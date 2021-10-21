/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class SobolBrownianGeneratorFactory extends BrownianGeneratorFactory {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected SobolBrownianGeneratorFactory(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.SobolBrownianGeneratorFactory_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SobolBrownianGeneratorFactory obj) {
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
        QuantLibJNI.delete_SobolBrownianGeneratorFactory(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SobolBrownianGeneratorFactory(SobolBrownianGenerator.Ordering ordering, long seed, SobolRsg.DirectionIntegers directionIntegers) {
    this(QuantLibJNI.new_SobolBrownianGeneratorFactory__SWIG_0(ordering.swigValue(), seed, directionIntegers.swigValue()), true);
  }

  public SobolBrownianGeneratorFactory(SobolBrownianGenerator.Ordering ordering, long seed) {
    this(QuantLibJNI.new_SobolBrownianGeneratorFactory__SWIG_1(ordering.swigValue(), seed), true);
  }

  public SobolBrownianGeneratorFactory(SobolBrownianGenerator.Ordering ordering) {
    this(QuantLibJNI.new_SobolBrownianGeneratorFactory__SWIG_2(ordering.swigValue()), true);
  }

}