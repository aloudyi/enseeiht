/**
 * generated by Xtext 2.25.0
 */
package fr.n7.eNIGMA.impl;

import fr.n7.eNIGMA.Action;
import fr.n7.eNIGMA.ENIGMAPackage;
import fr.n7.eNIGMA.Qualification;
import fr.n7.eNIGMA.Reponse;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reponse</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.eNIGMA.impl.ReponseImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.impl.ReponseImpl#getTexte <em>Texte</em>}</li>
 *   <li>{@link fr.n7.eNIGMA.impl.ReponseImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReponseImpl extends JeuElementImpl implements Reponse
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
   * The cached value of the '{@link #getTexte() <em>Texte</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTexte()
   * @generated
   * @ordered
   */
  protected Qualification texte;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReponseImpl()
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
    return ENIGMAPackage.Literals.REPONSE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, ENIGMAPackage.REPONSE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Qualification getTexte()
  {
    return texte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTexte(Qualification newTexte, NotificationChain msgs)
  {
    Qualification oldTexte = texte;
    texte = newTexte;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ENIGMAPackage.REPONSE__TEXTE, oldTexte, newTexte);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTexte(Qualification newTexte)
  {
    if (newTexte != texte)
    {
      NotificationChain msgs = null;
      if (texte != null)
        msgs = ((InternalEObject)texte).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ENIGMAPackage.REPONSE__TEXTE, null, msgs);
      if (newTexte != null)
        msgs = ((InternalEObject)newTexte).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ENIGMAPackage.REPONSE__TEXTE, null, msgs);
      msgs = basicSetTexte(newTexte, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ENIGMAPackage.REPONSE__TEXTE, newTexte, newTexte));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action getAction()
  {
    if (action != null && action.eIsProxy())
    {
      InternalEObject oldAction = (InternalEObject)action;
      action = (Action)eResolveProxy(oldAction);
      if (action != oldAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ENIGMAPackage.REPONSE__ACTION, oldAction, action));
      }
    }
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action basicGetAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setAction(Action newAction)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ENIGMAPackage.REPONSE__ACTION, oldAction, action));
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
      case ENIGMAPackage.REPONSE__TEXTE:
        return basicSetTexte(null, msgs);
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
      case ENIGMAPackage.REPONSE__NAME:
        return getName();
      case ENIGMAPackage.REPONSE__TEXTE:
        return getTexte();
      case ENIGMAPackage.REPONSE__ACTION:
        if (resolve) return getAction();
        return basicGetAction();
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
      case ENIGMAPackage.REPONSE__NAME:
        setName((String)newValue);
        return;
      case ENIGMAPackage.REPONSE__TEXTE:
        setTexte((Qualification)newValue);
        return;
      case ENIGMAPackage.REPONSE__ACTION:
        setAction((Action)newValue);
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
      case ENIGMAPackage.REPONSE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ENIGMAPackage.REPONSE__TEXTE:
        setTexte((Qualification)null);
        return;
      case ENIGMAPackage.REPONSE__ACTION:
        setAction((Action)null);
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
      case ENIGMAPackage.REPONSE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ENIGMAPackage.REPONSE__TEXTE:
        return texte != null;
      case ENIGMAPackage.REPONSE__ACTION:
        return action != null;
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

} //ReponseImpl
