/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class ZabrShortMaturityLognormal {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ZabrShortMaturityLognormal(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ZabrShortMaturityLognormal obj) {
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
        QuantLibJNI.delete_ZabrShortMaturityLognormal(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public ZabrShortMaturityLognormal() {
    this(QuantLibJNI.new_ZabrShortMaturityLognormal(), true);
  }

}
