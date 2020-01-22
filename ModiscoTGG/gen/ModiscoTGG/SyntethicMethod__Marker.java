/**
 */
package ModiscoTGG;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.modisco.java.ClassDeclaration;

import org.gravity.modisco.MMethodDefinition;
import org.gravity.modisco.MSyntheticMethodDefinition;

import org.gravity.typegraph.basic.TClass;
import org.gravity.typegraph.basic.TMethodDefinition;
import org.gravity.typegraph.basic.TMethodSignature;
import org.gravity.typegraph.basic.TSyntethicMethod;

import runtime.TGGRuleApplication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Syntethic Method Marker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__SRC__mClass <em>CONTEXT SRC mClass</em>}</li>
 *   <li>{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__SRC__mDef <em>CONTEXT SRC mDef</em>}</li>
 *   <li>{@link ModiscoTGG.SyntethicMethod__Marker#getCREATE__SRC__mSyntethic <em>CREATE SRC mSyntethic</em>}</li>
 *   <li>{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}</li>
 *   <li>{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__TRG__tDef <em>CONTEXT TRG tDef</em>}</li>
 *   <li>{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__TRG__tSig <em>CONTEXT TRG tSig</em>}</li>
 *   <li>{@link ModiscoTGG.SyntethicMethod__Marker#getCREATE__TRG__tSyntethic <em>CREATE TRG tSyntethic</em>}</li>
 *   <li>{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__CORR__mClassDeclarationToTClass <em>CONTEXT CORR mClass Declaration To TClass</em>}</li>
 *   <li>{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__CORR__mDefinitionToTMember <em>CONTEXT CORR mDefinition To TMember</em>}</li>
 *   <li>{@link ModiscoTGG.SyntethicMethod__Marker#getCREATE__CORR__mSyntToTSynt <em>CREATE CORR mSynt To TSynt</em>}</li>
 * </ul>
 *
 * @see ModiscoTGG.ModiscoTGGPackage#getSyntethicMethod__Marker()
 * @model
 * @generated
 */
public interface SyntethicMethod__Marker extends EObject, TGGRuleApplication {
	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mClass</em>' reference.
	 * @see #setCONTEXT__SRC__mClass(ClassDeclaration)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSyntethicMethod__Marker_CONTEXT__SRC__mClass()
	 * @model required="true"
	 * @generated
	 */
	ClassDeclaration getCONTEXT__SRC__mClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__SRC__mClass <em>CONTEXT SRC mClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mClass</em>' reference.
	 * @see #getCONTEXT__SRC__mClass()
	 * @generated
	 */
	void setCONTEXT__SRC__mClass(ClassDeclaration value);

	/**
	 * Returns the value of the '<em><b>CONTEXT SRC mDef</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT SRC mDef</em>' reference.
	 * @see #setCONTEXT__SRC__mDef(MMethodDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSyntethicMethod__Marker_CONTEXT__SRC__mDef()
	 * @model required="true"
	 * @generated
	 */
	MMethodDefinition getCONTEXT__SRC__mDef();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__SRC__mDef <em>CONTEXT SRC mDef</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT SRC mDef</em>' reference.
	 * @see #getCONTEXT__SRC__mDef()
	 * @generated
	 */
	void setCONTEXT__SRC__mDef(MMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>CREATE SRC mSyntethic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE SRC mSyntethic</em>' reference.
	 * @see #setCREATE__SRC__mSyntethic(MSyntheticMethodDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSyntethicMethod__Marker_CREATE__SRC__mSyntethic()
	 * @model required="true"
	 * @generated
	 */
	MSyntheticMethodDefinition getCREATE__SRC__mSyntethic();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SyntethicMethod__Marker#getCREATE__SRC__mSyntethic <em>CREATE SRC mSyntethic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE SRC mSyntethic</em>' reference.
	 * @see #getCREATE__SRC__mSyntethic()
	 * @generated
	 */
	void setCREATE__SRC__mSyntethic(MSyntheticMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tClass</em>' reference.
	 * @see #setCONTEXT__TRG__tClass(TClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSyntethicMethod__Marker_CONTEXT__TRG__tClass()
	 * @model required="true"
	 * @generated
	 */
	TClass getCONTEXT__TRG__tClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__TRG__tClass <em>CONTEXT TRG tClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tClass</em>' reference.
	 * @see #getCONTEXT__TRG__tClass()
	 * @generated
	 */
	void setCONTEXT__TRG__tClass(TClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tDef</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tDef</em>' reference.
	 * @see #setCONTEXT__TRG__tDef(TMethodDefinition)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSyntethicMethod__Marker_CONTEXT__TRG__tDef()
	 * @model required="true"
	 * @generated
	 */
	TMethodDefinition getCONTEXT__TRG__tDef();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__TRG__tDef <em>CONTEXT TRG tDef</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tDef</em>' reference.
	 * @see #getCONTEXT__TRG__tDef()
	 * @generated
	 */
	void setCONTEXT__TRG__tDef(TMethodDefinition value);

	/**
	 * Returns the value of the '<em><b>CONTEXT TRG tSig</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT TRG tSig</em>' reference.
	 * @see #setCONTEXT__TRG__tSig(TMethodSignature)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSyntethicMethod__Marker_CONTEXT__TRG__tSig()
	 * @model required="true"
	 * @generated
	 */
	TMethodSignature getCONTEXT__TRG__tSig();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__TRG__tSig <em>CONTEXT TRG tSig</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT TRG tSig</em>' reference.
	 * @see #getCONTEXT__TRG__tSig()
	 * @generated
	 */
	void setCONTEXT__TRG__tSig(TMethodSignature value);

	/**
	 * Returns the value of the '<em><b>CREATE TRG tSyntethic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE TRG tSyntethic</em>' reference.
	 * @see #setCREATE__TRG__tSyntethic(TSyntethicMethod)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSyntethicMethod__Marker_CREATE__TRG__tSyntethic()
	 * @model required="true"
	 * @generated
	 */
	TSyntethicMethod getCREATE__TRG__tSyntethic();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SyntethicMethod__Marker#getCREATE__TRG__tSyntethic <em>CREATE TRG tSyntethic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE TRG tSyntethic</em>' reference.
	 * @see #getCREATE__TRG__tSyntethic()
	 * @generated
	 */
	void setCREATE__TRG__tSyntethic(TSyntethicMethod value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mClass Declaration To TClass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mClass Declaration To TClass</em>' reference.
	 * @see #setCONTEXT__CORR__mClassDeclarationToTClass(ClassDeclarationToTClass)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSyntethicMethod__Marker_CONTEXT__CORR__mClassDeclarationToTClass()
	 * @model required="true"
	 * @generated
	 */
	ClassDeclarationToTClass getCONTEXT__CORR__mClassDeclarationToTClass();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__CORR__mClassDeclarationToTClass <em>CONTEXT CORR mClass Declaration To TClass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mClass Declaration To TClass</em>' reference.
	 * @see #getCONTEXT__CORR__mClassDeclarationToTClass()
	 * @generated
	 */
	void setCONTEXT__CORR__mClassDeclarationToTClass(ClassDeclarationToTClass value);

	/**
	 * Returns the value of the '<em><b>CONTEXT CORR mDefinition To TMember</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CONTEXT CORR mDefinition To TMember</em>' reference.
	 * @see #setCONTEXT__CORR__mDefinitionToTMember(MDefinitionToTMember)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSyntethicMethod__Marker_CONTEXT__CORR__mDefinitionToTMember()
	 * @model required="true"
	 * @generated
	 */
	MDefinitionToTMember getCONTEXT__CORR__mDefinitionToTMember();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SyntethicMethod__Marker#getCONTEXT__CORR__mDefinitionToTMember <em>CONTEXT CORR mDefinition To TMember</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CONTEXT CORR mDefinition To TMember</em>' reference.
	 * @see #getCONTEXT__CORR__mDefinitionToTMember()
	 * @generated
	 */
	void setCONTEXT__CORR__mDefinitionToTMember(MDefinitionToTMember value);

	/**
	 * Returns the value of the '<em><b>CREATE CORR mSynt To TSynt</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATE CORR mSynt To TSynt</em>' reference.
	 * @see #setCREATE__CORR__mSyntToTSynt(MSyntethicMethodToTSyntethicMethod)
	 * @see ModiscoTGG.ModiscoTGGPackage#getSyntethicMethod__Marker_CREATE__CORR__mSyntToTSynt()
	 * @model required="true"
	 * @generated
	 */
	MSyntethicMethodToTSyntethicMethod getCREATE__CORR__mSyntToTSynt();

	/**
	 * Sets the value of the '{@link ModiscoTGG.SyntethicMethod__Marker#getCREATE__CORR__mSyntToTSynt <em>CREATE CORR mSynt To TSynt</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATE CORR mSynt To TSynt</em>' reference.
	 * @see #getCREATE__CORR__mSyntToTSynt()
	 * @generated
	 */
	void setCREATE__CORR__mSyntToTSynt(MSyntethicMethodToTSyntethicMethod value);

} // SyntethicMethod__Marker
