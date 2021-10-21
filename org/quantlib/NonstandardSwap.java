/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class NonstandardSwap extends Swap {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected NonstandardSwap(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.NonstandardSwap_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NonstandardSwap obj) {
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
        QuantLibJNI.delete_NonstandardSwap(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NonstandardSwap(Swap.Type type, DoubleVector fixedNominal, DoubleVector floatingNominal, Schedule fixedSchedule, DoubleVector fixedRate, DayCounter fixedDayCount, Schedule floatSchedule, IborIndex index, DoubleVector gearing, DoubleVector spread, DayCounter floatDayCount, boolean intermediateCapitalExchange, boolean finalCapitalExchange, BusinessDayConvention paymentConvention) {
    this(QuantLibJNI.new_NonstandardSwap__SWIG_0(type.swigValue(), DoubleVector.getCPtr(fixedNominal), fixedNominal, DoubleVector.getCPtr(floatingNominal), floatingNominal, Schedule.getCPtr(fixedSchedule), fixedSchedule, DoubleVector.getCPtr(fixedRate), fixedRate, DayCounter.getCPtr(fixedDayCount), fixedDayCount, Schedule.getCPtr(floatSchedule), floatSchedule, IborIndex.getCPtr(index), index, DoubleVector.getCPtr(gearing), gearing, DoubleVector.getCPtr(spread), spread, DayCounter.getCPtr(floatDayCount), floatDayCount, intermediateCapitalExchange, finalCapitalExchange, paymentConvention.swigValue()), true);
  }

  public NonstandardSwap(Swap.Type type, DoubleVector fixedNominal, DoubleVector floatingNominal, Schedule fixedSchedule, DoubleVector fixedRate, DayCounter fixedDayCount, Schedule floatSchedule, IborIndex index, DoubleVector gearing, DoubleVector spread, DayCounter floatDayCount, boolean intermediateCapitalExchange, boolean finalCapitalExchange) {
    this(QuantLibJNI.new_NonstandardSwap__SWIG_1(type.swigValue(), DoubleVector.getCPtr(fixedNominal), fixedNominal, DoubleVector.getCPtr(floatingNominal), floatingNominal, Schedule.getCPtr(fixedSchedule), fixedSchedule, DoubleVector.getCPtr(fixedRate), fixedRate, DayCounter.getCPtr(fixedDayCount), fixedDayCount, Schedule.getCPtr(floatSchedule), floatSchedule, IborIndex.getCPtr(index), index, DoubleVector.getCPtr(gearing), gearing, DoubleVector.getCPtr(spread), spread, DayCounter.getCPtr(floatDayCount), floatDayCount, intermediateCapitalExchange, finalCapitalExchange), true);
  }

  public NonstandardSwap(Swap.Type type, DoubleVector fixedNominal, DoubleVector floatingNominal, Schedule fixedSchedule, DoubleVector fixedRate, DayCounter fixedDayCount, Schedule floatSchedule, IborIndex index, DoubleVector gearing, DoubleVector spread, DayCounter floatDayCount, boolean intermediateCapitalExchange) {
    this(QuantLibJNI.new_NonstandardSwap__SWIG_2(type.swigValue(), DoubleVector.getCPtr(fixedNominal), fixedNominal, DoubleVector.getCPtr(floatingNominal), floatingNominal, Schedule.getCPtr(fixedSchedule), fixedSchedule, DoubleVector.getCPtr(fixedRate), fixedRate, DayCounter.getCPtr(fixedDayCount), fixedDayCount, Schedule.getCPtr(floatSchedule), floatSchedule, IborIndex.getCPtr(index), index, DoubleVector.getCPtr(gearing), gearing, DoubleVector.getCPtr(spread), spread, DayCounter.getCPtr(floatDayCount), floatDayCount, intermediateCapitalExchange), true);
  }

  public NonstandardSwap(Swap.Type type, DoubleVector fixedNominal, DoubleVector floatingNominal, Schedule fixedSchedule, DoubleVector fixedRate, DayCounter fixedDayCount, Schedule floatSchedule, IborIndex index, DoubleVector gearing, DoubleVector spread, DayCounter floatDayCount) {
    this(QuantLibJNI.new_NonstandardSwap__SWIG_3(type.swigValue(), DoubleVector.getCPtr(fixedNominal), fixedNominal, DoubleVector.getCPtr(floatingNominal), floatingNominal, Schedule.getCPtr(fixedSchedule), fixedSchedule, DoubleVector.getCPtr(fixedRate), fixedRate, DayCounter.getCPtr(fixedDayCount), fixedDayCount, Schedule.getCPtr(floatSchedule), floatSchedule, IborIndex.getCPtr(index), index, DoubleVector.getCPtr(gearing), gearing, DoubleVector.getCPtr(spread), spread, DayCounter.getCPtr(floatDayCount), floatDayCount), true);
  }

  public Swap.Type type() {
    return Swap.Type.swigToEnum(QuantLibJNI.NonstandardSwap_type(swigCPtr, this));
  }

  public DoubleVector fixedNominal() {
    return new DoubleVector(QuantLibJNI.NonstandardSwap_fixedNominal(swigCPtr, this), false);
  }

  public DoubleVector floatingNominal() {
    return new DoubleVector(QuantLibJNI.NonstandardSwap_floatingNominal(swigCPtr, this), false);
  }

  public Schedule fixedSchedule() {
    return new Schedule(QuantLibJNI.NonstandardSwap_fixedSchedule(swigCPtr, this), false);
  }

  public DoubleVector fixedRate() {
    return new DoubleVector(QuantLibJNI.NonstandardSwap_fixedRate(swigCPtr, this), false);
  }

  public DayCounter fixedDayCount() {
    return new DayCounter(QuantLibJNI.NonstandardSwap_fixedDayCount(swigCPtr, this), false);
  }

  public Schedule floatingSchedule() {
    return new Schedule(QuantLibJNI.NonstandardSwap_floatingSchedule(swigCPtr, this), false);
  }

  public IborIndex iborIndex() {
    long cPtr = QuantLibJNI.NonstandardSwap_iborIndex(swigCPtr, this);
    return (cPtr == 0) ? null : new IborIndex(cPtr, true);
  }

  public double spread() {
    return QuantLibJNI.NonstandardSwap_spread(swigCPtr, this);
  }

  public double gearing() {
    return QuantLibJNI.NonstandardSwap_gearing(swigCPtr, this);
  }

  public DoubleVector spreads() {
    return new DoubleVector(QuantLibJNI.NonstandardSwap_spreads(swigCPtr, this), false);
  }

  public DoubleVector gearings() {
    return new DoubleVector(QuantLibJNI.NonstandardSwap_gearings(swigCPtr, this), false);
  }

  public DayCounter floatingDayCount() {
    return new DayCounter(QuantLibJNI.NonstandardSwap_floatingDayCount(swigCPtr, this), false);
  }

  public BusinessDayConvention paymentConvention() {
    return BusinessDayConvention.swigToEnum(QuantLibJNI.NonstandardSwap_paymentConvention(swigCPtr, this));
  }

  public Leg fixedLeg() {
    return new Leg(QuantLibJNI.NonstandardSwap_fixedLeg(swigCPtr, this), false);
  }

  public Leg floatingLeg() {
    return new Leg(QuantLibJNI.NonstandardSwap_floatingLeg(swigCPtr, this), false);
  }

}