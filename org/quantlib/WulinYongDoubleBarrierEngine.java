/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class WulinYongDoubleBarrierEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected WulinYongDoubleBarrierEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.WulinYongDoubleBarrierEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(WulinYongDoubleBarrierEngine obj) {
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
        QuantLibJNI.delete_WulinYongDoubleBarrierEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public WulinYongDoubleBarrierEngine(GeneralizedBlackScholesProcess process, int series) {
    this(QuantLibJNI.new_WulinYongDoubleBarrierEngine__SWIG_0(GeneralizedBlackScholesProcess.getCPtr(process), process, series), true);
  }

  public WulinYongDoubleBarrierEngine(GeneralizedBlackScholesProcess process) {
    this(QuantLibJNI.new_WulinYongDoubleBarrierEngine__SWIG_1(GeneralizedBlackScholesProcess.getCPtr(process), process), true);
  }

}
