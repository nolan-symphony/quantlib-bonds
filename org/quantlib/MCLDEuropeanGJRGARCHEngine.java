/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MCLDEuropeanGJRGARCHEngine extends PricingEngine {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected MCLDEuropeanGJRGARCHEngine(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MCLDEuropeanGJRGARCHEngine_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MCLDEuropeanGJRGARCHEngine obj) {
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
        QuantLibJNI.delete_MCLDEuropeanGJRGARCHEngine(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MCLDEuropeanGJRGARCHEngine(GJRGARCHProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples, int seed) {
    this(QuantLibJNI.new_MCLDEuropeanGJRGARCHEngine__SWIG_0(GJRGARCHProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, requiredSamples, requiredTolerance, maxSamples, seed), true);
  }

  public MCLDEuropeanGJRGARCHEngine(GJRGARCHProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, int requiredSamples, double requiredTolerance, int maxSamples) {
    this(QuantLibJNI.new_MCLDEuropeanGJRGARCHEngine__SWIG_1(GJRGARCHProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, requiredSamples, requiredTolerance, maxSamples), true);
  }

  public MCLDEuropeanGJRGARCHEngine(GJRGARCHProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, int requiredSamples, double requiredTolerance) {
    this(QuantLibJNI.new_MCLDEuropeanGJRGARCHEngine__SWIG_2(GJRGARCHProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, requiredSamples, requiredTolerance), true);
  }

  public MCLDEuropeanGJRGARCHEngine(GJRGARCHProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate, int requiredSamples) {
    this(QuantLibJNI.new_MCLDEuropeanGJRGARCHEngine__SWIG_3(GJRGARCHProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate, requiredSamples), true);
  }

  public MCLDEuropeanGJRGARCHEngine(GJRGARCHProcess process, int timeSteps, int timeStepsPerYear, boolean antitheticVariate) {
    this(QuantLibJNI.new_MCLDEuropeanGJRGARCHEngine__SWIG_4(GJRGARCHProcess.getCPtr(process), process, timeSteps, timeStepsPerYear, antitheticVariate), true);
  }

  public MCLDEuropeanGJRGARCHEngine(GJRGARCHProcess process, int timeSteps, int timeStepsPerYear) {
    this(QuantLibJNI.new_MCLDEuropeanGJRGARCHEngine__SWIG_5(GJRGARCHProcess.getCPtr(process), process, timeSteps, timeStepsPerYear), true);
  }

  public MCLDEuropeanGJRGARCHEngine(GJRGARCHProcess process, int timeSteps) {
    this(QuantLibJNI.new_MCLDEuropeanGJRGARCHEngine__SWIG_6(GJRGARCHProcess.getCPtr(process), process, timeSteps), true);
  }

  public MCLDEuropeanGJRGARCHEngine(GJRGARCHProcess process) {
    this(QuantLibJNI.new_MCLDEuropeanGJRGARCHEngine__SWIG_7(GJRGARCHProcess.getCPtr(process), process), true);
  }

}