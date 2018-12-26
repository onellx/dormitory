package com.jjvu.dormitory.po;

import java.util.ArrayList;
import java.util.List;

public class ItemsOutRecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemsOutRecordsExample() {
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

        public Criteria andItemsRecordsIdIsNull() {
            addCriterion("ITEMS_RECORDS_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsIdIsNotNull() {
            addCriterion("ITEMS_RECORDS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsIdEqualTo(String value) {
            addCriterion("ITEMS_RECORDS_ID =", value, "itemsRecordsId");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsIdNotEqualTo(String value) {
            addCriterion("ITEMS_RECORDS_ID <>", value, "itemsRecordsId");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsIdGreaterThan(String value) {
            addCriterion("ITEMS_RECORDS_ID >", value, "itemsRecordsId");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsIdGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMS_RECORDS_ID >=", value, "itemsRecordsId");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsIdLessThan(String value) {
            addCriterion("ITEMS_RECORDS_ID <", value, "itemsRecordsId");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsIdLessThanOrEqualTo(String value) {
            addCriterion("ITEMS_RECORDS_ID <=", value, "itemsRecordsId");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsIdLike(String value) {
            addCriterion("ITEMS_RECORDS_ID like", value, "itemsRecordsId");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsIdNotLike(String value) {
            addCriterion("ITEMS_RECORDS_ID not like", value, "itemsRecordsId");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsIdIn(List<String> values) {
            addCriterion("ITEMS_RECORDS_ID in", values, "itemsRecordsId");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsIdNotIn(List<String> values) {
            addCriterion("ITEMS_RECORDS_ID not in", values, "itemsRecordsId");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsIdBetween(String value1, String value2) {
            addCriterion("ITEMS_RECORDS_ID between", value1, value2, "itemsRecordsId");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsIdNotBetween(String value1, String value2) {
            addCriterion("ITEMS_RECORDS_ID not between", value1, value2, "itemsRecordsId");
            return (Criteria) this;
        }

        public Criteria andItemsInfoIdIsNull() {
            addCriterion("ITEMS_INFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andItemsInfoIdIsNotNull() {
            addCriterion("ITEMS_INFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andItemsInfoIdEqualTo(String value) {
            addCriterion("ITEMS_INFO_ID =", value, "itemsInfoId");
            return (Criteria) this;
        }

        public Criteria andItemsInfoIdNotEqualTo(String value) {
            addCriterion("ITEMS_INFO_ID <>", value, "itemsInfoId");
            return (Criteria) this;
        }

        public Criteria andItemsInfoIdGreaterThan(String value) {
            addCriterion("ITEMS_INFO_ID >", value, "itemsInfoId");
            return (Criteria) this;
        }

        public Criteria andItemsInfoIdGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMS_INFO_ID >=", value, "itemsInfoId");
            return (Criteria) this;
        }

        public Criteria andItemsInfoIdLessThan(String value) {
            addCriterion("ITEMS_INFO_ID <", value, "itemsInfoId");
            return (Criteria) this;
        }

        public Criteria andItemsInfoIdLessThanOrEqualTo(String value) {
            addCriterion("ITEMS_INFO_ID <=", value, "itemsInfoId");
            return (Criteria) this;
        }

        public Criteria andItemsInfoIdLike(String value) {
            addCriterion("ITEMS_INFO_ID like", value, "itemsInfoId");
            return (Criteria) this;
        }

        public Criteria andItemsInfoIdNotLike(String value) {
            addCriterion("ITEMS_INFO_ID not like", value, "itemsInfoId");
            return (Criteria) this;
        }

        public Criteria andItemsInfoIdIn(List<String> values) {
            addCriterion("ITEMS_INFO_ID in", values, "itemsInfoId");
            return (Criteria) this;
        }

        public Criteria andItemsInfoIdNotIn(List<String> values) {
            addCriterion("ITEMS_INFO_ID not in", values, "itemsInfoId");
            return (Criteria) this;
        }

        public Criteria andItemsInfoIdBetween(String value1, String value2) {
            addCriterion("ITEMS_INFO_ID between", value1, value2, "itemsInfoId");
            return (Criteria) this;
        }

        public Criteria andItemsInfoIdNotBetween(String value1, String value2) {
            addCriterion("ITEMS_INFO_ID not between", value1, value2, "itemsInfoId");
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

        public Criteria andItemsRecordsStateIsNull() {
            addCriterion("ITEMS_RECORDS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsStateIsNotNull() {
            addCriterion("ITEMS_RECORDS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsStateEqualTo(String value) {
            addCriterion("ITEMS_RECORDS_STATE =", value, "itemsRecordsState");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsStateNotEqualTo(String value) {
            addCriterion("ITEMS_RECORDS_STATE <>", value, "itemsRecordsState");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsStateGreaterThan(String value) {
            addCriterion("ITEMS_RECORDS_STATE >", value, "itemsRecordsState");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsStateGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMS_RECORDS_STATE >=", value, "itemsRecordsState");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsStateLessThan(String value) {
            addCriterion("ITEMS_RECORDS_STATE <", value, "itemsRecordsState");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsStateLessThanOrEqualTo(String value) {
            addCriterion("ITEMS_RECORDS_STATE <=", value, "itemsRecordsState");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsStateLike(String value) {
            addCriterion("ITEMS_RECORDS_STATE like", value, "itemsRecordsState");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsStateNotLike(String value) {
            addCriterion("ITEMS_RECORDS_STATE not like", value, "itemsRecordsState");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsStateIn(List<String> values) {
            addCriterion("ITEMS_RECORDS_STATE in", values, "itemsRecordsState");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsStateNotIn(List<String> values) {
            addCriterion("ITEMS_RECORDS_STATE not in", values, "itemsRecordsState");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsStateBetween(String value1, String value2) {
            addCriterion("ITEMS_RECORDS_STATE between", value1, value2, "itemsRecordsState");
            return (Criteria) this;
        }

        public Criteria andItemsRecordsStateNotBetween(String value1, String value2) {
            addCriterion("ITEMS_RECORDS_STATE not between", value1, value2, "itemsRecordsState");
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