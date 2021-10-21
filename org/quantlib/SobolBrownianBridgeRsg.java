/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class SobolBrownianBridgeRsg {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SobolBrownianBridgeRsg(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SobolBrownianBridgeRsg obj) {
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
        QuantLibJNI.delete_SobolBrownianBridgeRsg(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SobolBrownianBridgeRsg(long factors, long steps) {
    this(QuantLibJNI.new_SobolBrownianBridgeRsg(factors, steps), true);
  }

  public SampleRealVector nextSequence() {
    return new SampleRealVector(QuantLibJNI.SobolBrownianBridgeRsg_nextSequence(swigCPtr, this), false);
  }

  public SampleRealVector lastSequence() {
    return new SampleRealVector(QuantLibJNI.SobolBrownianBridgeRsg_lastSequence(swigCPtr, this), false);
  }

  public long dimension() {
    return QuantLibJNI.SobolBrownianBridgeRsg_dimension(swigCPtr, this);
  }

}
