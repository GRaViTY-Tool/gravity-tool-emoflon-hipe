package org.emoflon.ibex.tgg.run.modiscotgg.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.java.emf.impl.JavaPackageImpl;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.modiscotgg.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.gravity.modisco.impl.ModiscoPackageImpl;
import org.gravity.typegraph.basic.impl.BasicPackageImpl;

import ModiscoTGG.impl.ModiscoTGGPackageImpl;
import ModiscoTGG.sync.hipe.engine.HiPEEngine;
import hipe.engine.HiPEContentAdapter;
import hipe.network.HiPENetwork;

public class HiPERegistrationHelper implements IRegistrationHelper {
	
//	#import "http://www.eclipse.org/MoDisco/Java/0.2.incubation/java"
//	#import "http://www.gravity-tool.org/modisco"
//	#import "http://www.gravity-tool.org/typegraph/basic"
	
	/** Create default options **/
	public final void setWorkspaceRootDirectory(ResourceSet resourceSet) throws IOException {
		final String root = "../";
		URI key = URI.createPlatformResourceURI("/", true);
		URI value = URI.createFileURI(new File(root).getCanonicalPath() + File.separatorChar);
		resourceSet.getURIConverter().getURIMap().put(key, value);
	}

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		
		// Set correct workspace root
		setWorkspaceRootDirectory(rs);
		
		// Load and register source and target metamodels
		EPackage javaPack = null;
		EPackage modiscoPack = null;
		EPackage basicPack = null;
		EPackage modiscoTGGPack = null;
		
		javaPack = JavaPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/Java/model/Java.ecore", javaPack);
		rs.getPackageRegistry().put("platform:/plugin/Java/model/Java.ecore", javaPack);
		rs.getPackageRegistry().put("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java", javaPack);
			
		basicPack = BasicPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/Basic/model/Basic.ecore", basicPack);
	    rs.getPackageRegistry().put("platform:/plugin/Basic/model/Basic.ecore", basicPack);	
	    rs.getPackageRegistry().put("http://www.gravity-tool.org/typegraph/basic", basicPack);	
		
		modiscoPack = ModiscoPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/Modisco/model/Modisco.ecore", modiscoPack);
		rs.getPackageRegistry().put("platform:/plugin/Modisco/model/Modisco.ecore", modiscoPack);
		rs.getPackageRegistry().put("http://www.gravity-tool.org/modisco", modiscoPack);
	
		modiscoTGGPack = ModiscoTGGPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/ModiscoTGG/model/ModiscoTGG.ecore", modiscoTGGPack);
		rs.getPackageRegistry().put("platform:/plugin/ModiscoTGG/model/ModiscoTGG.ecore", modiscoTGGPack);
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
		options.projectPath("ModiscoTGG"
				+ "");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
