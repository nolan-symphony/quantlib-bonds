/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Callability {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected Callability(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Callability obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void swigSetCMemOwn(boolean own) {
    swigCMemOwn = own;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Callability(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Callability(BondPrice price, Callability.Type type, Date date) {
    this(QuantLibJNI.new_Callability(BondPrice.getCPtr(price), price, type.swigValue(), Date.getCPtr(date), date), true);
  }

  public BondPrice price() {
    return new BondPrice(QuantLibJNI.Callability_price(swigCPtr, this), false);
  }

  public Callability.Type type() {
    return Callability.Type.swigToEnum(QuantLibJNI.Callability_type(swigCPtr, this));
  }

  public Date date() {
    return new Date(QuantLibJNI.Callability_date(swigCPtr, this), true);
  }

  public final static class Type {
    public final static Callability.Type Call = new Callability.Type("Call");
    public final static Callability.Type Put = new Callability.Type("Put");

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

    private static Type[] swigValues = { Call, Put };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
