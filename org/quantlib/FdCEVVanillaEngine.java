/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdCEVVanillaEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdCEVVanillaEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdCEVVanillaEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdCEVVanillaEngine obj) {
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
        QuantLibJNI.delete_FdCEVVanillaEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdCEVVanillaEngine(double f0, double alpha, double beta, YieldTermStructureHandle rTS, long tGrid, long xGrid, long dampingSteps, double scalingFactor, double eps, FdmSchemeDesc schemeDesc) {
    this(QuantLibJNI.new_FdCEVVanillaEngine__SWIG_0(f0, alpha, beta, YieldTermStructureHandle.getCPtr(rTS), rTS, tGrid, xGrid, dampingSteps, scalingFactor, eps, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc), true);
  }

  public FdCEVVanillaEngine(double f0, double alpha, double beta, YieldTermStructureHandle rTS, long tGrid, long xGrid, long dampingSteps, double scalingFactor, double eps) {
    this(QuantLibJNI.new_FdCEVVanillaEngine__SWIG_1(f0, alpha, beta, YieldTermStructureHandle.getCPtr(rTS), rTS, tGrid, xGrid, dampingSteps, scalingFactor, eps), true);
  }

  public FdCEVVanillaEngine(double f0, double alpha, double beta, YieldTermStructureHandle rTS, long tGrid, long xGrid, long dampingSteps, double scalingFactor) {
    this(QuantLibJNI.new_FdCEVVanillaEngine__SWIG_2(f0, alpha, beta, YieldTermStructureHandle.getCPtr(rTS), rTS, tGrid, xGrid, dampingSteps, scalingFactor), true);
  }

  public FdCEVVanillaEngine(double f0, double alpha, double beta, YieldTermStructureHandle rTS, long tGrid, long xGrid, long dampingSteps) {
    this(QuantLibJNI.new_FdCEVVanillaEngine__SWIG_3(f0, alpha, beta, YieldTermStructureHandle.getCPtr(rTS), rTS, tGrid, xGrid, dampingSteps), true);
  }

  public FdCEVVanillaEngine(double f0, double alpha, double beta, YieldTermStructureHandle rTS, long tGrid, long xGrid) {
    this(QuantLibJNI.new_FdCEVVanillaEngine__SWIG_4(f0, alpha, beta, YieldTermStructureHandle.getCPtr(rTS), rTS, tGrid, xGrid), true);
  }

  public FdCEVVanillaEngine(double f0, double alpha, double beta, YieldTermStructureHandle rTS, long tGrid) {
    this(QuantLibJNI.new_FdCEVVanillaEngine__SWIG_5(f0, alpha, beta, YieldTermStructureHandle.getCPtr(rTS), rTS, tGrid), true);
  }

  public FdCEVVanillaEngine(double f0, double alpha, double beta, YieldTermStructureHandle rTS) {
    this(QuantLibJNI.new_FdCEVVanillaEngine__SWIG_6(f0, alpha, beta, YieldTermStructureHandle.getCPtr(rTS), rTS), true);
  }

}
