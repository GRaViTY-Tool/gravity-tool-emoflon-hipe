package org.emoflon.ibex.tgg.run.modiscotgg.config;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.modisco.java.emf.JavaPackage;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.gravity.modisco.ModiscoPackage;
import org.gravity.typegraph.basic.BasicPackage;

public class _DefaultRegistrationHelper implements IRegistrationHelper{

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		// Replace to register generated code or handle other URI-related requirements
		Registry reg = rs.getPackageRegistry();
		reg.put(JavaPackage.eNS_URI, JavaPackage.eINSTANCE);
		reg.put(ModiscoPackage.eNS_URI, ModiscoPackage.eINSTANCE);
		reg.put(BasicPackage.eNS_URI, BasicPackage.eINSTANCE);
		new DemoclesRegistrationHelper().registerMetamodels(rs, executable);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		return new DemoclesRegistrationHelper().createIbexOptions();
	}
}
