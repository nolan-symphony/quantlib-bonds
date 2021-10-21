/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * This file is not intended to be easily readable and contains a number of
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG
 * interface file instead.
 * ----------------------------------------------------------------------------- */

#ifndef SWIG_QuantLib_WRAP_H_
#define SWIG_QuantLib_WRAP_H_

class SwigDirector_UnaryFunctionDelegate : public UnaryFunctionDelegate, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_UnaryFunctionDelegate(JNIEnv *jenv);
    virtual ~SwigDirector_UnaryFunctionDelegate();
    virtual Real value(Real x) const;
public:
    bool swig_overrides(int n) {
      return (n < 1 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<1> swig_override;
};

class SwigDirector_BinaryFunctionDelegate : public BinaryFunctionDelegate, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_BinaryFunctionDelegate(JNIEnv *jenv);
    virtual ~SwigDirector_BinaryFunctionDelegate();
    virtual Real value(Real arg0, Real arg1) const;
public:
    bool swig_overrides(int n) {
      return (n < 1 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<1> swig_override;
};

class SwigDirector_CostFunctionDelegate : public CostFunctionDelegate, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_CostFunctionDelegate(JNIEnv *jenv);
    virtual ~SwigDirector_CostFunctionDelegate();
    virtual Real value(Array const &x) const;
    virtual Array values(Array const &x) const;
public:
    bool swig_overrides(int n) {
      return (n < 2 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<2> swig_override;
};

class SwigDirector_FdmLinearOpCompositeDelegate : public FdmLinearOpCompositeDelegate, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_FdmLinearOpCompositeDelegate(JNIEnv *jenv);
    virtual ~SwigDirector_FdmLinearOpCompositeDelegate();
    virtual Size size() const;
    virtual void setTime(Time t1, Time t2);
    virtual Array apply(Array const &r) const;
    virtual Array apply_mixed(Array const &r) const;
    virtual Array apply_direction(Size direction, Array const &r) const;
    virtual Array solve_splitting(Size direction, Array const &r, Real s) const;
    virtual Array preconditioner(Array const &r, Real dt) const;
public:
    bool swig_overrides(int n) {
      return (n < 7 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<7> swig_override;
};

class SwigDirector_FdmStepConditionDelegate : public FdmStepConditionDelegate, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_FdmStepConditionDelegate(JNIEnv *jenv);
    virtual ~SwigDirector_FdmStepConditionDelegate();
    virtual void applyTo(Array &a, Time t) const;
public:
    bool swig_overrides(int n) {
      return (n < 1 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<1> swig_override;
};

class SwigDirector_FdmInnerValueCalculatorDelegate : public FdmInnerValueCalculatorDelegate, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_FdmInnerValueCalculatorDelegate(JNIEnv *jenv);
    virtual ~SwigDirector_FdmInnerValueCalculatorDelegate();
    virtual Real innerValue(FdmLinearOpIterator const &iter, Time t);
    virtual Real avgInnerValue(FdmLinearOpIterator const &iter, Time t);
public:
    bool swig_overrides(int n) {
      return (n < 2 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<2> swig_override;
};

class SwigDirector_OdeFctDelegate : public OdeFctDelegate, public Swig::Director {

public:
    void swig_connect_director(JNIEnv *jenv, jobject jself, jclass jcls, bool swig_mem_own, bool weak_global);
    SwigDirector_OdeFctDelegate(JNIEnv *jenv);
    virtual ~SwigDirector_OdeFctDelegate();
    virtual std::vector< Real > value(Real x, std::vector< Real > const &y) const;
public:
    bool swig_overrides(int n) {
      return (n < 1 ? swig_override[n] : false);
    }
protected:
    Swig::BoolArray<1> swig_override;
};


#endif
