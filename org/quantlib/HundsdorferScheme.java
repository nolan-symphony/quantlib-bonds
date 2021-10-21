/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class HundsdorferScheme {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected HundsdorferScheme(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HundsdorferScheme obj) {
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
        QuantLibJNI.delete_HundsdorferScheme(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public HundsdorferScheme(double theta, double mu, FdmLinearOpComposite map, FdmBoundaryConditionSet bcSet) {
    this(QuantLibJNI.new_HundsdorferScheme__SWIG_0(theta, mu, FdmLinearOpComposite.getCPtr(map), map, FdmBoundaryConditionSet.getCPtr(bcSet), bcSet), true);
  }

  public HundsdorferScheme(double theta, double mu, FdmLinearOpComposite map) {
    this(QuantLibJNI.new_HundsdorferScheme__SWIG_1(theta, mu, FdmLinearOpComposite.getCPtr(map), map), true);
  }

  public void step(Array a, double t) {
    QuantLibJNI.HundsdorferScheme_step(swigCPtr, this, Array.getCPtr(a), a, t);
  }

  public void setStep(double dt) {
    QuantLibJNI.HundsdorferScheme_setStep(swigCPtr, this, dt);
  }

}