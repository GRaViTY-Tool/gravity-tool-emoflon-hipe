/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.VariableDeclarationFragment;

import org.gravity.modisco.MDefinition;
import org.gravity.modisco.MFieldDefinition;
import org.gravity.modisco.MSingleVariableAccess;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TFieldDefinition;
import org.gravity.typegraph.basic.TMember;
import org.gravity.typegraph.basic.TReadWrite;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Access Read Write Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCREATE__SRC__mAccess <em>CREATE SRC mAccess</em>}</li>
 *   <li>{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__SRC__mField <em>CONTEXT SRC mField</em>}</li>
 *   <li>{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}</li>
 *   <li>{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__SRC__varDeclFrag <em>CONTEXT SRC var Decl Frag</em>}</li>
 *   <li>{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCREATE__TRG__tAccess <em>CREATE TRG tAccess</em>}</li>
 *   <li>{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__TRG__tField <em>CONTEXT TRG tField</em>}</li>
 *   <li>{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}</li>
 *   <li>{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}</li>
 *   <li>{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCREATE__CORR__mAccessToTAccess <em>CREATE CORR mAccess To TAccess</em>}</li>
 *   <li>{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCREATE__CORR__mFlowOwnerToTFlowOwner <em>CREATE CORR mFlow Owner To TFlow Owner</em>}</li>
 *   <li>{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}</li>
 *   <li>{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__CORR__mMethodToTMethod <em>CONTEXT CORR mMethod To TMethod</em>}</li>
 *   <li>{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getFieldAccessReadWrite__Marker()
 * @model
 * @generated
 */
public interface FieldAccessReadWrite__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC mAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mAccess</em>' reference.
	 * @see #setCREATE__SRC__mAccess(MSingleVariableAccess)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldAccessReadWrite__Marker_CREATE__SRC__mAccess()
	 * @model required="true"
	 * @generated
	 */
	MSingleVariableAccess getCREATE__SRC__mAccess();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCREATE__SRC__mAccess <em>CREATE SRC mAccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mAccess</em>' reference.
	 * @see #getCREATE__SRC__mAccess()
	 * @generated
	 */
	void setCREATE__SRC__mAccess(MSingleVariableAccess value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mField</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mField</em>' reference.
	 * @see #setCONTEXT__SRC__mField(MFieldDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldAccessReadWrite__Marker_CONTEXT__SRC__mField()
	 * @model required="true"
	 * @generated
	 */
	MFieldDefinition getCONTEXT__SRC__mField();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__SRC__mField <em>CONTEXT SRC mField</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mField</em>' reference.
	 * @see #getCONTEXT__SRC__mField()
	 * @generated
	 */
	void setCONTEXT__SRC__mField(MFieldDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mMember</em>' reference.
	 * @see #setCONTEXT__SRC__mMember(MDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldAccessReadWrite__Marker_CONTEXT__SRC__mMember()
	 * @model required="true"
	 * @generated
	 */
	MDefinition getCONTEXT__SRC__mMember();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__SRC__mMember <em>CONTEXT SRC mMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mMember</em>' reference.
	 * @see #getCONTEXT__SRC__mMember()
	 * @generated
	 */
	void setCONTEXT__SRC__mMember(MDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mType</em>' reference.
	 * @see #setCONTEXT__SRC__mType(AbstractTypeDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldAccessReadWrite__Marker_CONTEXT__SRC__mType()
	 * @model required="true"
	 * @generated
	 */
	AbstractTypeDeclaration getCONTEXT__SRC__mType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mType</em>' reference.
	 * @see #getCONTEXT__SRC__mType()
	 * @generated
	 */
	void setCONTEXT__SRC__mType(AbstractTypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC var Decl Frag</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC var Decl Frag</em>' reference.
	 * @see #setCONTEXT__SRC__varDeclFrag(VariableDeclarationFragment)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldAccessReadWrite__Marker_CONTEXT__SRC__varDeclFrag()
	 * @model required="true"
	 * @generated
	 */
	VariableDeclarationFragment getCONTEXT__SRC__varDeclFrag();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__SRC__varDeclFrag <em>CONTEXT SRC var Decl Frag</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC var Decl Frag</em>' reference.
	 * @see #getCONTEXT__SRC__varDeclFrag()
	 * @generated
	 */
	void setCONTEXT__SRC__varDeclFrag(VariableDeclarationFragment value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tAccess</em>' reference.
	 * @see #setCREATE__TRG__tAccess(TReadWrite)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldAccessReadWrite__Marker_CREATE__TRG__tAccess()
	 * @model required="true"
	 * @generated
	 */
	TReadWrite getCREATE__TRG__tAccess();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCREATE__TRG__tAccess <em>CREATE TRG tAccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tAccess</em>' reference.
	 * @see #getCREATE__TRG__tAccess()
	 * @generated
	 */
	void setCREATE__TRG__tAccess(TReadWrite value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tField</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tField</em>' reference.
	 * @see #setCONTEXT__TRG__tField(TFieldDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldAccessReadWrite__Marker_CONTEXT__TRG__tField()
	 * @model required="true"
	 * @generated
	 */
	TFieldDefinition getCONTEXT__TRG__tField();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__TRG__tField <em>CONTEXT TRG tField</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tField</em>' reference.
	 * @see #getCONTEXT__TRG__tField()
	 * @generated
	 */
	void setCONTEXT__TRG__tField(TFieldDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tMember</em>' reference.
	 * @see #setCONTEXT__TRG__tMember(TMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldAccessReadWrite__Marker_CONTEXT__TRG__tMember()
	 * @model required="true"
	 * @generated
	 */
	TMember getCONTEXT__TRG__tMember();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__TRG__tMember <em>CONTEXT TRG tMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tMember</em>' reference.
	 * @see #getCONTEXT__TRG__tMember()
	 * @generated
	 */
	void setCONTEXT__TRG__tMember(TMember value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tType</em>' reference.
	 * @see #setCONTEXT__TRG__tType(TAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldAccessReadWrite__Marker_CONTEXT__TRG__tType()
	 * @model required="true"
	 * @generated
	 */
	TAbstractType getCONTEXT__TRG__tType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tType</em>' reference.
	 * @see #getCONTEXT__TRG__tType()
	 * @generated
	 */
	void setCONTEXT__TRG__tType(TAbstractType value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mAccess To TAccess</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mAccess To TAccess</em>' reference.
	 * @see #setCREATE__CORR__mAccessToTAccess(MSingleVariableAccessToTAccess)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldAccessReadWrite__Marker_CREATE__CORR__mAccessToTAccess()
	 * @model required="true"
	 * @generated
	 */
	MSingleVariableAccessToTAccess getCREATE__CORR__mAccessToTAccess();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCREATE__CORR__mAccessToTAccess <em>CREATE CORR mAccess To TAccess</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mAccess To TAccess</em>' reference.
	 * @see #getCREATE__CORR__mAccessToTAccess()
	 * @generated
	 */
	void setCREATE__CORR__mAccessToTAccess(MSingleVariableAccessToTAccess value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mFlow Owner To TFlow Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mFlow Owner To TFlow Owner</em>' reference.
	 * @see #setCREATE__CORR__mFlowOwnerToTFlowOwner(MAbstractFlowElementToTAbstractFlowElement)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldAccessReadWrite__Marker_CREATE__CORR__mFlowOwnerToTFlowOwner()
	 * @model required="true"
	 * @generated
	 */
	MAbstractFlowElementToTAbstractFlowElement getCREATE__CORR__mFlowOwnerToTFlowOwner();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCREATE__CORR__mFlowOwnerToTFlowOwner <em>CREATE CORR mFlow Owner To TFlow Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mFlow Owner To TFlow Owner</em>' reference.
	 * @see #getCREATE__CORR__mFlowOwnerToTFlowOwner()
	 * @generated
	 */
	void setCREATE__CORR__mFlowOwnerToTFlowOwner(MAbstractFlowElementToTAbstractFlowElement value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mMember To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mMember To TMember</em>' reference.
	 * @see #setCONTEXT__CORR__mMemberToTMember(MDefinitionToTMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldAccessReadWrite__Marker_CONTEXT__CORR__mMemberToTMember()
	 * @model required="true"
	 * @generated
	 */
	MDefinitionToTMember getCONTEXT__CORR__mMemberToTMember();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__CORR__mMemberToTMember <em>CONTEXT CORR mMember To TMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mMember To TMember</em>' reference.
	 * @see #getCONTEXT__CORR__mMemberToTMember()
	 * @generated
	 */
	void setCONTEXT__CORR__mMemberToTMember(MDefinitionToTMember value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mMethod To TMethod</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mMethod To TMethod</em>' reference.
	 * @see #setCONTEXT__CORR__mMethodToTMethod(MDefinitionToTMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldAccessReadWrite__Marker_CONTEXT__CORR__mMethodToTMethod()
	 * @model required="true"
	 * @generated
	 */
	MDefinitionToTMember getCONTEXT__CORR__mMethodToTMethod();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__CORR__mMethodToTMethod <em>CONTEXT CORR mMethod To TMethod</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mMethod To TMethod</em>' reference.
	 * @see #getCONTEXT__CORR__mMethodToTMethod()
	 * @generated
	 */
	void setCONTEXT__CORR__mMethodToTMethod(MDefinitionToTMember value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mType To TType</em>' reference.
	 * @see #setCONTEXT__CORR__mTypeToTType(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getFieldAccessReadWrite__Marker_CONTEXT__CORR__mTypeToTType()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCONTEXT__CORR__mTypeToTType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.FieldAccessReadWrite__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mType To TType</em>' reference.
	 * @see #getCONTEXT__CORR__mTypeToTType()
	 * @generated
	 */
	void setCONTEXT__CORR__mTypeToTType(TypeToTAbstractType value);

} // FieldAccessReadWrite__Marker
