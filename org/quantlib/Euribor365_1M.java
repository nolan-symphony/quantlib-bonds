/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Euribor365_1M extends Euribor365 {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Euribor365_1M(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Euribor365_1M_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Euribor365_1M obj) {
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
        QuantLibJNI.delete_Euribor365_1M(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Euribor365_1M(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Euribor365_1M__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Euribor365_1M() {
    this(QuantLibJNI.new_Euribor365_1M__SWIG_1(), true);
  }

}
