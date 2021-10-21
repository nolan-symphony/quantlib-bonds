/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CEVRNDCalculator extends RiskNeutralDensityCalculator {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected CEVRNDCalculator(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CEVRNDCalculator_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CEVRNDCalculator obj) {
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
        QuantLibJNI.delete_CEVRNDCalculator(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CEVRNDCalculator(double f0, double alpha, double beta) {
    this(QuantLibJNI.new_CEVRNDCalculator(f0, alpha, beta), true);
  }

  public double massAtZero(double t) {
    return QuantLibJNI.CEVRNDCalculator_massAtZero(swigCPtr, this, t);
  }

}
