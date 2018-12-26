package com.jjvu.dormitory.po;

import java.util.ArrayList;
import java.util.List;

public class StudentsLateRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentsLateRecordsExample() {
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

        public Criteria andLateRecordsIdIsNull() {
            addCriterion("LATE_RECORDS_ID is null");
            return (Criteria) this;
        }

        public Criteria andLateRecordsIdIsNotNull() {
            addCriterion("LATE_RECORDS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLateRecordsIdEqualTo(String value) {
            addCriterion("LATE_RECORDS_ID =", value, "lateRecordsId");
            return (Criteria) this;
        }

        public Criteria andLateRecordsIdNotEqualTo(String value) {
            addCriterion("LATE_RECORDS_ID <>", value, "lateRecordsId");
            return (Criteria) this;
        }

        public Criteria andLateRecordsIdGreaterThan(String value) {
            addCriterion("LATE_RECORDS_ID >", value, "lateRecordsId");
            return (Criteria) this;
        }

        public Criteria andLateRecordsIdGreaterThanOrEqualTo(String value) {
            addCriterion("LATE_RECORDS_ID >=", value, "lateRecordsId");
            return (Criteria) this;
        }

        public Criteria andLateRecordsIdLessThan(String value) {
            addCriterion("LATE_RECORDS_ID <", value, "lateRecordsId");
            return (Criteria) this;
        }

        public Criteria andLateRecordsIdLessThanOrEqualTo(String value) {
            addCriterion("LATE_RECORDS_ID <=", value, "lateRecordsId");
            return (Criteria) this;
        }

        public Criteria andLateRecordsIdLike(String value) {
            addCriterion("LATE_RECORDS_ID like", value, "lateRecordsId");
            return (Criteria) this;
        }

        public Criteria andLateRecordsIdNotLike(String value) {
            addCriterion("LATE_RECORDS_ID not like", value, "lateRecordsId");
            return (Criteria) this;
        }

        public Criteria andLateRecordsIdIn(List<String> values) {
            addCriterion("LATE_RECORDS_ID in", values, "lateRecordsId");
            return (Criteria) this;
        }

        public Criteria andLateRecordsIdNotIn(List<String> values) {
            addCriterion("LATE_RECORDS_ID not in", values, "lateRecordsId");
            return (Criteria) this;
        }

        public Criteria andLateRecordsIdBetween(String value1, String value2) {
            addCriterion("LATE_RECORDS_ID between", value1, value2, "lateRecordsId");
            return (Criteria) this;
        }

        public Criteria andLateRecordsIdNotBetween(String value1, String value2) {
            addCriterion("LATE_RECORDS_ID not between", value1, value2, "lateRecordsId");
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

        public Criteria andItemsRecordsTimeIsNull() {
            addCriterion("ITEMS_RECORDS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsTimeIsNotNull() {
            addCriterion("ITEMS_RECORDS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsTimeEqualTo(String value) {
            addCriterion("ITEMS_RECORDS_TIME =", value, "itemsRecordsTime");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsTimeNotEqualTo(String value) {
            addCriterion("ITEMS_RECORDS_TIME <>", value, "itemsRecordsTime");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsTimeGreaterThan(String value) {
            addCriterion("ITEMS_RECORDS_TIME >", value, "itemsRecordsTime");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMS_RECORDS_TIME >=", value, "itemsRecordsTime");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsTimeLessThan(String value) {
            addCriterion("ITEMS_RECORDS_TIME <", value, "itemsRecordsTime");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsTimeLessThanOrEqualTo(String value) {
            addCriterion("ITEMS_RECORDS_TIME <=", value, "itemsRecordsTime");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsTimeLike(String value) {
            addCriterion("ITEMS_RECORDS_TIME like", value, "itemsRecordsTime");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsTimeNotLike(String value) {
            addCriterion("ITEMS_RECORDS_TIME not like", value, "itemsRecordsTime");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsTimeIn(List<String> values) {
            addCriterion("ITEMS_RECORDS_TIME in", values, "itemsRecordsTime");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsTimeNotIn(List<String> values) {
            addCriterion("ITEMS_RECORDS_TIME not in", values, "itemsRecordsTime");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsTimeBetween(String value1, String value2) {
            addCriterion("ITEMS_RECORDS_TIME between", value1, value2, "itemsRecordsTime");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsTimeNotBetween(String value1, String value2) {
            addCriterion("ITEMS_RECORDS_TIME not between", value1, value2, "itemsRecordsTime");
            return (Criteria) this;
        }

        public Criteria andLateRecordsStateIsNull() {
            addCriterion("LATE_RECORDS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLateRecordsStateIsNotNull() {
            addCriterion("LATE_RECORDS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLateRecordsStateEqualTo(String value) {
            addCriterion("LATE_RECORDS_STATE =", value, "lateRecordsState");
            return (Criteria) this;
        }

        public Criteria andLateRecordsStateNotEqualTo(String value) {
            addCriterion("LATE_RECORDS_STATE <>", value, "lateRecordsState");
            return (Criteria) this;
        }

        public Criteria andLateRecordsStateGreaterThan(String value) {
            addCriterion("LATE_RECORDS_STATE >", value, "lateRecordsState");
            return (Criteria) this;
        }

        public Criteria andLateRecordsStateGreaterThanOrEqualTo(String value) {
            addCriterion("LATE_RECORDS_STATE >=", value, "lateRecordsState");
            return (Criteria) this;
        }

        public Criteria andLateRecordsStateLessThan(String value) {
            addCriterion("LATE_RECORDS_STATE <", value, "lateRecordsState");
            return (Criteria) this;
        }

        public Criteria andLateRecordsStateLessThanOrEqualTo(String value) {
            addCriterion("LATE_RECORDS_STATE <=", value, "lateRecordsState");
            return (Criteria) this;
        }

        public Criteria andLateRecordsStateLike(String value) {
            addCriterion("LATE_RECORDS_STATE like", value, "lateRecordsState");
            return (Criteria) this;
        }

        public Criteria andLateRecordsStateNotLike(String value) {
            addCriterion("LATE_RECORDS_STATE not like", value, "lateRecordsState");
            return (Criteria) this;
        }

        public Criteria andLateRecordsStateIn(List<String> values) {
            addCriterion("LATE_RECORDS_STATE in", values, "lateRecordsState");
            return (Criteria) this;
        }

        public Criteria andLateRecordsStateNotIn(List<String> values) {
            addCriterion("LATE_RECORDS_STATE not in", values, "lateRecordsState");
            return (Criteria) this;
        }

        public Criteria andLateRecordsStateBetween(String value1, String value2) {
            addCriterion("LATE_RECORDS_STATE between", value1, value2, "lateRecordsState");
            return (Criteria) this;
        }

        public Criteria andLateRecordsStateNotBetween(String value1, String value2) {
            addCriterion("LATE_RECORDS_STATE not between", value1, value2, "lateRecordsState");
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