package com.etc.onlineordering.dao;

import com.etc.onlineordering.entity.Dishe;
import java.util.List;

public interface DisheMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dishe
     *
     * @mbg.generated Sun Nov 28 19:30:49 GMT+08:00 2021
     */
    int deleteByPrimaryKey(Integer disheid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dishe
     *
     * @mbg.generated Sun Nov 28 19:30:49 GMT+08:00 2021
     */
    int insert(Dishe record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dishe
     *
     * @mbg.generated Sun Nov 28 19:30:49 GMT+08:00 2021
     */
    Dishe selectByPrimaryKey(Integer disheid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dishe
     *
     * @mbg.generated Sun Nov 28 19:30:49 GMT+08:00 2021
     */
    List<Dishe> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dishe
     *
     * @mbg.generated Sun Nov 28 19:30:49 GMT+08:00 2021
     */
    int updateByPrimaryKey(Dishe record);
}