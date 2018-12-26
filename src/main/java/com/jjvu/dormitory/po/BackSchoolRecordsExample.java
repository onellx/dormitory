package com.jjvu.dormitory.po;

import java.util.ArrayList;
import java.util.List;

public class BackSchoolRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BackSchoolRecordsExample() {
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

        public Criteria andBackRecodesIdIsNull() {
            addCriterion("BACK_RECODES_ID is null");
            return (Criteria) this;
        }

        public Criteria andBackRecodesIdIsNotNull() {
            addCriterion("BACK_RECODES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBackRecodesIdEqualTo(String value) {
            addCriterion("BACK_RECODES_ID =", value, "backRecodesId");
            return (Criteria) this;
        }

        public Criteria andBackRecodesIdNotEqualTo(String value) {
            addCriterion("BACK_RECODES_ID <>", value, "backRecodesId");
            return (Criteria) this;
        }

        public Criteria andBackRecodesIdGreaterThan(String value) {
            addCriterion("BACK_RECODES_ID >", value, "backRecodesId");
            return (Criteria) this;
        }

        public Criteria andBackRecodesIdGreaterThanOrEqualTo(String value) {
            addCriterion("BACK_RECODES_ID >=", value, "backRecodesId");
            return (Criteria) this;
        }

        public Criteria andBackRecodesIdLessThan(String value) {
            addCriterion("BACK_RECODES_ID <", value, "backRecodesId");
            return (Criteria) this;
        }

        public Criteria andBackRecodesIdLessThanOrEqualTo(String value) {
            addCriterion("BACK_RECODES_ID <=", value, "backRecodesId");
            return (Criteria) this;
        }

        public Criteria andBackRecodesIdLike(String value) {
            addCriterion("BACK_RECODES_ID like", value, "backRecodesId");
            return (Criteria) this;
        }

        public Criteria andBackRecodesIdNotLike(String value) {
            addCriterion("BACK_RECODES_ID not like", value, "backRecodesId");
            return (Criteria) this;
        }

        public Criteria andBackRecodesIdIn(List<String> values) {
            addCriterion("BACK_RECODES_ID in", values, "backRecodesId");
            return (Criteria) this;
        }

        public Criteria andBackRecodesIdNotIn(List<String> values) {
            addCriterion("BACK_RECODES_ID not in", values, "backRecodesId");
            return (Criteria) this;
        }

        public Criteria andBackRecodesIdBetween(String value1, String value2) {
            addCriterion("BACK_RECODES_ID between", value1, value2, "backRecodesId");
            return (Criteria) this;
        }

        public Criteria andBackRecodesIdNotBetween(String value1, String value2) {
            addCriterion("BACK_RECODES_ID not between", value1, value2, "backRecodesId");
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

        public Criteria andBackRecodesTimeIsNull() {
            addCriterion("BACK_RECODES_TIME is null");
            return (Criteria) this;
        }

        public Criteria andBackRecodesTimeIsNotNull() {
            addCriterion("BACK_RECODES_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andBackRecodesTimeEqualTo(String value) {
            addCriterion("BACK_RECODES_TIME =", value, "backRecodesTime");
            return (Criteria) this;
        }

        public Criteria andBackRecodesTimeNotEqualTo(String value) {
            addCriterion("BACK_RECODES_TIME <>", value, "backRecodesTime");
            return (Criteria) this;
        }

        public Criteria andBackRecodesTimeGreaterThan(String value) {
            addCriterion("BACK_RECODES_TIME >", value, "backRecodesTime");
            return (Criteria) this;
        }

        public Criteria andBackRecodesTimeGreaterThanOrEqualTo(String value) {
            addCriterion("BACK_RECODES_TIME >=", value, "backRecodesTime");
            return (Criteria) this;
        }

        public Criteria andBackRecodesTimeLessThan(String value) {
            addCriterion("BACK_RECODES_TIME <", value, "backRecodesTime");
            return (Criteria) this;
        }

        public Criteria andBackRecodesTimeLessThanOrEqualTo(String value) {
            addCriterion("BACK_RECODES_TIME <=", value, "backRecodesTime");
            return (Criteria) this;
        }

        public Criteria andBackRecodesTimeLike(String value) {
            addCriterion("BACK_RECODES_TIME like", value, "backRecodesTime");
            return (Criteria) this;
        }

        public Criteria andBackRecodesTimeNotLike(String value) {
            addCriterion("BACK_RECODES_TIME not like", value, "backRecodesTime");
            return (Criteria) this;
        }

        public Criteria andBackRecodesTimeIn(List<String> values) {
            addCriterion("BACK_RECODES_TIME in", values, "backRecodesTime");
            return (Criteria) this;
        }

        public Criteria andBackRecodesTimeNotIn(List<String> values) {
            addCriterion("BACK_RECODES_TIME not in", values, "backRecodesTime");
            return (Criteria) this;
        }

        public Criteria andBackRecodesTimeBetween(String value1, String value2) {
            addCriterion("BACK_RECODES_TIME between", value1, value2, "backRecodesTime");
            return (Criteria) this;
        }

        public Criteria andBackRecodesTimeNotBetween(String value1, String value2) {
            addCriterion("BACK_RECODES_TIME not between", value1, value2, "backRecodesTime");
            return (Criteria) this;
        }

        public Criteria andBackRecodesStateIsNull() {
            addCriterion("BACK_RECODES_STATE is null");
            return (Criteria) this;
        }

        public Criteria andBackRecodesStateIsNotNull() {
            addCriterion("BACK_RECODES_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andBackRecodesStateEqualTo(String value) {
            addCriterion("BACK_RECODES_STATE =", value, "backRecodesState");
            return (Criteria) this;
        }

        public Criteria andBackRecodesStateNotEqualTo(String value) {
            addCriterion("BACK_RECODES_STATE <>", value, "backRecodesState");
            return (Criteria) this;
        }

        public Criteria andBackRecodesStateGreaterThan(String value) {
            addCriterion("BACK_RECODES_STATE >", value, "backRecodesState");
            return (Criteria) this;
        }

        public Criteria andBackRecodesStateGreaterThanOrEqualTo(String value) {
            addCriterion("BACK_RECODES_STATE >=", value, "backRecodesState");
            return (Criteria) this;
        }

        public Criteria andBackRecodesStateLessThan(String value) {
            addCriterion("BACK_RECODES_STATE <", value, "backRecodesState");
            return (Criteria) this;
        }

        public Criteria andBackRecodesStateLessThanOrEqualTo(String value) {
            addCriterion("BACK_RECODES_STATE <=", value, "backRecodesState");
            return (Criteria) this;
        }

        public Criteria andBackRecodesStateLike(String value) {
            addCriterion("BACK_RECODES_STATE like", value, "backRecodesState");
            return (Criteria) this;
        }

        public Criteria andBackRecodesStateNotLike(String value) {
            addCriterion("BACK_RECODES_STATE not like", value, "backRecodesState");
            return (Criteria) this;
        }

        public Criteria andBackRecodesStateIn(List<String> values) {
            addCriterion("BACK_RECODES_STATE in", values, "backRecodesState");
            return (Criteria) this;
        }

        public Criteria andBackRecodesStateNotIn(List<String> values) {
            addCriterion("BACK_RECODES_STATE not in", values, "backRecodesState");
            return (Criteria) this;
        }

        public Criteria andBackRecodesStateBetween(String value1, String value2) {
            addCriterion("BACK_RECODES_STATE between", value1, value2, "backRecodesState");
            return (Criteria) this;
        }

        public Criteria andBackRecodesStateNotBetween(String value1, String value2) {
            addCriterion("BACK_RECODES_STATE not between", value1, value2, "backRecodesState");
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