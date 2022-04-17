package com.etc.onlineordering.dao;

import com.etc.onlineordering.entity.Cart;
import java.util.List;

public interface CartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Sun Nov 28 19:30:49 GMT+08:00 2021
     */
    int deleteByPrimaryKey(Integer cartid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Sun Nov 28 19:30:49 GMT+08:00 2021
     */
    int insert(Cart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Sun Nov 28 19:30:49 GMT+08:00 2021
     */
    Cart selectByPrimaryKey(Integer cartid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Sun Nov 28 19:30:49 GMT+08:00 2021
     */
    List<Cart> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cart
     *
     * @mbg.generated Sun Nov 28 19:30:49 GMT+08:00 2021
     */
    int updateByPrimaryKey(Cart record);
}