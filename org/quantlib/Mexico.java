/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Mexico extends Calendar {
  private transient long swigCPtr;

  protected Mexico(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Mexico_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Mexico obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        QuantLibJNI.delete_Mexico(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Mexico(Mexico.Market m) {
    this(QuantLibJNI.new_Mexico__SWIG_0(m.swigValue()), true);
  }

  public Mexico() {
    this(QuantLibJNI.new_Mexico__SWIG_1(), true);
  }

  public final static class Market {
    public final static Mexico.Market BMV = new Mexico.Market("BMV");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static Market swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + Market.class + " with value " + swigValue);
    }

    private Market(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private Market(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private Market(String swigName, Market swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static Market[] swigValues = { BMV };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}