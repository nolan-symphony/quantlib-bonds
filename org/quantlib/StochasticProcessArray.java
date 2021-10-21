/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class StochasticProcessArray extends StochasticProcess {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected StochasticProcessArray(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.StochasticProcessArray_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StochasticProcessArray obj) {
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
        QuantLibJNI.delete_StochasticProcessArray(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public StochasticProcessArray(StochasticProcess1DVector array, Matrix correlation) {
    this(QuantLibJNI.new_StochasticProcessArray(StochasticProcess1DVector.getCPtr(array), array, Matrix.getCPtr(correlation), correlation), true);
  }

}
