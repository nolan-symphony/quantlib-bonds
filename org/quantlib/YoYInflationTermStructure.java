/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class YoYInflationTermStructure extends InflationTermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected YoYInflationTermStructure(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.YoYInflationTermStructure_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YoYInflationTermStructure obj) {
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
        QuantLibJNI.delete_YoYInflationTermStructure(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public double yoyRate(Date d, Period instObsLag, boolean forceLinearInterpolation, boolean extrapolate) {
    return QuantLibJNI.YoYInflationTermStructure_yoyRate__SWIG_0(swigCPtr, this, Date.getCPtr(d), d, Period.getCPtr(instObsLag), instObsLag, forceLinearInterpolation, extrapolate);
  }

  public double yoyRate(Date d, Period instObsLag, boolean forceLinearInterpolation) {
    return QuantLibJNI.YoYInflationTermStructure_yoyRate__SWIG_1(swigCPtr, this, Date.getCPtr(d), d, Period.getCPtr(instObsLag), instObsLag, forceLinearInterpolation);
  }

  public double yoyRate(Date d, Period instObsLag) {
    return QuantLibJNI.YoYInflationTermStructure_yoyRate__SWIG_2(swigCPtr, this, Date.getCPtr(d), d, Period.getCPtr(instObsLag), instObsLag);
  }

  public double yoyRate(Date d) {
    return QuantLibJNI.YoYInflationTermStructure_yoyRate__SWIG_3(swigCPtr, this, Date.getCPtr(d), d);
  }

  public double yoyRate(double t, boolean extrapolate) {
    return QuantLibJNI.YoYInflationTermStructure_yoyRate__SWIG_4(swigCPtr, this, t, extrapolate);
  }

  public double yoyRate(double t) {
    return QuantLibJNI.YoYInflationTermStructure_yoyRate__SWIG_5(swigCPtr, this, t);
  }

}