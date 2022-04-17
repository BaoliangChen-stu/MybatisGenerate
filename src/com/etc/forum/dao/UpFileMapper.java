package com.etc.forum.dao;

import com.etc.forum.entity.UpFile;
import java.util.List;

public interface UpFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_upfile
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_upfile
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    int insert(UpFile record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_upfile
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    UpFile selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_upfile
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    List<UpFile> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table f_upfile
     *
     * @mbg.generated Fri Mar 25 11:38:56 GMT+08:00 2022
     */
    int updateByPrimaryKey(UpFile record);
}