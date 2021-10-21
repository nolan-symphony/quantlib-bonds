/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdHestonHullWhiteVanillaEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdHestonHullWhiteVanillaEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdHestonHullWhiteVanillaEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdHestonHullWhiteVanillaEngine obj) {
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
        QuantLibJNI.delete_FdHestonHullWhiteVanillaEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdHestonHullWhiteVanillaEngine(HestonModel model, HullWhiteProcess hwProcess, double corrEquityShortRate, long tGrid, long xGrid, long vGrid, long rGrid, long dampingSteps, boolean controlVariate, FdmSchemeDesc schemeDesc) {
    this(QuantLibJNI.new_FdHestonHullWhiteVanillaEngine__SWIG_0(HestonModel.getCPtr(model), model, HullWhiteProcess.getCPtr(hwProcess), hwProcess, corrEquityShortRate, tGrid, xGrid, vGrid, rGrid, dampingSteps, controlVariate, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc), true);
  }

  public FdHestonHullWhiteVanillaEngine(HestonModel model, HullWhiteProcess hwProcess, double corrEquityShortRate, long tGrid, long xGrid, long vGrid, long rGrid, long dampingSteps, boolean controlVariate) {
    this(QuantLibJNI.new_FdHestonHullWhiteVanillaEngine__SWIG_1(HestonModel.getCPtr(model), model, HullWhiteProcess.getCPtr(hwProcess), hwProcess, corrEquityShortRate, tGrid, xGrid, vGrid, rGrid, dampingSteps, controlVariate), true);
  }

  public FdHestonHullWhiteVanillaEngine(HestonModel model, HullWhiteProcess hwProcess, double corrEquityShortRate, long tGrid, long xGrid, long vGrid, long rGrid, long dampingSteps) {
    this(QuantLibJNI.new_FdHestonHullWhiteVanillaEngine__SWIG_2(HestonModel.getCPtr(model), model, HullWhiteProcess.getCPtr(hwProcess), hwProcess, corrEquityShortRate, tGrid, xGrid, vGrid, rGrid, dampingSteps), true);
  }

  public FdHestonHullWhiteVanillaEngine(HestonModel model, HullWhiteProcess hwProcess, double corrEquityShortRate, long tGrid, long xGrid, long vGrid, long rGrid) {
    this(QuantLibJNI.new_FdHestonHullWhiteVanillaEngine__SWIG_3(HestonModel.getCPtr(model), model, HullWhiteProcess.getCPtr(hwProcess), hwProcess, corrEquityShortRate, tGrid, xGrid, vGrid, rGrid), true);
  }

  public FdHestonHullWhiteVanillaEngine(HestonModel model, HullWhiteProcess hwProcess, double corrEquityShortRate, long tGrid, long xGrid, long vGrid) {
    this(QuantLibJNI.new_FdHestonHullWhiteVanillaEngine__SWIG_4(HestonModel.getCPtr(model), model, HullWhiteProcess.getCPtr(hwProcess), hwProcess, corrEquityShortRate, tGrid, xGrid, vGrid), true);
  }

  public FdHestonHullWhiteVanillaEngine(HestonModel model, HullWhiteProcess hwProcess, double corrEquityShortRate, long tGrid, long xGrid) {
    this(QuantLibJNI.new_FdHestonHullWhiteVanillaEngine__SWIG_5(HestonModel.getCPtr(model), model, HullWhiteProcess.getCPtr(hwProcess), hwProcess, corrEquityShortRate, tGrid, xGrid), true);
  }

  public FdHestonHullWhiteVanillaEngine(HestonModel model, HullWhiteProcess hwProcess, double corrEquityShortRate, long tGrid) {
    this(QuantLibJNI.new_FdHestonHullWhiteVanillaEngine__SWIG_6(HestonModel.getCPtr(model), model, HullWhiteProcess.getCPtr(hwProcess), hwProcess, corrEquityShortRate, tGrid), true);
  }

  public FdHestonHullWhiteVanillaEngine(HestonModel model, HullWhiteProcess hwProcess, double corrEquityShortRate) {
    this(QuantLibJNI.new_FdHestonHullWhiteVanillaEngine__SWIG_7(HestonModel.getCPtr(model), model, HullWhiteProcess.getCPtr(hwProcess), hwProcess, corrEquityShortRate), true);
  }

}