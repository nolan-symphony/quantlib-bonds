/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class FdmG2Op extends FdmLinearOpComposite {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected FdmG2Op(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.FdmG2Op_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FdmG2Op obj) {
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
        QuantLibJNI.delete_FdmG2Op(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public FdmG2Op(FdmMesher mesher, G2 model, long direction1, long direction2) {
    this(QuantLibJNI.new_FdmG2Op(FdmMesher.getCPtr(mesher), mesher, G2.getCPtr(model), model, direction1, direction2), true);
  }

}
