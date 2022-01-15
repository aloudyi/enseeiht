/**
 * generated by Xtext 2.25.0
 */
package fr.n7.eNIGMA;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Territoire</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.eNIGMA.Territoire#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.Territoire#getLieuDebut <em>Lieu Debut</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.Territoire#getLieuxintermediaires <em>Lieuxintermediaires</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.Territoire#getLieuxFin <em>Lieux Fin</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.Territoire#getChemins <em>Chemins</em>}</li>
 * </ul>
 *
 * @see fr.n7.eNIGMA.ENIGMAPackage#getTerritoire()
 * @model
 * @generated
 */
public interface Territoire extends JeuElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see fr.n7.eNIGMA.ENIGMAPackage#getTerritoire_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link fr.n7.eNIGMA.Territoire#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Lieu Debut</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lieu Debut</em>' containment reference.
   * @see #setLieuDebut(Lieu)
   * @see fr.n7.eNIGMA.ENIGMAPackage#getTerritoire_LieuDebut()
   * @model containment="true"
   * @generated
   */
  Lieu getLieuDebut();

  /**
   * Sets the value of the '{@link fr.n7.eNIGMA.Territoire#getLieuDebut <em>Lieu Debut</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lieu Debut</em>' containment reference.
   * @see #getLieuDebut()
   * @generated
   */
  void setLieuDebut(Lieu value);

  /**
   * Returns the value of the '<em><b>Lieuxintermediaires</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.eNIGMA.Lieu}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lieuxintermediaires</em>' containment reference list.
   * @see fr.n7.eNIGMA.ENIGMAPackage#getTerritoire_Lieuxintermediaires()
   * @model containment="true"
   * @generated
   */
  EList<Lieu> getLieuxintermediaires();

  /**
   * Returns the value of the '<em><b>Lieux Fin</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.eNIGMA.Lieu}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lieux Fin</em>' containment reference list.
   * @see fr.n7.eNIGMA.ENIGMAPackage#getTerritoire_LieuxFin()
   * @model containment="true"
   * @generated
   */
  EList<Lieu> getLieuxFin();

  /**
   * Returns the value of the '<em><b>Chemins</b></em>' containment reference list.
   * The list contents are of type {@link fr.n7.eNIGMA.Chemin}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Chemins</em>' containment reference list.
   * @see fr.n7.eNIGMA.ENIGMAPackage#getTerritoire_Chemins()
   * @model containment="true"
   * @generated
   */
  EList<Chemin> getChemins();

} // Territoire
