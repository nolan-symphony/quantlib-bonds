/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class BlackConstantVol extends BlackVolTermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected BlackConstantVol(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.BlackConstantVol_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(BlackConstantVol obj) {
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
        QuantLibJNI.delete_BlackConstantVol(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public BlackConstantVol(Date referenceDate, Calendar c, double volatility, DayCounter dayCounter) {
    this(QuantLibJNI.new_BlackConstantVol__SWIG_0(Date.getCPtr(referenceDate), referenceDate, Calendar.getCPtr(c), c, volatility, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public BlackConstantVol(Date referenceDate, Calendar c, QuoteHandle volatility, DayCounter dayCounter) {
    this(QuantLibJNI.new_BlackConstantVol__SWIG_1(Date.getCPtr(referenceDate), referenceDate, Calendar.getCPtr(c), c, QuoteHandle.getCPtr(volatility), volatility, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public BlackConstantVol(long settlementDays, Calendar calendar, double volatility, DayCounter dayCounter) {
    this(QuantLibJNI.new_BlackConstantVol__SWIG_2(settlementDays, Calendar.getCPtr(calendar), calendar, volatility, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public BlackConstantVol(long settlementDays, Calendar calendar, QuoteHandle volatility, DayCounter dayCounter) {
    this(QuantLibJNI.new_BlackConstantVol__SWIG_3(settlementDays, Calendar.getCPtr(calendar), calendar, QuoteHandle.getCPtr(volatility), volatility, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

}
