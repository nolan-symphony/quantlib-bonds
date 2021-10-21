/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class InverseCumulativeNormal {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected InverseCumulativeNormal(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(InverseCumulativeNormal obj) {
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
        QuantLibJNI.delete_InverseCumulativeNormal(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public InverseCumulativeNormal(double average, double sigma) {
    this(QuantLibJNI.new_InverseCumulativeNormal__SWIG_0(average, sigma), true);
  }

  public InverseCumulativeNormal(double average) {
    this(QuantLibJNI.new_InverseCumulativeNormal__SWIG_1(average), true);
  }

  public InverseCumulativeNormal() {
    this(QuantLibJNI.new_InverseCumulativeNormal__SWIG_2(), true);
  }

  public double getValue(double x) {
    return QuantLibJNI.InverseCumulativeNormal_getValue(swigCPtr, this, x);
  }

}
