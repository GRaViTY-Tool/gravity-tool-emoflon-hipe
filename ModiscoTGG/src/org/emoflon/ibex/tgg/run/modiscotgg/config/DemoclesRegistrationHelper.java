package org.emoflon.ibex.tgg.run.modiscotgg.config;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.java.emf.JavaPackage;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.modiscotgg.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.gravity.modisco.ModiscoPackage;
import org.gravity.tgg.modisco.MoDiscoTGGActivator;
import org.gravity.typegraph.basic.BasicPackage;

import ModiscoTGG.sync.hipe.engine.HiPEEngine;
import hipe.engine.HiPEContentAdapter;
import hipe.network.HiPENetwork;

public class DemoclesRegistrationHelper implements IRegistrationHelper {

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		// Replace to register generated code or handle other URI-related requirements
		Registry reg = rs.getPackageRegistry();
		reg.put(JavaPackage.eNS_URI, JavaPackage.eINSTANCE);
		reg.put(ModiscoPackage.eNS_URI, ModiscoPackage.eINSTANCE);
		reg.put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		executable.getResourceHandler().loadAndRegisterMetamodel("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java");
		executable.getResourceHandler().loadAndRegisterMetamodel("http://www.gravity-tool.org/modisco");
		executable.getResourceHandler().loadAndRegisterMetamodel("http://www.gravity-tool.org/typegraph/basic");
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new HiPETGGEngine() {
			@Override
			protected void initEngine(final ResourceSet resourceSet) {
				HiPENetwork network = loadNetwork(getProjectName() + "/debug/" + getNetworkFileName());
				if (network == null) {
					throw new RuntimeException("No " + getNetworkFileName() + " could be found");
				}
				engine = new HiPEEngine(network);

				try {
					engine.initialize();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				adapter = new HiPEContentAdapter(resourceSet, engine);
			}
		});
		options.projectName("ModiscoTGG");
		options.projectPath(MoDiscoTGGActivator.PLUGIN_ID);
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
