/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GaussChebyshevIntegration {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GaussChebyshevIntegration(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GaussChebyshevIntegration obj) {
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
        QuantLibJNI.delete_GaussChebyshevIntegration(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GaussChebyshevIntegration(long n) {
    this(QuantLibJNI.new_GaussChebyshevIntegration(n), true);
  }

  public double calculate(UnaryFunctionDelegate f) {
    return QuantLibJNI.GaussChebyshevIntegration_calculate(swigCPtr, this, UnaryFunctionDelegate.getCPtr(f), f);
  }

}
