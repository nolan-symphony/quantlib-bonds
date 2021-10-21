/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BlackIborCouponPricer extends IborCouponPricer {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BlackIborCouponPricer(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BlackIborCouponPricer_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BlackIborCouponPricer obj) {
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
        QuantLibJNI.delete_BlackIborCouponPricer(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BlackIborCouponPricer(OptionletVolatilityStructureHandle v, BlackIborCouponPricer.TimingAdjustment timingAdjustment, QuoteHandle correlation) {
    this(QuantLibJNI.new_BlackIborCouponPricer__SWIG_0(OptionletVolatilityStructureHandle.getCPtr(v), v, timingAdjustment.swigValue(), QuoteHandle.getCPtr(correlation), correlation), true);
  }

  public BlackIborCouponPricer(OptionletVolatilityStructureHandle v, BlackIborCouponPricer.TimingAdjustment timingAdjustment) {
    this(QuantLibJNI.new_BlackIborCouponPricer__SWIG_1(OptionletVolatilityStructureHandle.getCPtr(v), v, timingAdjustment.swigValue()), true);
  }

  public BlackIborCouponPricer(OptionletVolatilityStructureHandle v) {
    this(QuantLibJNI.new_BlackIborCouponPricer__SWIG_2(OptionletVolatilityStructureHandle.getCPtr(v), v), true);
  }

  public BlackIborCouponPricer() {
    this(QuantLibJNI.new_BlackIborCouponPricer__SWIG_3(), true);
  }

  public final static class TimingAdjustment {
    public final static BlackIborCouponPricer.TimingAdjustment Black76 = new BlackIborCouponPricer.TimingAdjustment("Black76");
    public final static BlackIborCouponPricer.TimingAdjustment BivariateLognormal = new BlackIborCouponPricer.TimingAdjustment("BivariateLognormal");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static TimingAdjustment swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + TimingAdjustment.class + " with value " + swigValue);
    }

    private TimingAdjustment(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private TimingAdjustment(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private TimingAdjustment(String swigName, TimingAdjustment swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static TimingAdjustment[] swigValues = { Black76, BivariateLognormal };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}