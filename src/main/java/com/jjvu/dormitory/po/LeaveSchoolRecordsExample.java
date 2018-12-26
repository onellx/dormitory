package com.jjvu.dormitory.po;

import java.util.ArrayList;
import java.util.List;

public class LeaveSchoolRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LeaveSchoolRecordsExample() {
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

        public Criteria andLeaveRecodesIdIsNull() {
            addCriterion("LEAVE_RECODES_ID is null");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesIdIsNotNull() {
            addCriterion("LEAVE_RECODES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesIdEqualTo(String value) {
            addCriterion("LEAVE_RECODES_ID =", value, "leaveRecodesId");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesIdNotEqualTo(String value) {
            addCriterion("LEAVE_RECODES_ID <>", value, "leaveRecodesId");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesIdGreaterThan(String value) {
            addCriterion("LEAVE_RECODES_ID >", value, "leaveRecodesId");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesIdGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_RECODES_ID >=", value, "leaveRecodesId");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesIdLessThan(String value) {
            addCriterion("LEAVE_RECODES_ID <", value, "leaveRecodesId");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesIdLessThanOrEqualTo(String value) {
            addCriterion("LEAVE_RECODES_ID <=", value, "leaveRecodesId");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesIdLike(String value) {
            addCriterion("LEAVE_RECODES_ID like", value, "leaveRecodesId");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesIdNotLike(String value) {
            addCriterion("LEAVE_RECODES_ID not like", value, "leaveRecodesId");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesIdIn(List<String> values) {
            addCriterion("LEAVE_RECODES_ID in", values, "leaveRecodesId");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesIdNotIn(List<String> values) {
            addCriterion("LEAVE_RECODES_ID not in", values, "leaveRecodesId");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesIdBetween(String value1, String value2) {
            addCriterion("LEAVE_RECODES_ID between", value1, value2, "leaveRecodesId");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesIdNotBetween(String value1, String value2) {
            addCriterion("LEAVE_RECODES_ID not between", value1, value2, "leaveRecodesId");
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

        public Criteria andLeaveRecodesTimeIsNull() {
            addCriterion("LEAVE_RECODES_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesTimeIsNotNull() {
            addCriterion("LEAVE_RECODES_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesTimeEqualTo(String value) {
            addCriterion("LEAVE_RECODES_TIME =", value, "leaveRecodesTime");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesTimeNotEqualTo(String value) {
            addCriterion("LEAVE_RECODES_TIME <>", value, "leaveRecodesTime");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesTimeGreaterThan(String value) {
            addCriterion("LEAVE_RECODES_TIME >", value, "leaveRecodesTime");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_RECODES_TIME >=", value, "leaveRecodesTime");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesTimeLessThan(String value) {
            addCriterion("LEAVE_RECODES_TIME <", value, "leaveRecodesTime");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesTimeLessThanOrEqualTo(String value) {
            addCriterion("LEAVE_RECODES_TIME <=", value, "leaveRecodesTime");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesTimeLike(String value) {
            addCriterion("LEAVE_RECODES_TIME like", value, "leaveRecodesTime");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesTimeNotLike(String value) {
            addCriterion("LEAVE_RECODES_TIME not like", value, "leaveRecodesTime");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesTimeIn(List<String> values) {
            addCriterion("LEAVE_RECODES_TIME in", values, "leaveRecodesTime");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesTimeNotIn(List<String> values) {
            addCriterion("LEAVE_RECODES_TIME not in", values, "leaveRecodesTime");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesTimeBetween(String value1, String value2) {
            addCriterion("LEAVE_RECODES_TIME between", value1, value2, "leaveRecodesTime");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesTimeNotBetween(String value1, String value2) {
            addCriterion("LEAVE_RECODES_TIME not between", value1, value2, "leaveRecodesTime");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesStateIsNull() {
            addCriterion("LEAVE_RECODES_STATE is null");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesStateIsNotNull() {
            addCriterion("LEAVE_RECODES_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesStateEqualTo(String value) {
            addCriterion("LEAVE_RECODES_STATE =", value, "leaveRecodesState");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesStateNotEqualTo(String value) {
            addCriterion("LEAVE_RECODES_STATE <>", value, "leaveRecodesState");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesStateGreaterThan(String value) {
            addCriterion("LEAVE_RECODES_STATE >", value, "leaveRecodesState");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesStateGreaterThanOrEqualTo(String value) {
            addCriterion("LEAVE_RECODES_STATE >=", value, "leaveRecodesState");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesStateLessThan(String value) {
            addCriterion("LEAVE_RECODES_STATE <", value, "leaveRecodesState");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesStateLessThanOrEqualTo(String value) {
            addCriterion("LEAVE_RECODES_STATE <=", value, "leaveRecodesState");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesStateLike(String value) {
            addCriterion("LEAVE_RECODES_STATE like", value, "leaveRecodesState");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesStateNotLike(String value) {
            addCriterion("LEAVE_RECODES_STATE not like", value, "leaveRecodesState");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesStateIn(List<String> values) {
            addCriterion("LEAVE_RECODES_STATE in", values, "leaveRecodesState");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesStateNotIn(List<String> values) {
            addCriterion("LEAVE_RECODES_STATE not in", values, "leaveRecodesState");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesStateBetween(String value1, String value2) {
            addCriterion("LEAVE_RECODES_STATE between", value1, value2, "leaveRecodesState");
            return (Criteria) this;
        }

        public Criteria andLeaveRecodesStateNotBetween(String value1, String value2) {
            addCriterion("LEAVE_RECODES_STATE not between", value1, value2, "leaveRecodesState");
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