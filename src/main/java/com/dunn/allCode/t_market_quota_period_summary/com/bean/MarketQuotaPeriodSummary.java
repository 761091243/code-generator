package com.bean;

import java.util.Date;

public class MarketQuotaPeriodSummary {
    /**
     * 
     */
    private Integer id;

    /**
     * 商户编号
     */
    private String merchantId;

    /**
     * 商户简称
     */
    private String merchantName;

    /**
     * 一代代理商编号
     */
    private String agentId1g;

    /**
     * 一代代理商名称
     */
    private String agentId1gName;

    /**
     * 直属代理商编号
     */
    private String agentId;

    /**
     * 额度包周期，比如202007表示七月份的额度包
     */
    private String period;

    /**
     * 额度包周期类型：1-自认月；2-跨月
     */
    private Boolean quotaPeriodType;

    /**
     * 周期开始日期
     */
    private Date periodBeginDate;

    /**
     * 周期结束日期
     */
    private Date periodEndDate;

    /**
     * 活动编号
     */
    private String activityId;

    /**
     * 银行编号
     */
    private String bankCode;

    /**
     * 所属推广员id
     */
    private Integer promoterId;

    /**
     * 交易总额(单位：分)
     */
    private Long sumAmount;

    /**
     * 已充值额度包(单位：分)
     */
    private Long sumRechargedQuota;

    /**
     * 当前额度包周期额度包剩余额度(单位：分)
     */
    private Long quotaBalance;

    /**
     * 银行手续费补贴总额（单位：万分之一分）
     */
    private Long sumBankSubsidyFee;

    /**
     * 统计额度包扣减总额（单位：万分之一分）
     */
    private Long sumQuotaDeduction;

    /**
     * 补贴出款总额(单位：分)
     */
    private Long sumSubsidyDisbursement;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 
     * @return F_id 
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 商户编号
     * @return F_merchant_id 商户编号
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * 商户编号
     * @param merchantId 商户编号
     */
    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    /**
     * 商户简称
     * @return F_merchant_name 商户简称
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * 商户简称
     * @param merchantName 商户简称
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    /**
     * 一代代理商编号
     * @return F_agent_id_1g 一代代理商编号
     */
    public String getAgentId1g() {
        return agentId1g;
    }

    /**
     * 一代代理商编号
     * @param agentId1g 一代代理商编号
     */
    public void setAgentId1g(String agentId1g) {
        this.agentId1g = agentId1g;
    }

    /**
     * 一代代理商名称
     * @return F_agent_id_1g_name 一代代理商名称
     */
    public String getAgentId1gName() {
        return agentId1gName;
    }

    /**
     * 一代代理商名称
     * @param agentId1gName 一代代理商名称
     */
    public void setAgentId1gName(String agentId1gName) {
        this.agentId1gName = agentId1gName;
    }

    /**
     * 直属代理商编号
     * @return F_agent_id 直属代理商编号
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * 直属代理商编号
     * @param agentId 直属代理商编号
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    /**
     * 额度包周期，比如202007表示七月份的额度包
     * @return F_period 额度包周期，比如202007表示七月份的额度包
     */
    public String getPeriod() {
        return period;
    }

    /**
     * 额度包周期，比如202007表示七月份的额度包
     * @param period 额度包周期，比如202007表示七月份的额度包
     */
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * 额度包周期类型：1-自认月；2-跨月
     * @return F_quota_period_type 额度包周期类型：1-自认月；2-跨月
     */
    public Boolean getQuotaPeriodType() {
        return quotaPeriodType;
    }

    /**
     * 额度包周期类型：1-自认月；2-跨月
     * @param quotaPeriodType 额度包周期类型：1-自认月；2-跨月
     */
    public void setQuotaPeriodType(Boolean quotaPeriodType) {
        this.quotaPeriodType = quotaPeriodType;
    }

    /**
     * 周期开始日期
     * @return F_period_begin_date 周期开始日期
     */
    public Date getPeriodBeginDate() {
        return periodBeginDate;
    }

    /**
     * 周期开始日期
     * @param periodBeginDate 周期开始日期
     */
    public void setPeriodBeginDate(Date periodBeginDate) {
        this.periodBeginDate = periodBeginDate;
    }

