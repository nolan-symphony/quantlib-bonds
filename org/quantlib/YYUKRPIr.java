/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class YYUKRPIr extends YoYInflationIndex {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected YYUKRPIr(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.YYUKRPIr_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YYUKRPIr obj) {
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
        QuantLibJNI.delete_YYUKRPIr(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public YYUKRPIr(boolean interpolated, YoYInflationTermStructureHandle h) {
    this(QuantLibJNI.new_YYUKRPIr__SWIG_0(interpolated, YoYInflationTermStructureHandle.getCPtr(h), h), true);
  }

  public YYUKRPIr(boolean interpolated) {
    this(QuantLibJNI.new_YYUKRPIr__SWIG_1(interpolated), true);
  }

}
