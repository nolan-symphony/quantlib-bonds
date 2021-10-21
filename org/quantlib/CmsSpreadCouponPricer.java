/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CmsSpreadCouponPricer extends FloatingRateCouponPricer {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected CmsSpreadCouponPricer(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CmsSpreadCouponPricer_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CmsSpreadCouponPricer obj) {
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
        QuantLibJNI.delete_CmsSpreadCouponPricer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public QuoteHandle correlation() {
    return new QuoteHandle(QuantLibJNI.CmsSpreadCouponPricer_correlation(swigCPtr, this), true);
  }

  public void setCorrelation(QuoteHandle correlation) {
    QuantLibJNI.CmsSpreadCouponPricer_setCorrelation__SWIG_0(swigCPtr, this, QuoteHandle.getCPtr(correlation), correlation);
  }

  public void setCorrelation() {
    QuantLibJNI.CmsSpreadCouponPricer_setCorrelation__SWIG_1(swigCPtr, this);
  }

}
