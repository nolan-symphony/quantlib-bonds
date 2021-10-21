/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdmAmericanStepCondition extends FdmStepCondition {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdmAmericanStepCondition(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdmAmericanStepCondition_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdmAmericanStepCondition obj) {
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
        QuantLibJNI.delete_FdmAmericanStepCondition(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdmAmericanStepCondition(FdmMesher mesher, FdmInnerValueCalculator calculator) {
    this(QuantLibJNI.new_FdmAmericanStepCondition(FdmMesher.getCPtr(mesher), mesher, FdmInnerValueCalculator.getCPtr(calculator), calculator), true);
  }

}
