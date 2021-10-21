/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class OvernightIndexFutureRateHelper extends RateHelper {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected OvernightIndexFutureRateHelper(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.OvernightIndexFutureRateHelper_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(OvernightIndexFutureRateHelper obj) {
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
        QuantLibJNI.delete_OvernightIndexFutureRateHelper(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public OvernightIndexFutureRateHelper(QuoteHandle price, Date valueDate, Date maturityDate, OvernightIndex index, QuoteHandle convexityAdjustment, RateAveraging.Type averagingMethod) {
    this(QuantLibJNI.new_OvernightIndexFutureRateHelper__SWIG_0(QuoteHandle.getCPtr(price), price, Date.getCPtr(valueDate), valueDate, Date.getCPtr(maturityDate), maturityDate, OvernightIndex.getCPtr(index), index, QuoteHandle.getCPtr(convexityAdjustment), convexityAdjustment, averagingMethod.swigValue()), true);
  }

  public OvernightIndexFutureRateHelper(QuoteHandle price, Date valueDate, Date maturityDate, OvernightIndex index, QuoteHandle convexityAdjustment) {
    this(QuantLibJNI.new_OvernightIndexFutureRateHelper__SWIG_1(QuoteHandle.getCPtr(price), price, Date.getCPtr(valueDate), valueDate, Date.getCPtr(maturityDate), maturityDate, OvernightIndex.getCPtr(index), index, QuoteHandle.getCPtr(convexityAdjustment), convexityAdjustment), true);
  }

  public OvernightIndexFutureRateHelper(QuoteHandle price, Date valueDate, Date maturityDate, OvernightIndex index) {
    this(QuantLibJNI.new_OvernightIndexFutureRateHelper__SWIG_2(QuoteHandle.getCPtr(price), price, Date.getCPtr(valueDate), valueDate, Date.getCPtr(maturityDate), maturityDate, OvernightIndex.getCPtr(index), index), true);
  }

}