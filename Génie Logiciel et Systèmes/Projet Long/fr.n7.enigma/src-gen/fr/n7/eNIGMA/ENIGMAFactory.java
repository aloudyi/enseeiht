/**
 * generated by Xtext 2.25.0
 */
package fr.n7.eNIGMA;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.n7.eNIGMA.ENIGMAPackage
 * @generated
 */
public interface ENIGMAFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ENIGMAFactory eINSTANCE = fr.n7.eNIGMA.impl.ENIGMAFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Jeu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jeu</em>'.
   * @generated
   */
  Jeu createJeu();

  /**
   * Returns a new object of class '<em>Jeu Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Jeu Element</em>'.
   * @generated
   */
  JeuElement createJeuElement();

  /**
   * Returns a new object of class '<em>Joueur</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Joueur</em>'.
   * @generated
   */
  Joueur createJoueur();

  /**
   * Returns a new object of class '<em>Connaissance</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Connaissance</em>'.
   * @generated
   */
  Connaissance createConnaissance();

  /**
   * Returns a new object of class '<em>Objet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Objet</em>'.
   * @generated
   */
  Objet createObjet();

  /**
   * Returns a new object of class '<em>Territoire</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Territoire</em>'.
   * @generated
   */
  Territoire createTerritoire();

  /**
   * Returns a new object of class '<em>Choix</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Choix</em>'.
   * @generated
   */
  Choix createChoix();

  /**
   * Returns a new object of class '<em>Interaction</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Interaction</em>'.
   * @generated
   */
  Interaction createInteraction();

  /**
   * Returns a new object of class '<em>Personne</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Personne</em>'.
   * @generated
   */
  Personne createPersonne();

  /**
   * Returns a new object of class '<em>Lieu</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lieu</em>'.
   * @generated
   */
  Lieu createLieu();

  /**
   * Returns a new object of class '<em>Chemin</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Chemin</em>'.
   * @generated
   */
  Chemin createChemin();

  /**
   * Returns a new object of class '<em>Qualification</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualification</em>'.
   * @generated
   */
  Qualification createQualification();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Reponse</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reponse</em>'.
   * @generated
   */
  Reponse createReponse();

  /**
   * Returns a new object of class '<em>Condition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition</em>'.
   * @generated
   */
  Condition createCondition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ENIGMAPackage getENIGMAPackage();

} //ENIGMAFactory
