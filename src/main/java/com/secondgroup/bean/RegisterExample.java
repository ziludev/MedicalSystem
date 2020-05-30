package com.secondgroup.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RegisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegisterExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(String value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(String value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(String value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(String value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(String value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(String value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLike(String value) {
            addCriterion("rid like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotLike(String value) {
            addCriterion("rid not like", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<String> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<String> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(String value1, String value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(String value1, String value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNull() {
            addCriterion("idCard is null");
            return (Criteria) this;
        }

        public Criteria andIdcardIsNotNull() {
            addCriterion("idCard is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardEqualTo(String value) {
            addCriterion("idCard =", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotEqualTo(String value) {
            addCriterion("idCard <>", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThan(String value) {
            addCriterion("idCard >", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("idCard >=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThan(String value) {
            addCriterion("idCard <", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLessThanOrEqualTo(String value) {
            addCriterion("idCard <=", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardLike(String value) {
            addCriterion("idCard like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotLike(String value) {
            addCriterion("idCard not like", value, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardIn(List<String> values) {
            addCriterion("idCard in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotIn(List<String> values) {
            addCriterion("idCard not in", values, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardBetween(String value1, String value2) {
            addCriterion("idCard between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andIdcardNotBetween(String value1, String value2) {
            addCriterion("idCard not between", value1, value2, "idcard");
            return (Criteria) this;
        }

        public Criteria andSinumberIsNull() {
            addCriterion("siNumber is null");
            return (Criteria) this;
        }

        public Criteria andSinumberIsNotNull() {
            addCriterion("siNumber is not null");
            return (Criteria) this;
        }

        public Criteria andSinumberEqualTo(String value) {
            addCriterion("siNumber =", value, "sinumber");
            return (Criteria) this;
        }

        public Criteria andSinumberNotEqualTo(String value) {
            addCriterion("siNumber <>", value, "sinumber");
            return (Criteria) this;
        }

        public Criteria andSinumberGreaterThan(String value) {
            addCriterion("siNumber >", value, "sinumber");
            return (Criteria) this;
        }

        public Criteria andSinumberGreaterThanOrEqualTo(String value) {
            addCriterion("siNumber >=", value, "sinumber");
            return (Criteria) this;
        }

        public Criteria andSinumberLessThan(String value) {
            addCriterion("siNumber <", value, "sinumber");
            return (Criteria) this;
        }

        public Criteria andSinumberLessThanOrEqualTo(String value) {
            addCriterion("siNumber <=", value, "sinumber");
            return (Criteria) this;
        }

        public Criteria andSinumberLike(String value) {
            addCriterion("siNumber like", value, "sinumber");
            return (Criteria) this;
        }

        public Criteria andSinumberNotLike(String value) {
            addCriterion("siNumber not like", value, "sinumber");
            return (Criteria) this;
        }

        public Criteria andSinumberIn(List<String> values) {
            addCriterion("siNumber in", values, "sinumber");
            return (Criteria) this;
        }

        public Criteria andSinumberNotIn(List<String> values) {
            addCriterion("siNumber not in", values, "sinumber");
            return (Criteria) this;
        }

        public Criteria andSinumberBetween(String value1, String value2) {
            addCriterion("siNumber between", value1, value2, "sinumber");
            return (Criteria) this;
        }

        public Criteria andSinumberNotBetween(String value1, String value2) {
            addCriterion("siNumber not between", value1, value2, "sinumber");
            return (Criteria) this;
        }

        public Criteria andRegistermoneyIsNull() {
            addCriterion("registerMoney is null");
            return (Criteria) this;
        }

        public Criteria andRegistermoneyIsNotNull() {
            addCriterion("registerMoney is not null");
            return (Criteria) this;
        }

        public Criteria andRegistermoneyEqualTo(Double value) {
            addCriterion("registerMoney =", value, "registermoney");
            return (Criteria) this;
        }

        public Criteria andRegistermoneyNotEqualTo(Double value) {
            addCriterion("registerMoney <>", value, "registermoney");
            return (Criteria) this;
        }

        public Criteria andRegistermoneyGreaterThan(Double value) {
            addCriterion("registerMoney >", value, "registermoney");
            return (Criteria) this;
        }

        public Criteria andRegistermoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("registerMoney >=", value, "registermoney");
            return (Criteria) this;
        }

        public Criteria andRegistermoneyLessThan(Double value) {
            addCriterion("registerMoney <", value, "registermoney");
            return (Criteria) this;
        }

        public Criteria andRegistermoneyLessThanOrEqualTo(Double value) {
            addCriterion("registerMoney <=", value, "registermoney");
            return (Criteria) this;
        }

        public Criteria andRegistermoneyIn(List<Double> values) {
            addCriterion("registerMoney in", values, "registermoney");
            return (Criteria) this;
        }

        public Criteria andRegistermoneyNotIn(List<Double> values) {
            addCriterion("registerMoney not in", values, "registermoney");
            return (Criteria) this;
        }

        public Criteria andRegistermoneyBetween(Double value1, Double value2) {
            addCriterion("registerMoney between", value1, value2, "registermoney");
            return (Criteria) this;
        }

        public Criteria andRegistermoneyNotBetween(Double value1, Double value2) {
            addCriterion("registerMoney not between", value1, value2, "registermoney");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andIspayIsNull() {
            addCriterion("isPay is null");
            return (Criteria) this;
        }

        public Criteria andIspayIsNotNull() {
            addCriterion("isPay is not null");
            return (Criteria) this;
        }

        public Criteria andIspayEqualTo(Integer value) {
            addCriterion("isPay =", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotEqualTo(Integer value) {
            addCriterion("isPay <>", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThan(Integer value) {
            addCriterion("isPay >", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayGreaterThanOrEqualTo(Integer value) {
            addCriterion("isPay >=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThan(Integer value) {
            addCriterion("isPay <", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayLessThanOrEqualTo(Integer value) {
            addCriterion("isPay <=", value, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayIn(List<Integer> values) {
            addCriterion("isPay in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotIn(List<Integer> values) {
            addCriterion("isPay not in", values, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayBetween(Integer value1, Integer value2) {
            addCriterion("isPay between", value1, value2, "ispay");
            return (Criteria) this;
        }

        public Criteria andIspayNotBetween(Integer value1, Integer value2) {
            addCriterion("isPay not between", value1, value2, "ispay");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Integer value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Integer value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Integer value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Integer value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Integer value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Integer> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Integer> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Integer value1, Integer value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Integer value1, Integer value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andConsultationIsNull() {
            addCriterion("consultation is null");
            return (Criteria) this;
        }

        public Criteria andConsultationIsNotNull() {
            addCriterion("consultation is not null");
            return (Criteria) this;
        }

        public Criteria andConsultationEqualTo(Integer value) {
            addCriterion("consultation =", value, "consultation");
            return (Criteria) this;
        }

        public Criteria andConsultationNotEqualTo(Integer value) {
            addCriterion("consultation <>", value, "consultation");
            return (Criteria) this;
        }

        public Criteria andConsultationGreaterThan(Integer value) {
            addCriterion("consultation >", value, "consultation");
            return (Criteria) this;
        }

        public Criteria andConsultationGreaterThanOrEqualTo(Integer value) {
            addCriterion("consultation >=", value, "consultation");
            return (Criteria) this;
        }

        public Criteria andConsultationLessThan(Integer value) {
            addCriterion("consultation <", value, "consultation");
            return (Criteria) this;
        }

        public Criteria andConsultationLessThanOrEqualTo(Integer value) {
            addCriterion("consultation <=", value, "consultation");
            return (Criteria) this;
        }

        public Criteria andConsultationIn(List<Integer> values) {
            addCriterion("consultation in", values, "consultation");
            return (Criteria) this;
        }

        public Criteria andConsultationNotIn(List<Integer> values) {
            addCriterion("consultation not in", values, "consultation");
            return (Criteria) this;
        }

        public Criteria andConsultationBetween(Integer value1, Integer value2) {
            addCriterion("consultation between", value1, value2, "consultation");
            return (Criteria) this;
        }

        public Criteria andConsultationNotBetween(Integer value1, Integer value2) {
            addCriterion("consultation not between", value1, value2, "consultation");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("department is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("department is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(Integer value) {
            addCriterion("department =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(Integer value) {
            addCriterion("department <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(Integer value) {
            addCriterion("department >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(Integer value) {
            addCriterion("department >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(Integer value) {
            addCriterion("department <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(Integer value) {
            addCriterion("department <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<Integer> values) {
            addCriterion("department in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<Integer> values) {
            addCriterion("department not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(Integer value1, Integer value2) {
            addCriterion("department between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(Integer value1, Integer value2) {
            addCriterion("department not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDidIsNull() {
            addCriterion("did is null");
            return (Criteria) this;
        }

        public Criteria andDidIsNotNull() {
            addCriterion("did is not null");
            return (Criteria) this;
        }

        public Criteria andDidEqualTo(Integer value) {
            addCriterion("did =", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotEqualTo(Integer value) {
            addCriterion("did <>", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThan(Integer value) {
            addCriterion("did >", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("did >=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThan(Integer value) {
            addCriterion("did <", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidLessThanOrEqualTo(Integer value) {
            addCriterion("did <=", value, "did");
            return (Criteria) this;
        }

        public Criteria andDidIn(List<Integer> values) {
            addCriterion("did in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotIn(List<Integer> values) {
            addCriterion("did not in", values, "did");
            return (Criteria) this;
        }

        public Criteria andDidBetween(Integer value1, Integer value2) {
            addCriterion("did between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andDidNotBetween(Integer value1, Integer value2) {
            addCriterion("did not between", value1, value2, "did");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNull() {
            addCriterion("registerDate is null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIsNotNull() {
            addCriterion("registerDate is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterdateEqualTo(Date value) {
            addCriterion("registerDate =", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotEqualTo(Date value) {
            addCriterion("registerDate <>", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThan(Date value) {
            addCriterion("registerDate >", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateGreaterThanOrEqualTo(Date value) {
            addCriterion("registerDate >=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThan(Date value) {
            addCriterion("registerDate <", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateLessThanOrEqualTo(Date value) {
            addCriterion("registerDate <=", value, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateIn(List<Date> values) {
            addCriterion("registerDate in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotIn(List<Date> values) {
            addCriterion("registerDate not in", values, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateBetween(Date value1, Date value2) {
            addCriterion("registerDate between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRegisterdateNotBetween(Date value1, Date value2) {
            addCriterion("registerDate not between", value1, value2, "registerdate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}