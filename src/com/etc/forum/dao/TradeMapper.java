package com.etc.forum.dao;

import com.etc.forum.entity.Trade;
import java.util.List;

public interface TradeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_trade
     *
     * @mbg.generated Sun Apr 17 13:32:33 GMT+08:00 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_trade
     *
     * @mbg.generated Sun Apr 17 13:32:33 GMT+08:00 2022
     */
    int insert(Trade record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_trade
     *
     * @mbg.generated Sun Apr 17 13:32:33 GMT+08:00 2022
     */
    Trade selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_trade
     *
     * @mbg.generated Sun Apr 17 13:32:33 GMT+08:00 2022
     */
    List<Trade> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_trade
     *
     * @mbg.generated Sun Apr 17 13:32:33 GMT+08:00 2022
     */
    int updateByPrimaryKey(Trade record);
}