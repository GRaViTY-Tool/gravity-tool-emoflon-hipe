package org.gravity.tgg.modisco;

import java.io.IOException;
import org.eclipse.core.resources.IProject;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.modiscotgg.config._DefaultRegistrationHelper;
import org.gravity.eclipse.GravityActivator;

public class TGGApp extends SYNC {

	private static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	private static final String PLATFORM_RESOURCE = "platform:/resource/"; //$NON-NLS-1$

	private static final String MODISCO_FLATTENED_TGG_XMI_LOCATION = "model/ModiscoTGG_flattened.tgg.xmi"; //$NON-NLS-1$
	private static final String MODISCO_FLATTENED_TGG_XMI_URI = PLATFORM_RESOURCE + MoDiscoTGGActivator.PLUGIN_ID + "/" //$NON-NLS-1$
			+ MODISCO_FLATTENED_TGG_XMI_LOCATION;
	private static final String MODISCO_ECORE_LOCATION = "model/ModiscoTGG.ecore"; //$NON-NLS-1$
	private static final String MODISCO_ECORE_URI = PLATFORM_RESOURCE + MoDiscoTGGActivator.PLUGIN_ID + "/" //$NON-NLS-1$
			+ MODISCO_ECORE_LOCATION;
	private static final String MODISCO_TGG_XMI_LOCATION = "model/ModiscoTGG.tgg.xmi"; //$NON-NLS-1$
	private static final String MODISCO_TGG_XMI_URI = PLATFORM_RESOURCE + MoDiscoTGGActivator.PLUGIN_ID + "/" //$NON-NLS-1$
			+ MODISCO_TGG_XMI_LOCATION;

	/**
	 * Create a new transformation application
	 * 
	 * @param javaProject The project which should be transformed
	 * 
	 * @throws IOException If one of the models cannot be loaded
	 */
	public TGGApp(IProject project) throws IOException {
		super(registrationHelper.createIbexOptions().setResourceHandler(new TGGResourceHandler() {
			@Override
			public void loadModels() throws IOException {
				String gravityFolder = PLATFORM_RESOURCE + project.getName() + '/' + GravityActivator.GRAVITY_FOLDER_NAME + '/';
				source = createResource(gravityFolder + "src.xmi"); //$NON-NLS-1$
				target = createResource(gravityFolder + project.getName() + ".xmi"); //$NON-NLS-1$
				corr = createResource(gravityFolder + "corr.xmi"); //$NON-NLS-1$
				protocol = createResource(gravityFolder + "protocol.xmi"); //$NON-NLS-1$
			}

//			@Override
//			protected void registerUserMetamodels() throws IOException {
//				registerPackage(JavaPackage.eINSTANCE);
//				registerPackage(ModiscoPackage.eINSTANCE);
//				registerPackage(BasicPackage.eINSTANCE);
//				EPackage tggPackage = loadMetaModelPackage();
//				registerPackage(tggPackage);
//				options.setCorrMetamodel(tggPackage);
//				EcoreUtil.resolveAll(rs);
//			}
//
//			/**
//			 * Registers the package at the resource set
//			 * 
//			 * @param ePackage The package
//			 */
//			private void registerPackage(EPackage ePackage) {
//				rs.getPackageRegistry().put(ePackage.getNsURI(), ePackage);
//				rs.getResources().remove(ePackage.eResource());
//			}
//
//			/**
//			 * Load the meta model package
//			 * 
//			 * @param uri The URI of the meta model
//			 * @return The EPackage of the meta model
//			 * @throws IOException If the file cannot be reador the URI hasn't a valid
//			 *                     format
//			 */
//			private EPackage loadMetaModelPackage() throws IOException {
//				try (InputStream stream = MoDiscoTGGActivator.getEntryAsStream(MODISCO_ECORE_LOCATION)) {
//					Resource resource = loadResource(MODISCO_ECORE_URI, stream);
//					return (EPackage) resource.getContents().get(0);
//				}
//			}
//
//			@Override
//			public Resource loadResource(String uri) throws IOException {
//				try (InputStream stream = new URL(uri).openConnection().getInputStream()) {
//					return loadResource(uri, stream);
//				}
//			}
//
//			/**
//			 * Loads a resource from the given input stream under the given URI
//			 * 
//			 * @param uri    The URI of the resource
//			 * @param stream The stream containing the resources contents
//			 * @return The loaded resource
//			 * @throws IOException If the resource couldn't be loaded
//			 */
//			private Resource loadResource(String uri, InputStream stream) throws IOException {
//				Resource resource = rs.createResource(URI.createURI(uri));
//				resource.load(stream, Collections.emptyMap());
//				EcoreUtil.resolveAll(resource);
//				return resource;
//			}
//
//			@Override
//			protected Resource loadTGGResource() throws IOException {
//				try (InputStream stream = MoDiscoTGGActivator.getEntryAsStream(MODISCO_TGG_XMI_LOCATION)) {
//					return loadResource(MODISCO_TGG_XMI_URI, stream);
//				}
//			}
//
//			@Override
//			protected Resource loadFlattenedTGGResource() throws IOException {
//				try (InputStream stream = MoDiscoTGGActivator.getEntryAsStream(MODISCO_FLATTENED_TGG_XMI_LOCATION)) {
//					return loadResource(MODISCO_FLATTENED_TGG_XMI_URI, stream);
//				}
//			}
		}));
	}
}
