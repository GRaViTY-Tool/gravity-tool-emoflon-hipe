/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.AnnotationTypeDeclaration;
import org.eclipse.modisco.java.AnonymousClassDeclaration;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TypeGraph;

import org.gravity.typegraph.basic.annotations.TAnnotationType;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Type In Anonymous Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCONTEXT__SRC__eAnonymousClassDeclaration <em>CONTEXT SRC eAnonymous Class Declaration</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCREATE__SRC__mNestedType <em>CREATE SRC mNested Type</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCREATE__TRG__tNestedType <em>CREATE TRG tNested Type</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass <em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCREATE__CORR__mNestedTypeToTNestedType <em>CREATE CORR mNested Type To TNested Type</em>}</li>
 *   <li>{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCREATE__CORR__mbodyToTAnnotatable <em>CREATE CORR mbody To TAnnotatable</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeInAnonymous__Marker()
 * @model
 * @generated
 */
public interface AnnotationTypeInAnonymous__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC eAnonymous Class Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC eAnonymous Class Declaration</em>' reference.
	 * @see #setCONTEXT__SRC__eAnonymousClassDeclaration(AnonymousClassDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeInAnonymous__Marker_CONTEXT__SRC__eAnonymousClassDeclaration()
	 * @model required="true"
	 * @generated
	 */
	AnonymousClassDeclaration getCONTEXT__SRC__eAnonymousClassDeclaration();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCONTEXT__SRC__eAnonymousClassDeclaration <em>CONTEXT SRC eAnonymous Class Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC eAnonymous Class Declaration</em>' reference.
	 * @see #getCONTEXT__SRC__eAnonymousClassDeclaration()
	 * @generated
	 */
	void setCONTEXT__SRC__eAnonymousClassDeclaration(AnonymousClassDeclaration value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC mNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mNested Type</em>' reference.
	 * @see #setCREATE__SRC__mNestedType(AnnotationTypeDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeInAnonymous__Marker_CREATE__SRC__mNestedType()
	 * @model required="true"
	 * @generated
	 */
	AnnotationTypeDeclaration getCREATE__SRC__mNestedType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCREATE__SRC__mNestedType <em>CREATE SRC mNested Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mNested Type</em>' reference.
	 * @see #getCREATE__SRC__mNestedType()
	 * @generated
	 */
	void setCREATE__SRC__mNestedType(AnnotationTypeDeclaration value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG pg</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG pg</em>' reference.
	 * @see #setCONTEXT__TRG__pg(TypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeInAnonymous__Marker_CONTEXT__TRG__pg()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getCONTEXT__TRG__pg();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCONTEXT__TRG__pg <em>CONTEXT TRG pg</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG pg</em>' reference.
	 * @see #getCONTEXT__TRG__pg()
	 * @generated
	 */
	void setCONTEXT__TRG__pg(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tClass</em>' reference.
	 * @see #setCONTEXT__TRG__tClass(TClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeInAnonymous__Marker_CONTEXT__TRG__tClass()
	 * @model required="true"
	 * @generated
	 */
	TClass getCONTEXT__TRG__tClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tClass</em>' reference.
	 * @see #getCONTEXT__TRG__tClass()
	 * @generated
	 */
	void setCONTEXT__TRG__tClass(TClass value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tNested Type</em>' reference.
	 * @see #setCREATE__TRG__tNestedType(TAnnotationType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeInAnonymous__Marker_CREATE__TRG__tNestedType()
	 * @model required="true"
	 * @generated
	 */
	TAnnotationType getCREATE__TRG__tNestedType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCREATE__TRG__tNestedType <em>CREATE TRG tNested Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tNested Type</em>' reference.
	 * @see #getCREATE__TRG__tNestedType()
	 * @generated
	 */
	void setCREATE__TRG__tNestedType(TAnnotationType value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eAnonymous Class Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>' reference.
	 * @see #setCONTEXT__CORR__eAnonymousClassDeclarationToTClass(AnonymousClassDeclarationToTClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeInAnonymous__Marker_CONTEXT__CORR__eAnonymousClassDeclarationToTClass()
	 * @model required="true"
	 * @generated
	 */
	AnonymousClassDeclarationToTClass getCONTEXT__CORR__eAnonymousClassDeclarationToTClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCONTEXT__CORR__eAnonymousClassDeclarationToTClass <em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eAnonymous Class Declaration To TClass</em>' reference.
	 * @see #getCONTEXT__CORR__eAnonymousClassDeclarationToTClass()
	 * @generated
	 */
	void setCONTEXT__CORR__eAnonymousClassDeclarationToTClass(AnonymousClassDeclarationToTClass value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mNested Type To TNested Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mNested Type To TNested Type</em>' reference.
	 * @see #setCREATE__CORR__mNestedTypeToTNestedType(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeInAnonymous__Marker_CREATE__CORR__mNestedTypeToTNestedType()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCREATE__CORR__mNestedTypeToTNestedType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCREATE__CORR__mNestedTypeToTNestedType <em>CREATE CORR mNested Type To TNested Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mNested Type To TNested Type</em>' reference.
	 * @see #getCREATE__CORR__mNestedTypeToTNestedType()
	 * @generated
	 */
	void setCREATE__CORR__mNestedTypeToTNestedType(TypeToTAbstractType value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mbody To TAnnotatable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mbody To TAnnotatable</em>' reference.
	 * @see #setCREATE__CORR__mbodyToTAnnotatable(ASTNodeToTAnnotatable)
	 * @see ModiscoTGG.ModiscoTGGPackage#getAnnotationTypeInAnonymous__Marker_CREATE__CORR__mbodyToTAnnotatable()
	 * @model required="true"
	 * @generated
	 */
	ASTNodeToTAnnotatable getCREATE__CORR__mbodyToTAnnotatable();

	/**
	 * Sets the value of the '{@link ModiscoTGG.AnnotationTypeInAnonymous__Marker#getCREATE__CORR__mbodyToTAnnotatable <em>CREATE CORR mbody To TAnnotatable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mbody To TAnnotatable</em>' reference.
	 * @see #getCREATE__CORR__mbodyToTAnnotatable()
	 * @generated
	 */
	void setCREATE__CORR__mbodyToTAnnotatable(ASTNodeToTAnnotatable value);

} // AnnotationTypeInAnonymous__Marker
