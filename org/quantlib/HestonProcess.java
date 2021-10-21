/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class HestonProcess extends StochasticProcess {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected HestonProcess(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.HestonProcess_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(HestonProcess obj) {
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
        QuantLibJNI.delete_HestonProcess(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public HestonProcess(YieldTermStructureHandle riskFreeTS, YieldTermStructureHandle dividendTS, QuoteHandle s0, double v0, double kappa, double theta, double sigma, double rho, HestonProcess.Discretization d) {
    this(QuantLibJNI.new_HestonProcess__SWIG_0(YieldTermStructureHandle.getCPtr(riskFreeTS), riskFreeTS, YieldTermStructureHandle.getCPtr(dividendTS), dividendTS, QuoteHandle.getCPtr(s0), s0, v0, kappa, theta, sigma, rho, d.swigValue()), true);
  }

  public HestonProcess(YieldTermStructureHandle riskFreeTS, YieldTermStructureHandle dividendTS, QuoteHandle s0, double v0, double kappa, double theta, double sigma, double rho) {
    this(QuantLibJNI.new_HestonProcess__SWIG_1(YieldTermStructureHandle.getCPtr(riskFreeTS), riskFreeTS, YieldTermStructureHandle.getCPtr(dividendTS), dividendTS, QuoteHandle.getCPtr(s0), s0, v0, kappa, theta, sigma, rho), true);
  }

  public QuoteHandle s0() {
    return new QuoteHandle(QuantLibJNI.HestonProcess_s0(swigCPtr, this), true);
  }

  public YieldTermStructureHandle dividendYield() {
    return new YieldTermStructureHandle(QuantLibJNI.HestonProcess_dividendYield(swigCPtr, this), true);
  }

  public YieldTermStructureHandle riskFreeRate() {
    return new YieldTermStructureHandle(QuantLibJNI.HestonProcess_riskFreeRate(swigCPtr, this), true);
  }

  public final static class Discretization {
    public final static HestonProcess.Discretization PartialTruncation = new HestonProcess.Discretization("PartialTruncation");
    public final static HestonProcess.Discretization FullTruncation = new HestonProcess.Discretization("FullTruncation");
    public final static HestonProcess.Discretization Reflection = new HestonProcess.Discretization("Reflection");
    public final static HestonProcess.Discretization NonCentralChiSquareVariance = new HestonProcess.Discretization("NonCentralChiSquareVariance");
    public final static HestonProcess.Discretization QuadraticExponential = new HestonProcess.Discretization("QuadraticExponential");
    public final static HestonProcess.Discretization QuadraticExponentialMartingale = new HestonProcess.Discretization("QuadraticExponentialMartingale");
    public final static HestonProcess.Discretization BroadieKayaExactSchemeLobatto = new HestonProcess.Discretization("BroadieKayaExactSchemeLobatto");
    public final static HestonProcess.Discretization BroadieKayaExactSchemeLaguerre = new HestonProcess.Discretization("BroadieKayaExactSchemeLaguerre");
    public final static HestonProcess.Discretization BroadieKayaExactSchemeTrapezoidal = new HestonProcess.Discretization("BroadieKayaExactSchemeTrapezoidal");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Discretization swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Discretization.class + " with value " + swigValue);
    }

    private Discretization(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Discretization(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Discretization(String swigName, Discretization swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Discretization[] swigValues = { PartialTruncation, FullTruncation, Reflection, NonCentralChiSquareVariance, QuadraticExponential, QuadraticExponentialMartingale, BroadieKayaExactSchemeLobatto, BroadieKayaExactSchemeLaguerre, BroadieKayaExactSchemeTrapezoidal };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
