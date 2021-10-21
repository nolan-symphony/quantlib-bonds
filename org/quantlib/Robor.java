/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Robor extends IborIndex {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Robor(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Robor_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Robor obj) {
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
        QuantLibJNI.delete_Robor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Robor(Period tenor, YieldTermStructureHandle h) {
    this(QuantLibJNI.new_Robor__SWIG_0(Period.getCPtr(tenor), tenor, YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public Robor(Period tenor) {
    this(QuantLibJNI.new_Robor__SWIG_1(Period.getCPtr(tenor), tenor), true);
  }

}
