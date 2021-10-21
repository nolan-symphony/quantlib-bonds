/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class SimpsonIntegral {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SimpsonIntegral(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SimpsonIntegral obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_SimpsonIntegral(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SimpsonIntegral(double accuracy, long maxIterations) {
    this(QuantLibJNI.new_SimpsonIntegral(accuracy, maxIterations), true);
  }

  public double calculate(UnaryFunctionDelegate f, double a, double b) {
    return QuantLibJNI.SimpsonIntegral_calculate(swigCPtr, this, UnaryFunctionDelegate.getCPtr(f), f, a, b);
  }

}
