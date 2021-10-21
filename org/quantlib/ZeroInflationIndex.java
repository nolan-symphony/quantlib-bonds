/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ZeroInflationIndex extends InflationIndex {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ZeroInflationIndex(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ZeroInflationIndex_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZeroInflationIndex obj) {
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
        QuantLibJNI.delete_ZeroInflationIndex(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ZeroInflationIndex(String familyName, Region region, boolean revised, boolean interpolated, Frequency frequency, Period availabilityLag, Currency currency, ZeroInflationTermStructureHandle h) {
    this(QuantLibJNI.new_ZeroInflationIndex__SWIG_0(familyName, Region.getCPtr(region), region, revised, interpolated, frequency.swigValue(), Period.getCPtr(availabilityLag), availabilityLag, Currency.getCPtr(currency), currency, ZeroInflationTermStructureHandle.getCPtr(h), h), true);
  }

  public ZeroInflationIndex(String familyName, Region region, boolean revised, boolean interpolated, Frequency frequency, Period availabilityLag, Currency currency) {
    this(QuantLibJNI.new_ZeroInflationIndex__SWIG_1(familyName, Region.getCPtr(region), region, revised, interpolated, frequency.swigValue(), Period.getCPtr(availabilityLag), availabilityLag, Currency.getCPtr(currency), currency), true);
  }

  public ZeroInflationTermStructureHandle zeroInflationTermStructure() {
    return new ZeroInflationTermStructureHandle(QuantLibJNI.ZeroInflationIndex_zeroInflationTermStructure(swigCPtr, this), true);
  }

  public ZeroInflationIndex clone(ZeroInflationTermStructureHandle h) {
    long cPtr = QuantLibJNI.ZeroInflationIndex_clone(swigCPtr, this, ZeroInflationTermStructureHandle.getCPtr(h), h);
    return (cPtr == 0) ? null : new ZeroInflationIndex(cPtr, true);
  }

}
