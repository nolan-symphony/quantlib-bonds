/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class UnsignedIntVector extends java.util.AbstractList<Long> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected UnsignedIntVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(UnsignedIntVector obj) {
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
        QuantLibJNI.delete_UnsignedIntVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public UnsignedIntVector(long[] initialElements) {
    this();
    reserve(initialElements.length);

    for (long element : initialElements) {
      add(element);
    }
  }

  public UnsignedIntVector(Iterable<Long> initialElements) {
    this();
    for (long element : initialElements) {
      add(element);
    }
  }

  public Long get(int index) {
    return doGet(index);
  }

  public Long set(int index, Long e) {
    return doSet(index, e);
  }

  public boolean add(Long e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, Long e) {
    modCount++;
    doAdd(index, e);
  }

  public Long remove(int index) {
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

  public UnsignedIntVector() {
    this(QuantLibJNI.new_UnsignedIntVector__SWIG_0(), true);
  }

  public UnsignedIntVector(UnsignedIntVector other) {
    this(QuantLibJNI.new_UnsignedIntVector__SWIG_1(UnsignedIntVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return QuantLibJNI.UnsignedIntVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    QuantLibJNI.UnsignedIntVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return QuantLibJNI.UnsignedIntVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    QuantLibJNI.UnsignedIntVector_clear(swigCPtr, this);
  }

  public UnsignedIntVector(int count, long value) {
    this(QuantLibJNI.new_UnsignedIntVector__SWIG_2(count, value), true);
  }

  private int doSize() {
    return QuantLibJNI.UnsignedIntVector_doSize(swigCPtr, this);
  }

  private void doAdd(long x) {
    QuantLibJNI.UnsignedIntVector_doAdd__SWIG_0(swigCPtr, this, x);
  }

  private void doAdd(int index, long x) {
    QuantLibJNI.UnsignedIntVector_doAdd__SWIG_1(swigCPtr, this, index, x);
  }

  private long doRemove(int index) {
    return QuantLibJNI.UnsignedIntVector_doRemove(swigCPtr, this, index);
  }

  private long doGet(int index) {
    return QuantLibJNI.UnsignedIntVector_doGet(swigCPtr, this, index);
  }

  private long doSet(int index, long val) {
    return QuantLibJNI.UnsignedIntVector_doSet(swigCPtr, this, index, val);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    QuantLibJNI.UnsignedIntVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}
