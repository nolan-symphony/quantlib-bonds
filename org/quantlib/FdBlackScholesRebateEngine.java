/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdBlackScholesRebateEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdBlackScholesRebateEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdBlackScholesRebateEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdBlackScholesRebateEngine obj) {
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
        QuantLibJNI.delete_FdBlackScholesRebateEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdBlackScholesRebateEngine(GeneralizedBlackScholesProcess process, long tGrid, long xGrid, long dampingSteps, FdmSchemeDesc schemeDesc, boolean localVol, double illegalLocalVolOverwrite) {
    this(QuantLibJNI.new_FdBlackScholesRebateEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(process), process, tGrid, xGrid, dampingSteps, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc, localVol, illegalLocalVolOverwrite), true);
  }

  public FdBlackScholesRebateEngine(GeneralizedBlackScholesProcess process, long tGrid, long xGrid, long dampingSteps, FdmSchemeDesc schemeDesc, boolean localVol) {
    this(QuantLibJNI.new_FdBlackScholesRebateEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(process), process, tGrid, xGrid, dampingSteps, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc, localVol), true);
  }

  public FdBlackScholesRebateEngine(GeneralizedBlackScholesProcess process, long tGrid, long xGrid, long dampingSteps, FdmSchemeDesc schemeDesc) {
    this(QuantLibJNI.new_FdBlackScholesRebateEngine__SWIG_2(GeneralizedBlackScholesProcess.getCPtr(process), process, tGrid, xGrid, dampingSteps, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc), true);
  }

  public FdBlackScholesRebateEngine(GeneralizedBlackScholesProcess process, long tGrid, long xGrid, long dampingSteps) {
    this(QuantLibJNI.new_FdBlackScholesRebateEngine__SWIG_3(GeneralizedBlackScholesProcess.getCPtr(process), process, tGrid, xGrid, dampingSteps), true);
  }

  public FdBlackScholesRebateEngine(GeneralizedBlackScholesProcess process, long tGrid, long xGrid) {
    this(QuantLibJNI.new_FdBlackScholesRebateEngine__SWIG_4(GeneralizedBlackScholesProcess.getCPtr(process), process, tGrid, xGrid), true);
  }

  public FdBlackScholesRebateEngine(GeneralizedBlackScholesProcess process, long tGrid) {
    this(QuantLibJNI.new_FdBlackScholesRebateEngine__SWIG_5(GeneralizedBlackScholesProcess.getCPtr(process), process, tGrid), true);
  }

  public FdBlackScholesRebateEngine(GeneralizedBlackScholesProcess process) {
    this(QuantLibJNI.new_FdBlackScholesRebateEngine__SWIG_6(GeneralizedBlackScholesProcess.getCPtr(process), process), true);
  }

}