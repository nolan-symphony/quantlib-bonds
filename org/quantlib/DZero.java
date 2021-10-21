/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class DZero extends TridiagonalOperator {
  private transient long swigCPtr;

  protected DZero(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.DZero_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(DZero obj) {
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
        QuantLibJNI.delete_DZero(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public DZero(long gridPoints, double h) {
    this(QuantLibJNI.new_DZero(gridPoints, h), true);
  }

}
