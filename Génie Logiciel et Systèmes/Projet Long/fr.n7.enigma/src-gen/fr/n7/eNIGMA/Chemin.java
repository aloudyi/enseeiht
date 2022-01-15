/**
 * generated by Xtext 2.25.0
 */
package fr.n7.eNIGMA;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chemin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.eNIGMA.Chemin#getEtatc <em>Etatc</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.Chemin#getConditionc <em>Conditionc</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.Chemin#getEtato <em>Etato</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.Chemin#getConditiono <em>Conditiono</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.Chemin#getEtatv <em>Etatv</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.Chemin#getConditionv <em>Conditionv</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.Chemin#getPrecedent <em>Precedent</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.Chemin#getSuivant <em>Suivant</em>}</li>
 * </ul>
 *
 * @see fr.n7.eNIGMA.ENIGMAPackage#getChemin()
 * @model
 * @generated
 */
public interface Chemin extends JeuElement
{
  /**
   * Returns the value of the '<em><b>Etatc</b></em>' attribute.
   * The literals are from the enumeration {@link fr.n7.eNIGMA.EtatChemin}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Etatc</em>' attribute.
   * @see fr.n7.eNIGMA.EtatChemin
   * @see #setEtatc(EtatChemin)
   * @see fr.n7.eNIGMA.ENIGMAPackage#getChemin_Etatc()
   * @model
   * @generated
   */
  EtatChemin getEtatc();

  /**
   * Sets the value of the '{@link fr.n7.eNIGMA.Chemin#getEtatc <em>Etatc</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Etatc</em>' attribute.
   * @see fr.n7.eNIGMA.EtatChemin
   * @see #getEtatc()
   * @generated
   */
  void setEtatc(EtatChemin value);

  /**
   * Returns the value of the '<em><b>Conditionc</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditionc</em>' reference.
   * @see #setConditionc(Condition)
   * @see fr.n7.eNIGMA.ENIGMAPackage#getChemin_Conditionc()
   * @model
   * @generated
   */
  Condition getConditionc();

  /**
   * Sets the value of the '{@link fr.n7.eNIGMA.Chemin#getConditionc <em>Conditionc</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditionc</em>' reference.
   * @see #getConditionc()
   * @generated
   */
  void setConditionc(Condition value);

  /**
   * Returns the value of the '<em><b>Etato</b></em>' attribute.
   * The literals are from the enumeration {@link fr.n7.eNIGMA.EtatObligation}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Etato</em>' attribute.
   * @see fr.n7.eNIGMA.EtatObligation
   * @see #setEtato(EtatObligation)
   * @see fr.n7.eNIGMA.ENIGMAPackage#getChemin_Etato()
   * @model
   * @generated
   */
  EtatObligation getEtato();

  /**
   * Sets the value of the '{@link fr.n7.eNIGMA.Chemin#getEtato <em>Etato</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Etato</em>' attribute.
   * @see fr.n7.eNIGMA.EtatObligation
   * @see #getEtato()
   * @generated
   */
  void setEtato(EtatObligation value);

  /**
   * Returns the value of the '<em><b>Conditiono</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditiono</em>' reference.
   * @see #setConditiono(Condition)
   * @see fr.n7.eNIGMA.ENIGMAPackage#getChemin_Conditiono()
   * @model
   * @generated
   */
  Condition getConditiono();

  /**
   * Sets the value of the '{@link fr.n7.eNIGMA.Chemin#getConditiono <em>Conditiono</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditiono</em>' reference.
   * @see #getConditiono()
   * @generated
   */
  void setConditiono(Condition value);

  /**
   * Returns the value of the '<em><b>Etatv</b></em>' attribute.
   * The literals are from the enumeration {@link fr.n7.eNIGMA.EtatVisibilite}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Etatv</em>' attribute.
   * @see fr.n7.eNIGMA.EtatVisibilite
   * @see #setEtatv(EtatVisibilite)
   * @see fr.n7.eNIGMA.ENIGMAPackage#getChemin_Etatv()
   * @model
   * @generated
   */
  EtatVisibilite getEtatv();

  /**
   * Sets the value of the '{@link fr.n7.eNIGMA.Chemin#getEtatv <em>Etatv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Etatv</em>' attribute.
   * @see fr.n7.eNIGMA.EtatVisibilite
   * @see #getEtatv()
   * @generated
   */
  void setEtatv(EtatVisibilite value);

  /**
   * Returns the value of the '<em><b>Conditionv</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditionv</em>' reference.
   * @see #setConditionv(Condition)
   * @see fr.n7.eNIGMA.ENIGMAPackage#getChemin_Conditionv()
   * @model
   * @generated
   */
  Condition getConditionv();

  /**
   * Sets the value of the '{@link fr.n7.eNIGMA.Chemin#getConditionv <em>Conditionv</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditionv</em>' reference.
   * @see #getConditionv()
   * @generated
   */
  void setConditionv(Condition value);

  /**
   * Returns the value of the '<em><b>Precedent</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Precedent</em>' reference.
   * @see #setPrecedent(Lieu)
   * @see fr.n7.eNIGMA.ENIGMAPackage#getChemin_Precedent()
   * @model
   * @generated
   */
  Lieu getPrecedent();

  /**
   * Sets the value of the '{@link fr.n7.eNIGMA.Chemin#getPrecedent <em>Precedent</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Precedent</em>' reference.
   * @see #getPrecedent()
   * @generated
   */
  void setPrecedent(Lieu value);

  /**
   * Returns the value of the '<em><b>Suivant</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Suivant</em>' reference.
   * @see #setSuivant(Lieu)
   * @see fr.n7.eNIGMA.ENIGMAPackage#getChemin_Suivant()
   * @model
   * @generated
   */
  Lieu getSuivant();

  /**
   * Sets the value of the '{@link fr.n7.eNIGMA.Chemin#getSuivant <em>Suivant</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Suivant</em>' reference.
   * @see #getSuivant()
   * @generated
   */
  void setSuivant(Lieu value);

} // Chemin
