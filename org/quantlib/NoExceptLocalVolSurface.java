/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class NoExceptLocalVolSurface extends LocalVolSurface {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected NoExceptLocalVolSurface(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.NoExceptLocalVolSurface_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NoExceptLocalVolSurface obj) {
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
        QuantLibJNI.delete_NoExceptLocalVolSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NoExceptLocalVolSurface(BlackVolTermStructureHandle blackTS, YieldTermStructureHandle riskFreeTS, YieldTermStructureHandle dividendTS, QuoteHandle underlying, double illegalLocalVolOverwrite) {
    this(QuantLibJNI.new_NoExceptLocalVolSurface__SWIG_0(BlackVolTermStructureHandle.getCPtr(blackTS), blackTS, YieldTermStructureHandle.getCPtr(riskFreeTS), riskFreeTS, YieldTermStructureHandle.getCPtr(dividendTS), dividendTS, QuoteHandle.getCPtr(underlying), underlying, illegalLocalVolOverwrite), true);
  }

  public NoExceptLocalVolSurface(BlackVolTermStructureHandle blackTS, YieldTermStructureHandle riskFreeTS, YieldTermStructureHandle dividendTS, double underlying, double illegalLocalVolOverwrite) {
    this(QuantLibJNI.new_NoExceptLocalVolSurface__SWIG_1(BlackVolTermStructureHandle.getCPtr(blackTS), blackTS, YieldTermStructureHandle.getCPtr(riskFreeTS), riskFreeTS, YieldTermStructureHandle.getCPtr(dividendTS), dividendTS, underlying, illegalLocalVolOverwrite), true);
  }

}
