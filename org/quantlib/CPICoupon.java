/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CPICoupon extends InflationCoupon {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected CPICoupon(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CPICoupon_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CPICoupon obj) {
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
        QuantLibJNI.delete_CPICoupon(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public double fixedRate() {
    return QuantLibJNI.CPICoupon_fixedRate(swigCPtr, this);
  }

  public double spread() {
    return QuantLibJNI.CPICoupon_spread(swigCPtr, this);
  }

  public double adjustedFixing() {
    return QuantLibJNI.CPICoupon_adjustedFixing(swigCPtr, this);
  }

  public double baseCPI() {
    return QuantLibJNI.CPICoupon_baseCPI(swigCPtr, this);
  }

  public CPI.InterpolationType observationInterpolation() {
    return CPI.InterpolationType.swigToEnum(QuantLibJNI.CPICoupon_observationInterpolation(swigCPtr, this));
  }

  public ZeroInflationIndex cpiIndex() {
    long cPtr = QuantLibJNI.CPICoupon_cpiIndex(swigCPtr, this);
    return (cPtr == 0) ? null : new ZeroInflationIndex(cPtr, true);
  }

}