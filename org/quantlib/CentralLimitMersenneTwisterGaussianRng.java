/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CentralLimitMersenneTwisterGaussianRng {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CentralLimitMersenneTwisterGaussianRng(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CentralLimitMersenneTwisterGaussianRng obj) {
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
        QuantLibJNI.delete_CentralLimitMersenneTwisterGaussianRng(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CentralLimitMersenneTwisterGaussianRng(MersenneTwisterUniformRng rng) {
    this(QuantLibJNI.new_CentralLimitMersenneTwisterGaussianRng(MersenneTwisterUniformRng.getCPtr(rng), rng), true);
  }

  public SampleNumber next() {
    return new SampleNumber(QuantLibJNI.CentralLimitMersenneTwisterGaussianRng_next(swigCPtr, this), true);
  }

}
