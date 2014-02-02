package com.probridge.vbox.model;

import java.io.Serializable;
import java.util.Date;

public class VM implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_id
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_type
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_course_code
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmCourseCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_name
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_title
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_description
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmDescription;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_preferred_course
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmPreferredCourse;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_hypervisor_id
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private Integer vmHypervisorId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_disabled
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmDisabled;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_owner
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmOwner;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_cores
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private Integer vmCores;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_memory
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private Integer vmMemory;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_vhd_gm_image
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmVhdGmImage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_vhd_gm_type
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmVhdGmType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_vhd_gm_filename
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmVhdGmFilename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_vhd_user_filename
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmVhdUserFilename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_network_type
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmNetworkType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_persistance
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmPersistance;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_init_flag
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmInitFlag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_heartbeat
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private Integer vmHeartbeat;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_mac_address
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmMacAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_ip_address
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmIpAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_creation_timestamp
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private Date vmCreationTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_status
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private Integer vmStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_guest_password
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private String vmGuestPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column virtual_machines.vm_last_update_timestamp
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private Date vmLastUpdateTimestamp;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table virtual_machines
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_id
     *
     * @return the value of virtual_machines.vm_id
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmId() {
        return vmId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_id
     *
     * @param vmId the value for virtual_machines.vm_id
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmId(String vmId) {
        this.vmId = vmId == null ? null : vmId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_type
     *
     * @return the value of virtual_machines.vm_type
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmType() {
        return vmType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_type
     *
     * @param vmType the value for virtual_machines.vm_type
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmType(String vmType) {
        this.vmType = vmType == null ? null : vmType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_course_code
     *
     * @return the value of virtual_machines.vm_course_code
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmCourseCode() {
        return vmCourseCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_course_code
     *
     * @param vmCourseCode the value for virtual_machines.vm_course_code
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmCourseCode(String vmCourseCode) {
        this.vmCourseCode = vmCourseCode == null ? null : vmCourseCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_name
     *
     * @return the value of virtual_machines.vm_name
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmName() {
        return vmName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_name
     *
     * @param vmName the value for virtual_machines.vm_name
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmName(String vmName) {
        this.vmName = vmName == null ? null : vmName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_title
     *
     * @return the value of virtual_machines.vm_title
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmTitle() {
        return vmTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_title
     *
     * @param vmTitle the value for virtual_machines.vm_title
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmTitle(String vmTitle) {
        this.vmTitle = vmTitle == null ? null : vmTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_description
     *
     * @return the value of virtual_machines.vm_description
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmDescription() {
        return vmDescription;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_description
     *
     * @param vmDescription the value for virtual_machines.vm_description
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmDescription(String vmDescription) {
        this.vmDescription = vmDescription == null ? null : vmDescription.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_preferred_course
     *
     * @return the value of virtual_machines.vm_preferred_course
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmPreferredCourse() {
        return vmPreferredCourse;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_preferred_course
     *
     * @param vmPreferredCourse the value for virtual_machines.vm_preferred_course
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmPreferredCourse(String vmPreferredCourse) {
        this.vmPreferredCourse = vmPreferredCourse == null ? null : vmPreferredCourse.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_hypervisor_id
     *
     * @return the value of virtual_machines.vm_hypervisor_id
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public Integer getVmHypervisorId() {
        return vmHypervisorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_hypervisor_id
     *
     * @param vmHypervisorId the value for virtual_machines.vm_hypervisor_id
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmHypervisorId(Integer vmHypervisorId) {
        this.vmHypervisorId = vmHypervisorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_disabled
     *
     * @return the value of virtual_machines.vm_disabled
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmDisabled() {
        return vmDisabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_disabled
     *
     * @param vmDisabled the value for virtual_machines.vm_disabled
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmDisabled(String vmDisabled) {
        this.vmDisabled = vmDisabled == null ? null : vmDisabled.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_owner
     *
     * @return the value of virtual_machines.vm_owner
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmOwner() {
        return vmOwner;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_owner
     *
     * @param vmOwner the value for virtual_machines.vm_owner
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmOwner(String vmOwner) {
        this.vmOwner = vmOwner == null ? null : vmOwner.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_cores
     *
     * @return the value of virtual_machines.vm_cores
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public Integer getVmCores() {
        return vmCores;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_cores
     *
     * @param vmCores the value for virtual_machines.vm_cores
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmCores(Integer vmCores) {
        this.vmCores = vmCores;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_memory
     *
     * @return the value of virtual_machines.vm_memory
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public Integer getVmMemory() {
        return vmMemory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_memory
     *
     * @param vmMemory the value for virtual_machines.vm_memory
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmMemory(Integer vmMemory) {
        this.vmMemory = vmMemory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_vhd_gm_image
     *
     * @return the value of virtual_machines.vm_vhd_gm_image
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmVhdGmImage() {
        return vmVhdGmImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_vhd_gm_image
     *
     * @param vmVhdGmImage the value for virtual_machines.vm_vhd_gm_image
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmVhdGmImage(String vmVhdGmImage) {
        this.vmVhdGmImage = vmVhdGmImage == null ? null : vmVhdGmImage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_vhd_gm_type
     *
     * @return the value of virtual_machines.vm_vhd_gm_type
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmVhdGmType() {
        return vmVhdGmType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_vhd_gm_type
     *
     * @param vmVhdGmType the value for virtual_machines.vm_vhd_gm_type
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmVhdGmType(String vmVhdGmType) {
        this.vmVhdGmType = vmVhdGmType == null ? null : vmVhdGmType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_vhd_gm_filename
     *
     * @return the value of virtual_machines.vm_vhd_gm_filename
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmVhdGmFilename() {
        return vmVhdGmFilename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_vhd_gm_filename
     *
     * @param vmVhdGmFilename the value for virtual_machines.vm_vhd_gm_filename
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmVhdGmFilename(String vmVhdGmFilename) {
        this.vmVhdGmFilename = vmVhdGmFilename == null ? null : vmVhdGmFilename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_vhd_user_filename
     *
     * @return the value of virtual_machines.vm_vhd_user_filename
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmVhdUserFilename() {
        return vmVhdUserFilename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_vhd_user_filename
     *
     * @param vmVhdUserFilename the value for virtual_machines.vm_vhd_user_filename
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmVhdUserFilename(String vmVhdUserFilename) {
        this.vmVhdUserFilename = vmVhdUserFilename == null ? null : vmVhdUserFilename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_network_type
     *
     * @return the value of virtual_machines.vm_network_type
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmNetworkType() {
        return vmNetworkType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_network_type
     *
     * @param vmNetworkType the value for virtual_machines.vm_network_type
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmNetworkType(String vmNetworkType) {
        this.vmNetworkType = vmNetworkType == null ? null : vmNetworkType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_persistance
     *
     * @return the value of virtual_machines.vm_persistance
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmPersistance() {
        return vmPersistance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_persistance
     *
     * @param vmPersistance the value for virtual_machines.vm_persistance
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmPersistance(String vmPersistance) {
        this.vmPersistance = vmPersistance == null ? null : vmPersistance.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_init_flag
     *
     * @return the value of virtual_machines.vm_init_flag
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmInitFlag() {
        return vmInitFlag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_init_flag
     *
     * @param vmInitFlag the value for virtual_machines.vm_init_flag
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmInitFlag(String vmInitFlag) {
        this.vmInitFlag = vmInitFlag == null ? null : vmInitFlag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_heartbeat
     *
     * @return the value of virtual_machines.vm_heartbeat
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public Integer getVmHeartbeat() {
        return vmHeartbeat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_heartbeat
     *
     * @param vmHeartbeat the value for virtual_machines.vm_heartbeat
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmHeartbeat(Integer vmHeartbeat) {
        this.vmHeartbeat = vmHeartbeat;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_mac_address
     *
     * @return the value of virtual_machines.vm_mac_address
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmMacAddress() {
        return vmMacAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_mac_address
     *
     * @param vmMacAddress the value for virtual_machines.vm_mac_address
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmMacAddress(String vmMacAddress) {
        this.vmMacAddress = vmMacAddress == null ? null : vmMacAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_ip_address
     *
     * @return the value of virtual_machines.vm_ip_address
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmIpAddress() {
        return vmIpAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_ip_address
     *
     * @param vmIpAddress the value for virtual_machines.vm_ip_address
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmIpAddress(String vmIpAddress) {
        this.vmIpAddress = vmIpAddress == null ? null : vmIpAddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_creation_timestamp
     *
     * @return the value of virtual_machines.vm_creation_timestamp
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public Date getVmCreationTimestamp() {
        return vmCreationTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_creation_timestamp
     *
     * @param vmCreationTimestamp the value for virtual_machines.vm_creation_timestamp
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmCreationTimestamp(Date vmCreationTimestamp) {
        this.vmCreationTimestamp = vmCreationTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_status
     *
     * @return the value of virtual_machines.vm_status
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public Integer getVmStatus() {
        return vmStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_status
     *
     * @param vmStatus the value for virtual_machines.vm_status
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmStatus(Integer vmStatus) {
        this.vmStatus = vmStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_guest_password
     *
     * @return the value of virtual_machines.vm_guest_password
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public String getVmGuestPassword() {
        return vmGuestPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_guest_password
     *
     * @param vmGuestPassword the value for virtual_machines.vm_guest_password
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmGuestPassword(String vmGuestPassword) {
        this.vmGuestPassword = vmGuestPassword == null ? null : vmGuestPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column virtual_machines.vm_last_update_timestamp
     *
     * @return the value of virtual_machines.vm_last_update_timestamp
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public Date getVmLastUpdateTimestamp() {
        return vmLastUpdateTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column virtual_machines.vm_last_update_timestamp
     *
     * @param vmLastUpdateTimestamp the value for virtual_machines.vm_last_update_timestamp
     *
     * @mbggenerated Sun Jan 19 09:59:57 CST 2014
     */
    public void setVmLastUpdateTimestamp(Date vmLastUpdateTimestamp) {
        this.vmLastUpdateTimestamp = vmLastUpdateTimestamp;
    }
}