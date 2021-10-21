/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class EndCriteria {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected EndCriteria(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(EndCriteria obj) {
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
        QuantLibJNI.delete_EndCriteria(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public EndCriteria(long maxIteration, long maxStationaryStateIterations, double rootEpsilon, double functionEpsilon, double gradientNormEpsilon) {
    this(QuantLibJNI.new_EndCriteria(maxIteration, maxStationaryStateIterations, rootEpsilon, functionEpsilon, gradientNormEpsilon), true);
  }

  public boolean getValue(long iteration, SWIGTYPE_p_std__size_t statState, boolean positiveOptimization, double fold, double normgold, double fnew, double normgnewx, SWIGTYPE_p_EndCriteria__Type ecType) {
    return QuantLibJNI.EndCriteria_getValue(swigCPtr, this, iteration, SWIGTYPE_p_std__size_t.getCPtr(statState), positiveOptimization, fold, normgold, fnew, normgnewx, SWIGTYPE_p_EndCriteria__Type.getCPtr(ecType));
  }

  public final static class Type {
    public final static EndCriteria.Type None = new EndCriteria.Type("None");
    public final static EndCriteria.Type MaxIterations = new EndCriteria.Type("MaxIterations");
    public final static EndCriteria.Type StationaryPoint = new EndCriteria.Type("StationaryPoint");
    public final static EndCriteria.Type StationaryFunctionValue = new EndCriteria.Type("StationaryFunctionValue");
    public final static EndCriteria.Type StationaryFunctionAccuracy = new EndCriteria.Type("StationaryFunctionAccuracy");
    public final static EndCriteria.Type ZeroGradientNorm = new EndCriteria.Type("ZeroGradientNorm");
    public final static EndCriteria.Type Unknown = new EndCriteria.Type("Unknown");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Type swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Type.class + " with value " + swigValue);
    }

    private Type(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Type(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Type(String swigName, Type swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Type[] swigValues = { None, MaxIterations, StationaryPoint, StationaryFunctionValue, StationaryFunctionAccuracy, ZeroGradientNorm, Unknown };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
