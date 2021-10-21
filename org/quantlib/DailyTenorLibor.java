/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class DailyTenorLibor extends IborIndex {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected DailyTenorLibor(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.DailyTenorLibor_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DailyTenorLibor obj) {
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
        QuantLibJNI.delete_DailyTenorLibor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DailyTenorLibor(String familyName, long settlementDays, Currency currency, Calendar financialCenterCalendar, DayCounter dayCounter, YieldTermStructureHandle h) {
    this(QuantLibJNI.new_DailyTenorLibor__SWIG_0(familyName, settlementDays, Currency.getCPtr(currency), currency, Calendar.getCPtr(financialCenterCalendar), financialCenterCalendar, DayCounter.getCPtr(dayCounter), dayCounter, YieldTermStructureHandle.getCPtr(h), h), true);
  }

  public DailyTenorLibor(String familyName, long settlementDays, Currency currency, Calendar financialCenterCalendar, DayCounter dayCounter) {
    this(QuantLibJNI.new_DailyTenorLibor__SWIG_1(familyName, settlementDays, Currency.getCPtr(currency), currency, Calendar.getCPtr(financialCenterCalendar), financialCenterCalendar, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

}
