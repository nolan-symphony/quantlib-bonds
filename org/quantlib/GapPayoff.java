/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class GapPayoff extends StrikedTypePayoff {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected GapPayoff(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.GapPayoff_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GapPayoff obj) {
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
        QuantLibJNI.delete_GapPayoff(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GapPayoff(Option.Type type, double strike, double strikePayoff) {
    this(QuantLibJNI.new_GapPayoff(type.swigValue(), strike, strikePayoff), true);
  }

}