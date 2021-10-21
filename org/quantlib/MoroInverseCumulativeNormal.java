/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MoroInverseCumulativeNormal {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MoroInverseCumulativeNormal(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MoroInverseCumulativeNormal obj) {
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
        QuantLibJNI.delete_MoroInverseCumulativeNormal(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MoroInverseCumulativeNormal(double average, double sigma) {
    this(QuantLibJNI.new_MoroInverseCumulativeNormal__SWIG_0(average, sigma), true);
  }

  public MoroInverseCumulativeNormal(double average) {
    this(QuantLibJNI.new_MoroInverseCumulativeNormal__SWIG_1(average), true);
  }

  public MoroInverseCumulativeNormal() {
    this(QuantLibJNI.new_MoroInverseCumulativeNormal__SWIG_2(), true);
  }

  public double getValue(double x) {
    return QuantLibJNI.MoroInverseCumulativeNormal_getValue(swigCPtr, this, x);
  }

}
