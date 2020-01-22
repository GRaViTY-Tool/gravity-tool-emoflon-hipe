/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.AnnotationTypeDeclaration;

import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.TAnnotationType;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Type Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.AnnotationType__Marker#getCONTEXT__SRC__mPackage <em>CONTEXT SRC mPackage</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationType__Marker#getCREATE__SRC__mType <em>CREATE SRC mType</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationType__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationType__Marker#getCONTEXT__TRG__tPackage <em>CONTEXT TRG tPackage</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationType__Marker#getCREATE__TRG__tType <em>CREATE TRG tType</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationType__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationType__Marker#getCONTEXT__CORR__mPackageToTPackage <em>CONTEXT CORR mPackage To TPackage</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationType__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationType__Marker()
 * @model
 * @generated
 */
public interface AnnotationType__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mPackage</em>' reference.
	 * @see #setCONTEXT__SRC__mPackage(org.eclipse.modisco.java.Package)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationType__Marker_CONTEXT__SRC__mPackage()
	 * @model required="true"
	 * @generated
	 */
	org.eclipse.modisco.java.Package getCONTEXT__SRC__mPackage();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationType__Marker#getCONTEXT__SRC__mPackage <em>CONTEXT SRC mPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mPackage</em>' reference.
	 * @see #getCONTEXT__SRC__mPackage()
	 * @generated
	 */
	void setCONTEXT__SRC__mPackage(org.eclipse.modisco.java.Package value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC mType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mType</em>' reference.
	 * @see #setCREATE__SRC__mType(AnnotationTypeDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationType__Marker_CREATE__SRC__mType()
	 * @model required="true"
	 * @generated
	 */
	AnnotationTypeDeclaration getCREATE__SRC__mType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationType__Marker#getCREATE__SRC__mType <em>CREATE SRC mType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mType</em>' reference.
	 * @see #getCREATE__SRC__mType()
	 * @generated
	 */
	void setCREATE__SRC__mType(AnnotationTypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG pg</em>' reference.
	 * @see #setCONTEXT__TRG__pg(TypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationType__Marker_CONTEXT__TRG__pg()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getCONTEXT__TRG__pg();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationType__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG pg</em>' reference.
	 * @see #getCONTEXT__TRG__pg()
	 * @generated
	 */
	void setCONTEXT__TRG__pg(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tPackage</em>' reference.
	 * @see #setCONTEXT__TRG__tPackage(TPackage)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationType__Marker_CONTEXT__TRG__tPackage()
	 * @model required="true"
	 * @generated
	 */
	TPackage getCONTEXT__TRG__tPackage();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationType__Marker#getCONTEXT__TRG__tPackage <em>CONTEXT TRG tPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tPackage</em>' reference.
	 * @see #getCONTEXT__TRG__tPackage()
	 * @generated
	 */
	void setCONTEXT__TRG__tPackage(TPackage value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tType</em>' reference.
	 * @see #setCREATE__TRG__tType(TAnnotationType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationType__Marker_CREATE__TRG__tType()
	 * @model required="true"
	 * @generated
	 */
	TAnnotationType getCREATE__TRG__tType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationType__Marker#getCREATE__TRG__tType <em>CREATE TRG tType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tType</em>' reference.
	 * @see #getCREATE__TRG__tType()
	 * @generated
	 */
	void setCREATE__TRG__tType(TAnnotationType value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mBody To TAnnotation</em>' reference.
	 * @see #setCREATE__CORR__mBodyToTAnnotation(ASTNodeToTAnnotatable)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationType__Marker_CREATE__CORR__mBodyToTAnnotation()
	 * @model required="true"
	 * @generated
	 */
	ASTNodeToTAnnotatable getCREATE__CORR__mBodyToTAnnotation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationType__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mBody To TAnnotation</em>' reference.
	 * @see #getCREATE__CORR__mBodyToTAnnotation()
	 * @generated
	 */
	void setCREATE__CORR__mBodyToTAnnotation(ASTNodeToTAnnotatable value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mPackage To TPackage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mPackage To TPackage</em>' reference.
	 * @see #setCONTEXT__CORR__mPackageToTPackage(PackageToTPackage)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationType__Marker_CONTEXT__CORR__mPackageToTPackage()
	 * @model required="true"
	 * @generated
	 */
	PackageToTPackage getCONTEXT__CORR__mPackageToTPackage();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationType__Marker#getCONTEXT__CORR__mPackageToTPackage <em>CONTEXT CORR mPackage To TPackage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mPackage To TPackage</em>' reference.
	 * @see #getCONTEXT__CORR__mPackageToTPackage()
	 * @generated
	 */
	void setCONTEXT__CORR__mPackageToTPackage(PackageToTPackage value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mType To TType</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mType To TType</em>' reference.
	 * @see #setCREATE__CORR__mTypeToTType(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationType__Marker_CREATE__CORR__mTypeToTType()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCREATE__CORR__mTypeToTType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationType__Marker#getCREATE__CORR__mTypeToTType <em>CREATE CORR mType To TType</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mType To TType</em>' reference.
	 * @see #getCREATE__CORR__mTypeToTType()
	 * @generated
	 */
	void setCREATE__CORR__mTypeToTType(TypeToTAbstractType value);

} // AnnotationType__Marker
