package com.fit2cloud.netty.model;

import java.io.Serializable;

public class Tag implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.id
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.server_id
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    private Long serverId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.group_id
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    private Long groupId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.name
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.value
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    private String value;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.cluster_id
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    private Long clusterId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.cluster_role_id
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    private Long clusterRoleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.server_name
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    private String serverName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.cluster_name
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    private String clusterName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.cluster_role_name
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    private String clusterRoleName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tag
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.id
     *
     * @return the value of tag.id
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.id
     *
     * @param id the value for tag.id
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.server_id
     *
     * @return the value of tag.server_id
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public Long getServerId() {
        return serverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.server_id
     *
     * @param serverId the value for tag.server_id
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public void setServerId(Long serverId) {
        this.serverId = serverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.group_id
     *
     * @return the value of tag.group_id
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public Long getGroupId() {
        return groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.group_id
     *
     * @param groupId the value for tag.group_id
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.name
     *
     * @return the value of tag.name
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.name
     *
     * @param name the value for tag.name
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.value
     *
     * @return the value of tag.value
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.value
     *
     * @param value the value for tag.value
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.cluster_id
     *
     * @return the value of tag.cluster_id
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public Long getClusterId() {
        return clusterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.cluster_id
     *
     * @param clusterId the value for tag.cluster_id
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public void setClusterId(Long clusterId) {
        this.clusterId = clusterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.cluster_role_id
     *
     * @return the value of tag.cluster_role_id
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public Long getClusterRoleId() {
        return clusterRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.cluster_role_id
     *
     * @param clusterRoleId the value for tag.cluster_role_id
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public void setClusterRoleId(Long clusterRoleId) {
        this.clusterRoleId = clusterRoleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.server_name
     *
     * @return the value of tag.server_name
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.server_name
     *
     * @param serverName the value for tag.server_name
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public void setServerName(String serverName) {
        this.serverName = serverName == null ? null : serverName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.cluster_name
     *
     * @return the value of tag.cluster_name
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public String getClusterName() {
        return clusterName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.cluster_name
     *
     * @param clusterName the value for tag.cluster_name
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public void setClusterName(String clusterName) {
        this.clusterName = clusterName == null ? null : clusterName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.cluster_role_name
     *
     * @return the value of tag.cluster_role_name
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public String getClusterRoleName() {
        return clusterRoleName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.cluster_role_name
     *
     * @param clusterRoleName the value for tag.cluster_role_name
     *
     * @mbg.generated Thu Aug 16 14:46:57 CST 2018
     */
    public void setClusterRoleName(String clusterRoleName) {
        this.clusterRoleName = clusterRoleName == null ? null : clusterRoleName.trim();
    }
}