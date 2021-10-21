/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CADLiborON extends DailyTenorLibor {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected CADLiborON(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CADLiborON_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CADLiborON obj) {
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
        QuantLibJNI.delete_CADLiborON(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CADLiborON(YieldTermStructureHandle h) {
    this(QuantLibJNI.new_CADLiborON__SWIG_0(YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public CADLiborON() {
    this(QuantLibJNI.new_CADLiborON__SWIG_1(), true);
  }

}
