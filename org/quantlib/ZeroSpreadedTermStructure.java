/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ZeroSpreadedTermStructure extends YieldTermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ZeroSpreadedTermStructure(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ZeroSpreadedTermStructure_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZeroSpreadedTermStructure obj) {
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
        QuantLibJNI.delete_ZeroSpreadedTermStructure(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ZeroSpreadedTermStructure(YieldTermStructureHandle curveHandle, QuoteHandle spreadHandle, Compounding comp, Frequency freq, DayCounter dc) {
    this(QuantLibJNI.new_ZeroSpreadedTermStructure__SWIG_0(YieldTermStructureHandle.getCPtr(curveHandle), curveHandle, QuoteHandle.getCPtr(spreadHandle), spreadHandle, comp.swigValue(), freq.swigValue(), DayCounter.getCPtr(dc), dc), true);
  }

  public ZeroSpreadedTermStructure(YieldTermStructureHandle curveHandle, QuoteHandle spreadHandle, Compounding comp, Frequency freq) {
    this(QuantLibJNI.new_ZeroSpreadedTermStructure__SWIG_1(YieldTermStructureHandle.getCPtr(curveHandle), curveHandle, QuoteHandle.getCPtr(spreadHandle), spreadHandle, comp.swigValue(), freq.swigValue()), true);
  }

  public ZeroSpreadedTermStructure(YieldTermStructureHandle curveHandle, QuoteHandle spreadHandle, Compounding comp) {
    this(QuantLibJNI.new_ZeroSpreadedTermStructure__SWIG_2(YieldTermStructureHandle.getCPtr(curveHandle), curveHandle, QuoteHandle.getCPtr(spreadHandle), spreadHandle, comp.swigValue()), true);
  }

  public ZeroSpreadedTermStructure(YieldTermStructureHandle curveHandle, QuoteHandle spreadHandle) {
    this(QuantLibJNI.new_ZeroSpreadedTermStructure__SWIG_3(YieldTermStructureHandle.getCPtr(curveHandle), curveHandle, QuoteHandle.getCPtr(spreadHandle), spreadHandle), true);
  }

}
