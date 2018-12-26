package com.jjvu.dormitory.po;

import java.util.ArrayList;
import java.util.List;

public class ItemsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemsInfoExample() {
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

        public Criteria andItemsInfoNameIsNull() {
            addCriterion("ITEMS_INFO_NAME is null");
            return (Criteria) this;
        }

        public Criteria andItemsInfoNameIsNotNull() {
            addCriterion("ITEMS_INFO_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andItemsInfoNameEqualTo(String value) {
            addCriterion("ITEMS_INFO_NAME =", value, "itemsInfoName");
            return (Criteria) this;
        }

        public Criteria andItemsInfoNameNotEqualTo(String value) {
            addCriterion("ITEMS_INFO_NAME <>", value, "itemsInfoName");
            return (Criteria) this;
        }

        public Criteria andItemsInfoNameGreaterThan(String value) {
            addCriterion("ITEMS_INFO_NAME >", value, "itemsInfoName");
            return (Criteria) this;
        }

        public Criteria andItemsInfoNameGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMS_INFO_NAME >=", value, "itemsInfoName");
            return (Criteria) this;
        }

        public Criteria andItemsInfoNameLessThan(String value) {
            addCriterion("ITEMS_INFO_NAME <", value, "itemsInfoName");
            return (Criteria) this;
        }

        public Criteria andItemsInfoNameLessThanOrEqualTo(String value) {
            addCriterion("ITEMS_INFO_NAME <=", value, "itemsInfoName");
            return (Criteria) this;
        }

        public Criteria andItemsInfoNameLike(String value) {
            addCriterion("ITEMS_INFO_NAME like", value, "itemsInfoName");
            return (Criteria) this;
        }

        public Criteria andItemsInfoNameNotLike(String value) {
            addCriterion("ITEMS_INFO_NAME not like", value, "itemsInfoName");
            return (Criteria) this;
        }

        public Criteria andItemsInfoNameIn(List<String> values) {
            addCriterion("ITEMS_INFO_NAME in", values, "itemsInfoName");
            return (Criteria) this;
        }

        public Criteria andItemsInfoNameNotIn(List<String> values) {
            addCriterion("ITEMS_INFO_NAME not in", values, "itemsInfoName");
            return (Criteria) this;
        }

        public Criteria andItemsInfoNameBetween(String value1, String value2) {
            addCriterion("ITEMS_INFO_NAME between", value1, value2, "itemsInfoName");
            return (Criteria) this;
        }

        public Criteria andItemsInfoNameNotBetween(String value1, String value2) {
            addCriterion("ITEMS_INFO_NAME not between", value1, value2, "itemsInfoName");
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

        public Criteria andItemsInfoCategoryIsNull() {
            addCriterion("ITEMS_INFO_CATEGORY is null");
            return (Criteria) this;
        }

        public Criteria andItemsInfoCategoryIsNotNull() {
            addCriterion("ITEMS_INFO_CATEGORY is not null");
            return (Criteria) this;
        }

        public Criteria andItemsInfoCategoryEqualTo(String value) {
            addCriterion("ITEMS_INFO_CATEGORY =", value, "itemsInfoCategory");
            return (Criteria) this;
        }

        public Criteria andItemsInfoCategoryNotEqualTo(String value) {
            addCriterion("ITEMS_INFO_CATEGORY <>", value, "itemsInfoCategory");
            return (Criteria) this;
        }

        public Criteria andItemsInfoCategoryGreaterThan(String value) {
            addCriterion("ITEMS_INFO_CATEGORY >", value, "itemsInfoCategory");
            return (Criteria) this;
        }

        public Criteria andItemsInfoCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMS_INFO_CATEGORY >=", value, "itemsInfoCategory");
            return (Criteria) this;
        }

        public Criteria andItemsInfoCategoryLessThan(String value) {
            addCriterion("ITEMS_INFO_CATEGORY <", value, "itemsInfoCategory");
            return (Criteria) this;
        }

        public Criteria andItemsInfoCategoryLessThanOrEqualTo(String value) {
            addCriterion("ITEMS_INFO_CATEGORY <=", value, "itemsInfoCategory");
            return (Criteria) this;
        }

        public Criteria andItemsInfoCategoryLike(String value) {
            addCriterion("ITEMS_INFO_CATEGORY like", value, "itemsInfoCategory");
            return (Criteria) this;
        }

        public Criteria andItemsInfoCategoryNotLike(String value) {
            addCriterion("ITEMS_INFO_CATEGORY not like", value, "itemsInfoCategory");
            return (Criteria) this;
        }

