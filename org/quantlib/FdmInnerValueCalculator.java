/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdmInnerValueCalculator {
  private transient long swigCPtr;
  private transient boolean swigCMemOwn;

  protected FdmInnerValueCalculator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdmInnerValueCalculator obj) {
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
        QuantLibJNI.delete_FdmInnerValueCalculator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public double innerValue(FdmLinearOpIterator iter, double t) {
    return QuantLibJNI.FdmInnerValueCalculator_innerValue(swigCPtr, this, FdmLinearOpIterator.getCPtr(iter), iter, t);
  }

  public double avgInnerValue(FdmLinearOpIterator iter, double t) {
    return QuantLibJNI.FdmInnerValueCalculator_avgInnerValue(swigCPtr, this, FdmLinearOpIterator.getCPtr(iter), iter, t);
  }

}
