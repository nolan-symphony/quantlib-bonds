/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class HullWhiteForwardProcess extends StochasticProcess1D {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected HullWhiteForwardProcess(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.HullWhiteForwardProcess_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HullWhiteForwardProcess obj) {
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
        QuantLibJNI.delete_HullWhiteForwardProcess(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public HullWhiteForwardProcess(YieldTermStructureHandle riskFreeTS, double a, double sigma) {
    this(QuantLibJNI.new_HullWhiteForwardProcess(YieldTermStructureHandle.getCPtr(riskFreeTS), riskFreeTS, a, sigma), true);
  }

  public double alpha(double t) {
    return QuantLibJNI.HullWhiteForwardProcess_alpha(swigCPtr, this, t);
  }

  public double M_T(double s, double t, double T) {
    return QuantLibJNI.HullWhiteForwardProcess_M_T(swigCPtr, this, s, t, T);
  }

  public double B(double t, double T) {
    return QuantLibJNI.HullWhiteForwardProcess_B(swigCPtr, this, t, T);
  }

  public void setForwardMeasureTime(double t) {
    QuantLibJNI.HullWhiteForwardProcess_setForwardMeasureTime(swigCPtr, this, t);
  }

}