    /**
     * 周期结束日期
     * @return F_period_end_date 周期结束日期
     */
    public Date getPeriodEndDate() {
        return periodEndDate;
    }

    /**
     * 周期结束日期
     * @param periodEndDate 周期结束日期
     */
    public void setPeriodEndDate(Date periodEndDate) {
        this.periodEndDate = periodEndDate;
    }

    /**
     * 活动编号
     * @return F_activity_id 活动编号
     */
    public String getActivityId() {
        return activityId;
    }

    /**
     * 活动编号
     * @param activityId 活动编号
     */
    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    /**
     * 银行编号
     * @return F_bank_code 银行编号
     */
    public String getBankCode() {
        return bankCode;
    }

    /**
     * 银行编号
     * @param bankCode 银行编号
     */
    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    /**
     * 所属推广员id
     * @return F_promoter_id 所属推广员id
     */
    public Integer getPromoterId() {
        return promoterId;
    }

    /**
     * 所属推广员id
     * @param promoterId 所属推广员id
     */
    public void setPromoterId(Integer promoterId) {
        this.promoterId = promoterId;
    }

    /**
     * 交易总额(单位：分)
     * @return F_sum_amount 交易总额(单位：分)
     */
    public Long getSumAmount() {
        return sumAmount;
    }

    /**
     * 交易总额(单位：分)
     * @param sumAmount 交易总额(单位：分)
     */
    public void setSumAmount(Long sumAmount) {
        this.sumAmount = sumAmount;
    }

    /**
     * 已充值额度包(单位：分)
     * @return F_sum_recharged_quota 已充值额度包(单位：分)
     */
    public Long getSumRechargedQuota() {
        return sumRechargedQuota;
    }

    /**
     * 已充值额度包(单位：分)
     * @param sumRechargedQuota 已充值额度包(单位：分)
     */
    public void setSumRechargedQuota(Long sumRechargedQuota) {
        this.sumRechargedQuota = sumRechargedQuota;
    }

    /**
     * 当前额度包周期额度包剩余额度(单位：分)
     * @return F_quota_balance 当前额度包周期额度包剩余额度(单位：分)
     */
    public Long getQuotaBalance() {
        return quotaBalance;
    }

    /**
     * 当前额度包周期额度包剩余额度(单位：分)
     * @param quotaBalance 当前额度包周期额度包剩余额度(单位：分)
     */
    public void setQuotaBalance(Long quotaBalance) {
        this.quotaBalance = quotaBalance;
    }

    /**
     * 银行手续费补贴总额（单位：万分之一分）
     * @return F_sum_bank_subsidy_fee 银行手续费补贴总额（单位：万分之一分）
     */
    public Long getSumBankSubsidyFee() {
        return sumBankSubsidyFee;
    }

    /**
     * 银行手续费补贴总额（单位：万分之一分）
     * @param sumBankSubsidyFee 银行手续费补贴总额（单位：万分之一分）
     */
    public void setSumBankSubsidyFee(Long sumBankSubsidyFee) {
        this.sumBankSubsidyFee = sumBankSubsidyFee;
    }

    /**
     * 统计额度包扣减总额（单位：万分之一分）
     * @return F_sum_quota_deduction 统计额度包扣减总额（单位：万分之一分）
     */
    public Long getSumQuotaDeduction() {
        return sumQuotaDeduction;
    }

    /**
     * 统计额度包扣减总额（单位：万分之一分）
     * @param sumQuotaDeduction 统计额度包扣减总额（单位：万分之一分）
     */
    public void setSumQuotaDeduction(Long sumQuotaDeduction) {
        this.sumQuotaDeduction = sumQuotaDeduction;
    }

    /**
     * 补贴出款总额(单位：分)
     * @return F_sum_subsidy_disbursement 补贴出款总额(单位：分)
     */
    public Long getSumSubsidyDisbursement() {
        return sumSubsidyDisbursement;
    }

    /**
     * 补贴出款总额(单位：分)
     * @param sumSubsidyDisbursement 补贴出款总额(单位：分)
     */
    public void setSumSubsidyDisbursement(Long sumSubsidyDisbursement) {
        this.sumSubsidyDisbursement = sumSubsidyDisbursement;
    }

    /**
     * 创建时间
     * @return F_create_time 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     * @return F_update_time 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}