/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class SmileSectionVector extends java.util.AbstractList<SmileSection> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SmileSectionVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SmileSectionVector obj) {
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
        QuantLibJNI.delete_SmileSectionVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SmileSectionVector(SmileSection[] initialElements) {
    this();
    reserve(initialElements.length);

    for (SmileSection element : initialElements) {
      add(element);
    }
  }

  public SmileSectionVector(Iterable<SmileSection> initialElements) {
    this();
    for (SmileSection element : initialElements) {
      add(element);
    }
  }

  public SmileSection get(int index) {
    return doGet(index);
  }

  public SmileSection set(int index, SmileSection e) {
    return doSet(index, e);
  }

  public boolean add(SmileSection e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, SmileSection e) {
    modCount++;
    doAdd(index, e);
  }

  public SmileSection remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public SmileSectionVector() {
    this(QuantLibJNI.new_SmileSectionVector__SWIG_0(), true);
  }

  public SmileSectionVector(SmileSectionVector other) {
    this(QuantLibJNI.new_SmileSectionVector__SWIG_1(SmileSectionVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.SmileSectionVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.SmileSectionVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.SmileSectionVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.SmileSectionVector_clear(swigCPtr, this);
  }

  public SmileSectionVector(int count, SmileSection value) {
    this(QuantLibJNI.new_SmileSectionVector__SWIG_2(count, SmileSection.getCPtr(value), value), true);
  }

  private int doSize() {
    return QuantLibJNI.SmileSectionVector_doSize(swigCPtr, this);
  }

  private void doAdd(SmileSection x) {
    QuantLibJNI.SmileSectionVector_doAdd__SWIG_0(swigCPtr, this, SmileSection.getCPtr(x), x);
  }

  private void doAdd(int index, SmileSection x) {
    QuantLibJNI.SmileSectionVector_doAdd__SWIG_1(swigCPtr, this, index, SmileSection.getCPtr(x), x);
  }

  private SmileSection doRemove(int index) {
    long cPtr = QuantLibJNI.SmileSectionVector_doRemove(swigCPtr, this, index);
    return (cPtr == 0) ? null : new SmileSection(cPtr, true);
  }

  private SmileSection doGet(int index) {
    long cPtr = QuantLibJNI.SmileSectionVector_doGet(swigCPtr, this, index);
    return (cPtr == 0) ? null : new SmileSection(cPtr, true);
  }

  private SmileSection doSet(int index, SmileSection val) {
    long cPtr = QuantLibJNI.SmileSectionVector_doSet(swigCPtr, this, index, SmileSection.getCPtr(val), val);
    return (cPtr == 0) ? null : new SmileSection(cPtr, true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.SmileSectionVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
