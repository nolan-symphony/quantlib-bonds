/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class YoYInflationCapFloorTermPriceSurface extends YoYCapFloorTermPriceSurface {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected YoYInflationCapFloorTermPriceSurface(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.YoYInflationCapFloorTermPriceSurface_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YoYInflationCapFloorTermPriceSurface obj) {
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
        QuantLibJNI.delete_YoYInflationCapFloorTermPriceSurface(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public YoYInflationCapFloorTermPriceSurface(long fixingDays, Period yyLag, YoYInflationIndex yii, double baseRate, YieldTermStructureHandle nominal, DayCounter dc, Calendar cal, BusinessDayConvention bdc, DoubleVector cStrikes, DoubleVector fStrikes, PeriodVector cfMaturities, Matrix cPrice, Matrix fPrice, Bicubic interpolator2d, Cubic interpolator1d) {
    this(QuantLibJNI.new_YoYInflationCapFloorTermPriceSurface__SWIG_0(fixingDays, Period.getCPtr(yyLag), yyLag, YoYInflationIndex.getCPtr(yii), yii, baseRate, YieldTermStructureHandle.getCPtr(nominal), nominal, DayCounter.getCPtr(dc), dc, Calendar.getCPtr(cal), cal, bdc.swigValue(), DoubleVector.getCPtr(cStrikes), cStrikes, DoubleVector.getCPtr(fStrikes), fStrikes, PeriodVector.getCPtr(cfMaturities), cfMaturities, Matrix.getCPtr(cPrice), cPrice, Matrix.getCPtr(fPrice), fPrice, Bicubic.getCPtr(interpolator2d), interpolator2d, Cubic.getCPtr(interpolator1d), interpolator1d), true);
  }

  public YoYInflationCapFloorTermPriceSurface(long fixingDays, Period yyLag, YoYInflationIndex yii, double baseRate, YieldTermStructureHandle nominal, DayCounter dc, Calendar cal, BusinessDayConvention bdc, DoubleVector cStrikes, DoubleVector fStrikes, PeriodVector cfMaturities, Matrix cPrice, Matrix fPrice, Bicubic interpolator2d) {
    this(QuantLibJNI.new_YoYInflationCapFloorTermPriceSurface__SWIG_1(fixingDays, Period.getCPtr(yyLag), yyLag, YoYInflationIndex.getCPtr(yii), yii, baseRate, YieldTermStructureHandle.getCPtr(nominal), nominal, DayCounter.getCPtr(dc), dc, Calendar.getCPtr(cal), cal, bdc.swigValue(), DoubleVector.getCPtr(cStrikes), cStrikes, DoubleVector.getCPtr(fStrikes), fStrikes, PeriodVector.getCPtr(cfMaturities), cfMaturities, Matrix.getCPtr(cPrice), cPrice, Matrix.getCPtr(fPrice), fPrice, Bicubic.getCPtr(interpolator2d), interpolator2d), true);
  }

  public YoYInflationCapFloorTermPriceSurface(long fixingDays, Period yyLag, YoYInflationIndex yii, double baseRate, YieldTermStructureHandle nominal, DayCounter dc, Calendar cal, BusinessDayConvention bdc, DoubleVector cStrikes, DoubleVector fStrikes, PeriodVector cfMaturities, Matrix cPrice, Matrix fPrice) {
    this(QuantLibJNI.new_YoYInflationCapFloorTermPriceSurface__SWIG_2(fixingDays, Period.getCPtr(yyLag), yyLag, YoYInflationIndex.getCPtr(yii), yii, baseRate, YieldTermStructureHandle.getCPtr(nominal), nominal, DayCounter.getCPtr(dc), dc, Calendar.getCPtr(cal), cal, bdc.swigValue(), DoubleVector.getCPtr(cStrikes), cStrikes, DoubleVector.getCPtr(fStrikes), fStrikes, PeriodVector.getCPtr(cfMaturities), cfMaturities, Matrix.getCPtr(cPrice), cPrice, Matrix.getCPtr(fPrice), fPrice), true);
  }

}
