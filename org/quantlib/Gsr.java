/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Gsr extends Gaussian1dModel {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Gsr(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Gsr_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Gsr obj) {
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
        QuantLibJNI.delete_Gsr(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Gsr(YieldTermStructureHandle termStructure, DateVector volstepdates, QuoteHandleVector volatilities, QuoteHandleVector reversions, double T) {
    this(QuantLibJNI.new_Gsr__SWIG_0(YieldTermStructureHandle.getCPtr(termStructure), termStructure, DateVector.getCPtr(volstepdates), volstepdates, QuoteHandleVector.getCPtr(volatilities), volatilities, QuoteHandleVector.getCPtr(reversions), reversions, T), true);
  }

  public Gsr(YieldTermStructureHandle termStructure, DateVector volstepdates, QuoteHandleVector volatilities, QuoteHandleVector reversions) {
    this(QuantLibJNI.new_Gsr__SWIG_1(YieldTermStructureHandle.getCPtr(termStructure), termStructure, DateVector.getCPtr(volstepdates), volstepdates, QuoteHandleVector.getCPtr(volatilities), volatilities, QuoteHandleVector.getCPtr(reversions), reversions), true);
  }

  public void calibrateVolatilitiesIterative(BlackCalibrationHelperVector helpers, OptimizationMethod method, EndCriteria endCriteria, Constraint constraint, DoubleVector weights) {
    QuantLibJNI.Gsr_calibrateVolatilitiesIterative__SWIG_0(swigCPtr, this, BlackCalibrationHelperVector.getCPtr(helpers), helpers, OptimizationMethod.getCPtr(method), method, EndCriteria.getCPtr(endCriteria), endCriteria, Constraint.getCPtr(constraint), constraint, DoubleVector.getCPtr(weights), weights);
  }

  public void calibrateVolatilitiesIterative(BlackCalibrationHelperVector helpers, OptimizationMethod method, EndCriteria endCriteria, Constraint constraint) {
    QuantLibJNI.Gsr_calibrateVolatilitiesIterative__SWIG_1(swigCPtr, this, BlackCalibrationHelperVector.getCPtr(helpers), helpers, OptimizationMethod.getCPtr(method), method, EndCriteria.getCPtr(endCriteria), endCriteria, Constraint.getCPtr(constraint), constraint);
  }

  public void calibrateVolatilitiesIterative(BlackCalibrationHelperVector helpers, OptimizationMethod method, EndCriteria endCriteria) {
    QuantLibJNI.Gsr_calibrateVolatilitiesIterative__SWIG_2(swigCPtr, this, BlackCalibrationHelperVector.getCPtr(helpers), helpers, OptimizationMethod.getCPtr(method), method, EndCriteria.getCPtr(endCriteria), endCriteria);
  }

  public Array reversion() {
    return new Array(QuantLibJNI.Gsr_reversion(swigCPtr, this), false);
  }

  public Array volatility() {
    return new Array(QuantLibJNI.Gsr_volatility(swigCPtr, this), false);
  }

  public Array params() {
    return new Array(QuantLibJNI.Gsr_params(swigCPtr, this), true);
  }

  public void calibrate(CalibrationHelperVector instruments, OptimizationMethod method, EndCriteria endCriteria, Constraint constraint, DoubleVector weights, BoolVector fixParameters) {
    QuantLibJNI.Gsr_calibrate__SWIG_0(swigCPtr, this, CalibrationHelperVector.getCPtr(instruments), instruments, OptimizationMethod.getCPtr(method), method, EndCriteria.getCPtr(endCriteria), endCriteria, Constraint.getCPtr(constraint), constraint, DoubleVector.getCPtr(weights), weights, BoolVector.getCPtr(fixParameters), fixParameters);
  }

  public void calibrate(CalibrationHelperVector instruments, OptimizationMethod method, EndCriteria endCriteria, Constraint constraint, DoubleVector weights) {
    QuantLibJNI.Gsr_calibrate__SWIG_1(swigCPtr, this, CalibrationHelperVector.getCPtr(instruments), instruments, OptimizationMethod.getCPtr(method), method, EndCriteria.getCPtr(endCriteria), endCriteria, Constraint.getCPtr(constraint), constraint, DoubleVector.getCPtr(weights), weights);
  }

  public void calibrate(CalibrationHelperVector instruments, OptimizationMethod method, EndCriteria endCriteria, Constraint constraint) {
    QuantLibJNI.Gsr_calibrate__SWIG_2(swigCPtr, this, CalibrationHelperVector.getCPtr(instruments), instruments, OptimizationMethod.getCPtr(method), method, EndCriteria.getCPtr(endCriteria), endCriteria, Constraint.getCPtr(constraint), constraint);
  }

  public void calibrate(CalibrationHelperVector instruments, OptimizationMethod method, EndCriteria endCriteria) {
    QuantLibJNI.Gsr_calibrate__SWIG_3(swigCPtr, this, CalibrationHelperVector.getCPtr(instruments), instruments, OptimizationMethod.getCPtr(method), method, EndCriteria.getCPtr(endCriteria), endCriteria);
  }

  public void setParams(Array params) {
    QuantLibJNI.Gsr_setParams(swigCPtr, this, Array.getCPtr(params), params);
  }

  public double value(Array params, CalibrationHelperVector instruments) {
    return QuantLibJNI.Gsr_value(swigCPtr, this, Array.getCPtr(params), params, CalibrationHelperVector.getCPtr(instruments), instruments);
  }

  public Constraint constraint() {
    long cPtr = QuantLibJNI.Gsr_constraint(swigCPtr, this);
    return (cPtr == 0) ? null : new Constraint(cPtr, true);
  }

  public EndCriteria.Type endCriteria() {
    return EndCriteria.Type.swigToEnum(QuantLibJNI.Gsr_endCriteria(swigCPtr, this));
  }

  public Array problemValues() {
    return new Array(QuantLibJNI.Gsr_problemValues(swigCPtr, this), false);
  }

  public int functionEvaluation() {
    return QuantLibJNI.Gsr_functionEvaluation(swigCPtr, this);
  }

}
