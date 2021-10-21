/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class YoYInflationCurve extends YoYInflationTermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected YoYInflationCurve(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.YoYInflationCurve_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YoYInflationCurve obj) {
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
        QuantLibJNI.delete_YoYInflationCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public YoYInflationCurve(Date referenceDate, Calendar calendar, DayCounter dayCounter, Period lag, Frequency frequency, boolean indexIsInterpolated, YieldTermStructureHandle yTS, DateVector dates, DoubleVector rates, Linear interpolator) {
    this(QuantLibJNI.new_YoYInflationCurve__SWIG_0(Date.getCPtr(referenceDate), referenceDate, Calendar.getCPtr(calendar), calendar, DayCounter.getCPtr(dayCounter), dayCounter, Period.getCPtr(lag), lag, frequency.swigValue(), indexIsInterpolated, YieldTermStructureHandle.getCPtr(yTS), yTS, DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(rates), rates, Linear.getCPtr(interpolator), interpolator), true);
  }

  public YoYInflationCurve(Date referenceDate, Calendar calendar, DayCounter dayCounter, Period lag, Frequency frequency, boolean indexIsInterpolated, YieldTermStructureHandle yTS, DateVector dates, DoubleVector rates) {
    this(QuantLibJNI.new_YoYInflationCurve__SWIG_1(Date.getCPtr(referenceDate), referenceDate, Calendar.getCPtr(calendar), calendar, DayCounter.getCPtr(dayCounter), dayCounter, Period.getCPtr(lag), lag, frequency.swigValue(), indexIsInterpolated, YieldTermStructureHandle.getCPtr(yTS), yTS, DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(rates), rates), true);
  }

  public DateVector dates() {
    return new DateVector(QuantLibJNI.YoYInflationCurve_dates(swigCPtr, this), false);
  }

  public DoubleVector times() {
    return new DoubleVector(QuantLibJNI.YoYInflationCurve_times(swigCPtr, this), false);
  }

  public DoubleVector data() {
    return new DoubleVector(QuantLibJNI.YoYInflationCurve_data(swigCPtr, this), false);
  }

  public DoubleVector rates() {
    return new DoubleVector(QuantLibJNI.YoYInflationCurve_rates(swigCPtr, this), false);
  }

  public NodeVector nodes() {
    return new NodeVector(QuantLibJNI.YoYInflationCurve_nodes(swigCPtr, this), true);
  }

}
