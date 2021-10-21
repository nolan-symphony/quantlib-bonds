/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CmsMarketCalibration {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CmsMarketCalibration(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CmsMarketCalibration obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_CmsMarketCalibration(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CmsMarketCalibration(SwaptionVolatilityStructureHandle volCube, CmsMarket cmsMarket, Matrix weights, CmsMarketCalibration.CalibrationType calibrationType) {
    this(QuantLibJNI.new_CmsMarketCalibration(SwaptionVolatilityStructureHandle.getCPtr(volCube), volCube, CmsMarket.getCPtr(cmsMarket), cmsMarket, Matrix.getCPtr(weights), weights, calibrationType.swigValue()), true);
  }

  public Array compute(EndCriteria endCriteria, OptimizationMethod method, Array guess, boolean isMeanReversionFixed) {
    return new Array(QuantLibJNI.CmsMarketCalibration_compute__SWIG_0(swigCPtr, this, EndCriteria.getCPtr(endCriteria), endCriteria, OptimizationMethod.getCPtr(method), method, Array.getCPtr(guess), guess, isMeanReversionFixed), true);
  }

  public Matrix compute(EndCriteria endCriteria, OptimizationMethod method, Matrix guess, boolean isMeanReversionFixed, double meanReversionGuess) {
    return new Matrix(QuantLibJNI.CmsMarketCalibration_compute__SWIG_1(swigCPtr, this, EndCriteria.getCPtr(endCriteria), endCriteria, OptimizationMethod.getCPtr(method), method, Matrix.getCPtr(guess), guess, isMeanReversionFixed, meanReversionGuess), true);
  }

  public Matrix compute(EndCriteria endCriteria, OptimizationMethod method, Matrix guess, boolean isMeanReversionFixed) {
    return new Matrix(QuantLibJNI.CmsMarketCalibration_compute__SWIG_2(swigCPtr, this, EndCriteria.getCPtr(endCriteria), endCriteria, OptimizationMethod.getCPtr(method), method, Matrix.getCPtr(guess), guess, isMeanReversionFixed), true);
  }

  public Matrix computeParametric(EndCriteria endCriteria, OptimizationMethod method, Matrix guess, boolean isMeanReversionFixed, double meanReversionGuess) {
    return new Matrix(QuantLibJNI.CmsMarketCalibration_computeParametric__SWIG_0(swigCPtr, this, EndCriteria.getCPtr(endCriteria), endCriteria, OptimizationMethod.getCPtr(method), method, Matrix.getCPtr(guess), guess, isMeanReversionFixed, meanReversionGuess), true);
  }

  public Matrix computeParametric(EndCriteria endCriteria, OptimizationMethod method, Matrix guess, boolean isMeanReversionFixed) {
    return new Matrix(QuantLibJNI.CmsMarketCalibration_computeParametric__SWIG_1(swigCPtr, this, EndCriteria.getCPtr(endCriteria), endCriteria, OptimizationMethod.getCPtr(method), method, Matrix.getCPtr(guess), guess, isMeanReversionFixed), true);
  }

  public double error() {
    return QuantLibJNI.CmsMarketCalibration_error(swigCPtr, this);
  }

  public EndCriteria.Type endCriteria() {
    return EndCriteria.Type.swigToEnum(QuantLibJNI.CmsMarketCalibration_endCriteria(swigCPtr, this));
  }

  public final static class CalibrationType {
    public final static CmsMarketCalibration.CalibrationType OnSpread = new CmsMarketCalibration.CalibrationType("OnSpread");
    public final static CmsMarketCalibration.CalibrationType OnPrice = new CmsMarketCalibration.CalibrationType("OnPrice");
    public final static CmsMarketCalibration.CalibrationType OnForwardCmsPrice = new CmsMarketCalibration.CalibrationType("OnForwardCmsPrice");

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

    private static CalibrationType[] swigValues = { OnSpread, OnPrice, OnForwardCmsPrice };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
