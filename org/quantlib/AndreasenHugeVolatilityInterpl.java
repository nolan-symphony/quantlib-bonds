/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class AndreasenHugeVolatilityInterpl extends Observable {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected AndreasenHugeVolatilityInterpl(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.AndreasenHugeVolatilityInterpl_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AndreasenHugeVolatilityInterpl obj) {
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
        QuantLibJNI.delete_AndreasenHugeVolatilityInterpl(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public AndreasenHugeVolatilityInterpl(CalibrationSet calibrationSet, QuoteHandle spot, YieldTermStructureHandle rTS, YieldTermStructureHandle qTS, AndreasenHugeVolatilityInterpl.InterpolationType interpolationType, AndreasenHugeVolatilityInterpl.CalibrationType calibrationType, long nGridPoints, double minStrike, double maxStrike, OptimizationMethod optimizationMethod, EndCriteria endCriteria) {
    this(QuantLibJNI.new_AndreasenHugeVolatilityInterpl__SWIG_0(CalibrationSet.getCPtr(calibrationSet), calibrationSet, QuoteHandle.getCPtr(spot), spot, YieldTermStructureHandle.getCPtr(rTS), rTS, YieldTermStructureHandle.getCPtr(qTS), qTS, interpolationType.swigValue(), calibrationType.swigValue(), nGridPoints, minStrike, maxStrike, OptimizationMethod.getCPtr(optimizationMethod), optimizationMethod, EndCriteria.getCPtr(endCriteria), endCriteria), true);
  }

  public AndreasenHugeVolatilityInterpl(CalibrationSet calibrationSet, QuoteHandle spot, YieldTermStructureHandle rTS, YieldTermStructureHandle qTS, AndreasenHugeVolatilityInterpl.InterpolationType interpolationType, AndreasenHugeVolatilityInterpl.CalibrationType calibrationType, long nGridPoints, double minStrike, double maxStrike, OptimizationMethod optimizationMethod) {
    this(QuantLibJNI.new_AndreasenHugeVolatilityInterpl__SWIG_1(CalibrationSet.getCPtr(calibrationSet), calibrationSet, QuoteHandle.getCPtr(spot), spot, YieldTermStructureHandle.getCPtr(rTS), rTS, YieldTermStructureHandle.getCPtr(qTS), qTS, interpolationType.swigValue(), calibrationType.swigValue(), nGridPoints, minStrike, maxStrike, OptimizationMethod.getCPtr(optimizationMethod), optimizationMethod), true);
  }

  public AndreasenHugeVolatilityInterpl(CalibrationSet calibrationSet, QuoteHandle spot, YieldTermStructureHandle rTS, YieldTermStructureHandle qTS, AndreasenHugeVolatilityInterpl.InterpolationType interpolationType, AndreasenHugeVolatilityInterpl.CalibrationType calibrationType, long nGridPoints, double minStrike, double maxStrike) {
    this(QuantLibJNI.new_AndreasenHugeVolatilityInterpl__SWIG_2(CalibrationSet.getCPtr(calibrationSet), calibrationSet, QuoteHandle.getCPtr(spot), spot, YieldTermStructureHandle.getCPtr(rTS), rTS, YieldTermStructureHandle.getCPtr(qTS), qTS, interpolationType.swigValue(), calibrationType.swigValue(), nGridPoints, minStrike, maxStrike), true);
  }

  public AndreasenHugeVolatilityInterpl(CalibrationSet calibrationSet, QuoteHandle spot, YieldTermStructureHandle rTS, YieldTermStructureHandle qTS, AndreasenHugeVolatilityInterpl.InterpolationType interpolationType, AndreasenHugeVolatilityInterpl.CalibrationType calibrationType, long nGridPoints, double minStrike) {
    this(QuantLibJNI.new_AndreasenHugeVolatilityInterpl__SWIG_3(CalibrationSet.getCPtr(calibrationSet), calibrationSet, QuoteHandle.getCPtr(spot), spot, YieldTermStructureHandle.getCPtr(rTS), rTS, YieldTermStructureHandle.getCPtr(qTS), qTS, interpolationType.swigValue(), calibrationType.swigValue(), nGridPoints, minStrike), true);
  }

  public AndreasenHugeVolatilityInterpl(CalibrationSet calibrationSet, QuoteHandle spot, YieldTermStructureHandle rTS, YieldTermStructureHandle qTS, AndreasenHugeVolatilityInterpl.InterpolationType interpolationType, AndreasenHugeVolatilityInterpl.CalibrationType calibrationType, long nGridPoints) {
    this(QuantLibJNI.new_AndreasenHugeVolatilityInterpl__SWIG_4(CalibrationSet.getCPtr(calibrationSet), calibrationSet, QuoteHandle.getCPtr(spot), spot, YieldTermStructureHandle.getCPtr(rTS), rTS, YieldTermStructureHandle.getCPtr(qTS), qTS, interpolationType.swigValue(), calibrationType.swigValue(), nGridPoints), true);
  }

  public AndreasenHugeVolatilityInterpl(CalibrationSet calibrationSet, QuoteHandle spot, YieldTermStructureHandle rTS, YieldTermStructureHandle qTS, AndreasenHugeVolatilityInterpl.InterpolationType interpolationType, AndreasenHugeVolatilityInterpl.CalibrationType calibrationType) {
    this(QuantLibJNI.new_AndreasenHugeVolatilityInterpl__SWIG_5(CalibrationSet.getCPtr(calibrationSet), calibrationSet, QuoteHandle.getCPtr(spot), spot, YieldTermStructureHandle.getCPtr(rTS), rTS, YieldTermStructureHandle.getCPtr(qTS), qTS, interpolationType.swigValue(), calibrationType.swigValue()), true);
  }

  public AndreasenHugeVolatilityInterpl(CalibrationSet calibrationSet, QuoteHandle spot, YieldTermStructureHandle rTS, YieldTermStructureHandle qTS, AndreasenHugeVolatilityInterpl.InterpolationType interpolationType) {
    this(QuantLibJNI.new_AndreasenHugeVolatilityInterpl__SWIG_6(CalibrationSet.getCPtr(calibrationSet), calibrationSet, QuoteHandle.getCPtr(spot), spot, YieldTermStructureHandle.getCPtr(rTS), rTS, YieldTermStructureHandle.getCPtr(qTS), qTS, interpolationType.swigValue()), true);
  }

  public AndreasenHugeVolatilityInterpl(CalibrationSet calibrationSet, QuoteHandle spot, YieldTermStructureHandle rTS, YieldTermStructureHandle qTS) {
    this(QuantLibJNI.new_AndreasenHugeVolatilityInterpl__SWIG_7(CalibrationSet.getCPtr(calibrationSet), calibrationSet, QuoteHandle.getCPtr(spot), spot, YieldTermStructureHandle.getCPtr(rTS), rTS, YieldTermStructureHandle.getCPtr(qTS), qTS), true);
  }

  public Date maxDate() {
    return new Date(QuantLibJNI.AndreasenHugeVolatilityInterpl_maxDate(swigCPtr, this), true);
  }

  public double minStrike() {
    return QuantLibJNI.AndreasenHugeVolatilityInterpl_minStrike(swigCPtr, this);
  }

  public double maxStrike() {
    return QuantLibJNI.AndreasenHugeVolatilityInterpl_maxStrike(swigCPtr, this);
  }

  public double fwd(double t) {
    return QuantLibJNI.AndreasenHugeVolatilityInterpl_fwd(swigCPtr, this, t);
  }

  public YieldTermStructureHandle riskFreeRate() {
    return new YieldTermStructureHandle(QuantLibJNI.AndreasenHugeVolatilityInterpl_riskFreeRate(swigCPtr, this), false);
  }

  public CalibrationErrorTuple calibrationError() {
    return new CalibrationErrorTuple(QuantLibJNI.AndreasenHugeVolatilityInterpl_calibrationError(swigCPtr, this), true);
  }

  public double optionPrice(double t, double strike, Option.Type optionType) {
    return QuantLibJNI.AndreasenHugeVolatilityInterpl_optionPrice(swigCPtr, this, t, strike, optionType.swigValue());
  }

  public double localVol(double t, double strike) {
    return QuantLibJNI.AndreasenHugeVolatilityInterpl_localVol(swigCPtr, this, t, strike);
  }

  public final static class InterpolationType {
    public final static AndreasenHugeVolatilityInterpl.InterpolationType PiecewiseConstant = new AndreasenHugeVolatilityInterpl.InterpolationType("PiecewiseConstant");
    public final static AndreasenHugeVolatilityInterpl.InterpolationType Linear = new AndreasenHugeVolatilityInterpl.InterpolationType("Linear");
    public final static AndreasenHugeVolatilityInterpl.InterpolationType CubicSpline = new AndreasenHugeVolatilityInterpl.InterpolationType("CubicSpline");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static InterpolationType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + InterpolationType.class + " with value " + swigValue);
    }

    private InterpolationType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private InterpolationType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private InterpolationType(String swigName, InterpolationType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static InterpolationType[] swigValues = { PiecewiseConstant, Linear, CubicSpline };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

  public final static class CalibrationType {
    public final static AndreasenHugeVolatilityInterpl.CalibrationType Call = new AndreasenHugeVolatilityInterpl.CalibrationType("Call", QuantLibJNI.AndreasenHugeVolatilityInterpl_Call_get());
    public final static AndreasenHugeVolatilityInterpl.CalibrationType Put = new AndreasenHugeVolatilityInterpl.CalibrationType("Put", QuantLibJNI.AndreasenHugeVolatilityInterpl_Put_get());
    public final static AndreasenHugeVolatilityInterpl.CalibrationType CallPut = new AndreasenHugeVolatilityInterpl.CalibrationType("CallPut");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static CalibrationType swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + CalibrationType.class + " with value " + swigValue);
    }

    private CalibrationType(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private CalibrationType(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private CalibrationType(String swigName, CalibrationType swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static CalibrationType[] swigValues = { Call, Put, CallPut };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
