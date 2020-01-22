/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.AbstractTypeDeclaration;
import org.eclipse.modisco.java.AnnotationTypeDeclaration;

import org.gravity.typegraph.basic.TAbstractType;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.TAnnotationType;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Type Nested Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__SRC__eNestedType <em>CREATE SRC eNested Type</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__SRC__eOuterType <em>CONTEXT SRC eOuter Type</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__TRG__tNestedPackage <em>CREATE TRG tNested Package</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__TRG__tNestedType <em>CREATE TRG tNested Type</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__TRG__tOuterPackage <em>CONTEXT TRG tOuter Package</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__TRG__tOuterType <em>CONTEXT TRG tOuter Type</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__CORR__eNestedTypeToTNestedType <em>CREATE CORR eNested Type To TNested Type</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__CORR__eOuterTypeToTOuterInterface <em>CONTEXT CORR eOuter Type To TOuter Interface</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeNested__Marker()
 * @model
 * @generated
 */
public interface AnnotationTypeNested__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CREATE SRC eNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC eNested Type</em>' reference.
	 * @see #setCREATE__SRC__eNestedType(AnnotationTypeDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeNested__Marker_CREATE__SRC__eNestedType()
	 * @model required="true"
	 * @generated
	 */
	AnnotationTypeDeclaration getCREATE__SRC__eNestedType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__SRC__eNestedType <em>CREATE SRC eNested Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC eNested Type</em>' reference.
	 * @see #getCREATE__SRC__eNestedType()
	 * @generated
	 */
	void setCREATE__SRC__eNestedType(AnnotationTypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC eOuter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC eOuter Type</em>' reference.
	 * @see #setCONTEXT__SRC__eOuterType(AbstractTypeDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeNested__Marker_CONTEXT__SRC__eOuterType()
	 * @model required="true"
	 * @generated
	 */
	AbstractTypeDeclaration getCONTEXT__SRC__eOuterType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__SRC__eOuterType <em>CONTEXT SRC eOuter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC eOuter Type</em>' reference.
	 * @see #getCONTEXT__SRC__eOuterType()
	 * @generated
	 */
	void setCONTEXT__SRC__eOuterType(AbstractTypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tNested Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tNested Package</em>' reference.
	 * @see #setCREATE__TRG__tNestedPackage(TPackage)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeNested__Marker_CREATE__TRG__tNestedPackage()
	 * @model required="true"
	 * @generated
	 */
	TPackage getCREATE__TRG__tNestedPackage();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__TRG__tNestedPackage <em>CREATE TRG tNested Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tNested Package</em>' reference.
	 * @see #getCREATE__TRG__tNestedPackage()
	 * @generated
	 */
	void setCREATE__TRG__tNestedPackage(TPackage value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tNested Type</em>' reference.
	 * @see #setCREATE__TRG__tNestedType(TAnnotationType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeNested__Marker_CREATE__TRG__tNestedType()
	 * @model required="true"
	 * @generated
	 */
	TAnnotationType getCREATE__TRG__tNestedType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__TRG__tNestedType <em>CREATE TRG tNested Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tNested Type</em>' reference.
	 * @see #getCREATE__TRG__tNestedType()
	 * @generated
	 */
	void setCREATE__TRG__tNestedType(TAnnotationType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tOuter Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tOuter Package</em>' reference.
	 * @see #setCONTEXT__TRG__tOuterPackage(TPackage)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeNested__Marker_CONTEXT__TRG__tOuterPackage()
	 * @model required="true"
	 * @generated
	 */
	TPackage getCONTEXT__TRG__tOuterPackage();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__TRG__tOuterPackage <em>CONTEXT TRG tOuter Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tOuter Package</em>' reference.
	 * @see #getCONTEXT__TRG__tOuterPackage()
	 * @generated
	 */
	void setCONTEXT__TRG__tOuterPackage(TPackage value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tOuter Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tOuter Type</em>' reference.
	 * @see #setCONTEXT__TRG__tOuterType(TAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeNested__Marker_CONTEXT__TRG__tOuterType()
	 * @model required="true"
	 * @generated
	 */
	TAbstractType getCONTEXT__TRG__tOuterType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__TRG__tOuterType <em>CONTEXT TRG tOuter Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tOuter Type</em>' reference.
	 * @see #getCONTEXT__TRG__tOuterType()
	 * @generated
	 */
	void setCONTEXT__TRG__tOuterType(TAbstractType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG type Graph</em>' reference.
	 * @see #setCONTEXT__TRG__typeGraph(TypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeNested__Marker_CONTEXT__TRG__typeGraph()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getCONTEXT__TRG__typeGraph();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG type Graph</em>' reference.
	 * @see #getCONTEXT__TRG__typeGraph()
	 * @generated
	 */
	void setCONTEXT__TRG__typeGraph(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR eNested Type To TNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR eNested Type To TNested Type</em>' reference.
	 * @see #setCREATE__CORR__eNestedTypeToTNestedType(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeNested__Marker_CREATE__CORR__eNestedTypeToTNestedType()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCREATE__CORR__eNestedTypeToTNestedType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__CORR__eNestedTypeToTNestedType <em>CREATE CORR eNested Type To TNested Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR eNested Type To TNested Type</em>' reference.
	 * @see #getCREATE__CORR__eNestedTypeToTNestedType()
	 * @generated
	 */
	void setCREATE__CORR__eNestedTypeToTNestedType(TypeToTAbstractType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eOuter Type To TOuter Interface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eOuter Type To TOuter Interface</em>' reference.
	 * @see #setCONTEXT__CORR__eOuterTypeToTOuterInterface(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeNested__Marker_CONTEXT__CORR__eOuterTypeToTOuterInterface()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCONTEXT__CORR__eOuterTypeToTOuterInterface();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCONTEXT__CORR__eOuterTypeToTOuterInterface <em>CONTEXT CORR eOuter Type To TOuter Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eOuter Type To TOuter Interface</em>' reference.
	 * @see #getCONTEXT__CORR__eOuterTypeToTOuterInterface()
	 * @generated
	 */
	void setCONTEXT__CORR__eOuterTypeToTOuterInterface(TypeToTAbstractType value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mBody To TAnnotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mBody To TAnnotation</em>' reference.
	 * @see #setCREATE__CORR__mBodyToTAnnotation(ASTNodeToTAnnotatable)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeNested__Marker_CREATE__CORR__mBodyToTAnnotation()
	 * @model required="true"
	 * @generated
	 */
	ASTNodeToTAnnotatable getCREATE__CORR__mBodyToTAnnotation();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeNested__Marker#getCREATE__CORR__mBodyToTAnnotation <em>CREATE CORR mBody To TAnnotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mBody To TAnnotation</em>' reference.
	 * @see #getCREATE__CORR__mBodyToTAnnotation()
	 * @generated
	 */
	void setCREATE__CORR__mBodyToTAnnotation(ASTNodeToTAnnotatable value);

} // AnnotationTypeNested__Marker
