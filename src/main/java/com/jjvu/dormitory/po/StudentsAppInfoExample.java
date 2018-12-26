package com.jjvu.dormitory.po;

import java.util.ArrayList;
import java.util.List;

public class StudentsAppInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentsAppInfoExample() {
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

        public Criteria andStudentsAppIdIsNull() {
            addCriterion("STUDENTS_APP_ID is null");
            return (Criteria) this;
        }

        public Criteria andStudentsAppIdIsNotNull() {
            addCriterion("STUDENTS_APP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentsAppIdEqualTo(String value) {
            addCriterion("STUDENTS_APP_ID =", value, "studentsAppId");
            return (Criteria) this;
        }

        public Criteria andStudentsAppIdNotEqualTo(String value) {
            addCriterion("STUDENTS_APP_ID <>", value, "studentsAppId");
            return (Criteria) this;
        }

        public Criteria andStudentsAppIdGreaterThan(String value) {
            addCriterion("STUDENTS_APP_ID >", value, "studentsAppId");
            return (Criteria) this;
        }

        public Criteria andStudentsAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENTS_APP_ID >=", value, "studentsAppId");
            return (Criteria) this;
        }

        public Criteria andStudentsAppIdLessThan(String value) {
            addCriterion("STUDENTS_APP_ID <", value, "studentsAppId");
            return (Criteria) this;
        }

        public Criteria andStudentsAppIdLessThanOrEqualTo(String value) {
            addCriterion("STUDENTS_APP_ID <=", value, "studentsAppId");
            return (Criteria) this;
        }

        public Criteria andStudentsAppIdLike(String value) {
            addCriterion("STUDENTS_APP_ID like", value, "studentsAppId");
            return (Criteria) this;
        }

        public Criteria andStudentsAppIdNotLike(String value) {
            addCriterion("STUDENTS_APP_ID not like", value, "studentsAppId");
            return (Criteria) this;
        }

        public Criteria andStudentsAppIdIn(List<String> values) {
            addCriterion("STUDENTS_APP_ID in", values, "studentsAppId");
            return (Criteria) this;
        }

        public Criteria andStudentsAppIdNotIn(List<String> values) {
            addCriterion("STUDENTS_APP_ID not in", values, "studentsAppId");
            return (Criteria) this;
        }

        public Criteria andStudentsAppIdBetween(String value1, String value2) {
            addCriterion("STUDENTS_APP_ID between", value1, value2, "studentsAppId");
            return (Criteria) this;
        }

