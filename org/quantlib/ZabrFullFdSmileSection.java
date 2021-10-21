/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ZabrFullFdSmileSection extends SmileSection {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ZabrFullFdSmileSection(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.ZabrFullFdSmileSection_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZabrFullFdSmileSection obj) {
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
        QuantLibJNI.delete_ZabrFullFdSmileSection(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ZabrFullFdSmileSection(double timeToExpiry, double forward, DoubleVector zabrParameters, DoubleVector moneyness, long fdRefinement) {
    this(QuantLibJNI.new_ZabrFullFdSmileSection__SWIG_0(timeToExpiry, forward, DoubleVector.getCPtr(zabrParameters), zabrParameters, DoubleVector.getCPtr(moneyness), moneyness, fdRefinement), true);
  }

  public ZabrFullFdSmileSection(double timeToExpiry, double forward, DoubleVector zabrParameters, DoubleVector moneyness) {
    this(QuantLibJNI.new_ZabrFullFdSmileSection__SWIG_1(timeToExpiry, forward, DoubleVector.getCPtr(zabrParameters), zabrParameters, DoubleVector.getCPtr(moneyness), moneyness), true);
  }

  public ZabrFullFdSmileSection(double timeToExpiry, double forward, DoubleVector zabrParameters) {
    this(QuantLibJNI.new_ZabrFullFdSmileSection__SWIG_2(timeToExpiry, forward, DoubleVector.getCPtr(zabrParameters), zabrParameters), true);
  }

  public ZabrFullFdSmileSection(Date d, double forward, DoubleVector zabrParameters, DayCounter dc, DoubleVector moneyness, long fdRefinement) {
    this(QuantLibJNI.new_ZabrFullFdSmileSection__SWIG_3(Date.getCPtr(d), d, forward, DoubleVector.getCPtr(zabrParameters), zabrParameters, DayCounter.getCPtr(dc), dc, DoubleVector.getCPtr(moneyness), moneyness, fdRefinement), true);
  }

  public ZabrFullFdSmileSection(Date d, double forward, DoubleVector zabrParameters, DayCounter dc, DoubleVector moneyness) {
    this(QuantLibJNI.new_ZabrFullFdSmileSection__SWIG_4(Date.getCPtr(d), d, forward, DoubleVector.getCPtr(zabrParameters), zabrParameters, DayCounter.getCPtr(dc), dc, DoubleVector.getCPtr(moneyness), moneyness), true);
  }

  public ZabrFullFdSmileSection(Date d, double forward, DoubleVector zabrParameters, DayCounter dc) {
    this(QuantLibJNI.new_ZabrFullFdSmileSection__SWIG_5(Date.getCPtr(d), d, forward, DoubleVector.getCPtr(zabrParameters), zabrParameters, DayCounter.getCPtr(dc), dc), true);
  }

  public ZabrFullFdSmileSection(Date d, double forward, DoubleVector zabrParameters) {
    this(QuantLibJNI.new_ZabrFullFdSmileSection__SWIG_6(Date.getCPtr(d), d, forward, DoubleVector.getCPtr(zabrParameters), zabrParameters), true);
  }

}
