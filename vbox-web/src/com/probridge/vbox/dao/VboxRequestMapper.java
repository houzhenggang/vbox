package com.probridge.vbox.dao;

import com.probridge.vbox.model.VboxRequest;
import com.probridge.vbox.model.VboxRequestExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VboxRequestMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vbox_request
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int countByExample(VboxRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vbox_request
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int deleteByExample(VboxRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vbox_request
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int deleteByPrimaryKey(Integer vboxRequestId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vbox_request
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int insert(VboxRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vbox_request
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int insertSelective(VboxRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vbox_request
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    List<VboxRequest> selectByExample(VboxRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vbox_request
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    VboxRequest selectByPrimaryKey(Integer vboxRequestId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vbox_request
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int updateByExampleSelective(@Param("record") VboxRequest record, @Param("example") VboxRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vbox_request
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int updateByExample(@Param("record") VboxRequest record, @Param("example") VboxRequestExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vbox_request
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int updateByPrimaryKeySelective(VboxRequest record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table vbox_request
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int updateByPrimaryKey(VboxRequest record);
}