        public Criteria andItemsInfoCategoryIn(List<String> values) {
            addCriterion("ITEMS_INFO_CATEGORY in", values, "itemsInfoCategory");
            return (Criteria) this;
        }

        public Criteria andItemsInfoCategoryNotIn(List<String> values) {
            addCriterion("ITEMS_INFO_CATEGORY not in", values, "itemsInfoCategory");
            return (Criteria) this;
        }

        public Criteria andItemsInfoCategoryBetween(String value1, String value2) {
            addCriterion("ITEMS_INFO_CATEGORY between", value1, value2, "itemsInfoCategory");
            return (Criteria) this;
        }

        public Criteria andItemsInfoCategoryNotBetween(String value1, String value2) {
            addCriterion("ITEMS_INFO_CATEGORY not between", value1, value2, "itemsInfoCategory");
            return (Criteria) this;
        }

        public Criteria andComputerMacIsNull() {
            addCriterion("COMPUTER_MAC is null");
            return (Criteria) this;
        }

        public Criteria andComputerMacIsNotNull() {
            addCriterion("COMPUTER_MAC is not null");
            return (Criteria) this;
        }

        public Criteria andComputerMacEqualTo(String value) {
            addCriterion("COMPUTER_MAC =", value, "computerMac");
            return (Criteria) this;
        }

        public Criteria andComputerMacNotEqualTo(String value) {
            addCriterion("COMPUTER_MAC <>", value, "computerMac");
            return (Criteria) this;
        }

        public Criteria andComputerMacGreaterThan(String value) {
            addCriterion("COMPUTER_MAC >", value, "computerMac");
            return (Criteria) this;
        }

        public Criteria andComputerMacGreaterThanOrEqualTo(String value) {
            addCriterion("COMPUTER_MAC >=", value, "computerMac");
            return (Criteria) this;
        }

        public Criteria andComputerMacLessThan(String value) {
            addCriterion("COMPUTER_MAC <", value, "computerMac");
            return (Criteria) this;
        }

        public Criteria andComputerMacLessThanOrEqualTo(String value) {
            addCriterion("COMPUTER_MAC <=", value, "computerMac");
            return (Criteria) this;
        }

        public Criteria andComputerMacLike(String value) {
            addCriterion("COMPUTER_MAC like", value, "computerMac");
            return (Criteria) this;
        }

        public Criteria andComputerMacNotLike(String value) {
            addCriterion("COMPUTER_MAC not like", value, "computerMac");
            return (Criteria) this;
        }

        public Criteria andComputerMacIn(List<String> values) {
            addCriterion("COMPUTER_MAC in", values, "computerMac");
            return (Criteria) this;
        }

        public Criteria andComputerMacNotIn(List<String> values) {
            addCriterion("COMPUTER_MAC not in", values, "computerMac");
            return (Criteria) this;
        }

        public Criteria andComputerMacBetween(String value1, String value2) {
            addCriterion("COMPUTER_MAC between", value1, value2, "computerMac");
            return (Criteria) this;
        }

        public Criteria andComputerMacNotBetween(String value1, String value2) {
            addCriterion("COMPUTER_MAC not between", value1, value2, "computerMac");
            return (Criteria) this;
        }

        public Criteria andItemsInfoImageIsNull() {
            addCriterion("ITEMS_INFO_IMAGE is null");
            return (Criteria) this;
        }

        public Criteria andItemsInfoImageIsNotNull() {
            addCriterion("ITEMS_INFO_IMAGE is not null");
            return (Criteria) this;
        }

        public Criteria andItemsInfoImageEqualTo(String value) {
            addCriterion("ITEMS_INFO_IMAGE =", value, "itemsInfoImage");
            return (Criteria) this;
        }

        public Criteria andItemsInfoImageNotEqualTo(String value) {
            addCriterion("ITEMS_INFO_IMAGE <>", value, "itemsInfoImage");
            return (Criteria) this;
        }

        public Criteria andItemsInfoImageGreaterThan(String value) {
            addCriterion("ITEMS_INFO_IMAGE >", value, "itemsInfoImage");
            return (Criteria) this;
        }

