/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Uniform1dMesher extends Fdm1dMesher {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected Uniform1dMesher(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.Uniform1dMesher_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Uniform1dMesher obj) {
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
        QuantLibJNI.delete_Uniform1dMesher(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public Uniform1dMesher(double start, double end, long size) {
    this(QuantLibJNI.new_Uniform1dMesher(start, end, size), true);
  }

}
