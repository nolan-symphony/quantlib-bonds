/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FloatingRateCouponPricer {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected FloatingRateCouponPricer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FloatingRateCouponPricer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_FloatingRateCouponPricer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public double swapletPrice() {
    return QuantLibJNI.FloatingRateCouponPricer_swapletPrice(swigCPtr, this);
  }

  public double swapletRate() {
    return QuantLibJNI.FloatingRateCouponPricer_swapletRate(swigCPtr, this);
  }

  public double capletPrice(double effectiveCap) {
    return QuantLibJNI.FloatingRateCouponPricer_capletPrice(swigCPtr, this, effectiveCap);
  }

  public double capletRate(double effectiveCap) {
    return QuantLibJNI.FloatingRateCouponPricer_capletRate(swigCPtr, this, effectiveCap);
  }

  public double floorletPrice(double effectiveFloor) {
    return QuantLibJNI.FloatingRateCouponPricer_floorletPrice(swigCPtr, this, effectiveFloor);
  }

  public double floorletRate(double effectiveFloor) {
    return QuantLibJNI.FloatingRateCouponPricer_floorletRate(swigCPtr, this, effectiveFloor);
  }

}
