package com.mapper;

import com.bean.MarketQuotaPeriodSummary;
import com.bean.MarketQuotaPeriodSummaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketQuotaPeriodSummaryMapper {
    /**
     *
     * @mbg.generated 2022-03-22
     */
    long countByExample(MarketQuotaPeriodSummaryExample example);

    /**
     *
     * @mbg.generated 2022-03-22
     */
    int deleteByExample(MarketQuotaPeriodSummaryExample example);

    /**
     *
     * @mbg.generated 2022-03-22
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2022-03-22
     */
    int insert(MarketQuotaPeriodSummary record);

    /**
     *
     * @mbg.generated 2022-03-22
     */
    int insertSelective(MarketQuotaPeriodSummary record);

    /**
     *
     * @mbg.generated 2022-03-22
     */
    List<MarketQuotaPeriodSummary> selectByExample(MarketQuotaPeriodSummaryExample example);

    /**
     *
     * @mbg.generated 2022-03-22
     */
    MarketQuotaPeriodSummary selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2022-03-22
     */
    int updateByExampleSelective(@Param("record") MarketQuotaPeriodSummary record, @Param("example") MarketQuotaPeriodSummaryExample example);

    /**
     *
     * @mbg.generated 2022-03-22
     */
    int updateByExample(@Param("record") MarketQuotaPeriodSummary record, @Param("example") MarketQuotaPeriodSummaryExample example);

    /**
     *
     * @mbg.generated 2022-03-22
     */
    int updateByPrimaryKeySelective(MarketQuotaPeriodSummary record);

    /**
     *
     * @mbg.generated 2022-03-22
     */
    int updateByPrimaryKey(MarketQuotaPeriodSummary record);
}