/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class EuriborSwapIsdaFixB extends SwapIndex {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected EuriborSwapIsdaFixB(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.EuriborSwapIsdaFixB_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EuriborSwapIsdaFixB obj) {
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
        QuantLibJNI.delete_EuriborSwapIsdaFixB(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public EuriborSwapIsdaFixB(Period tenor, YieldTermStructureHandle h) {
    this(QuantLibJNI.new_EuriborSwapIsdaFixB__SWIG_0(Period.getCPtr(tenor), tenor, YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public EuriborSwapIsdaFixB(Period tenor) {
    this(QuantLibJNI.new_EuriborSwapIsdaFixB__SWIG_1(Period.getCPtr(tenor), tenor), true);
  }

  public EuriborSwapIsdaFixB(Period tenor, YieldTermStructureHandle h1, YieldTermStructureHandle h2) {
    this(QuantLibJNI.new_EuriborSwapIsdaFixB__SWIG_2(Period.getCPtr(tenor), tenor, YieldTermStructureHandle.getCPtr(h1), h1, YieldTermStructureHandle.getCPtr(h2), h2), true);
  }

}