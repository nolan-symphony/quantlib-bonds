/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Coupon extends CashFlow {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Coupon(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Coupon_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Coupon obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        QuantLibJNI.delete_Coupon(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public double nominal() {
    return QuantLibJNI.Coupon_nominal(swigCPtr, this);
  }

  public Date accrualStartDate() {
    return new Date(QuantLibJNI.Coupon_accrualStartDate(swigCPtr, this), true);
  }

  public Date accrualEndDate() {
    return new Date(QuantLibJNI.Coupon_accrualEndDate(swigCPtr, this), true);
  }

  public Date referencePeriodStart() {
    return new Date(QuantLibJNI.Coupon_referencePeriodStart(swigCPtr, this), true);
  }

  public Date referencePeriodEnd() {
    return new Date(QuantLibJNI.Coupon_referencePeriodEnd(swigCPtr, this), true);
  }

  public Date exCouponDate() {
    return new Date(QuantLibJNI.Coupon_exCouponDate(swigCPtr, this), true);
  }

  public double rate() {
    return QuantLibJNI.Coupon_rate(swigCPtr, this);
  }

  public double accrualPeriod() {
    return QuantLibJNI.Coupon_accrualPeriod(swigCPtr, this);
  }

  public int accrualDays() {
    return QuantLibJNI.Coupon_accrualDays(swigCPtr, this);
  }

  public DayCounter dayCounter() {
    return new DayCounter(QuantLibJNI.Coupon_dayCounter(swigCPtr, this), true);
  }

  public double accruedAmount(Date date) {
    return QuantLibJNI.Coupon_accruedAmount(swigCPtr, this, Date.getCPtr(date), date);
  }

}
