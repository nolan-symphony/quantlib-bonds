/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class YoYInflationFloor extends YoYInflationCapFloor {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected YoYInflationFloor(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.YoYInflationFloor_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YoYInflationFloor obj) {
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
        QuantLibJNI.delete_YoYInflationFloor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public YoYInflationFloor(Leg leg, DoubleVector floorRates) {
    this(QuantLibJNI.new_YoYInflationFloor(Leg.getCPtr(leg), leg, DoubleVector.getCPtr(floorRates), floorRates), true);
  }

}
