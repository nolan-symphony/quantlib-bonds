/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdmCellAveragingInnerValue extends FdmInnerValueCalculator {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdmCellAveragingInnerValue(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdmCellAveragingInnerValue_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdmCellAveragingInnerValue obj) {
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
        QuantLibJNI.delete_FdmCellAveragingInnerValue(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdmCellAveragingInnerValue(Payoff payoff, FdmMesher mesher, long direction, UnaryFunctionDelegate gridMapping) {
    this(QuantLibJNI.new_FdmCellAveragingInnerValue__SWIG_0(Payoff.getCPtr(payoff), payoff, FdmMesher.getCPtr(mesher), mesher, direction, UnaryFunctionDelegate.getCPtr(gridMapping), gridMapping), true);
  }

  public FdmCellAveragingInnerValue(Payoff payoff, FdmMesher mesher, long direction) {
    this(QuantLibJNI.new_FdmCellAveragingInnerValue__SWIG_1(Payoff.getCPtr(payoff), payoff, FdmMesher.getCPtr(mesher), mesher, direction), true);
  }

}