/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class AnalyticBSMHullWhiteEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected AnalyticBSMHullWhiteEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.AnalyticBSMHullWhiteEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AnalyticBSMHullWhiteEngine obj) {
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
        QuantLibJNI.delete_AnalyticBSMHullWhiteEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AnalyticBSMHullWhiteEngine(double equityShortRateCorrelation, GeneralizedBlackScholesProcess arg1, HullWhite arg2) {
    this(QuantLibJNI.new_AnalyticBSMHullWhiteEngine(equityShortRateCorrelation, GeneralizedBlackScholesProcess.getCPtr(arg1), arg1, HullWhite.getCPtr(arg2), arg2), true);
  }

}