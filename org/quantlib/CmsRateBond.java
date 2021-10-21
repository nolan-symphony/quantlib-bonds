/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class CmsRateBond extends Bond {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected CmsRateBond(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.CmsRateBond_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CmsRateBond obj) {
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
        QuantLibJNI.delete_CmsRateBond(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public CmsRateBond(long settlementDays, double faceAmount, Schedule schedule, SwapIndex index, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps, DoubleVector floors, boolean inArrears, double redemption, Date issueDate) {
    this(QuantLibJNI.new_CmsRateBond__SWIG_0(settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, SwapIndex.getCPtr(index), index, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps, DoubleVector.getCPtr(floors), floors, inArrears, redemption, Date.getCPtr(issueDate), issueDate), true);
  }

  public CmsRateBond(long settlementDays, double faceAmount, Schedule schedule, SwapIndex index, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps, DoubleVector floors, boolean inArrears, double redemption) {
    this(QuantLibJNI.new_CmsRateBond__SWIG_1(settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, SwapIndex.getCPtr(index), index, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps, DoubleVector.getCPtr(floors), floors, inArrears, redemption), true);
  }

  public CmsRateBond(long settlementDays, double faceAmount, Schedule schedule, SwapIndex index, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps, DoubleVector floors, boolean inArrears) {
    this(QuantLibJNI.new_CmsRateBond__SWIG_2(settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, SwapIndex.getCPtr(index), index, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps, DoubleVector.getCPtr(floors), floors, inArrears), true);
  }

  public CmsRateBond(long settlementDays, double faceAmount, Schedule schedule, SwapIndex index, DayCounter paymentDayCounter, BusinessDayConvention paymentConvention, long fixingDays, DoubleVector gearings, DoubleVector spreads, DoubleVector caps, DoubleVector floors) {
    this(QuantLibJNI.new_CmsRateBond__SWIG_3(settlementDays, faceAmount, Schedule.getCPtr(schedule), schedule, SwapIndex.getCPtr(index), index, DayCounter.getCPtr(paymentDayCounter), paymentDayCounter, paymentConvention.swigValue(), fixingDays, DoubleVector.getCPtr(gearings), gearings, DoubleVector.getCPtr(spreads), spreads, DoubleVector.getCPtr(caps), caps, DoubleVector.getCPtr(floors), floors), true);
  }

}