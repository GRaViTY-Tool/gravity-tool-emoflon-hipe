/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.UnresolvedTypeDeclaration;

import org.gravity.modisco.MGravityModel;

import org.gravity.typegraph.basic.TUnresolvedType;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unresolved Type Declaration Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}</li>
 *   <li>{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCREATE__SRC__unresolvedType <em>CREATE SRC unresolved Type</em>}</li>
 *   <li>{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}</li>
 *   <li>{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCREATE__TRG__tClass <em>CREATE TRG tClass</em>}</li>
 *   <li>{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCREATE__CORR__eAnonymousClassDeclarationToTClass <em>CREATE CORR eAnonymous Class Declaration To TClass</em>}</li>
 *   <li>{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCONTEXT__CORR__eModelToPg <em>CONTEXT CORR eModel To Pg</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getUnresolvedTypeDeclaration__Marker()
 * @model
 * @generated
 */
public interface UnresolvedTypeDeclaration__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC eModel</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC eModel</em>' reference.
	 * @see #setCONTEXT__SRC__eModel(MGravityModel)
	 * @see ModiscoTGG.ModiscoTGGPackage#getUnresolvedTypeDeclaration__Marker_CONTEXT__SRC__eModel()
	 * @model required="true"
	 * @generated
	 */
	MGravityModel getCONTEXT__SRC__eModel();

	/**
	 * Sets the value of the '{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCONTEXT__SRC__eModel <em>CONTEXT SRC eModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC eModel</em>' reference.
	 * @see #getCONTEXT__SRC__eModel()
	 * @generated
	 */
	void setCONTEXT__SRC__eModel(MGravityModel value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC unresolved Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC unresolved Type</em>' reference.
	 * @see #setCREATE__SRC__unresolvedType(UnresolvedTypeDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getUnresolvedTypeDeclaration__Marker_CREATE__SRC__unresolvedType()
	 * @model required="true"
	 * @generated
	 */
	UnresolvedTypeDeclaration getCREATE__SRC__unresolvedType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCREATE__SRC__unresolvedType <em>CREATE SRC unresolved Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC unresolved Type</em>' reference.
	 * @see #getCREATE__SRC__unresolvedType()
	 * @generated
	 */
	void setCREATE__SRC__unresolvedType(UnresolvedTypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG pg</em>' reference.
	 * @see #setCONTEXT__TRG__pg(TypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getUnresolvedTypeDeclaration__Marker_CONTEXT__TRG__pg()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getCONTEXT__TRG__pg();

	/**
	 * Sets the value of the '{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG pg</em>' reference.
	 * @see #getCONTEXT__TRG__pg()
	 * @generated
	 */
	void setCONTEXT__TRG__pg(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tClass</em>' reference.
	 * @see #setCREATE__TRG__tClass(TUnresolvedType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getUnresolvedTypeDeclaration__Marker_CREATE__TRG__tClass()
	 * @model required="true"
	 * @generated
	 */
	TUnresolvedType getCREATE__TRG__tClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCREATE__TRG__tClass <em>CREATE TRG tClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tClass</em>' reference.
	 * @see #getCREATE__TRG__tClass()
	 * @generated
	 */
	void setCREATE__TRG__tClass(TUnresolvedType value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR eAnonymous Class Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR eAnonymous Class Declaration To TClass</em>' reference.
	 * @see #setCREATE__CORR__eAnonymousClassDeclarationToTClass(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getUnresolvedTypeDeclaration__Marker_CREATE__CORR__eAnonymousClassDeclarationToTClass()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCREATE__CORR__eAnonymousClassDeclarationToTClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCREATE__CORR__eAnonymousClassDeclarationToTClass <em>CREATE CORR eAnonymous Class Declaration To TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR eAnonymous Class Declaration To TClass</em>' reference.
	 * @see #getCREATE__CORR__eAnonymousClassDeclarationToTClass()
	 * @generated
	 */
	void setCREATE__CORR__eAnonymousClassDeclarationToTClass(TypeToTAbstractType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eModel To Pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eModel To Pg</em>' reference.
	 * @see #setCONTEXT__CORR__eModelToPg(ModelToTypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getUnresolvedTypeDeclaration__Marker_CONTEXT__CORR__eModelToPg()
	 * @model required="true"
	 * @generated
	 */
	ModelToTypeGraph getCONTEXT__CORR__eModelToPg();

	/**
	 * Sets the value of the '{@link ModiscoTGG.UnresolvedTypeDeclaration__Marker#getCONTEXT__CORR__eModelToPg <em>CONTEXT CORR eModel To Pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eModel To Pg</em>' reference.
	 * @see #getCONTEXT__CORR__eModelToPg()
	 * @generated
	 */
	void setCONTEXT__CORR__eModelToPg(ModelToTypeGraph value);

} // UnresolvedTypeDeclaration__Marker
