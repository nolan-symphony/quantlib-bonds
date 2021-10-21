/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class SimpleQuote extends Quote {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected SimpleQuote(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.SimpleQuote_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SimpleQuote obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwnDerived = own;
    super.swigSetCMemOwn(own);
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        QuantLibJNI.delete_SimpleQuote(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SimpleQuote(double value) {
    this(QuantLibJNI.new_SimpleQuote(value), true);
  }

  public void setValue(double value) {
    QuantLibJNI.SimpleQuote_setValue(swigCPtr, this, value);
  }

}
