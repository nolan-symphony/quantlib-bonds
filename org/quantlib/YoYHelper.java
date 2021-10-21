/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class YoYHelper extends Observable {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected YoYHelper(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.YoYHelper_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YoYHelper obj) {
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
        QuantLibJNI.delete_YoYHelper(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public QuoteHandle quote() {
    return new QuoteHandle(QuantLibJNI.YoYHelper_quote(swigCPtr, this), true);
  }

  public Date latestDate() {
    return new Date(QuantLibJNI.YoYHelper_latestDate(swigCPtr, this), true);
  }

  public Date earliestDate() {
    return new Date(QuantLibJNI.YoYHelper_earliestDate(swigCPtr, this), true);
  }

  public Date maturityDate() {
    return new Date(QuantLibJNI.YoYHelper_maturityDate(swigCPtr, this), true);
  }

  public Date latestRelevantDate() {
    return new Date(QuantLibJNI.YoYHelper_latestRelevantDate(swigCPtr, this), true);
  }

  public Date pillarDate() {
    return new Date(QuantLibJNI.YoYHelper_pillarDate(swigCPtr, this), true);
  }

  public double impliedQuote() {
    return QuantLibJNI.YoYHelper_impliedQuote(swigCPtr, this);
  }

  public double quoteError() {
    return QuantLibJNI.YoYHelper_quoteError(swigCPtr, this);
  }

}
