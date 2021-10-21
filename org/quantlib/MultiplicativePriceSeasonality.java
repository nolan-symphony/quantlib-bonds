/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MultiplicativePriceSeasonality extends Seasonality {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected MultiplicativePriceSeasonality(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MultiplicativePriceSeasonality_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MultiplicativePriceSeasonality obj) {
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
        QuantLibJNI.delete_MultiplicativePriceSeasonality(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MultiplicativePriceSeasonality(Date seasonalityBaseDate, Frequency frequency, DoubleVector seasonalityFactors) {
    this(QuantLibJNI.new_MultiplicativePriceSeasonality(Date.getCPtr(seasonalityBaseDate), seasonalityBaseDate, frequency.swigValue(), DoubleVector.getCPtr(seasonalityFactors), seasonalityFactors), true);
  }

}