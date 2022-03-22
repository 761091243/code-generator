package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MarketQuotaPeriodSummaryExample {
    /**
     * t_market_quota_period_summary
     */
    protected String orderByClause;

    /**
     * t_market_quota_period_summary
     */
    protected boolean distinct;

    /**
     * t_market_quota_period_summary
     */
    protected List<Criteria> oredCriteria;

    /**
     *
     * @mbg.generated 2022-03-22
     */
    public MarketQuotaPeriodSummaryExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *
     * @mbg.generated 2022-03-22
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *
     * @mbg.generated 2022-03-22
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *
     * @mbg.generated 2022-03-22
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *
     * @mbg.generated 2022-03-22
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *
     * @mbg.generated 2022-03-22
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     *
     * @mbg.generated 2022-03-22
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     *
     * @mbg.generated 2022-03-22
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *
     * @mbg.generated 2022-03-22
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *
     * @mbg.generated 2022-03-22
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *
     * @mbg.generated 2022-03-22
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * t_market_quota_period_summary 2022-03-22
     */
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("F_id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("F_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("F_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("F_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("F_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("F_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("F_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("F_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("F_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("F_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("F_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNull() {
            addCriterion("F_merchant_id is null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIsNotNull() {
            addCriterion("F_merchant_id is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantIdEqualTo(String value) {
            addCriterion("F_merchant_id =", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotEqualTo(String value) {
            addCriterion("F_merchant_id <>", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThan(String value) {
            addCriterion("F_merchant_id >", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_merchant_id >=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThan(String value) {
            addCriterion("F_merchant_id <", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLessThanOrEqualTo(String value) {
            addCriterion("F_merchant_id <=", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdLike(String value) {
            addCriterion("F_merchant_id like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotLike(String value) {
            addCriterion("F_merchant_id not like", value, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdIn(List<String> values) {
            addCriterion("F_merchant_id in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotIn(List<String> values) {
            addCriterion("F_merchant_id not in", values, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdBetween(String value1, String value2) {
            addCriterion("F_merchant_id between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantIdNotBetween(String value1, String value2) {
            addCriterion("F_merchant_id not between", value1, value2, "merchantId");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNull() {
            addCriterion("F_merchant_name is null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIsNotNull() {
            addCriterion("F_merchant_name is not null");
            return (Criteria) this;
        }

        public Criteria andMerchantNameEqualTo(String value) {
            addCriterion("F_merchant_name =", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotEqualTo(String value) {
            addCriterion("F_merchant_name <>", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThan(String value) {
            addCriterion("F_merchant_name >", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_merchant_name >=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThan(String value) {
            addCriterion("F_merchant_name <", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLessThanOrEqualTo(String value) {
            addCriterion("F_merchant_name <=", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameLike(String value) {
            addCriterion("F_merchant_name like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotLike(String value) {
            addCriterion("F_merchant_name not like", value, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameIn(List<String> values) {
            addCriterion("F_merchant_name in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotIn(List<String> values) {
            addCriterion("F_merchant_name not in", values, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameBetween(String value1, String value2) {
            addCriterion("F_merchant_name between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andMerchantNameNotBetween(String value1, String value2) {
            addCriterion("F_merchant_name not between", value1, value2, "merchantName");
            return (Criteria) this;
        }

        public Criteria andAgentId1gIsNull() {
            addCriterion("F_agent_id_1g is null");
            return (Criteria) this;
        }

        public Criteria andAgentId1gIsNotNull() {
            addCriterion("F_agent_id_1g is not null");
            return (Criteria) this;
        }

        public Criteria andAgentId1gEqualTo(String value) {
            addCriterion("F_agent_id_1g =", value, "agentId1g");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNotEqualTo(String value) {
            addCriterion("F_agent_id_1g <>", value, "agentId1g");
            return (Criteria) this;
        }

        public Criteria andAgentId1gGreaterThan(String value) {
            addCriterion("F_agent_id_1g >", value, "agentId1g");
            return (Criteria) this;
        }

        public Criteria andAgentId1gGreaterThanOrEqualTo(String value) {
            addCriterion("F_agent_id_1g >=", value, "agentId1g");
            return (Criteria) this;
        }

        public Criteria andAgentId1gLessThan(String value) {
            addCriterion("F_agent_id_1g <", value, "agentId1g");
            return (Criteria) this;
        }

        public Criteria andAgentId1gLessThanOrEqualTo(String value) {
            addCriterion("F_agent_id_1g <=", value, "agentId1g");
            return (Criteria) this;
        }

        public Criteria andAgentId1gLike(String value) {
            addCriterion("F_agent_id_1g like", value, "agentId1g");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNotLike(String value) {
            addCriterion("F_agent_id_1g not like", value, "agentId1g");
            return (Criteria) this;
        }

        public Criteria andAgentId1gIn(List<String> values) {
            addCriterion("F_agent_id_1g in", values, "agentId1g");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNotIn(List<String> values) {
            addCriterion("F_agent_id_1g not in", values, "agentId1g");
            return (Criteria) this;
        }

        public Criteria andAgentId1gBetween(String value1, String value2) {
            addCriterion("F_agent_id_1g between", value1, value2, "agentId1g");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNotBetween(String value1, String value2) {
            addCriterion("F_agent_id_1g not between", value1, value2, "agentId1g");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNameIsNull() {
            addCriterion("F_agent_id_1g_name is null");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNameIsNotNull() {
            addCriterion("F_agent_id_1g_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNameEqualTo(String value) {
            addCriterion("F_agent_id_1g_name =", value, "agentId1gName");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNameNotEqualTo(String value) {
            addCriterion("F_agent_id_1g_name <>", value, "agentId1gName");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNameGreaterThan(String value) {
            addCriterion("F_agent_id_1g_name >", value, "agentId1gName");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_agent_id_1g_name >=", value, "agentId1gName");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNameLessThan(String value) {
            addCriterion("F_agent_id_1g_name <", value, "agentId1gName");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNameLessThanOrEqualTo(String value) {
            addCriterion("F_agent_id_1g_name <=", value, "agentId1gName");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNameLike(String value) {
            addCriterion("F_agent_id_1g_name like", value, "agentId1gName");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNameNotLike(String value) {
            addCriterion("F_agent_id_1g_name not like", value, "agentId1gName");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNameIn(List<String> values) {
            addCriterion("F_agent_id_1g_name in", values, "agentId1gName");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNameNotIn(List<String> values) {
            addCriterion("F_agent_id_1g_name not in", values, "agentId1gName");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNameBetween(String value1, String value2) {
            addCriterion("F_agent_id_1g_name between", value1, value2, "agentId1gName");
            return (Criteria) this;
        }

        public Criteria andAgentId1gNameNotBetween(String value1, String value2) {
            addCriterion("F_agent_id_1g_name not between", value1, value2, "agentId1gName");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNull() {
            addCriterion("F_agent_id is null");
            return (Criteria) this;
        }

        public Criteria andAgentIdIsNotNull() {
            addCriterion("F_agent_id is not null");
            return (Criteria) this;
        }

        public Criteria andAgentIdEqualTo(String value) {
            addCriterion("F_agent_id =", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotEqualTo(String value) {
            addCriterion("F_agent_id <>", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThan(String value) {
            addCriterion("F_agent_id >", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_agent_id >=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThan(String value) {
            addCriterion("F_agent_id <", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLessThanOrEqualTo(String value) {
            addCriterion("F_agent_id <=", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdLike(String value) {
            addCriterion("F_agent_id like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotLike(String value) {
            addCriterion("F_agent_id not like", value, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdIn(List<String> values) {
            addCriterion("F_agent_id in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotIn(List<String> values) {
            addCriterion("F_agent_id not in", values, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdBetween(String value1, String value2) {
            addCriterion("F_agent_id between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andAgentIdNotBetween(String value1, String value2) {
            addCriterion("F_agent_id not between", value1, value2, "agentId");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNull() {
            addCriterion("F_period is null");
            return (Criteria) this;
        }

        public Criteria andPeriodIsNotNull() {
            addCriterion("F_period is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEqualTo(String value) {
            addCriterion("F_period =", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotEqualTo(String value) {
            addCriterion("F_period <>", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThan(String value) {
            addCriterion("F_period >", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodGreaterThanOrEqualTo(String value) {
            addCriterion("F_period >=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThan(String value) {
            addCriterion("F_period <", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLessThanOrEqualTo(String value) {
            addCriterion("F_period <=", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodLike(String value) {
            addCriterion("F_period like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotLike(String value) {
            addCriterion("F_period not like", value, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodIn(List<String> values) {
            addCriterion("F_period in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotIn(List<String> values) {
            addCriterion("F_period not in", values, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodBetween(String value1, String value2) {
            addCriterion("F_period between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andPeriodNotBetween(String value1, String value2) {
            addCriterion("F_period not between", value1, value2, "period");
            return (Criteria) this;
        }

        public Criteria andQuotaPeriodTypeIsNull() {
            addCriterion("F_quota_period_type is null");
            return (Criteria) this;
        }

        public Criteria andQuotaPeriodTypeIsNotNull() {
            addCriterion("F_quota_period_type is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaPeriodTypeEqualTo(Boolean value) {
            addCriterion("F_quota_period_type =", value, "quotaPeriodType");
            return (Criteria) this;
        }

        public Criteria andQuotaPeriodTypeNotEqualTo(Boolean value) {
            addCriterion("F_quota_period_type <>", value, "quotaPeriodType");
            return (Criteria) this;
        }

        public Criteria andQuotaPeriodTypeGreaterThan(Boolean value) {
            addCriterion("F_quota_period_type >", value, "quotaPeriodType");
            return (Criteria) this;
        }

        public Criteria andQuotaPeriodTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("F_quota_period_type >=", value, "quotaPeriodType");
            return (Criteria) this;
        }

        public Criteria andQuotaPeriodTypeLessThan(Boolean value) {
            addCriterion("F_quota_period_type <", value, "quotaPeriodType");
            return (Criteria) this;
        }

        public Criteria andQuotaPeriodTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("F_quota_period_type <=", value, "quotaPeriodType");
            return (Criteria) this;
        }

        public Criteria andQuotaPeriodTypeIn(List<Boolean> values) {
            addCriterion("F_quota_period_type in", values, "quotaPeriodType");
            return (Criteria) this;
        }

        public Criteria andQuotaPeriodTypeNotIn(List<Boolean> values) {
            addCriterion("F_quota_period_type not in", values, "quotaPeriodType");
            return (Criteria) this;
        }

        public Criteria andQuotaPeriodTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("F_quota_period_type between", value1, value2, "quotaPeriodType");
            return (Criteria) this;
        }

        public Criteria andQuotaPeriodTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("F_quota_period_type not between", value1, value2, "quotaPeriodType");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginDateIsNull() {
            addCriterion("F_period_begin_date is null");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginDateIsNotNull() {
            addCriterion("F_period_begin_date is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginDateEqualTo(Date value) {
            addCriterionForJDBCDate("F_period_begin_date =", value, "periodBeginDate");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("F_period_begin_date <>", value, "periodBeginDate");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginDateGreaterThan(Date value) {
            addCriterionForJDBCDate("F_period_begin_date >", value, "periodBeginDate");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("F_period_begin_date >=", value, "periodBeginDate");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginDateLessThan(Date value) {
            addCriterionForJDBCDate("F_period_begin_date <", value, "periodBeginDate");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("F_period_begin_date <=", value, "periodBeginDate");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginDateIn(List<Date> values) {
            addCriterionForJDBCDate("F_period_begin_date in", values, "periodBeginDate");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("F_period_begin_date not in", values, "periodBeginDate");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("F_period_begin_date between", value1, value2, "periodBeginDate");
            return (Criteria) this;
        }

        public Criteria andPeriodBeginDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("F_period_begin_date not between", value1, value2, "periodBeginDate");
            return (Criteria) this;
        }

        public Criteria andPeriodEndDateIsNull() {
            addCriterion("F_period_end_date is null");
            return (Criteria) this;
        }

        public Criteria andPeriodEndDateIsNotNull() {
            addCriterion("F_period_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("F_period_end_date =", value, "periodEndDate");
            return (Criteria) this;
        }

        public Criteria andPeriodEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("F_period_end_date <>", value, "periodEndDate");
            return (Criteria) this;
        }

        public Criteria andPeriodEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("F_period_end_date >", value, "periodEndDate");
            return (Criteria) this;
        }

        public Criteria andPeriodEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("F_period_end_date >=", value, "periodEndDate");
            return (Criteria) this;
        }

        public Criteria andPeriodEndDateLessThan(Date value) {
            addCriterionForJDBCDate("F_period_end_date <", value, "periodEndDate");
            return (Criteria) this;
        }

        public Criteria andPeriodEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("F_period_end_date <=", value, "periodEndDate");
            return (Criteria) this;
        }

        public Criteria andPeriodEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("F_period_end_date in", values, "periodEndDate");
            return (Criteria) this;
        }

        public Criteria andPeriodEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("F_period_end_date not in", values, "periodEndDate");
            return (Criteria) this;
        }

        public Criteria andPeriodEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("F_period_end_date between", value1, value2, "periodEndDate");
            return (Criteria) this;
        }

        public Criteria andPeriodEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("F_period_end_date not between", value1, value2, "periodEndDate");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("F_activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("F_activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(String value) {
            addCriterion("F_activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(String value) {
            addCriterion("F_activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(String value) {
            addCriterion("F_activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(String value) {
            addCriterion("F_activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(String value) {
            addCriterion("F_activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLike(String value) {
            addCriterion("F_activity_id like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotLike(String value) {
            addCriterion("F_activity_id not like", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<String> values) {
            addCriterion("F_activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<String> values) {
            addCriterion("F_activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(String value1, String value2) {
            addCriterion("F_activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(String value1, String value2) {
            addCriterion("F_activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNull() {
            addCriterion("F_bank_code is null");
            return (Criteria) this;
        }

        public Criteria andBankCodeIsNotNull() {
            addCriterion("F_bank_code is not null");
            return (Criteria) this;
        }

        public Criteria andBankCodeEqualTo(String value) {
            addCriterion("F_bank_code =", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotEqualTo(String value) {
            addCriterion("F_bank_code <>", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThan(String value) {
            addCriterion("F_bank_code >", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeGreaterThanOrEqualTo(String value) {
            addCriterion("F_bank_code >=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThan(String value) {
            addCriterion("F_bank_code <", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLessThanOrEqualTo(String value) {
            addCriterion("F_bank_code <=", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeLike(String value) {
            addCriterion("F_bank_code like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotLike(String value) {
            addCriterion("F_bank_code not like", value, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeIn(List<String> values) {
            addCriterion("F_bank_code in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotIn(List<String> values) {
            addCriterion("F_bank_code not in", values, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeBetween(String value1, String value2) {
            addCriterion("F_bank_code between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andBankCodeNotBetween(String value1, String value2) {
            addCriterion("F_bank_code not between", value1, value2, "bankCode");
            return (Criteria) this;
        }

        public Criteria andPromoterIdIsNull() {
            addCriterion("F_promoter_id is null");
            return (Criteria) this;
        }

        public Criteria andPromoterIdIsNotNull() {
            addCriterion("F_promoter_id is not null");
            return (Criteria) this;
        }

        public Criteria andPromoterIdEqualTo(Integer value) {
            addCriterion("F_promoter_id =", value, "promoterId");
            return (Criteria) this;
        }

        public Criteria andPromoterIdNotEqualTo(Integer value) {
            addCriterion("F_promoter_id <>", value, "promoterId");
            return (Criteria) this;
        }

        public Criteria andPromoterIdGreaterThan(Integer value) {
            addCriterion("F_promoter_id >", value, "promoterId");
            return (Criteria) this;
        }

        public Criteria andPromoterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_promoter_id >=", value, "promoterId");
            return (Criteria) this;
        }

        public Criteria andPromoterIdLessThan(Integer value) {
            addCriterion("F_promoter_id <", value, "promoterId");
            return (Criteria) this;
        }

        public Criteria andPromoterIdLessThanOrEqualTo(Integer value) {
            addCriterion("F_promoter_id <=", value, "promoterId");
            return (Criteria) this;
        }

        public Criteria andPromoterIdIn(List<Integer> values) {
            addCriterion("F_promoter_id in", values, "promoterId");
            return (Criteria) this;
        }

        public Criteria andPromoterIdNotIn(List<Integer> values) {
            addCriterion("F_promoter_id not in", values, "promoterId");
            return (Criteria) this;
        }

        public Criteria andPromoterIdBetween(Integer value1, Integer value2) {
            addCriterion("F_promoter_id between", value1, value2, "promoterId");
            return (Criteria) this;
        }

        public Criteria andPromoterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("F_promoter_id not between", value1, value2, "promoterId");
            return (Criteria) this;
        }

        public Criteria andSumAmountIsNull() {
            addCriterion("F_sum_amount is null");
            return (Criteria) this;
        }

        public Criteria andSumAmountIsNotNull() {
            addCriterion("F_sum_amount is not null");
            return (Criteria) this;
        }

        public Criteria andSumAmountEqualTo(Long value) {
            addCriterion("F_sum_amount =", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountNotEqualTo(Long value) {
            addCriterion("F_sum_amount <>", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountGreaterThan(Long value) {
            addCriterion("F_sum_amount >", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("F_sum_amount >=", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountLessThan(Long value) {
            addCriterion("F_sum_amount <", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountLessThanOrEqualTo(Long value) {
            addCriterion("F_sum_amount <=", value, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountIn(List<Long> values) {
            addCriterion("F_sum_amount in", values, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountNotIn(List<Long> values) {
            addCriterion("F_sum_amount not in", values, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountBetween(Long value1, Long value2) {
            addCriterion("F_sum_amount between", value1, value2, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumAmountNotBetween(Long value1, Long value2) {
            addCriterion("F_sum_amount not between", value1, value2, "sumAmount");
            return (Criteria) this;
        }

        public Criteria andSumRechargedQuotaIsNull() {
            addCriterion("F_sum_recharged_quota is null");
            return (Criteria) this;
        }

        public Criteria andSumRechargedQuotaIsNotNull() {
            addCriterion("F_sum_recharged_quota is not null");
            return (Criteria) this;
        }

        public Criteria andSumRechargedQuotaEqualTo(Long value) {
            addCriterion("F_sum_recharged_quota =", value, "sumRechargedQuota");
            return (Criteria) this;
        }

        public Criteria andSumRechargedQuotaNotEqualTo(Long value) {
            addCriterion("F_sum_recharged_quota <>", value, "sumRechargedQuota");
            return (Criteria) this;
        }

        public Criteria andSumRechargedQuotaGreaterThan(Long value) {
            addCriterion("F_sum_recharged_quota >", value, "sumRechargedQuota");
            return (Criteria) this;
        }

        public Criteria andSumRechargedQuotaGreaterThanOrEqualTo(Long value) {
            addCriterion("F_sum_recharged_quota >=", value, "sumRechargedQuota");
            return (Criteria) this;
        }

        public Criteria andSumRechargedQuotaLessThan(Long value) {
            addCriterion("F_sum_recharged_quota <", value, "sumRechargedQuota");
            return (Criteria) this;
        }

        public Criteria andSumRechargedQuotaLessThanOrEqualTo(Long value) {
            addCriterion("F_sum_recharged_quota <=", value, "sumRechargedQuota");
            return (Criteria) this;
        }

        public Criteria andSumRechargedQuotaIn(List<Long> values) {
            addCriterion("F_sum_recharged_quota in", values, "sumRechargedQuota");
            return (Criteria) this;
        }

        public Criteria andSumRechargedQuotaNotIn(List<Long> values) {
            addCriterion("F_sum_recharged_quota not in", values, "sumRechargedQuota");
            return (Criteria) this;
        }

        public Criteria andSumRechargedQuotaBetween(Long value1, Long value2) {
            addCriterion("F_sum_recharged_quota between", value1, value2, "sumRechargedQuota");
            return (Criteria) this;
        }

        public Criteria andSumRechargedQuotaNotBetween(Long value1, Long value2) {
            addCriterion("F_sum_recharged_quota not between", value1, value2, "sumRechargedQuota");
            return (Criteria) this;
        }

        public Criteria andQuotaBalanceIsNull() {
            addCriterion("F_quota_balance is null");
            return (Criteria) this;
        }

        public Criteria andQuotaBalanceIsNotNull() {
            addCriterion("F_quota_balance is not null");
            return (Criteria) this;
        }

        public Criteria andQuotaBalanceEqualTo(Long value) {
            addCriterion("F_quota_balance =", value, "quotaBalance");
            return (Criteria) this;
        }

        public Criteria andQuotaBalanceNotEqualTo(Long value) {
            addCriterion("F_quota_balance <>", value, "quotaBalance");
            return (Criteria) this;
        }

        public Criteria andQuotaBalanceGreaterThan(Long value) {
            addCriterion("F_quota_balance >", value, "quotaBalance");
            return (Criteria) this;
        }

        public Criteria andQuotaBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("F_quota_balance >=", value, "quotaBalance");
            return (Criteria) this;
        }

        public Criteria andQuotaBalanceLessThan(Long value) {
            addCriterion("F_quota_balance <", value, "quotaBalance");
            return (Criteria) this;
        }

        public Criteria andQuotaBalanceLessThanOrEqualTo(Long value) {
            addCriterion("F_quota_balance <=", value, "quotaBalance");
            return (Criteria) this;
        }

        public Criteria andQuotaBalanceIn(List<Long> values) {
            addCriterion("F_quota_balance in", values, "quotaBalance");
            return (Criteria) this;
        }

        public Criteria andQuotaBalanceNotIn(List<Long> values) {
            addCriterion("F_quota_balance not in", values, "quotaBalance");
            return (Criteria) this;
        }

        public Criteria andQuotaBalanceBetween(Long value1, Long value2) {
            addCriterion("F_quota_balance between", value1, value2, "quotaBalance");
            return (Criteria) this;
        }

        public Criteria andQuotaBalanceNotBetween(Long value1, Long value2) {
            addCriterion("F_quota_balance not between", value1, value2, "quotaBalance");
            return (Criteria) this;
        }

        public Criteria andSumBankSubsidyFeeIsNull() {
            addCriterion("F_sum_bank_subsidy_fee is null");
            return (Criteria) this;
        }

        public Criteria andSumBankSubsidyFeeIsNotNull() {
            addCriterion("F_sum_bank_subsidy_fee is not null");
            return (Criteria) this;
        }

        public Criteria andSumBankSubsidyFeeEqualTo(Long value) {
            addCriterion("F_sum_bank_subsidy_fee =", value, "sumBankSubsidyFee");
            return (Criteria) this;
        }

        public Criteria andSumBankSubsidyFeeNotEqualTo(Long value) {
            addCriterion("F_sum_bank_subsidy_fee <>", value, "sumBankSubsidyFee");
            return (Criteria) this;
        }

        public Criteria andSumBankSubsidyFeeGreaterThan(Long value) {
            addCriterion("F_sum_bank_subsidy_fee >", value, "sumBankSubsidyFee");
            return (Criteria) this;
        }

        public Criteria andSumBankSubsidyFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("F_sum_bank_subsidy_fee >=", value, "sumBankSubsidyFee");
            return (Criteria) this;
        }

        public Criteria andSumBankSubsidyFeeLessThan(Long value) {
            addCriterion("F_sum_bank_subsidy_fee <", value, "sumBankSubsidyFee");
            return (Criteria) this;
        }

        public Criteria andSumBankSubsidyFeeLessThanOrEqualTo(Long value) {
            addCriterion("F_sum_bank_subsidy_fee <=", value, "sumBankSubsidyFee");
            return (Criteria) this;
        }

        public Criteria andSumBankSubsidyFeeIn(List<Long> values) {
            addCriterion("F_sum_bank_subsidy_fee in", values, "sumBankSubsidyFee");
            return (Criteria) this;
        }

        public Criteria andSumBankSubsidyFeeNotIn(List<Long> values) {
            addCriterion("F_sum_bank_subsidy_fee not in", values, "sumBankSubsidyFee");
            return (Criteria) this;
        }

        public Criteria andSumBankSubsidyFeeBetween(Long value1, Long value2) {
            addCriterion("F_sum_bank_subsidy_fee between", value1, value2, "sumBankSubsidyFee");
            return (Criteria) this;
        }

        public Criteria andSumBankSubsidyFeeNotBetween(Long value1, Long value2) {
            addCriterion("F_sum_bank_subsidy_fee not between", value1, value2, "sumBankSubsidyFee");
            return (Criteria) this;
        }

        public Criteria andSumQuotaDeductionIsNull() {
            addCriterion("F_sum_quota_deduction is null");
            return (Criteria) this;
        }

        public Criteria andSumQuotaDeductionIsNotNull() {
            addCriterion("F_sum_quota_deduction is not null");
            return (Criteria) this;
        }

        public Criteria andSumQuotaDeductionEqualTo(Long value) {
            addCriterion("F_sum_quota_deduction =", value, "sumQuotaDeduction");
            return (Criteria) this;
        }

        public Criteria andSumQuotaDeductionNotEqualTo(Long value) {
            addCriterion("F_sum_quota_deduction <>", value, "sumQuotaDeduction");
            return (Criteria) this;
        }

        public Criteria andSumQuotaDeductionGreaterThan(Long value) {
            addCriterion("F_sum_quota_deduction >", value, "sumQuotaDeduction");
            return (Criteria) this;
        }

        public Criteria andSumQuotaDeductionGreaterThanOrEqualTo(Long value) {
            addCriterion("F_sum_quota_deduction >=", value, "sumQuotaDeduction");
            return (Criteria) this;
        }

        public Criteria andSumQuotaDeductionLessThan(Long value) {
            addCriterion("F_sum_quota_deduction <", value, "sumQuotaDeduction");
            return (Criteria) this;
        }

        public Criteria andSumQuotaDeductionLessThanOrEqualTo(Long value) {
            addCriterion("F_sum_quota_deduction <=", value, "sumQuotaDeduction");
            return (Criteria) this;
        }

        public Criteria andSumQuotaDeductionIn(List<Long> values) {
            addCriterion("F_sum_quota_deduction in", values, "sumQuotaDeduction");
            return (Criteria) this;
        }

        public Criteria andSumQuotaDeductionNotIn(List<Long> values) {
            addCriterion("F_sum_quota_deduction not in", values, "sumQuotaDeduction");
            return (Criteria) this;
        }

        public Criteria andSumQuotaDeductionBetween(Long value1, Long value2) {
            addCriterion("F_sum_quota_deduction between", value1, value2, "sumQuotaDeduction");
            return (Criteria) this;
        }

        public Criteria andSumQuotaDeductionNotBetween(Long value1, Long value2) {
            addCriterion("F_sum_quota_deduction not between", value1, value2, "sumQuotaDeduction");
            return (Criteria) this;
        }

        public Criteria andSumSubsidyDisbursementIsNull() {
            addCriterion("F_sum_subsidy_disbursement is null");
            return (Criteria) this;
        }

        public Criteria andSumSubsidyDisbursementIsNotNull() {
            addCriterion("F_sum_subsidy_disbursement is not null");
            return (Criteria) this;
        }

        public Criteria andSumSubsidyDisbursementEqualTo(Long value) {
            addCriterion("F_sum_subsidy_disbursement =", value, "sumSubsidyDisbursement");
            return (Criteria) this;
        }

        public Criteria andSumSubsidyDisbursementNotEqualTo(Long value) {
            addCriterion("F_sum_subsidy_disbursement <>", value, "sumSubsidyDisbursement");
            return (Criteria) this;
        }

        public Criteria andSumSubsidyDisbursementGreaterThan(Long value) {
            addCriterion("F_sum_subsidy_disbursement >", value, "sumSubsidyDisbursement");
            return (Criteria) this;
        }

        public Criteria andSumSubsidyDisbursementGreaterThanOrEqualTo(Long value) {
            addCriterion("F_sum_subsidy_disbursement >=", value, "sumSubsidyDisbursement");
            return (Criteria) this;
        }

        public Criteria andSumSubsidyDisbursementLessThan(Long value) {
            addCriterion("F_sum_subsidy_disbursement <", value, "sumSubsidyDisbursement");
            return (Criteria) this;
        }

        public Criteria andSumSubsidyDisbursementLessThanOrEqualTo(Long value) {
            addCriterion("F_sum_subsidy_disbursement <=", value, "sumSubsidyDisbursement");
            return (Criteria) this;
        }

        public Criteria andSumSubsidyDisbursementIn(List<Long> values) {
            addCriterion("F_sum_subsidy_disbursement in", values, "sumSubsidyDisbursement");
            return (Criteria) this;
        }

        public Criteria andSumSubsidyDisbursementNotIn(List<Long> values) {
            addCriterion("F_sum_subsidy_disbursement not in", values, "sumSubsidyDisbursement");
            return (Criteria) this;
        }

        public Criteria andSumSubsidyDisbursementBetween(Long value1, Long value2) {
            addCriterion("F_sum_subsidy_disbursement between", value1, value2, "sumSubsidyDisbursement");
            return (Criteria) this;
        }

        public Criteria andSumSubsidyDisbursementNotBetween(Long value1, Long value2) {
            addCriterion("F_sum_subsidy_disbursement not between", value1, value2, "sumSubsidyDisbursement");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("F_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("F_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("F_create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("F_create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("F_create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("F_create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("F_create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("F_create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("F_create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("F_create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("F_create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("F_update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("F_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("F_update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("F_update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("F_update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("F_update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("F_update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("F_update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("F_update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("F_update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("F_update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("F_update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     * t_market_quota_period_summary
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * t_market_quota_period_summary 2022-03-22
     */
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