/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MersenneTwisterUniformRng {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MersenneTwisterUniformRng(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MersenneTwisterUniformRng obj) {
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
        QuantLibJNI.delete_MersenneTwisterUniformRng(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MersenneTwisterUniformRng(int seed) {
    this(QuantLibJNI.new_MersenneTwisterUniformRng__SWIG_0(seed), true);
  }

  public MersenneTwisterUniformRng() {
    this(QuantLibJNI.new_MersenneTwisterUniformRng__SWIG_1(), true);
  }

  public SampleNumber next() {
    return new SampleNumber(QuantLibJNI.MersenneTwisterUniformRng_next(swigCPtr, this), true);
  }

}
