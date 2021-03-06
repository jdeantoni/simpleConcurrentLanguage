/**
 * generated by Xtext 2.25.0
 */
package fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.concurrLang.impl;

import fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.concurrLang.ConcurrLangPackage;
import fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.concurrLang.Fork;
import fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.concurrLang.Join;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.univcotedazur.i3s.kairos.moccml.example.concurrlang.concurrLang.impl.JoinImpl#getFork <em>Fork</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinImpl extends StatementsImpl implements Join
{
  /**
   * The cached value of the '{@link #getFork() <em>Fork</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFork()
   * @generated
   * @ordered
   */
  protected Fork fork;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected JoinImpl()
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
    return ConcurrLangPackage.Literals.JOIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Fork getFork()
  {
    if (fork != null && fork.eIsProxy())
    {
      InternalEObject oldFork = (InternalEObject)fork;
      fork = (Fork)eResolveProxy(oldFork);
      if (fork != oldFork)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConcurrLangPackage.JOIN__FORK, oldFork, fork));
      }
    }
    return fork;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fork basicGetFork()
  {
    return fork;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFork(Fork newFork)
  {
    Fork oldFork = fork;
    fork = newFork;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ConcurrLangPackage.JOIN__FORK, oldFork, fork));
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
      case ConcurrLangPackage.JOIN__FORK:
        if (resolve) return getFork();
        return basicGetFork();
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
      case ConcurrLangPackage.JOIN__FORK:
        setFork((Fork)newValue);
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
      case ConcurrLangPackage.JOIN__FORK:
        setFork((Fork)null);
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
      case ConcurrLangPackage.JOIN__FORK:
        return fork != null;
    }
    return super.eIsSet(featureID);
  }

} //JoinImpl
