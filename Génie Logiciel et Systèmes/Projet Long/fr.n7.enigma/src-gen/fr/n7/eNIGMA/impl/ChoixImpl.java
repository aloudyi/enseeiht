/**
 * generated by Xtext 2.25.0
 */
package fr.n7.eNIGMA.impl;

import fr.n7.eNIGMA.Choix;
import fr.n7.eNIGMA.Condition;
import fr.n7.eNIGMA.ENIGMAPackage;
import fr.n7.eNIGMA.Reponse;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Choix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.eNIGMA.impl.ChoixImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.impl.ChoixImpl#getReponses <em>Reponses</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.impl.ChoixImpl#getConditions <em>Conditions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChoixImpl extends JeuElementImpl implements Choix
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
   * The cached value of the '{@link #getReponses() <em>Reponses</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReponses()
   * @generated
   * @ordered
   */
  protected EList<Reponse> reponses;

  /**
   * The cached value of the '{@link #getConditions() <em>Conditions</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditions()
   * @generated
   * @ordered
   */
  protected EList<Condition> conditions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChoixImpl()
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
    return ENIGMAPackage.Literals.CHOIX;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ENIGMAPackage.CHOIX__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Reponse> getReponses()
  {
    if (reponses == null)
    {
      reponses = new EObjectContainmentEList<Reponse>(Reponse.class, this, ENIGMAPackage.CHOIX__REPONSES);
    }
    return reponses;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Condition> getConditions()
  {
    if (conditions == null)
    {
      conditions = new EObjectResolvingEList<Condition>(Condition.class, this, ENIGMAPackage.CHOIX__CONDITIONS);
    }
    return conditions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ENIGMAPackage.CHOIX__REPONSES:
        return ((InternalEList<?>)getReponses()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case ENIGMAPackage.CHOIX__NAME:
        return getName();
      case ENIGMAPackage.CHOIX__REPONSES:
        return getReponses();
      case ENIGMAPackage.CHOIX__CONDITIONS:
        return getConditions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ENIGMAPackage.CHOIX__NAME:
        setName((String)newValue);
        return;
      case ENIGMAPackage.CHOIX__REPONSES:
        getReponses().clear();
        getReponses().addAll((Collection<? extends Reponse>)newValue);
        return;
      case ENIGMAPackage.CHOIX__CONDITIONS:
        getConditions().clear();
        getConditions().addAll((Collection<? extends Condition>)newValue);
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
      case ENIGMAPackage.CHOIX__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ENIGMAPackage.CHOIX__REPONSES:
        getReponses().clear();
        return;
      case ENIGMAPackage.CHOIX__CONDITIONS:
        getConditions().clear();
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
      case ENIGMAPackage.CHOIX__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ENIGMAPackage.CHOIX__REPONSES:
        return reponses != null && !reponses.isEmpty();
      case ENIGMAPackage.CHOIX__CONDITIONS:
        return conditions != null && !conditions.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //ChoixImpl
