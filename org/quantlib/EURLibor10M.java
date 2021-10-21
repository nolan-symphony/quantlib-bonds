/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class EURLibor10M extends EURLibor {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected EURLibor10M(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.EURLibor10M_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EURLibor10M obj) {
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
        QuantLibJNI.delete_EURLibor10M(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public EURLibor10M(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_EURLibor10M__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public EURLibor10M() {
    this(QuantLibJNI.new_EURLibor10M__SWIG_1(), true);
  }

}
