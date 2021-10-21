/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class AnalyticHestonHullWhiteEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected AnalyticHestonHullWhiteEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.AnalyticHestonHullWhiteEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AnalyticHestonHullWhiteEngine obj) {
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
        QuantLibJNI.delete_AnalyticHestonHullWhiteEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AnalyticHestonHullWhiteEngine(HestonModel hestonModel, SWIGTYPE_p_ext__shared_ptrT_HullWhite_t hullWhiteModel, long integrationOrder) {
    this(QuantLibJNI.new_AnalyticHestonHullWhiteEngine__SWIG_0(HestonModel.getCPtr(hestonModel), hestonModel, SWIGTYPE_p_ext__shared_ptrT_HullWhite_t.getCPtr(hullWhiteModel), integrationOrder), true);
  }

  public AnalyticHestonHullWhiteEngine(HestonModel hestonModel, SWIGTYPE_p_ext__shared_ptrT_HullWhite_t hullWhiteModel) {
    this(QuantLibJNI.new_AnalyticHestonHullWhiteEngine__SWIG_1(HestonModel.getCPtr(hestonModel), hestonModel, SWIGTYPE_p_ext__shared_ptrT_HullWhite_t.getCPtr(hullWhiteModel)), true);
  }

  public AnalyticHestonHullWhiteEngine(HestonModel model, SWIGTYPE_p_ext__shared_ptrT_HullWhite_t hullWhiteModel, double relTolerance, long maxEvaluations) {
    this(QuantLibJNI.new_AnalyticHestonHullWhiteEngine__SWIG_2(HestonModel.getCPtr(model), model, SWIGTYPE_p_ext__shared_ptrT_HullWhite_t.getCPtr(hullWhiteModel), relTolerance, maxEvaluations), true);
  }

}
