/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdmBoundaryCondition {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected FdmBoundaryCondition(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdmBoundaryCondition obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_FdmBoundaryCondition(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void applyBeforeApplying(FdmLinearOp arg0) {
    QuantLibJNI.FdmBoundaryCondition_applyBeforeApplying(swigCPtr, this, FdmLinearOp.getCPtr(arg0), arg0);
  }

  public void applyAfterApplying(Array arg0) {
    QuantLibJNI.FdmBoundaryCondition_applyAfterApplying(swigCPtr, this, Array.getCPtr(arg0), arg0);
  }

  public void applyBeforeSolving(FdmLinearOp arg0, Array rhs) {
    QuantLibJNI.FdmBoundaryCondition_applyBeforeSolving(swigCPtr, this, FdmLinearOp.getCPtr(arg0), arg0, Array.getCPtr(rhs), rhs);
  }

  public void applyAfterSolving(Array arg0) {
    QuantLibJNI.FdmBoundaryCondition_applyAfterSolving(swigCPtr, this, Array.getCPtr(arg0), arg0);
  }

  public void setTime(double t) {
    QuantLibJNI.FdmBoundaryCondition_setTime(swigCPtr, this, t);
  }

  public final static class Side {
    public final static FdmBoundaryCondition.Side NoSide = new FdmBoundaryCondition.Side("NoSide");
    public final static FdmBoundaryCondition.Side Upper = new FdmBoundaryCondition.Side("Upper");
    public final static FdmBoundaryCondition.Side Lower = new FdmBoundaryCondition.Side("Lower");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Side swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Side.class + " with value " + swigValue);
    }

    private Side(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Side(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Side(String swigName, Side swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Side[] swigValues = { NoSide, Upper, Lower };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}