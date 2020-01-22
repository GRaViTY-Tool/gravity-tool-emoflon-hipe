/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.AnonymousClassDeclaration;

import org.gravity.modisco.MAbstractMethodDefinition;
import org.gravity.modisco.MClass;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TPackage;
import org.gravity.typegraph.basic.TypeGraph;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Inner Anon Class Member Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__SRC__eOuterClass <em>CONTEXT SRC eOuter Class</em>}</li>
 *   <li>{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}</li>
 *   <li>{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__SRC__mInnerClass <em>CREATE SRC mInner Class</em>}</li>
 *   <li>{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__TRG__tInnerClass <em>CREATE TRG tInner Class</em>}</li>
 *   <li>{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__TRG__tInnerPackage <em>CREATE TRG tInner Package</em>}</li>
 *   <li>{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__TRG__tOuterClass <em>CONTEXT TRG tOuter Class</em>}</li>
 *   <li>{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__TRG__tOuterPackage <em>CONTEXT TRG tOuter Package</em>}</li>
 *   <li>{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}</li>
 *   <li>{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__CORR__eOuterClassToTOuterClass <em>CONTEXT CORR eOuter Class To TOuter Class</em>}</li>
 *   <li>{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__CORR__tInnerClassToTInnerClass <em>CREATE CORR tInner Class To TInner Class</em>}</li>
 *   <li>{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__CORR__tInnerTypeToTInnerAbstractType <em>CREATE CORR tInner Type To TInner Abstract Type</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getClassInnerAnonClassMember__Marker()
 * @model
 * @generated
 */
public interface ClassInnerAnonClassMember__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC eOuter Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC eOuter Class</em>' reference.
	 * @see #setCONTEXT__SRC__eOuterClass(AnonymousClassDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassInnerAnonClassMember__Marker_CONTEXT__SRC__eOuterClass()
	 * @model required="true"
	 * @generated
	 */
	AnonymousClassDeclaration getCONTEXT__SRC__eOuterClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__SRC__eOuterClass <em>CONTEXT SRC eOuter Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC eOuter Class</em>' reference.
	 * @see #getCONTEXT__SRC__eOuterClass()
	 * @generated
	 */
	void setCONTEXT__SRC__eOuterClass(AnonymousClassDeclaration value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mDefinition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mDefinition</em>' reference.
	 * @see #setCONTEXT__SRC__mDefinition(MAbstractMethodDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassInnerAnonClassMember__Marker_CONTEXT__SRC__mDefinition()
	 * @model required="true"
	 * @generated
	 */
	MAbstractMethodDefinition getCONTEXT__SRC__mDefinition();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__SRC__mDefinition <em>CONTEXT SRC mDefinition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mDefinition</em>' reference.
	 * @see #getCONTEXT__SRC__mDefinition()
	 * @generated
	 */
	void setCONTEXT__SRC__mDefinition(MAbstractMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC mInner Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mInner Class</em>' reference.
	 * @see #setCREATE__SRC__mInnerClass(MClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassInnerAnonClassMember__Marker_CREATE__SRC__mInnerClass()
	 * @model required="true"
	 * @generated
	 */
	MClass getCREATE__SRC__mInnerClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__SRC__mInnerClass <em>CREATE SRC mInner Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mInner Class</em>' reference.
	 * @see #getCREATE__SRC__mInnerClass()
	 * @generated
	 */
	void setCREATE__SRC__mInnerClass(MClass value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tInner Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tInner Class</em>' reference.
	 * @see #setCREATE__TRG__tInnerClass(TClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassInnerAnonClassMember__Marker_CREATE__TRG__tInnerClass()
	 * @model required="true"
	 * @generated
	 */
	TClass getCREATE__TRG__tInnerClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__TRG__tInnerClass <em>CREATE TRG tInner Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tInner Class</em>' reference.
	 * @see #getCREATE__TRG__tInnerClass()
	 * @generated
	 */
	void setCREATE__TRG__tInnerClass(TClass value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tInner Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tInner Package</em>' reference.
	 * @see #setCREATE__TRG__tInnerPackage(TPackage)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassInnerAnonClassMember__Marker_CREATE__TRG__tInnerPackage()
	 * @model required="true"
	 * @generated
	 */
	TPackage getCREATE__TRG__tInnerPackage();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__TRG__tInnerPackage <em>CREATE TRG tInner Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tInner Package</em>' reference.
	 * @see #getCREATE__TRG__tInnerPackage()
	 * @generated
	 */
	void setCREATE__TRG__tInnerPackage(TPackage value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tOuter Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tOuter Class</em>' reference.
	 * @see #setCONTEXT__TRG__tOuterClass(TClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassInnerAnonClassMember__Marker_CONTEXT__TRG__tOuterClass()
	 * @model required="true"
	 * @generated
	 */
	TClass getCONTEXT__TRG__tOuterClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__TRG__tOuterClass <em>CONTEXT TRG tOuter Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tOuter Class</em>' reference.
	 * @see #getCONTEXT__TRG__tOuterClass()
	 * @generated
	 */
	void setCONTEXT__TRG__tOuterClass(TClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tOuter Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tOuter Package</em>' reference.
	 * @see #setCONTEXT__TRG__tOuterPackage(TPackage)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassInnerAnonClassMember__Marker_CONTEXT__TRG__tOuterPackage()
	 * @model required="true"
	 * @generated
	 */
	TPackage getCONTEXT__TRG__tOuterPackage();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__TRG__tOuterPackage <em>CONTEXT TRG tOuter Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tOuter Package</em>' reference.
	 * @see #getCONTEXT__TRG__tOuterPackage()
	 * @generated
	 */
	void setCONTEXT__TRG__tOuterPackage(TPackage value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG type Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG type Graph</em>' reference.
	 * @see #setCONTEXT__TRG__typeGraph(TypeGraph)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassInnerAnonClassMember__Marker_CONTEXT__TRG__typeGraph()
	 * @model required="true"
	 * @generated
	 */
	TypeGraph getCONTEXT__TRG__typeGraph();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__TRG__typeGraph <em>CONTEXT TRG type Graph</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG type Graph</em>' reference.
	 * @see #getCONTEXT__TRG__typeGraph()
	 * @generated
	 */
	void setCONTEXT__TRG__typeGraph(TypeGraph value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR eOuter Class To TOuter Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR eOuter Class To TOuter Class</em>' reference.
	 * @see #setCONTEXT__CORR__eOuterClassToTOuterClass(AnonymousClassDeclarationToTClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassInnerAnonClassMember__Marker_CONTEXT__CORR__eOuterClassToTOuterClass()
	 * @model required="true"
	 * @generated
	 */
	AnonymousClassDeclarationToTClass getCONTEXT__CORR__eOuterClassToTOuterClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCONTEXT__CORR__eOuterClassToTOuterClass <em>CONTEXT CORR eOuter Class To TOuter Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR eOuter Class To TOuter Class</em>' reference.
	 * @see #getCONTEXT__CORR__eOuterClassToTOuterClass()
	 * @generated
	 */
	void setCONTEXT__CORR__eOuterClassToTOuterClass(AnonymousClassDeclarationToTClass value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR tInner Class To TInner Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR tInner Class To TInner Class</em>' reference.
	 * @see #setCREATE__CORR__tInnerClassToTInnerClass(ClassDeclarationToTClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassInnerAnonClassMember__Marker_CREATE__CORR__tInnerClassToTInnerClass()
	 * @model required="true"
	 * @generated
	 */
	ClassDeclarationToTClass getCREATE__CORR__tInnerClassToTInnerClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__CORR__tInnerClassToTInnerClass <em>CREATE CORR tInner Class To TInner Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR tInner Class To TInner Class</em>' reference.
	 * @see #getCREATE__CORR__tInnerClassToTInnerClass()
	 * @generated
	 */
	void setCREATE__CORR__tInnerClassToTInnerClass(ClassDeclarationToTClass value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR tInner Type To TInner Abstract Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR tInner Type To TInner Abstract Type</em>' reference.
	 * @see #setCREATE__CORR__tInnerTypeToTInnerAbstractType(TypeToTAbstractType)
	 * @see ModiscoTGG.ModiscoTGGPackage#getClassInnerAnonClassMember__Marker_CREATE__CORR__tInnerTypeToTInnerAbstractType()
	 * @model required="true"
	 * @generated
	 */
	TypeToTAbstractType getCREATE__CORR__tInnerTypeToTInnerAbstractType();

	/**
	 * Sets the value of the '{@link ModiscoTGG.ClassInnerAnonClassMember__Marker#getCREATE__CORR__tInnerTypeToTInnerAbstractType <em>CREATE CORR tInner Type To TInner Abstract Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR tInner Type To TInner Abstract Type</em>' reference.
	 * @see #getCREATE__CORR__tInnerTypeToTInnerAbstractType()
	 * @generated
	 */
	void setCREATE__CORR__tInnerTypeToTInnerAbstractType(TypeToTAbstractType value);

} // ClassInnerAnonClassMember__Marker
