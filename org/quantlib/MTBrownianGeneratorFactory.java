/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class MTBrownianGeneratorFactory extends BrownianGeneratorFactory {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected MTBrownianGeneratorFactory(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.MTBrownianGeneratorFactory_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MTBrownianGeneratorFactory obj) {
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
        QuantLibJNI.delete_MTBrownianGeneratorFactory(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public MTBrownianGeneratorFactory(long seed) {
    this(QuantLibJNI.new_MTBrownianGeneratorFactory__SWIG_0(seed), true);
  }

  public MTBrownianGeneratorFactory() {
    this(QuantLibJNI.new_MTBrownianGeneratorFactory__SWIG_1(), true);
  }

}