        public Criteria andStudentsAppIdNotBetween(String value1, String value2) {
            addCriterion("STUDENTS_APP_ID not between", value1, value2, "studentsAppId");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumIsNull() {
            addCriterion("STUDENT_EXAM_NUM is null");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumIsNotNull() {
            addCriterion("STUDENT_EXAM_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumEqualTo(String value) {
            addCriterion("STUDENT_EXAM_NUM =", value, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumNotEqualTo(String value) {
            addCriterion("STUDENT_EXAM_NUM <>", value, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumGreaterThan(String value) {
            addCriterion("STUDENT_EXAM_NUM >", value, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_EXAM_NUM >=", value, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumLessThan(String value) {
            addCriterion("STUDENT_EXAM_NUM <", value, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_EXAM_NUM <=", value, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumLike(String value) {
            addCriterion("STUDENT_EXAM_NUM like", value, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumNotLike(String value) {
            addCriterion("STUDENT_EXAM_NUM not like", value, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumIn(List<String> values) {
            addCriterion("STUDENT_EXAM_NUM in", values, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumNotIn(List<String> values) {
            addCriterion("STUDENT_EXAM_NUM not in", values, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumBetween(String value1, String value2) {
            addCriterion("STUDENT_EXAM_NUM between", value1, value2, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentExamNumNotBetween(String value1, String value2) {
            addCriterion("STUDENT_EXAM_NUM not between", value1, value2, "studentExamNum");
            return (Criteria) this;
        }

        public Criteria andStudentAppHeardIsNull() {
            addCriterion("STUDENT_APP_HEARD is null");
            return (Criteria) this;
        }

        public Criteria andStudentAppHeardIsNotNull() {
            addCriterion("STUDENT_APP_HEARD is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAppHeardEqualTo(String value) {
            addCriterion("STUDENT_APP_HEARD =", value, "studentAppHeard");
            return (Criteria) this;
        }

        public Criteria andStudentAppHeardNotEqualTo(String value) {
            addCriterion("STUDENT_APP_HEARD <>", value, "studentAppHeard");
            return (Criteria) this;
        }

        public Criteria andStudentAppHeardGreaterThan(String value) {
            addCriterion("STUDENT_APP_HEARD >", value, "studentAppHeard");
            return (Criteria) this;
        }

        public Criteria andStudentAppHeardGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_APP_HEARD >=", value, "studentAppHeard");
            return (Criteria) this;
        }

        public Criteria andStudentAppHeardLessThan(String value) {
            addCriterion("STUDENT_APP_HEARD <", value, "studentAppHeard");
            return (Criteria) this;
        }

        public Criteria andStudentAppHeardLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_APP_HEARD <=", value, "studentAppHeard");
            return (Criteria) this;
        }

        public Criteria andStudentAppHeardLike(String value) {
            addCriterion("STUDENT_APP_HEARD like", value, "studentAppHeard");
            return (Criteria) this;
        }

        public Criteria andStudentAppHeardNotLike(String value) {
            addCriterion("STUDENT_APP_HEARD not like", value, "studentAppHeard");
            return (Criteria) this;
        }

        public Criteria andStudentAppHeardIn(List<String> values) {
            addCriterion("STUDENT_APP_HEARD in", values, "studentAppHeard");
            return (Criteria) this;
        }

        public Criteria andStudentAppHeardNotIn(List<String> values) {
            addCriterion("STUDENT_APP_HEARD not in", values, "studentAppHeard");
            return (Criteria) this;
        }

        public Criteria andStudentAppHeardBetween(String value1, String value2) {
            addCriterion("STUDENT_APP_HEARD between", value1, value2, "studentAppHeard");
            return (Criteria) this;
        }

        public Criteria andStudentAppHeardNotBetween(String value1, String value2) {
            addCriterion("STUDENT_APP_HEARD not between", value1, value2, "studentAppHeard");
            return (Criteria) this;
        }

        public Criteria andStudentAppPasswdIsNull() {
            addCriterion("STUDENT_APP_PASSWD is null");
            return (Criteria) this;
        }

        public Criteria andStudentAppPasswdIsNotNull() {
            addCriterion("STUDENT_APP_PASSWD is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAppPasswdEqualTo(String value) {
            addCriterion("STUDENT_APP_PASSWD =", value, "studentAppPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentAppPasswdNotEqualTo(String value) {
            addCriterion("STUDENT_APP_PASSWD <>", value, "studentAppPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentAppPasswdGreaterThan(String value) {
            addCriterion("STUDENT_APP_PASSWD >", value, "studentAppPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentAppPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_APP_PASSWD >=", value, "studentAppPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentAppPasswdLessThan(String value) {
            addCriterion("STUDENT_APP_PASSWD <", value, "studentAppPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentAppPasswdLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_APP_PASSWD <=", value, "studentAppPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentAppPasswdLike(String value) {
            addCriterion("STUDENT_APP_PASSWD like", value, "studentAppPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentAppPasswdNotLike(String value) {
            addCriterion("STUDENT_APP_PASSWD not like", value, "studentAppPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentAppPasswdIn(List<String> values) {
            addCriterion("STUDENT_APP_PASSWD in", values, "studentAppPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentAppPasswdNotIn(List<String> values) {
            addCriterion("STUDENT_APP_PASSWD not in", values, "studentAppPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentAppPasswdBetween(String value1, String value2) {
            addCriterion("STUDENT_APP_PASSWD between", value1, value2, "studentAppPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentAppPasswdNotBetween(String value1, String value2) {
            addCriterion("STUDENT_APP_PASSWD not between", value1, value2, "studentAppPasswd");
            return (Criteria) this;
        }

        public Criteria andStudentAppPhoneIsNull() {
            addCriterion("STUDENT_APP_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andStudentAppPhoneIsNotNull() {
            addCriterion("STUDENT_APP_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andStudentAppPhoneEqualTo(String value) {
            addCriterion("STUDENT_APP_PHONE =", value, "studentAppPhone");
            return (Criteria) this;
        }

        public Criteria andStudentAppPhoneNotEqualTo(String value) {
            addCriterion("STUDENT_APP_PHONE <>", value, "studentAppPhone");
            return (Criteria) this;
        }

        public Criteria andStudentAppPhoneGreaterThan(String value) {
            addCriterion("STUDENT_APP_PHONE >", value, "studentAppPhone");
            return (Criteria) this;
        }

        public Criteria andStudentAppPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENT_APP_PHONE >=", value, "studentAppPhone");
            return (Criteria) this;
        }

        public Criteria andStudentAppPhoneLessThan(String value) {
            addCriterion("STUDENT_APP_PHONE <", value, "studentAppPhone");
            return (Criteria) this;
        }

        public Criteria andStudentAppPhoneLessThanOrEqualTo(String value) {
            addCriterion("STUDENT_APP_PHONE <=", value, "studentAppPhone");
            return (Criteria) this;
        }

        public Criteria andStudentAppPhoneLike(String value) {
            addCriterion("STUDENT_APP_PHONE like", value, "studentAppPhone");
            return (Criteria) this;
        }

        public Criteria andStudentAppPhoneNotLike(String value) {
            addCriterion("STUDENT_APP_PHONE not like", value, "studentAppPhone");
            return (Criteria) this;
        }

        public Criteria andStudentAppPhoneIn(List<String> values) {
            addCriterion("STUDENT_APP_PHONE in", values, "studentAppPhone");
            return (Criteria) this;
        }

        public Criteria andStudentAppPhoneNotIn(List<String> values) {
            addCriterion("STUDENT_APP_PHONE not in", values, "studentAppPhone");
            return (Criteria) this;
        }

        public Criteria andStudentAppPhoneBetween(String value1, String value2) {
            addCriterion("STUDENT_APP_PHONE between", value1, value2, "studentAppPhone");
            return (Criteria) this;
        }

        public Criteria andStudentAppPhoneNotBetween(String value1, String value2) {
            addCriterion("STUDENT_APP_PHONE not between", value1, value2, "studentAppPhone");
            return (Criteria) this;
        }

        public Criteria andStudentsFaceCodeIsNull() {
            addCriterion("STUDENTS_FACE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStudentsFaceCodeIsNotNull() {
            addCriterion("STUDENTS_FACE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStudentsFaceCodeEqualTo(String value) {
            addCriterion("STUDENTS_FACE_CODE =", value, "studentsFaceCode");
            return (Criteria) this;
        }

        public Criteria andStudentsFaceCodeNotEqualTo(String value) {
            addCriterion("STUDENTS_FACE_CODE <>", value, "studentsFaceCode");
            return (Criteria) this;
        }

        public Criteria andStudentsFaceCodeGreaterThan(String value) {
            addCriterion("STUDENTS_FACE_CODE >", value, "studentsFaceCode");
            return (Criteria) this;
        }

        public Criteria andStudentsFaceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENTS_FACE_CODE >=", value, "studentsFaceCode");
            return (Criteria) this;
        }

        public Criteria andStudentsFaceCodeLessThan(String value) {
            addCriterion("STUDENTS_FACE_CODE <", value, "studentsFaceCode");
            return (Criteria) this;
        }

        public Criteria andStudentsFaceCodeLessThanOrEqualTo(String value) {
            addCriterion("STUDENTS_FACE_CODE <=", value, "studentsFaceCode");
            return (Criteria) this;
        }

        public Criteria andStudentsFaceCodeLike(String value) {
            addCriterion("STUDENTS_FACE_CODE like", value, "studentsFaceCode");
            return (Criteria) this;
        }

        public Criteria andStudentsFaceCodeNotLike(String value) {
            addCriterion("STUDENTS_FACE_CODE not like", value, "studentsFaceCode");
            return (Criteria) this;
        }

        public Criteria andStudentsFaceCodeIn(List<String> values) {
            addCriterion("STUDENTS_FACE_CODE in", values, "studentsFaceCode");
            return (Criteria) this;
        }

        public Criteria andStudentsFaceCodeNotIn(List<String> values) {
            addCriterion("STUDENTS_FACE_CODE not in", values, "studentsFaceCode");
            return (Criteria) this;
        }

        public Criteria andStudentsFaceCodeBetween(String value1, String value2) {
            addCriterion("STUDENTS_FACE_CODE between", value1, value2, "studentsFaceCode");
            return (Criteria) this;
        }

        public Criteria andStudentsFaceCodeNotBetween(String value1, String value2) {
            addCriterion("STUDENTS_FACE_CODE not between", value1, value2, "studentsFaceCode");
            return (Criteria) this;
        }

        public Criteria andStudentsAppStateIsNull() {
            addCriterion("STUDENTS_APP_STATE is null");
            return (Criteria) this;
        }

        public Criteria andStudentsAppStateIsNotNull() {
            addCriterion("STUDENTS_APP_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStudentsAppStateEqualTo(String value) {
            addCriterion("STUDENTS_APP_STATE =", value, "studentsAppState");
            return (Criteria) this;
        }

        public Criteria andStudentsAppStateNotEqualTo(String value) {
            addCriterion("STUDENTS_APP_STATE <>", value, "studentsAppState");
            return (Criteria) this;
        }

        public Criteria andStudentsAppStateGreaterThan(String value) {
            addCriterion("STUDENTS_APP_STATE >", value, "studentsAppState");
            return (Criteria) this;
        }

        public Criteria andStudentsAppStateGreaterThanOrEqualTo(String value) {
            addCriterion("STUDENTS_APP_STATE >=", value, "studentsAppState");
            return (Criteria) this;
        }

        public Criteria andStudentsAppStateLessThan(String value) {
            addCriterion("STUDENTS_APP_STATE <", value, "studentsAppState");
            return (Criteria) this;
        }

        public Criteria andStudentsAppStateLessThanOrEqualTo(String value) {
            addCriterion("STUDENTS_APP_STATE <=", value, "studentsAppState");
            return (Criteria) this;
        }

        public Criteria andStudentsAppStateLike(String value) {
            addCriterion("STUDENTS_APP_STATE like", value, "studentsAppState");
            return (Criteria) this;
        }

        public Criteria andStudentsAppStateNotLike(String value) {
            addCriterion("STUDENTS_APP_STATE not like", value, "studentsAppState");
            return (Criteria) this;
        }

        public Criteria andStudentsAppStateIn(List<String> values) {
            addCriterion("STUDENTS_APP_STATE in", values, "studentsAppState");
            return (Criteria) this;
        }

        public Criteria andStudentsAppStateNotIn(List<String> values) {
            addCriterion("STUDENTS_APP_STATE not in", values, "studentsAppState");
            return (Criteria) this;
        }

        public Criteria andStudentsAppStateBetween(String value1, String value2) {
            addCriterion("STUDENTS_APP_STATE between", value1, value2, "studentsAppState");
            return (Criteria) this;
        }

        public Criteria andStudentsAppStateNotBetween(String value1, String value2) {
            addCriterion("STUDENTS_APP_STATE not between", value1, value2, "studentsAppState");
            return (Criteria) this;
        }

        public Criteria andAppChangeTimeIsNull() {
            addCriterion("APP_CHANGE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAppChangeTimeIsNotNull() {
            addCriterion("APP_CHANGE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAppChangeTimeEqualTo(String value) {
            addCriterion("APP_CHANGE_TIME =", value, "appChangeTime");
            return (Criteria) this;
        }

        public Criteria andAppChangeTimeNotEqualTo(String value) {
            addCriterion("APP_CHANGE_TIME <>", value, "appChangeTime");
            return (Criteria) this;
        }

        public Criteria andAppChangeTimeGreaterThan(String value) {
            addCriterion("APP_CHANGE_TIME >", value, "appChangeTime");
            return (Criteria) this;
        }

        public Criteria andAppChangeTimeGreaterThanOrEqualTo(String value) {
            addCriterion("APP_CHANGE_TIME >=", value, "appChangeTime");
            return (Criteria) this;
        }

        public Criteria andAppChangeTimeLessThan(String value) {
            addCriterion("APP_CHANGE_TIME <", value, "appChangeTime");
            return (Criteria) this;
        }

        public Criteria andAppChangeTimeLessThanOrEqualTo(String value) {
            addCriterion("APP_CHANGE_TIME <=", value, "appChangeTime");
            return (Criteria) this;
        }

        public Criteria andAppChangeTimeLike(String value) {
            addCriterion("APP_CHANGE_TIME like", value, "appChangeTime");
            return (Criteria) this;
        }

        public Criteria andAppChangeTimeNotLike(String value) {
            addCriterion("APP_CHANGE_TIME not like", value, "appChangeTime");
            return (Criteria) this;
        }

        public Criteria andAppChangeTimeIn(List<String> values) {
            addCriterion("APP_CHANGE_TIME in", values, "appChangeTime");
            return (Criteria) this;
        }

        public Criteria andAppChangeTimeNotIn(List<String> values) {
            addCriterion("APP_CHANGE_TIME not in", values, "appChangeTime");
            return (Criteria) this;
        }

        public Criteria andAppChangeTimeBetween(String value1, String value2) {
            addCriterion("APP_CHANGE_TIME between", value1, value2, "appChangeTime");
            return (Criteria) this;
        }

        public Criteria andAppChangeTimeNotBetween(String value1, String value2) {
            addCriterion("APP_CHANGE_TIME not between", value1, value2, "appChangeTime");
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