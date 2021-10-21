/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BondFunctions {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected BondFunctions(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BondFunctions obj) {
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
        QuantLibJNI.delete_BondFunctions(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public static Date startDate(Bond bond) {
    return new Date(QuantLibJNI.BondFunctions_startDate(Bond.getCPtr(bond), bond), true);
  }

  public static Date maturityDate(Bond bond) {
    return new Date(QuantLibJNI.BondFunctions_maturityDate(Bond.getCPtr(bond), bond), true);
  }

  public static boolean isTradable(Bond bond, Date settlementDate) {
    return QuantLibJNI.BondFunctions_isTradable__SWIG_0(Bond.getCPtr(bond), bond, Date.getCPtr(settlementDate), settlementDate);
  }

  public static boolean isTradable(Bond bond) {
    return QuantLibJNI.BondFunctions_isTradable__SWIG_1(Bond.getCPtr(bond), bond);
  }

  public static Date previousCashFlowDate(Bond bond, Date refDate) {
    return new Date(QuantLibJNI.BondFunctions_previousCashFlowDate__SWIG_0(Bond.getCPtr(bond), bond, Date.getCPtr(refDate), refDate), true);
  }

  public static Date previousCashFlowDate(Bond bond) {
    return new Date(QuantLibJNI.BondFunctions_previousCashFlowDate__SWIG_1(Bond.getCPtr(bond), bond), true);
  }

  public static Date nextCashFlowDate(Bond bond, Date refDate) {
    return new Date(QuantLibJNI.BondFunctions_nextCashFlowDate__SWIG_0(Bond.getCPtr(bond), bond, Date.getCPtr(refDate), refDate), true);
  }

  public static Date nextCashFlowDate(Bond bond) {
    return new Date(QuantLibJNI.BondFunctions_nextCashFlowDate__SWIG_1(Bond.getCPtr(bond), bond), true);
  }

  public static double previousCashFlowAmount(Bond bond, Date refDate) {
    return QuantLibJNI.BondFunctions_previousCashFlowAmount__SWIG_0(Bond.getCPtr(bond), bond, Date.getCPtr(refDate), refDate);
  }

  public static double previousCashFlowAmount(Bond bond) {
    return QuantLibJNI.BondFunctions_previousCashFlowAmount__SWIG_1(Bond.getCPtr(bond), bond);
  }

  public static double nextCashFlowAmount(Bond bond, Date refDate) {
    return QuantLibJNI.BondFunctions_nextCashFlowAmount__SWIG_0(Bond.getCPtr(bond), bond, Date.getCPtr(refDate), refDate);
  }

  public static double nextCashFlowAmount(Bond bond) {
    return QuantLibJNI.BondFunctions_nextCashFlowAmount__SWIG_1(Bond.getCPtr(bond), bond);
  }

  public static double previousCouponRate(Bond bond, Date settlementDate) {
    return QuantLibJNI.BondFunctions_previousCouponRate__SWIG_0(Bond.getCPtr(bond), bond, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double previousCouponRate(Bond bond) {
    return QuantLibJNI.BondFunctions_previousCouponRate__SWIG_1(Bond.getCPtr(bond), bond);
  }

  public static double nextCouponRate(Bond bond, Date settlementDate) {
    return QuantLibJNI.BondFunctions_nextCouponRate__SWIG_0(Bond.getCPtr(bond), bond, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double nextCouponRate(Bond bond) {
    return QuantLibJNI.BondFunctions_nextCouponRate__SWIG_1(Bond.getCPtr(bond), bond);
  }

  public static Date accrualStartDate(Bond bond, Date settlementDate) {
    return new Date(QuantLibJNI.BondFunctions_accrualStartDate__SWIG_0(Bond.getCPtr(bond), bond, Date.getCPtr(settlementDate), settlementDate), true);
  }

  public static Date accrualStartDate(Bond bond) {
    return new Date(QuantLibJNI.BondFunctions_accrualStartDate__SWIG_1(Bond.getCPtr(bond), bond), true);
  }

  public static Date accrualEndDate(Bond bond, Date settlementDate) {
    return new Date(QuantLibJNI.BondFunctions_accrualEndDate__SWIG_0(Bond.getCPtr(bond), bond, Date.getCPtr(settlementDate), settlementDate), true);
  }

  public static Date accrualEndDate(Bond bond) {
    return new Date(QuantLibJNI.BondFunctions_accrualEndDate__SWIG_1(Bond.getCPtr(bond), bond), true);
  }

  public static double accrualPeriod(Bond bond, Date settlementDate) {
    return QuantLibJNI.BondFunctions_accrualPeriod__SWIG_0(Bond.getCPtr(bond), bond, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double accrualPeriod(Bond bond) {
    return QuantLibJNI.BondFunctions_accrualPeriod__SWIG_1(Bond.getCPtr(bond), bond);
  }

  public static int accrualDays(Bond bond, Date settlementDate) {
    return QuantLibJNI.BondFunctions_accrualDays__SWIG_0(Bond.getCPtr(bond), bond, Date.getCPtr(settlementDate), settlementDate);
  }

  public static int accrualDays(Bond bond) {
    return QuantLibJNI.BondFunctions_accrualDays__SWIG_1(Bond.getCPtr(bond), bond);
  }

  public static double accruedPeriod(Bond bond, Date settlementDate) {
    return QuantLibJNI.BondFunctions_accruedPeriod__SWIG_0(Bond.getCPtr(bond), bond, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double accruedPeriod(Bond bond) {
    return QuantLibJNI.BondFunctions_accruedPeriod__SWIG_1(Bond.getCPtr(bond), bond);
  }

  public static int accruedDays(Bond bond, Date settlementDate) {
    return QuantLibJNI.BondFunctions_accruedDays__SWIG_0(Bond.getCPtr(bond), bond, Date.getCPtr(settlementDate), settlementDate);
  }

  public static int accruedDays(Bond bond) {
    return QuantLibJNI.BondFunctions_accruedDays__SWIG_1(Bond.getCPtr(bond), bond);
  }

  public static double accruedAmount(Bond bond, Date settlementDate) {
    return QuantLibJNI.BondFunctions_accruedAmount__SWIG_0(Bond.getCPtr(bond), bond, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double accruedAmount(Bond bond) {
    return QuantLibJNI.BondFunctions_accruedAmount__SWIG_1(Bond.getCPtr(bond), bond);
  }

  public static double cleanPrice(Bond bond, YieldTermStructure discountCurve, Date settlementDate) {
    return QuantLibJNI.BondFunctions_cleanPrice__SWIG_0(Bond.getCPtr(bond), bond, YieldTermStructure.getCPtr(discountCurve), discountCurve, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double cleanPrice(Bond bond, YieldTermStructure discountCurve) {
    return QuantLibJNI.BondFunctions_cleanPrice__SWIG_1(Bond.getCPtr(bond), bond, YieldTermStructure.getCPtr(discountCurve), discountCurve);
  }

  public static double bps(Bond bond, YieldTermStructure discountCurve, Date settlementDate) {
    return QuantLibJNI.BondFunctions_bps__SWIG_0(Bond.getCPtr(bond), bond, YieldTermStructure.getCPtr(discountCurve), discountCurve, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double bps(Bond bond, YieldTermStructure discountCurve) {
    return QuantLibJNI.BondFunctions_bps__SWIG_1(Bond.getCPtr(bond), bond, YieldTermStructure.getCPtr(discountCurve), discountCurve);
  }

  public static double atmRate(Bond bond, YieldTermStructure discountCurve, Date settlementDate, double cleanPrice) {
    return QuantLibJNI.BondFunctions_atmRate__SWIG_0(Bond.getCPtr(bond), bond, YieldTermStructure.getCPtr(discountCurve), discountCurve, Date.getCPtr(settlementDate), settlementDate, cleanPrice);
  }

  public static double atmRate(Bond bond, YieldTermStructure discountCurve, Date settlementDate) {
    return QuantLibJNI.BondFunctions_atmRate__SWIG_1(Bond.getCPtr(bond), bond, YieldTermStructure.getCPtr(discountCurve), discountCurve, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double atmRate(Bond bond, YieldTermStructure discountCurve) {
    return QuantLibJNI.BondFunctions_atmRate__SWIG_2(Bond.getCPtr(bond), bond, YieldTermStructure.getCPtr(discountCurve), discountCurve);
  }

  public static double cleanPrice(Bond bond, InterestRate yield, Date settlementDate) {
    return QuantLibJNI.BondFunctions_cleanPrice__SWIG_2(Bond.getCPtr(bond), bond, InterestRate.getCPtr(yield), yield, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double cleanPrice(Bond bond, InterestRate yield) {
    return QuantLibJNI.BondFunctions_cleanPrice__SWIG_3(Bond.getCPtr(bond), bond, InterestRate.getCPtr(yield), yield);
  }

  public static double cleanPrice(Bond bond, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate) {
    return QuantLibJNI.BondFunctions_cleanPrice__SWIG_4(Bond.getCPtr(bond), bond, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate);
  }

  public static double cleanPrice(Bond bond, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency) {
    return QuantLibJNI.BondFunctions_cleanPrice__SWIG_5(Bond.getCPtr(bond), bond, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue());
  }

  public static double bps(Bond bond, InterestRate yield, Date settlementDate) {
    return QuantLibJNI.BondFunctions_bps__SWIG_2(Bond.getCPtr(bond), bond, InterestRate.getCPtr(yield), yield, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double bps(Bond bond, InterestRate yield) {
    return QuantLibJNI.BondFunctions_bps__SWIG_3(Bond.getCPtr(bond), bond, InterestRate.getCPtr(yield), yield);
  }

  public static double bps(Bond bond, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate) {
    return QuantLibJNI.BondFunctions_bps__SWIG_4(Bond.getCPtr(bond), bond, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate);
  }

  public static double bps(Bond bond, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency) {
    return QuantLibJNI.BondFunctions_bps__SWIG_5(Bond.getCPtr(bond), bond, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue());
  }

  public static double yield(Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate, double accuracy, long maxIterations, double guess) {
    return QuantLibJNI.BondFunctions_yield__SWIG_0(Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate, accuracy, maxIterations, guess);
  }

  public static double yield(Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate, double accuracy, long maxIterations) {
    return QuantLibJNI.BondFunctions_yield__SWIG_1(Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate, accuracy, maxIterations);
  }

  public static double yield(Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate, double accuracy) {
    return QuantLibJNI.BondFunctions_yield__SWIG_2(Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate, accuracy);
  }

  public static double yield(Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate) {
    return QuantLibJNI.BondFunctions_yield__SWIG_3(Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate);
  }

  public static double yield(Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency) {
    return QuantLibJNI.BondFunctions_yield__SWIG_4(Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue());
  }

  public static double duration(Bond bond, InterestRate yield, Duration.Type type, Date settlementDate) {
    return QuantLibJNI.BondFunctions_duration__SWIG_0(Bond.getCPtr(bond), bond, InterestRate.getCPtr(yield), yield, type.swigValue(), Date.getCPtr(settlementDate), settlementDate);
  }

  public static double duration(Bond bond, InterestRate yield, Duration.Type type) {
    return QuantLibJNI.BondFunctions_duration__SWIG_1(Bond.getCPtr(bond), bond, InterestRate.getCPtr(yield), yield, type.swigValue());
  }

  public static double duration(Bond bond, InterestRate yield) {
    return QuantLibJNI.BondFunctions_duration__SWIG_2(Bond.getCPtr(bond), bond, InterestRate.getCPtr(yield), yield);
  }

  public static double duration(Bond bond, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, Duration.Type type, Date settlementDate) {
    return QuantLibJNI.BondFunctions_duration__SWIG_3(Bond.getCPtr(bond), bond, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), type.swigValue(), Date.getCPtr(settlementDate), settlementDate);
  }

  public static double duration(Bond bond, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, Duration.Type type) {
    return QuantLibJNI.BondFunctions_duration__SWIG_4(Bond.getCPtr(bond), bond, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), type.swigValue());
  }

  public static double duration(Bond bond, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency) {
    return QuantLibJNI.BondFunctions_duration__SWIG_5(Bond.getCPtr(bond), bond, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue());
  }

  public static double convexity(Bond bond, InterestRate yield, Date settlementDate) {
    return QuantLibJNI.BondFunctions_convexity__SWIG_0(Bond.getCPtr(bond), bond, InterestRate.getCPtr(yield), yield, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double convexity(Bond bond, InterestRate yield) {
    return QuantLibJNI.BondFunctions_convexity__SWIG_1(Bond.getCPtr(bond), bond, InterestRate.getCPtr(yield), yield);
  }

  public static double convexity(Bond bond, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate) {
    return QuantLibJNI.BondFunctions_convexity__SWIG_2(Bond.getCPtr(bond), bond, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate);
  }

  public static double convexity(Bond bond, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency) {
    return QuantLibJNI.BondFunctions_convexity__SWIG_3(Bond.getCPtr(bond), bond, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue());
  }

  public static double basisPointValue(Bond bond, InterestRate yield, Date settlementDate) {
    return QuantLibJNI.BondFunctions_basisPointValue__SWIG_0(Bond.getCPtr(bond), bond, InterestRate.getCPtr(yield), yield, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double basisPointValue(Bond bond, InterestRate yield) {
    return QuantLibJNI.BondFunctions_basisPointValue__SWIG_1(Bond.getCPtr(bond), bond, InterestRate.getCPtr(yield), yield);
  }

  public static double basisPointValue(Bond bond, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate) {
    return QuantLibJNI.BondFunctions_basisPointValue__SWIG_2(Bond.getCPtr(bond), bond, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate);
  }

  public static double basisPointValue(Bond bond, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency) {
    return QuantLibJNI.BondFunctions_basisPointValue__SWIG_3(Bond.getCPtr(bond), bond, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue());
  }

  public static double yieldValueBasisPoint(Bond bond, InterestRate yield, Date settlementDate) {
    return QuantLibJNI.BondFunctions_yieldValueBasisPoint__SWIG_0(Bond.getCPtr(bond), bond, InterestRate.getCPtr(yield), yield, Date.getCPtr(settlementDate), settlementDate);
  }

  public static double yieldValueBasisPoint(Bond bond, InterestRate yield) {
    return QuantLibJNI.BondFunctions_yieldValueBasisPoint__SWIG_1(Bond.getCPtr(bond), bond, InterestRate.getCPtr(yield), yield);
  }

  public static double yieldValueBasisPoint(Bond bond, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate) {
    return QuantLibJNI.BondFunctions_yieldValueBasisPoint__SWIG_2(Bond.getCPtr(bond), bond, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate);
  }

  public static double yieldValueBasisPoint(Bond bond, double yield, DayCounter dayCounter, Compounding compounding, Frequency frequency) {
    return QuantLibJNI.BondFunctions_yieldValueBasisPoint__SWIG_3(Bond.getCPtr(bond), bond, yield, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue());
  }

  public static double zSpread(Bond bond, double cleanPrice, YieldTermStructure discountCurve, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate, double accuracy, long maxIterations, double guess) {
    return QuantLibJNI.BondFunctions_zSpread__SWIG_0(Bond.getCPtr(bond), bond, cleanPrice, YieldTermStructure.getCPtr(discountCurve), discountCurve, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate, accuracy, maxIterations, guess);
  }

  public static double zSpread(Bond bond, double cleanPrice, YieldTermStructure discountCurve, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate, double accuracy, long maxIterations) {
    return QuantLibJNI.BondFunctions_zSpread__SWIG_1(Bond.getCPtr(bond), bond, cleanPrice, YieldTermStructure.getCPtr(discountCurve), discountCurve, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate, accuracy, maxIterations);
  }

  public static double zSpread(Bond bond, double cleanPrice, YieldTermStructure discountCurve, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate, double accuracy) {
    return QuantLibJNI.BondFunctions_zSpread__SWIG_2(Bond.getCPtr(bond), bond, cleanPrice, YieldTermStructure.getCPtr(discountCurve), discountCurve, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate, accuracy);
  }

  public static double zSpread(Bond bond, double cleanPrice, YieldTermStructure discountCurve, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate) {
    return QuantLibJNI.BondFunctions_zSpread__SWIG_3(Bond.getCPtr(bond), bond, cleanPrice, YieldTermStructure.getCPtr(discountCurve), discountCurve, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate);
  }

  public static double zSpread(Bond bond, double cleanPrice, YieldTermStructure discountCurve, DayCounter dayCounter, Compounding compounding, Frequency frequency) {
    return QuantLibJNI.BondFunctions_zSpread__SWIG_4(Bond.getCPtr(bond), bond, cleanPrice, YieldTermStructure.getCPtr(discountCurve), discountCurve, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue());
  }

  public static double yieldBrent(Brent solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate, double accuracy, double guess) {
    return QuantLibJNI.BondFunctions_yieldBrent__SWIG_0(Brent.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate, accuracy, guess);
  }

  public static double yieldBrent(Brent solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate, double accuracy) {
    return QuantLibJNI.BondFunctions_yieldBrent__SWIG_1(Brent.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate, accuracy);
  }

  public static double yieldBrent(Brent solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate) {
    return QuantLibJNI.BondFunctions_yieldBrent__SWIG_2(Brent.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate);
  }

  public static double yieldBrent(Brent solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency) {
    return QuantLibJNI.BondFunctions_yieldBrent__SWIG_3(Brent.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue());
  }

  public static double yieldBisection(Bisection solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate, double accuracy, double guess) {
    return QuantLibJNI.BondFunctions_yieldBisection__SWIG_0(Bisection.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate, accuracy, guess);
  }

  public static double yieldBisection(Bisection solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate, double accuracy) {
    return QuantLibJNI.BondFunctions_yieldBisection__SWIG_1(Bisection.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate, accuracy);
  }

  public static double yieldBisection(Bisection solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate) {
    return QuantLibJNI.BondFunctions_yieldBisection__SWIG_2(Bisection.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate);
  }

  public static double yieldBisection(Bisection solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency) {
    return QuantLibJNI.BondFunctions_yieldBisection__SWIG_3(Bisection.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue());
  }

  public static double yieldFalsePosition(FalsePosition solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate, double accuracy, double guess) {
    return QuantLibJNI.BondFunctions_yieldFalsePosition__SWIG_0(FalsePosition.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate, accuracy, guess);
  }

  public static double yieldFalsePosition(FalsePosition solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate, double accuracy) {
    return QuantLibJNI.BondFunctions_yieldFalsePosition__SWIG_1(FalsePosition.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate, accuracy);
  }

  public static double yieldFalsePosition(FalsePosition solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate) {
    return QuantLibJNI.BondFunctions_yieldFalsePosition__SWIG_2(FalsePosition.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate);
  }

  public static double yieldFalsePosition(FalsePosition solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency) {
    return QuantLibJNI.BondFunctions_yieldFalsePosition__SWIG_3(FalsePosition.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue());
  }

  public static double yieldRidder(Ridder solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate, double accuracy, double guess) {
    return QuantLibJNI.BondFunctions_yieldRidder__SWIG_0(Ridder.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate, accuracy, guess);
  }

  public static double yieldRidder(Ridder solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate, double accuracy) {
    return QuantLibJNI.BondFunctions_yieldRidder__SWIG_1(Ridder.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate, accuracy);
  }

  public static double yieldRidder(Ridder solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate) {
    return QuantLibJNI.BondFunctions_yieldRidder__SWIG_2(Ridder.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate);
  }

  public static double yieldRidder(Ridder solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency) {
    return QuantLibJNI.BondFunctions_yieldRidder__SWIG_3(Ridder.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue());
  }

  public static double yieldSecant(Secant solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate, double accuracy, double guess) {
    return QuantLibJNI.BondFunctions_yieldSecant__SWIG_0(Secant.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate, accuracy, guess);
  }

  public static double yieldSecant(Secant solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate, double accuracy) {
    return QuantLibJNI.BondFunctions_yieldSecant__SWIG_1(Secant.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate, accuracy);
  }

  public static double yieldSecant(Secant solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency, Date settlementDate) {
    return QuantLibJNI.BondFunctions_yieldSecant__SWIG_2(Secant.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue(), Date.getCPtr(settlementDate), settlementDate);
  }

  public static double yieldSecant(Secant solver, Bond bond, double cleanPrice, DayCounter dayCounter, Compounding compounding, Frequency frequency) {
    return QuantLibJNI.BondFunctions_yieldSecant__SWIG_3(Secant.getCPtr(solver), solver, Bond.getCPtr(bond), bond, cleanPrice, DayCounter.getCPtr(dayCounter), dayCounter, compounding.swigValue(), frequency.swigValue());
  }

  public BondFunctions() {
    this(QuantLibJNI.new_BondFunctions(), true);
  }

}