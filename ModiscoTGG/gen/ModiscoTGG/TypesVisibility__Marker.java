/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.Modifier;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TModifier;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types Visibility Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.TypesVisibility__Marker#getCREATE__SRC__mModifier <em>CREATE SRC mModifier</em>}</li>
 *   <li>{@link ModiscoTGG.TypesVisibility__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.TypesVisibility__Marker#getCREATE__TRG__tModifier <em>CREATE TRG tModifier</em>}</li>
 *   <li>{@link ModiscoTGG.TypesVisibility__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}</li>
 *   <li>{@link ModiscoTGG.TypesVisibility__Marker#getCREATE__CORR__mModifierToTModifier <em>CREATE CORR mModifier To TModifier</em>}</li>
 *   <li>{@link ModiscoTGG.TypesVisibility__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getTypesVisibility__Marker()
 * @model
 * @generated
 */
public interface TypesVisibility__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC mModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mModifier</em>' reference.
	 * @see #setCREATE__SRC__mModifier(Modifier)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTypesVisibility__Marker_CREATE__SRC__mModifier()
	 * @model required="true"
	 * @generated
	 */
	Modifier getCREATE__SRC__mModifier();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TypesVisibility__Marker#getCREATE__SRC__mModifier <em>CREATE SRC mModifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mModifier</em>' reference.
	 * @see #getCREATE__SRC__mModifier()
	 * @generated
	 */
	void setCREATE__SRC__mModifier(Modifier value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mType</em>' reference.
	 * @see #setCONTEXT__SRC__mType(AbstractTypeDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTypesVisibility__Marker_CONTEXT__SRC__mType()
	 * @model required="true"
	 * @generated
	 */
	AbstractTypeDeclaration getCONTEXT__SRC__mType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TypesVisibility__Marker#getCONTEXT__SRC__mType <em>CONTEXT SRC mType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mType</em>' reference.
	 * @see #getCONTEXT__SRC__mType()
	 * @generated
	 */
	void setCONTEXT__SRC__mType(AbstractTypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tModifier</em>' reference.
	 * @see #setCREATE__TRG__tModifier(TModifier)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTypesVisibility__Marker_CREATE__TRG__tModifier()
	 * @model required="true"
	 * @generated
	 */
	TModifier getCREATE__TRG__tModifier();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TypesVisibility__Marker#getCREATE__TRG__tModifier <em>CREATE TRG tModifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tModifier</em>' reference.
	 * @see #getCREATE__TRG__tModifier()
	 * @generated
	 */
	void setCREATE__TRG__tModifier(TModifier value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tType</em>' reference.
	 * @see #setCONTEXT__TRG__tType(TAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTypesVisibility__Marker_CONTEXT__TRG__tType()
	 * @model required="true"
	 * @generated
	 */
	TAbstractType getCONTEXT__TRG__tType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TypesVisibility__Marker#getCONTEXT__TRG__tType <em>CONTEXT TRG tType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tType</em>' reference.
	 * @see #getCONTEXT__TRG__tType()
	 * @generated
	 */
	void setCONTEXT__TRG__tType(TAbstractType value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mModifier To TModifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mModifier To TModifier</em>' reference.
	 * @see #setCREATE__CORR__mModifierToTModifier(MModifierToTModifier)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTypesVisibility__Marker_CREATE__CORR__mModifierToTModifier()
	 * @model required="true"
	 * @generated
	 */
	MModifierToTModifier getCREATE__CORR__mModifierToTModifier();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TypesVisibility__Marker#getCREATE__CORR__mModifierToTModifier <em>CREATE CORR mModifier To TModifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mModifier To TModifier</em>' reference.
	 * @see #getCREATE__CORR__mModifierToTModifier()
	 * @generated
	 */
	void setCREATE__CORR__mModifierToTModifier(MModifierToTModifier value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mType To TType</em>' reference.
	 * @see #setCONTEXT__CORR__mTypeToTType(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getTypesVisibility__Marker_CONTEXT__CORR__mTypeToTType()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCONTEXT__CORR__mTypeToTType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.TypesVisibility__Marker#getCONTEXT__CORR__mTypeToTType <em>CONTEXT CORR mType To TType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mType To TType</em>' reference.
	 * @see #getCONTEXT__CORR__mTypeToTType()
	 * @generated
	 */
	void setCONTEXT__CORR__mTypeToTType(TypeToTAbstractType value);

} // TypesVisibility__Marker
