/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.quantlib;

public class JointCalendar extends Calendar {
  private transient long swigCPtr;

  protected JointCalendar(long cPtr, boolean cMemoryOwn) {
    super(QuantLibJNI.JointCalendar_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(JointCalendar obj) {
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
        QuantLibJNI.delete_JointCalendar(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public JointCalendar(Calendar arg0, Calendar arg1, JointCalendarRule rule) {
    this(QuantLibJNI.new_JointCalendar__SWIG_0(Calendar.getCPtr(arg0), arg0, Calendar.getCPtr(arg1), arg1, rule.swigValue()), true);
  }

  public JointCalendar(Calendar arg0, Calendar arg1) {
    this(QuantLibJNI.new_JointCalendar__SWIG_1(Calendar.getCPtr(arg0), arg0, Calendar.getCPtr(arg1), arg1), true);
  }

  public JointCalendar(Calendar arg0, Calendar arg1, Calendar arg2, JointCalendarRule rule) {
    this(QuantLibJNI.new_JointCalendar__SWIG_2(Calendar.getCPtr(arg0), arg0, Calendar.getCPtr(arg1), arg1, Calendar.getCPtr(arg2), arg2, rule.swigValue()), true);
  }

  public JointCalendar(Calendar arg0, Calendar arg1, Calendar arg2) {
    this(QuantLibJNI.new_JointCalendar__SWIG_3(Calendar.getCPtr(arg0), arg0, Calendar.getCPtr(arg1), arg1, Calendar.getCPtr(arg2), arg2), true);
  }

  public JointCalendar(Calendar arg0, Calendar arg1, Calendar arg2, Calendar arg3, JointCalendarRule rule) {
    this(QuantLibJNI.new_JointCalendar__SWIG_4(Calendar.getCPtr(arg0), arg0, Calendar.getCPtr(arg1), arg1, Calendar.getCPtr(arg2), arg2, Calendar.getCPtr(arg3), arg3, rule.swigValue()), true);
  }

  public JointCalendar(Calendar arg0, Calendar arg1, Calendar arg2, Calendar arg3) {
    this(QuantLibJNI.new_JointCalendar__SWIG_5(Calendar.getCPtr(arg0), arg0, Calendar.getCPtr(arg1), arg1, Calendar.getCPtr(arg2), arg2, Calendar.getCPtr(arg3), arg3), true);
  }

}
