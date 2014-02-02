package com.probridge.vbox.dao;

import com.probridge.vbox.model.VM;
import com.probridge.vbox.model.VMExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VMMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table virtual_machines
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int countByExample(VMExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table virtual_machines
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int deleteByExample(VMExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table virtual_machines
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int deleteByPrimaryKey(String vmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table virtual_machines
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int insert(VM record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table virtual_machines
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int insertSelective(VM record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table virtual_machines
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    List<VM> selectByExample(VMExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table virtual_machines
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    VM selectByPrimaryKey(String vmId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table virtual_machines
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int updateByExampleSelective(@Param("record") VM record, @Param("example") VMExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table virtual_machines
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int updateByExample(@Param("record") VM record, @Param("example") VMExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table virtual_machines
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int updateByPrimaryKeySelective(VM record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table virtual_machines
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    int updateByPrimaryKey(VM record);
}