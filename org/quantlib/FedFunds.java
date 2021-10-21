/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FedFunds extends OvernightIndex {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FedFunds(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FedFunds_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FedFunds obj) {
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
        QuantLibJNI.delete_FedFunds(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FedFunds(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_FedFunds__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public FedFunds() {
    this(QuantLibJNI.new_FedFunds__SWIG_1(), true);
  }

}
