package com.probridge.vbox.model;

import java.io.Serializable;
import java.util.Date;

public class Users implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_name
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_password
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String userPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_group
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String userGroup;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_description
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String userDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_role
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String userRole;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_type
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String userType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_enabled
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String userEnabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_expiration
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private Date userExpiration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_pwd_expire
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private Date userPwdExpire;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_hypervisor_id
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private Integer userHypervisorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_vhd_name
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String userVhdName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_vhd_quota
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private Integer userVhdQuota;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table users
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_name
     *
     * @return the value of users.user_name
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_name
     *
     * @param userName the value for users.user_name
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_password
     *
     * @return the value of users.user_password
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_password
     *
     * @param userPassword the value for users.user_password
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_group
     *
     * @return the value of users.user_group
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getUserGroup() {
        return userGroup;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_group
     *
     * @param userGroup the value for users.user_group
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup == null ? null : userGroup.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_description
     *
     * @return the value of users.user_description
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getUserDescription() {
        return userDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_description
     *
     * @param userDescription the value for users.user_description
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription == null ? null : userDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_role
     *
     * @return the value of users.user_role
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_role
     *
     * @param userRole the value for users.user_role
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_type
     *
     * @return the value of users.user_type
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getUserType() {
        return userType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_type
     *
     * @param userType the value for users.user_type
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_enabled
     *
     * @return the value of users.user_enabled
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getUserEnabled() {
        return userEnabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_enabled
     *
     * @param userEnabled the value for users.user_enabled
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setUserEnabled(String userEnabled) {
        this.userEnabled = userEnabled == null ? null : userEnabled.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_expiration
     *
     * @return the value of users.user_expiration
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public Date getUserExpiration() {
        return userExpiration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_expiration
     *
     * @param userExpiration the value for users.user_expiration
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setUserExpiration(Date userExpiration) {
        this.userExpiration = userExpiration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_pwd_expire
     *
     * @return the value of users.user_pwd_expire
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public Date getUserPwdExpire() {
        return userPwdExpire;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_pwd_expire
     *
     * @param userPwdExpire the value for users.user_pwd_expire
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setUserPwdExpire(Date userPwdExpire) {
        this.userPwdExpire = userPwdExpire;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_hypervisor_id
     *
     * @return the value of users.user_hypervisor_id
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public Integer getUserHypervisorId() {
        return userHypervisorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_hypervisor_id
     *
     * @param userHypervisorId the value for users.user_hypervisor_id
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setUserHypervisorId(Integer userHypervisorId) {
        this.userHypervisorId = userHypervisorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_vhd_name
     *
     * @return the value of users.user_vhd_name
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getUserVhdName() {
        return userVhdName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_vhd_name
     *
     * @param userVhdName the value for users.user_vhd_name
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setUserVhdName(String userVhdName) {
        this.userVhdName = userVhdName == null ? null : userVhdName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_vhd_quota
     *
     * @return the value of users.user_vhd_quota
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public Integer getUserVhdQuota() {
        return userVhdQuota;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_vhd_quota
     *
     * @param userVhdQuota the value for users.user_vhd_quota
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setUserVhdQuota(Integer userVhdQuota) {
        this.userVhdQuota = userVhdQuota;
    }
}