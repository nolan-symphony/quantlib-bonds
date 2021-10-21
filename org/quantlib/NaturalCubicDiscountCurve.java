/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class NaturalCubicDiscountCurve extends YieldTermStructure {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected NaturalCubicDiscountCurve(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.NaturalCubicDiscountCurve_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(NaturalCubicDiscountCurve obj) {
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
        QuantLibJNI.delete_NaturalCubicDiscountCurve(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public NaturalCubicDiscountCurve(DateVector dates, DoubleVector discounts, DayCounter dayCounter, Calendar calendar, SplineCubic i) {
    this(QuantLibJNI.new_NaturalCubicDiscountCurve__SWIG_0(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(discounts), discounts, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar, SplineCubic.getCPtr(i), i), true);
  }

  public NaturalCubicDiscountCurve(DateVector dates, DoubleVector discounts, DayCounter dayCounter, Calendar calendar) {
    this(QuantLibJNI.new_NaturalCubicDiscountCurve__SWIG_1(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(discounts), discounts, DayCounter.getCPtr(dayCounter), dayCounter, Calendar.getCPtr(calendar), calendar), true);
  }

  public NaturalCubicDiscountCurve(DateVector dates, DoubleVector discounts, DayCounter dayCounter) {
    this(QuantLibJNI.new_NaturalCubicDiscountCurve__SWIG_2(DateVector.getCPtr(dates), dates, DoubleVector.getCPtr(discounts), discounts, DayCounter.getCPtr(dayCounter), dayCounter), true);
  }

  public DoubleVector times() {
    return new DoubleVector(QuantLibJNI.NaturalCubicDiscountCurve_times(swigCPtr, this), false);
  }

  public DoubleVector data() {
    return new DoubleVector(QuantLibJNI.NaturalCubicDiscountCurve_data(swigCPtr, this), false);
  }

  public DateVector dates() {
    return new DateVector(QuantLibJNI.NaturalCubicDiscountCurve_dates(swigCPtr, this), false);
  }

  public DoubleVector discounts() {
    return new DoubleVector(QuantLibJNI.NaturalCubicDiscountCurve_discounts(swigCPtr, this), false);
  }

  public NodeVector nodes() {
    return new NodeVector(QuantLibJNI.NaturalCubicDiscountCurve_nodes(swigCPtr, this), true);
  }

}
