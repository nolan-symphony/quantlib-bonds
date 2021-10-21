/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class YieldTermStructure extends TermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected YieldTermStructure(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.YieldTermStructure_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YieldTermStructure obj) {
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
        QuantLibJNI.delete_YieldTermStructure(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public double discount(Date arg0, boolean extrapolate) {
    return QuantLibJNI.YieldTermStructure_discount__SWIG_0(swigCPtr, this, Date.getCPtr(arg0), arg0, extrapolate);
  }

  public double discount(Date arg0) {
    return QuantLibJNI.YieldTermStructure_discount__SWIG_1(swigCPtr, this, Date.getCPtr(arg0), arg0);
  }

  public double discount(double arg0, boolean extrapolate) {
    return QuantLibJNI.YieldTermStructure_discount__SWIG_2(swigCPtr, this, arg0, extrapolate);
  }

  public double discount(double arg0) {
    return QuantLibJNI.YieldTermStructure_discount__SWIG_3(swigCPtr, this, arg0);
  }

  public InterestRate zeroRate(Date d, DayCounter arg1, Compounding arg2, Frequency f, boolean extrapolate) {
    return new InterestRate(QuantLibJNI.YieldTermStructure_zeroRate__SWIG_0(swigCPtr, this, Date.getCPtr(d), d, DayCounter.getCPtr(arg1), arg1, arg2.swigValue(), f.swigValue(), extrapolate), true);
  }

  public InterestRate zeroRate(Date d, DayCounter arg1, Compounding arg2, Frequency f) {
    return new InterestRate(QuantLibJNI.YieldTermStructure_zeroRate__SWIG_1(swigCPtr, this, Date.getCPtr(d), d, DayCounter.getCPtr(arg1), arg1, arg2.swigValue(), f.swigValue()), true);
  }

  public InterestRate zeroRate(Date d, DayCounter arg1, Compounding arg2) {
    return new InterestRate(QuantLibJNI.YieldTermStructure_zeroRate__SWIG_2(swigCPtr, this, Date.getCPtr(d), d, DayCounter.getCPtr(arg1), arg1, arg2.swigValue()), true);
  }

  public InterestRate zeroRate(double t, Compounding arg1, Frequency f, boolean extrapolate) {
    return new InterestRate(QuantLibJNI.YieldTermStructure_zeroRate__SWIG_3(swigCPtr, this, t, arg1.swigValue(), f.swigValue(), extrapolate), true);
  }

  public InterestRate zeroRate(double t, Compounding arg1, Frequency f) {
    return new InterestRate(QuantLibJNI.YieldTermStructure_zeroRate__SWIG_4(swigCPtr, this, t, arg1.swigValue(), f.swigValue()), true);
  }

  public InterestRate zeroRate(double t, Compounding arg1) {
    return new InterestRate(QuantLibJNI.YieldTermStructure_zeroRate__SWIG_5(swigCPtr, this, t, arg1.swigValue()), true);
  }

  public InterestRate forwardRate(Date d1, Date d2, DayCounter arg2, Compounding arg3, Frequency f, boolean extrapolate) {
    return new InterestRate(QuantLibJNI.YieldTermStructure_forwardRate__SWIG_0(swigCPtr, this, Date.getCPtr(d1), d1, Date.getCPtr(d2), d2, DayCounter.getCPtr(arg2), arg2, arg3.swigValue(), f.swigValue(), extrapolate), true);
  }

  public InterestRate forwardRate(Date d1, Date d2, DayCounter arg2, Compounding arg3, Frequency f) {
    return new InterestRate(QuantLibJNI.YieldTermStructure_forwardRate__SWIG_1(swigCPtr, this, Date.getCPtr(d1), d1, Date.getCPtr(d2), d2, DayCounter.getCPtr(arg2), arg2, arg3.swigValue(), f.swigValue()), true);
  }

  public InterestRate forwardRate(Date d1, Date d2, DayCounter arg2, Compounding arg3) {
    return new InterestRate(QuantLibJNI.YieldTermStructure_forwardRate__SWIG_2(swigCPtr, this, Date.getCPtr(d1), d1, Date.getCPtr(d2), d2, DayCounter.getCPtr(arg2), arg2, arg3.swigValue()), true);
  }

  public InterestRate forwardRate(double t1, double t2, Compounding arg2, Frequency f, boolean extrapolate) {
    return new InterestRate(QuantLibJNI.YieldTermStructure_forwardRate__SWIG_3(swigCPtr, this, t1, t2, arg2.swigValue(), f.swigValue(), extrapolate), true);
  }

  public InterestRate forwardRate(double t1, double t2, Compounding arg2, Frequency f) {
    return new InterestRate(QuantLibJNI.YieldTermStructure_forwardRate__SWIG_4(swigCPtr, this, t1, t2, arg2.swigValue(), f.swigValue()), true);
  }

  public InterestRate forwardRate(double t1, double t2, Compounding arg2) {
    return new InterestRate(QuantLibJNI.YieldTermStructure_forwardRate__SWIG_5(swigCPtr, this, t1, t2, arg2.swigValue()), true);
  }

}
