/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Period {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Period(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Period obj) {
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
        QuantLibJNI.delete_Period(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Period() {
    this(QuantLibJNI.new_Period__SWIG_0(), true);
  }

  public Period(int n, TimeUnit units) {
    this(QuantLibJNI.new_Period__SWIG_1(n, units.swigValue()), true);
  }

  public Period(Frequency arg0) {
    this(QuantLibJNI.new_Period__SWIG_2(arg0.swigValue()), true);
  }

  public int length() {
    return QuantLibJNI.Period_length(swigCPtr, this);
  }

  public TimeUnit units() {
    return TimeUnit.swigToEnum(QuantLibJNI.Period_units(swigCPtr, this));
  }

  public Frequency frequency() {
    return Frequency.swigToEnum(QuantLibJNI.Period_frequency(swigCPtr, this));
  }

  public Period(String str) {
    this(QuantLibJNI.new_Period__SWIG_3(str), true);
  }

  public String toString() {
    return QuantLibJNI.Period_toString(swigCPtr, this);
  }

  public String repr() {
    return QuantLibJNI.Period_repr(swigCPtr, this);
  }

}