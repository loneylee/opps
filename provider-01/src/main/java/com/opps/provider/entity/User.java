package com.opps.provider.entity;

import java.util.Date;

public class User {
    /**
    id
     */
    private String id;

    /**
    账户
     */
    private String account;

    /**
    密码
     */
    private String password;

    /**
    createTime
     */
    private Date createtime;

    /**
    updateTime
     */
    private Date updatetime;

    /**
    数据状态(0:正常、1:删除)
     */
    private Boolean status;

    /**
    角色(ADMIN、EDITOR)
     */
    private String role;

    /**
    modifier
     */
    private Integer modifier;

    /**
    creator
     */
    private Integer creator;

    /**
     * get id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * set id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * get 账户
     */
    public String getAccount() {
        return account;
    }

    /**
     *
     * set 账户
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * get 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * set 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * get createTime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     *
     * set createTime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**
     * get updateTime
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     *
     * set updateTime
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**
     * get 数据状态(0:正常、1:删除)
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     *
     * set 数据状态(0:正常、1:删除)
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * get 角色(ADMIN、EDITOR)
     */
    public String getRole() {
        return role;
    }

    /**
     *
     * set 角色(ADMIN、EDITOR)
     */
    public void setRole(String role) {
        this.role = role == null ? null : role.trim();
    }

    /**
     * get modifier
     */
    public Integer getModifier() {
        return modifier;
    }

    /**
     *
     * set modifier
     */
    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    /**
     * get creator
     */
    public Integer getCreator() {
        return creator;
    }

    /**
     *
     * set creator
     */
    public void setCreator(Integer creator) {
        this.creator = creator;
    }
}