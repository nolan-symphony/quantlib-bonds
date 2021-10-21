/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CumulativeChiSquareDistribution {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CumulativeChiSquareDistribution(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CumulativeChiSquareDistribution obj) {
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
        QuantLibJNI.delete_CumulativeChiSquareDistribution(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CumulativeChiSquareDistribution(double df) {
    this(QuantLibJNI.new_CumulativeChiSquareDistribution(df), true);
  }

  public double getValue(double x) {
    return QuantLibJNI.CumulativeChiSquareDistribution_getValue(swigCPtr, this, x);
  }

}