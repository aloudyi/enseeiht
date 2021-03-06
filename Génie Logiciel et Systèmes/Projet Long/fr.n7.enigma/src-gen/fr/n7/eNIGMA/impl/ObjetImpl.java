/**
 * generated by Xtext 2.25.0
 */
package fr.n7.eNIGMA.impl;

import fr.n7.eNIGMA.ENIGMAPackage;
import fr.n7.eNIGMA.EtatPossession;
import fr.n7.eNIGMA.EtatVisibilite;
import fr.n7.eNIGMA.Objet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.eNIGMA.impl.ObjetImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.impl.ObjetImpl#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.impl.ObjetImpl#getTaille <em>Taille</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.impl.ObjetImpl#getEtatv <em>Etatv</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.impl.ObjetImpl#getEtatp <em>Etatp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjetImpl extends JeuElementImpl implements Objet
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccurrence()
   * @generated
   * @ordered
   */
  protected static final int OCCURRENCE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOccurrence()
   * @generated
   * @ordered
   */
  protected int occurrence = OCCURRENCE_EDEFAULT;

  /**
   * The default value of the '{@link #getTaille() <em>Taille</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaille()
   * @generated
   * @ordered
   */
  protected static final int TAILLE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTaille() <em>Taille</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaille()
   * @generated
   * @ordered
   */
  protected int taille = TAILLE_EDEFAULT;

  /**
   * The default value of the '{@link #getEtatv() <em>Etatv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEtatv()
   * @generated
   * @ordered
   */
  protected static final EtatVisibilite ETATV_EDEFAULT = EtatVisibilite.VISIBLE;

  /**
   * The cached value of the '{@link #getEtatv() <em>Etatv</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEtatv()
   * @generated
   * @ordered
   */
  protected EtatVisibilite etatv = ETATV_EDEFAULT;

  /**
   * The default value of the '{@link #getEtatp() <em>Etatp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEtatp()
   * @generated
   * @ordered
   */
  protected static final EtatPossession ETATP_EDEFAULT = EtatPossession.POSSEDE;

  /**
   * The cached value of the '{@link #getEtatp() <em>Etatp</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEtatp()
   * @generated
   * @ordered
   */
  protected EtatPossession etatp = ETATP_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ObjetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ENIGMAPackage.Literals.OBJET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ENIGMAPackage.OBJET__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getOccurrence()
  {
    return occurrence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOccurrence(int newOccurrence)
  {
    int oldOccurrence = occurrence;
    occurrence = newOccurrence;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ENIGMAPackage.OBJET__OCCURRENCE, oldOccurrence, occurrence));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getTaille()
  {
    return taille;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTaille(int newTaille)
  {
    int oldTaille = taille;
    taille = newTaille;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ENIGMAPackage.OBJET__TAILLE, oldTaille, taille));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EtatVisibilite getEtatv()
  {
    return etatv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEtatv(EtatVisibilite newEtatv)
  {
    EtatVisibilite oldEtatv = etatv;
    etatv = newEtatv == null ? ETATV_EDEFAULT : newEtatv;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ENIGMAPackage.OBJET__ETATV, oldEtatv, etatv));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EtatPossession getEtatp()
  {
    return etatp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setEtatp(EtatPossession newEtatp)
  {
    EtatPossession oldEtatp = etatp;
    etatp = newEtatp == null ? ETATP_EDEFAULT : newEtatp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ENIGMAPackage.OBJET__ETATP, oldEtatp, etatp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ENIGMAPackage.OBJET__NAME:
        return getName();
      case ENIGMAPackage.OBJET__OCCURRENCE:
        return getOccurrence();
      case ENIGMAPackage.OBJET__TAILLE:
        return getTaille();
      case ENIGMAPackage.OBJET__ETATV:
        return getEtatv();
      case ENIGMAPackage.OBJET__ETATP:
        return getEtatp();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ENIGMAPackage.OBJET__NAME:
        setName((String)newValue);
        return;
      case ENIGMAPackage.OBJET__OCCURRENCE:
        setOccurrence((Integer)newValue);
        return;
      case ENIGMAPackage.OBJET__TAILLE:
        setTaille((Integer)newValue);
        return;
      case ENIGMAPackage.OBJET__ETATV:
        setEtatv((EtatVisibilite)newValue);
        return;
      case ENIGMAPackage.OBJET__ETATP:
        setEtatp((EtatPossession)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ENIGMAPackage.OBJET__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ENIGMAPackage.OBJET__OCCURRENCE:
        setOccurrence(OCCURRENCE_EDEFAULT);
        return;
      case ENIGMAPackage.OBJET__TAILLE:
        setTaille(TAILLE_EDEFAULT);
        return;
      case ENIGMAPackage.OBJET__ETATV:
        setEtatv(ETATV_EDEFAULT);
        return;
      case ENIGMAPackage.OBJET__ETATP:
        setEtatp(ETATP_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ENIGMAPackage.OBJET__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ENIGMAPackage.OBJET__OCCURRENCE:
        return occurrence != OCCURRENCE_EDEFAULT;
      case ENIGMAPackage.OBJET__TAILLE:
        return taille != TAILLE_EDEFAULT;
      case ENIGMAPackage.OBJET__ETATV:
        return etatv != ETATV_EDEFAULT;
      case ENIGMAPackage.OBJET__ETATP:
        return etatp != ETATP_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", occurrence: ");
    result.append(occurrence);
    result.append(", taille: ");
    result.append(taille);
    result.append(", etatv: ");
    result.append(etatv);
    result.append(", etatp: ");
    result.append(etatp);
    result.append(')');
    return result.toString();
  }

} //ObjetImpl
