/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class YoYInflationCapFloor extends Instrument {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected YoYInflationCapFloor(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.YoYInflationCapFloor_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(YoYInflationCapFloor obj) {
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
        QuantLibJNI.delete_YoYInflationCapFloor(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public YoYInflationCapFloor(YoYInflationCapFloor.Type type, Leg yoyLeg, DoubleVector strikes) {
    this(QuantLibJNI.new_YoYInflationCapFloor(type.swigValue(), Leg.getCPtr(yoyLeg), yoyLeg, DoubleVector.getCPtr(strikes), strikes), true);
  }

  public double impliedVolatility(double price, YoYInflationTermStructureHandle curve, double guess, double accuracy, long maxEvaluations, double minVol, double maxVol) {
    return QuantLibJNI.YoYInflationCapFloor_impliedVolatility__SWIG_0(swigCPtr, this, price, YoYInflationTermStructureHandle.getCPtr(curve), curve, guess, accuracy, maxEvaluations, minVol, maxVol);
  }

  public double impliedVolatility(double price, YoYInflationTermStructureHandle curve, double guess, double accuracy, long maxEvaluations, double minVol) {
    return QuantLibJNI.YoYInflationCapFloor_impliedVolatility__SWIG_1(swigCPtr, this, price, YoYInflationTermStructureHandle.getCPtr(curve), curve, guess, accuracy, maxEvaluations, minVol);
  }

  public double impliedVolatility(double price, YoYInflationTermStructureHandle curve, double guess, double accuracy, long maxEvaluations) {
    return QuantLibJNI.YoYInflationCapFloor_impliedVolatility__SWIG_2(swigCPtr, this, price, YoYInflationTermStructureHandle.getCPtr(curve), curve, guess, accuracy, maxEvaluations);
  }

  public double impliedVolatility(double price, YoYInflationTermStructureHandle curve, double guess, double accuracy) {
    return QuantLibJNI.YoYInflationCapFloor_impliedVolatility__SWIG_3(swigCPtr, this, price, YoYInflationTermStructureHandle.getCPtr(curve), curve, guess, accuracy);
  }

  public double impliedVolatility(double price, YoYInflationTermStructureHandle curve, double guess) {
    return QuantLibJNI.YoYInflationCapFloor_impliedVolatility__SWIG_4(swigCPtr, this, price, YoYInflationTermStructureHandle.getCPtr(curve), curve, guess);
  }

  public DoubleVector optionletPrices() {
    return new DoubleVector(QuantLibJNI.YoYInflationCapFloor_optionletPrices(swigCPtr, this), true);
  }

  public final static class Type {
    public final static YoYInflationCapFloor.Type Cap = new YoYInflationCapFloor.Type("Cap");
    public final static YoYInflationCapFloor.Type Floor = new YoYInflationCapFloor.Type("Floor");
    public final static YoYInflationCapFloor.Type Collar = new YoYInflationCapFloor.Type("Collar");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Type swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Type.class + " with value " + swigValue);
    }

    private Type(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Type(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Type(String swigName, Type swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Type[] swigValues = { Cap, Floor, Collar };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