        public Criteria andItemsInfoImageGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMS_INFO_IMAGE >=", value, "itemsInfoImage");
            return (Criteria) this;
        }

        public Criteria andItemsInfoImageLessThan(String value) {
            addCriterion("ITEMS_INFO_IMAGE <", value, "itemsInfoImage");
            return (Criteria) this;
        }

        public Criteria andItemsInfoImageLessThanOrEqualTo(String value) {
            addCriterion("ITEMS_INFO_IMAGE <=", value, "itemsInfoImage");
            return (Criteria) this;
        }

        public Criteria andItemsInfoImageLike(String value) {
            addCriterion("ITEMS_INFO_IMAGE like", value, "itemsInfoImage");
            return (Criteria) this;
        }

        public Criteria andItemsInfoImageNotLike(String value) {
            addCriterion("ITEMS_INFO_IMAGE not like", value, "itemsInfoImage");
            return (Criteria) this;
        }

        public Criteria andItemsInfoImageIn(List<String> values) {
            addCriterion("ITEMS_INFO_IMAGE in", values, "itemsInfoImage");
            return (Criteria) this;
        }

        public Criteria andItemsInfoImageNotIn(List<String> values) {
            addCriterion("ITEMS_INFO_IMAGE not in", values, "itemsInfoImage");
            return (Criteria) this;
        }

        public Criteria andItemsInfoImageBetween(String value1, String value2) {
            addCriterion("ITEMS_INFO_IMAGE between", value1, value2, "itemsInfoImage");
            return (Criteria) this;
        }

        public Criteria andItemsInfoImageNotBetween(String value1, String value2) {
            addCriterion("ITEMS_INFO_IMAGE not between", value1, value2, "itemsInfoImage");
            return (Criteria) this;
        }

        public Criteria andItemsInfoDescribeIsNull() {
            addCriterion("ITEMS_INFO_DESCRIBE is null");
            return (Criteria) this;
        }

        public Criteria andItemsInfoDescribeIsNotNull() {
            addCriterion("ITEMS_INFO_DESCRIBE is not null");
            return (Criteria) this;
        }

        public Criteria andItemsInfoDescribeEqualTo(String value) {
            addCriterion("ITEMS_INFO_DESCRIBE =", value, "itemsInfoDescribe");
            return (Criteria) this;
        }

        public Criteria andItemsInfoDescribeNotEqualTo(String value) {
            addCriterion("ITEMS_INFO_DESCRIBE <>", value, "itemsInfoDescribe");
            return (Criteria) this;
        }

        public Criteria andItemsInfoDescribeGreaterThan(String value) {
            addCriterion("ITEMS_INFO_DESCRIBE >", value, "itemsInfoDescribe");
            return (Criteria) this;
        }

        public Criteria andItemsInfoDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMS_INFO_DESCRIBE >=", value, "itemsInfoDescribe");
            return (Criteria) this;
        }

        public Criteria andItemsInfoDescribeLessThan(String value) {
            addCriterion("ITEMS_INFO_DESCRIBE <", value, "itemsInfoDescribe");
            return (Criteria) this;
        }

        public Criteria andItemsInfoDescribeLessThanOrEqualTo(String value) {
            addCriterion("ITEMS_INFO_DESCRIBE <=", value, "itemsInfoDescribe");
            return (Criteria) this;
        }

        public Criteria andItemsInfoDescribeLike(String value) {
            addCriterion("ITEMS_INFO_DESCRIBE like", value, "itemsInfoDescribe");
            return (Criteria) this;
        }

        public Criteria andItemsInfoDescribeNotLike(String value) {
            addCriterion("ITEMS_INFO_DESCRIBE not like", value, "itemsInfoDescribe");
            return (Criteria) this;
        }

        public Criteria andItemsInfoDescribeIn(List<String> values) {
            addCriterion("ITEMS_INFO_DESCRIBE in", values, "itemsInfoDescribe");
            return (Criteria) this;
        }

        public Criteria andItemsInfoDescribeNotIn(List<String> values) {
            addCriterion("ITEMS_INFO_DESCRIBE not in", values, "itemsInfoDescribe");
            return (Criteria) this;
        }

        public Criteria andItemsInfoDescribeBetween(String value1, String value2) {
            addCriterion("ITEMS_INFO_DESCRIBE between", value1, value2, "itemsInfoDescribe");
            return (Criteria) this;
        }

        public Criteria andItemsInfoDescribeNotBetween(String value1, String value2) {
            addCriterion("ITEMS_INFO_DESCRIBE not between", value1, value2, "itemsInfoDescribe");
            return (Criteria) this;
        }

        public Criteria andItemsReviewIsNull() {
            addCriterion("ITEMS_REVIEW is null");
            return (Criteria) this;
        }

        public Criteria andItemsReviewIsNotNull() {
            addCriterion("ITEMS_REVIEW is not null");
            return (Criteria) this;
        }

        public Criteria andItemsReviewEqualTo(String value) {
            addCriterion("ITEMS_REVIEW =", value, "itemsReview");
            return (Criteria) this;
        }

        public Criteria andItemsReviewNotEqualTo(String value) {
            addCriterion("ITEMS_REVIEW <>", value, "itemsReview");
            return (Criteria) this;
        }

        public Criteria andItemsReviewGreaterThan(String value) {
            addCriterion("ITEMS_REVIEW >", value, "itemsReview");
            return (Criteria) this;
        }

        public Criteria andItemsReviewGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMS_REVIEW >=", value, "itemsReview");
            return (Criteria) this;
        }

        public Criteria andItemsReviewLessThan(String value) {
            addCriterion("ITEMS_REVIEW <", value, "itemsReview");
            return (Criteria) this;
        }

        public Criteria andItemsReviewLessThanOrEqualTo(String value) {
            addCriterion("ITEMS_REVIEW <=", value, "itemsReview");
            return (Criteria) this;
        }

        public Criteria andItemsReviewLike(String value) {
            addCriterion("ITEMS_REVIEW like", value, "itemsReview");
            return (Criteria) this;
        }

        public Criteria andItemsReviewNotLike(String value) {
            addCriterion("ITEMS_REVIEW not like", value, "itemsReview");
            return (Criteria) this;
        }

        public Criteria andItemsReviewIn(List<String> values) {
            addCriterion("ITEMS_REVIEW in", values, "itemsReview");
            return (Criteria) this;
        }

        public Criteria andItemsReviewNotIn(List<String> values) {
            addCriterion("ITEMS_REVIEW not in", values, "itemsReview");
            return (Criteria) this;
        }

        public Criteria andItemsReviewBetween(String value1, String value2) {
            addCriterion("ITEMS_REVIEW between", value1, value2, "itemsReview");
            return (Criteria) this;
        }

        public Criteria andItemsReviewNotBetween(String value1, String value2) {
            addCriterion("ITEMS_REVIEW not between", value1, value2, "itemsReview");
            return (Criteria) this;
        }

        public Criteria andItemsLocationIsNull() {
            addCriterion("ITEMS_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andItemsLocationIsNotNull() {
            addCriterion("ITEMS_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andItemsLocationEqualTo(String value) {
            addCriterion("ITEMS_LOCATION =", value, "itemsLocation");
            return (Criteria) this;
        }

        public Criteria andItemsLocationNotEqualTo(String value) {
            addCriterion("ITEMS_LOCATION <>", value, "itemsLocation");
            return (Criteria) this;
        }

        public Criteria andItemsLocationGreaterThan(String value) {
            addCriterion("ITEMS_LOCATION >", value, "itemsLocation");
            return (Criteria) this;
        }

        public Criteria andItemsLocationGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMS_LOCATION >=", value, "itemsLocation");
            return (Criteria) this;
        }

        public Criteria andItemsLocationLessThan(String value) {
            addCriterion("ITEMS_LOCATION <", value, "itemsLocation");
            return (Criteria) this;
        }

        public Criteria andItemsLocationLessThanOrEqualTo(String value) {
            addCriterion("ITEMS_LOCATION <=", value, "itemsLocation");
            return (Criteria) this;
        }

        public Criteria andItemsLocationLike(String value) {
            addCriterion("ITEMS_LOCATION like", value, "itemsLocation");
            return (Criteria) this;
        }

        public Criteria andItemsLocationNotLike(String value) {
            addCriterion("ITEMS_LOCATION not like", value, "itemsLocation");
            return (Criteria) this;
        }

        public Criteria andItemsLocationIn(List<String> values) {
            addCriterion("ITEMS_LOCATION in", values, "itemsLocation");
            return (Criteria) this;
        }

        public Criteria andItemsLocationNotIn(List<String> values) {
            addCriterion("ITEMS_LOCATION not in", values, "itemsLocation");
            return (Criteria) this;
        }

        public Criteria andItemsLocationBetween(String value1, String value2) {
            addCriterion("ITEMS_LOCATION between", value1, value2, "itemsLocation");
            return (Criteria) this;
        }

        public Criteria andItemsLocationNotBetween(String value1, String value2) {
            addCriterion("ITEMS_LOCATION not between", value1, value2, "itemsLocation");
            return (Criteria) this;
        }

        public Criteria andItemsLocationTimeIsNull() {
            addCriterion("ITEMS_LOCATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andItemsLocationTimeIsNotNull() {
            addCriterion("ITEMS_LOCATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andItemsLocationTimeEqualTo(String value) {
            addCriterion("ITEMS_LOCATION_TIME =", value, "itemsLocationTime");
            return (Criteria) this;
        }

        public Criteria andItemsLocationTimeNotEqualTo(String value) {
            addCriterion("ITEMS_LOCATION_TIME <>", value, "itemsLocationTime");
            return (Criteria) this;
        }

        public Criteria andItemsLocationTimeGreaterThan(String value) {
            addCriterion("ITEMS_LOCATION_TIME >", value, "itemsLocationTime");
            return (Criteria) this;
        }

        public Criteria andItemsLocationTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMS_LOCATION_TIME >=", value, "itemsLocationTime");
            return (Criteria) this;
        }

        public Criteria andItemsLocationTimeLessThan(String value) {
            addCriterion("ITEMS_LOCATION_TIME <", value, "itemsLocationTime");
            return (Criteria) this;
        }

        public Criteria andItemsLocationTimeLessThanOrEqualTo(String value) {
            addCriterion("ITEMS_LOCATION_TIME <=", value, "itemsLocationTime");
            return (Criteria) this;
        }

        public Criteria andItemsLocationTimeLike(String value) {
            addCriterion("ITEMS_LOCATION_TIME like", value, "itemsLocationTime");
            return (Criteria) this;
        }

        public Criteria andItemsLocationTimeNotLike(String value) {
            addCriterion("ITEMS_LOCATION_TIME not like", value, "itemsLocationTime");
            return (Criteria) this;
        }

        public Criteria andItemsLocationTimeIn(List<String> values) {
            addCriterion("ITEMS_LOCATION_TIME in", values, "itemsLocationTime");
            return (Criteria) this;
        }

        public Criteria andItemsLocationTimeNotIn(List<String> values) {
            addCriterion("ITEMS_LOCATION_TIME not in", values, "itemsLocationTime");
            return (Criteria) this;
        }

        public Criteria andItemsLocationTimeBetween(String value1, String value2) {
            addCriterion("ITEMS_LOCATION_TIME between", value1, value2, "itemsLocationTime");
            return (Criteria) this;
        }

        public Criteria andItemsLocationTimeNotBetween(String value1, String value2) {
            addCriterion("ITEMS_LOCATION_TIME not between", value1, value2, "itemsLocationTime");
            return (Criteria) this;
        }

        public Criteria andItemsStateIsNull() {
            addCriterion("ITEMS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andItemsStateIsNotNull() {
            addCriterion("ITEMS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andItemsStateEqualTo(String value) {
            addCriterion("ITEMS_STATE =", value, "itemsState");
            return (Criteria) this;
        }

        public Criteria andItemsStateNotEqualTo(String value) {
            addCriterion("ITEMS_STATE <>", value, "itemsState");
            return (Criteria) this;
        }

        public Criteria andItemsStateGreaterThan(String value) {
            addCriterion("ITEMS_STATE >", value, "itemsState");
            return (Criteria) this;
        }

        public Criteria andItemsStateGreaterThanOrEqualTo(String value) {
            addCriterion("ITEMS_STATE >=", value, "itemsState");
            return (Criteria) this;
        }

        public Criteria andItemsStateLessThan(String value) {
            addCriterion("ITEMS_STATE <", value, "itemsState");
            return (Criteria) this;
        }

        public Criteria andItemsStateLessThanOrEqualTo(String value) {
            addCriterion("ITEMS_STATE <=", value, "itemsState");
            return (Criteria) this;
        }

        public Criteria andItemsStateLike(String value) {
            addCriterion("ITEMS_STATE like", value, "itemsState");
            return (Criteria) this;
        }

        public Criteria andItemsStateNotLike(String value) {
            addCriterion("ITEMS_STATE not like", value, "itemsState");
            return (Criteria) this;
        }

        public Criteria andItemsStateIn(List<String> values) {
            addCriterion("ITEMS_STATE in", values, "itemsState");
            return (Criteria) this;
        }

        public Criteria andItemsStateNotIn(List<String> values) {
            addCriterion("ITEMS_STATE not in", values, "itemsState");
            return (Criteria) this;
        }

        public Criteria andItemsStateBetween(String value1, String value2) {
            addCriterion("ITEMS_STATE between", value1, value2, "itemsState");
            return (Criteria) this;
        }

        public Criteria andItemsStateNotBetween(String value1, String value2) {
            addCriterion("ITEMS_STATE not between", value1, value2, "itemsState");
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