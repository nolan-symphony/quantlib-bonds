/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Concentrating1dMesherPoint {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Concentrating1dMesherPoint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Concentrating1dMesherPoint obj) {
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
        QuantLibJNI.delete_Concentrating1dMesherPoint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Concentrating1dMesherPoint(double arg0, double arg1, boolean arg2) {
    this(QuantLibJNI.new_Concentrating1dMesherPoint(arg0, arg1, arg2), true);
  }

  public double first() {
    return QuantLibJNI.Concentrating1dMesherPoint_first(swigCPtr, this);
  }

  public double second() {
    return QuantLibJNI.Concentrating1dMesherPoint_second(swigCPtr, this);
  }

  public boolean third() {
    return QuantLibJNI.Concentrating1dMesherPoint_third(swigCPtr, this);
  }

}
