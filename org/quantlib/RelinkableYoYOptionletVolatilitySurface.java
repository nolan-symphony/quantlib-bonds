/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class RelinkableYoYOptionletVolatilitySurface extends YoYOptionletVolatilitySurfaceHandle {
  private transient long swigCPtr;

  protected RelinkableYoYOptionletVolatilitySurface(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.RelinkableYoYOptionletVolatilitySurface_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(RelinkableYoYOptionletVolatilitySurface obj) {
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
        QuantLibJNI.delete_RelinkableYoYOptionletVolatilitySurface(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public RelinkableYoYOptionletVolatilitySurface(YoYOptionletVolatilitySurface arg0) {
    this(QuantLibJNI.new_RelinkableYoYOptionletVolatilitySurface__SWIG_0(YoYOptionletVolatilitySurface.getCPtr(arg0), arg0), true);
  }

  public RelinkableYoYOptionletVolatilitySurface() {
    this(QuantLibJNI.new_RelinkableYoYOptionletVolatilitySurface__SWIG_1(), true);
  }

  public void linkTo(YoYOptionletVolatilitySurface arg0) {
    QuantLibJNI.RelinkableYoYOptionletVolatilitySurface_linkTo(swigCPtr, this, YoYOptionletVolatilitySurface.getCPtr(arg0), arg0);
  }

  public void reset() {
    QuantLibJNI.RelinkableYoYOptionletVolatilitySurface_reset(swigCPtr, this);
  }

}