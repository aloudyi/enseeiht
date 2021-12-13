/**
 * generated by Xtext 2.23.0
 */
package fr.n7.eNIGMA;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.eNIGMA.Personne#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.Personne#getTexte <em>Texte</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.Personne#getInteraction <em>Interaction</em>}</li>
 * </ul>
 *
 * @see fr.n7.eNIGMA.ENIGMAPackage#getPersonne()
 * @model
 * @generated
 */
public interface Personne extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.n7.eNIGMA.ENIGMAPackage#getPersonne_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.n7.eNIGMA.Personne#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Texte</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Texte</em>' containment reference.
   * @see #setTexte(Qualification)
   * @see fr.n7.eNIGMA.ENIGMAPackage#getPersonne_Texte()
   * @model containment="true"
   * @generated
   */
  Qualification getTexte();

  /**
   * Sets the value of the '{@link fr.n7.eNIGMA.Personne#getTexte <em>Texte</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Texte</em>' containment reference.
   * @see #getTexte()
   * @generated
   */
  void setTexte(Qualification value);

  /**
   * Returns the value of the '<em><b>Interaction</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interaction</em>' containment reference.
   * @see #setInteraction(Interaction)
   * @see fr.n7.eNIGMA.ENIGMAPackage#getPersonne_Interaction()
   * @model containment="true"
   * @generated
   */
  Interaction getInteraction();

  /**
   * Sets the value of the '{@link fr.n7.eNIGMA.Personne#getInteraction <em>Interaction</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interaction</em>' containment reference.
   * @see #getInteraction()
   * @generated
   */
  void setInteraction(Interaction value);

} // Personne
