/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdmHestonSolver {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected FdmHestonSolver(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdmHestonSolver obj) {
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
        QuantLibJNI.delete_FdmHestonSolver(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FdmHestonSolver(HestonProcess process, FdmSolverDesc solverDesc, FdmSchemeDesc schemeDesc, FdmQuantoHelper quantoHelper, LocalVolTermStructure leverageFct) {
    this(QuantLibJNI.new_FdmHestonSolver__SWIG_0(HestonProcess.getCPtr(process), process, FdmSolverDesc.getCPtr(solverDesc), solverDesc, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc, FdmQuantoHelper.getCPtr(quantoHelper), quantoHelper, LocalVolTermStructure.getCPtr(leverageFct), leverageFct), true);
  }

  public FdmHestonSolver(HestonProcess process, FdmSolverDesc solverDesc, FdmSchemeDesc schemeDesc, FdmQuantoHelper quantoHelper) {
    this(QuantLibJNI.new_FdmHestonSolver__SWIG_1(HestonProcess.getCPtr(process), process, FdmSolverDesc.getCPtr(solverDesc), solverDesc, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc, FdmQuantoHelper.getCPtr(quantoHelper), quantoHelper), true);
  }

  public FdmHestonSolver(HestonProcess process, FdmSolverDesc solverDesc, FdmSchemeDesc schemeDesc) {
    this(QuantLibJNI.new_FdmHestonSolver__SWIG_2(HestonProcess.getCPtr(process), process, FdmSolverDesc.getCPtr(solverDesc), solverDesc, FdmSchemeDesc.getCPtr(schemeDesc), schemeDesc), true);
  }

  public FdmHestonSolver(HestonProcess process, FdmSolverDesc solverDesc) {
    this(QuantLibJNI.new_FdmHestonSolver__SWIG_3(HestonProcess.getCPtr(process), process, FdmSolverDesc.getCPtr(solverDesc), solverDesc), true);
  }

  public double valueAt(double s, double v) {
    return QuantLibJNI.FdmHestonSolver_valueAt(swigCPtr, this, s, v);
  }

  public double thetaAt(double s, double v) {
    return QuantLibJNI.FdmHestonSolver_thetaAt(swigCPtr, this, s, v);
  }

  public double deltaAt(double s, double v) {
    return QuantLibJNI.FdmHestonSolver_deltaAt(swigCPtr, this, s, v);
  }

  public double gammaAt(double s, double v) {
    return QuantLibJNI.FdmHestonSolver_gammaAt(swigCPtr, this, s, v);
  }

  public double meanVarianceDeltaAt(double s, double v) {
    return QuantLibJNI.FdmHestonSolver_meanVarianceDeltaAt(swigCPtr, this, s, v);
  }

  public double meanVarianceGammaAt(double s, double v) {
    return QuantLibJNI.FdmHestonSolver_meanVarianceGammaAt(swigCPtr, this, s, v);
  }

}
