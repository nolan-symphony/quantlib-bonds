/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Actual364 extends DayCounter {
  private transient long swigCPtr;

  protected Actual364(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Actual364_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Actual364 obj) {
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
        QuantLibJNI.delete_Actual364(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Actual364() {
    this(QuantLibJNI.new_Actual364(), true);
  }

}