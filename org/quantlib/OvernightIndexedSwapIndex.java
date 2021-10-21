/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class OvernightIndexedSwapIndex extends SwapIndex {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected OvernightIndexedSwapIndex(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.OvernightIndexedSwapIndex_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OvernightIndexedSwapIndex obj) {
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
        QuantLibJNI.delete_OvernightIndexedSwapIndex(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public OvernightIndexedSwapIndex(String familyName, Period tenor, long settlementDays, Currency currency, OvernightIndex overnightIndex, boolean telescopicValueDates, RateAveraging.Type averagingMethod) {
    this(QuantLibJNI.new_OvernightIndexedSwapIndex__SWIG_0(familyName, Period.getCPtr(tenor), tenor, settlementDays, Currency.getCPtr(currency), currency, OvernightIndex.getCPtr(overnightIndex), overnightIndex, telescopicValueDates, averagingMethod.swigValue()), true);
  }

  public OvernightIndexedSwapIndex(String familyName, Period tenor, long settlementDays, Currency currency, OvernightIndex overnightIndex, boolean telescopicValueDates) {
    this(QuantLibJNI.new_OvernightIndexedSwapIndex__SWIG_1(familyName, Period.getCPtr(tenor), tenor, settlementDays, Currency.getCPtr(currency), currency, OvernightIndex.getCPtr(overnightIndex), overnightIndex, telescopicValueDates), true);
  }

  public OvernightIndexedSwapIndex(String familyName, Period tenor, long settlementDays, Currency currency, OvernightIndex overnightIndex) {
    this(QuantLibJNI.new_OvernightIndexedSwapIndex__SWIG_2(familyName, Period.getCPtr(tenor), tenor, settlementDays, Currency.getCPtr(currency), currency, OvernightIndex.getCPtr(overnightIndex), overnightIndex), true);
  }

  public OvernightIndex overnightIndex() {
    long cPtr = QuantLibJNI.OvernightIndexedSwapIndex_overnightIndex(swigCPtr, this);
    return (cPtr == 0) ? null : new OvernightIndex(cPtr, true);
  }

  public OvernightIndexedSwap underlyingSwap(Date fixingDate) {
    long cPtr = QuantLibJNI.OvernightIndexedSwapIndex_underlyingSwap(swigCPtr, this, Date.getCPtr(fixingDate), fixingDate);
    return (cPtr == 0) ? null : new OvernightIndexedSwap(cPtr, true);
  }

}
