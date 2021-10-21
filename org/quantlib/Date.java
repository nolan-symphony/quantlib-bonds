/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class Date {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Date(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Date obj) {
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
        QuantLibJNI.delete_Date(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Date() {
    this(QuantLibJNI.new_Date__SWIG_0(), true);
  }

  public Date(int d, Month m, int y) {
    this(QuantLibJNI.new_Date__SWIG_1(d, m.swigValue(), y), true);
  }

  public Date(int d, Month m, int y, int hours, int minutes, int seconds, int millisec, int microsec) {
    this(QuantLibJNI.new_Date__SWIG_2(d, m.swigValue(), y, hours, minutes, seconds, millisec, microsec), true);
  }

  public Date(int d, Month m, int y, int hours, int minutes, int seconds, int millisec) {
    this(QuantLibJNI.new_Date__SWIG_3(d, m.swigValue(), y, hours, minutes, seconds, millisec), true);
  }

  public Date(int d, Month m, int y, int hours, int minutes, int seconds) {
    this(QuantLibJNI.new_Date__SWIG_4(d, m.swigValue(), y, hours, minutes, seconds), true);
  }

  public Date(int serialNumber) {
    this(QuantLibJNI.new_Date__SWIG_5(serialNumber), true);
  }

  public Weekday weekday() {
    return Weekday.swigToEnum(QuantLibJNI.Date_weekday(swigCPtr, this));
  }

  public int dayOfMonth() {
    return QuantLibJNI.Date_dayOfMonth(swigCPtr, this);
  }

  public int dayOfYear() {
    return QuantLibJNI.Date_dayOfYear(swigCPtr, this);
  }

  public Month month() {
    return Month.swigToEnum(QuantLibJNI.Date_month(swigCPtr, this));
  }

  public int year() {
    return QuantLibJNI.Date_year(swigCPtr, this);
  }

  public int hours() {
    return QuantLibJNI.Date_hours(swigCPtr, this);
  }

  public int minutes() {
    return QuantLibJNI.Date_minutes(swigCPtr, this);
  }

  public int seconds() {
    return QuantLibJNI.Date_seconds(swigCPtr, this);
  }

  public int milliseconds() {
    return QuantLibJNI.Date_milliseconds(swigCPtr, this);
  }

  public int microseconds() {
    return QuantLibJNI.Date_microseconds(swigCPtr, this);
  }

  public double fractionOfDay() {
    return QuantLibJNI.Date_fractionOfDay(swigCPtr, this);
  }

  public double fractionOfSecond() {
    return QuantLibJNI.Date_fractionOfSecond(swigCPtr, this);
  }

  public int serialNumber() {
    return QuantLibJNI.Date_serialNumber(swigCPtr, this);
  }

  public static boolean isLeap(int y) {
    return QuantLibJNI.Date_isLeap(y);
  }

  public static Date minDate() {
    return new Date(QuantLibJNI.Date_minDate(), true);
  }

  public static Date maxDate() {
    return new Date(QuantLibJNI.Date_maxDate(), true);
  }

  public static Date todaysDate() {
    return new Date(QuantLibJNI.Date_todaysDate(), true);
  }

  public static Date localDateTime() {
    return new Date(QuantLibJNI.Date_localDateTime(), true);
  }

  public static Date universalDateTime() {
    return new Date(QuantLibJNI.Date_universalDateTime(), true);
  }

  public static Date endOfMonth(Date arg0) {
    return new Date(QuantLibJNI.Date_endOfMonth(Date.getCPtr(arg0), arg0), true);
  }

  public static boolean isEndOfMonth(Date arg0) {
    return QuantLibJNI.Date_isEndOfMonth(Date.getCPtr(arg0), arg0);
  }

  public static Date nextWeekday(Date arg0, Weekday arg1) {
    return new Date(QuantLibJNI.Date_nextWeekday(Date.getCPtr(arg0), arg0, arg1.swigValue()), true);
  }

  public static Date nthWeekday(long n, Weekday arg1, Month m, int y) {
    return new Date(QuantLibJNI.Date_nthWeekday(n, arg1.swigValue(), m.swigValue(), y), true);
  }

  public Date add(int days) {
    return new Date(QuantLibJNI.Date_add__SWIG_0(swigCPtr, this, days), true);
  }

  public Date subtract(int days) {
    return new Date(QuantLibJNI.Date_subtract__SWIG_0(swigCPtr, this, days), true);
  }

  public Date add(Period arg0) {
    return new Date(QuantLibJNI.Date_add__SWIG_1(swigCPtr, this, Period.getCPtr(arg0), arg0), true);
  }

  public Date subtract(Period arg0) {
    return new Date(QuantLibJNI.Date_subtract__SWIG_1(swigCPtr, this, Period.getCPtr(arg0), arg0), true);
  }

  public Date(String str, String fmt) {
    this(QuantLibJNI.new_Date__SWIG_6(str, fmt), true);
  }

  public int weekdayNumber() {
    return QuantLibJNI.Date_weekdayNumber(swigCPtr, this);
  }

  public String toString() {
    return QuantLibJNI.Date_toString(swigCPtr, this);
  }

  public String __repr__() {
    return QuantLibJNI.Date___repr__(swigCPtr, this);
  }

  public String ISO() {
    return QuantLibJNI.Date_ISO(swigCPtr, this);
  }

}
