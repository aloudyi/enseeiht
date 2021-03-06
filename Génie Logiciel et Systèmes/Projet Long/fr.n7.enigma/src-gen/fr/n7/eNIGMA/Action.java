/**
 * generated by Xtext 2.25.0
 */
package fr.n7.eNIGMA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.eNIGMA.Action#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.Action#getObjetsconsommables <em>Objetsconsommables</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.Action#getObjetsattribuables <em>Objetsattribuables</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.Action#getConnaissancesattribuables <em>Connaissancesattribuables</em>}</li>
 * </ul>
 *
 * @see fr.n7.eNIGMA.ENIGMAPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends JeuElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.n7.eNIGMA.ENIGMAPackage#getAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.n7.eNIGMA.Action#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Objetsconsommables</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.eNIGMA.Objet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objetsconsommables</em>' containment reference list.
   * @see fr.n7.eNIGMA.ENIGMAPackage#getAction_Objetsconsommables()
   * @model containment="true"
   * @generated
   */
  EList<Objet> getObjetsconsommables();

  /**
   * Returns the value of the '<em><b>Objetsattribuables</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.eNIGMA.Objet}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Objetsattribuables</em>' containment reference list.
   * @see fr.n7.eNIGMA.ENIGMAPackage#getAction_Objetsattribuables()
   * @model containment="true"
   * @generated
   */
  EList<Objet> getObjetsattribuables();

  /**
   * Returns the value of the '<em><b>Connaissancesattribuables</b></em>' reference list.
   * The list contents are of type {@link fr.n7.eNIGMA.Connaissance}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Connaissancesattribuables</em>' reference list.
   * @see fr.n7.eNIGMA.ENIGMAPackage#getAction_Connaissancesattribuables()
   * @model
   * @generated
   */
  EList<Connaissance> getConnaissancesattribuables();

} // Action
