/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GaussChebyshev2ndIntegration {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GaussChebyshev2ndIntegration(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GaussChebyshev2ndIntegration obj) {
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
        QuantLibJNI.delete_GaussChebyshev2ndIntegration(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GaussChebyshev2ndIntegration(long n) {
    this(QuantLibJNI.new_GaussChebyshev2ndIntegration(n), true);
  }

  public double calculate(UnaryFunctionDelegate f) {
    return QuantLibJNI.GaussChebyshev2ndIntegration_calculate(swigCPtr, this, UnaryFunctionDelegate.getCPtr(f), f);
  }

}
