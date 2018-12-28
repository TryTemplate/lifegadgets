package com.eici.lifegadgets.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Table(name = "sys_user_admin")
public class SysUserAdmin implements Serializable {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 账号
     */
    private String account;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 用户昵称
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 真实姓名
     */
    @Column(name = "user_real_name")
    private String userRealName;

    /**
     * 性别 1.男,2.女,3.其他
     */
    private String sex;

    /**
     * 用户类型 1.用户 2.后台管理
     */
    @Column(name = "customer_type")
    private String customerType;

    /**
     * 头像路径
     */
    @Column(name = "avatar_path")
    private String avatarPath;

    /**
     * 状态 0.正常,1.冻结
     */
    @Column(name = "is_rozen")
    private String isRozen;

    /**
     * 冻结原因
     */
    @Column(name = "rozen_reason")
    private String rozenReason;

    /**
     * 是否是否删除 0.正常,1.删除
     */
    @Column(name = "is_delete")
    private String isDelete;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 操作人姓名
     */
    @Column(name = "admin_id")
    private Integer adminId;

    /**
     * 操作人姓名
     */
    @Column(name = "admin_name")
    private String adminName;

    /**
     * 密码
     */
    private byte[] password;

    /**
     * 获取主键id
     *
     * @return id - 主键id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键id
     *
     * @param id 主键id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取账号
     *
     * @return account - 账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置账号
     *
     * @param account 账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取用户昵称
     *
     * @return user_name - 用户昵称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户昵称
     *
     * @param userName 用户昵称
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取真实姓名
     *
     * @return user_real_name - 真实姓名
     */
    public String getUserRealName() {
        return userRealName;
    }

    /**
     * 设置真实姓名
     *
     * @param userRealName 真实姓名
     */
    public void setUserRealName(String userRealName) {
        this.userRealName = userRealName;
    }

    /**
     * 获取性别 1.男,2.女,3.其他
     *
     * @return sex - 性别 1.男,2.女,3.其他
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别 1.男,2.女,3.其他
     *
     * @param sex 性别 1.男,2.女,3.其他
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取用户类型 1.用户 2.后台管理
     *
     * @return customer_type - 用户类型 1.用户 2.后台管理
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * 设置用户类型 1.用户 2.后台管理
     *
     * @param customerType 用户类型 1.用户 2.后台管理
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    /**
     * 获取头像路径
     *
     * @return avatar_path - 头像路径
     */
    public String getAvatarPath() {
        return avatarPath;
    }

    /**
     * 设置头像路径
     *
     * @param avatarPath 头像路径
     */
    public void setAvatarPath(String avatarPath) {
        this.avatarPath = avatarPath;
    }

    /**
     * 获取状态 0.正常,1.冻结
     *
     * @return is_rozen - 状态 0.正常,1.冻结
     */
    public String getIsRozen() {
        return isRozen;
    }

    /**
     * 设置状态 0.正常,1.冻结
     *
     * @param isRozen 状态 0.正常,1.冻结
     */
    public void setIsRozen(String isRozen) {
        this.isRozen = isRozen;
    }

    /**
     * 获取冻结原因
     *
     * @return rozen_reason - 冻结原因
     */
    public String getRozenReason() {
        return rozenReason;
    }

    /**
     * 设置冻结原因
     *
     * @param rozenReason 冻结原因
     */
    public void setRozenReason(String rozenReason) {
        this.rozenReason = rozenReason;
    }

    /**
     * 获取是否是否删除 0.正常,1.删除
     *
     * @return is_delete - 是否是否删除 0.正常,1.删除
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否是否删除 0.正常,1.删除
     *
     * @param isDelete 是否是否删除 0.正常,1.删除
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取操作人姓名
     *
     * @return admin_id - 操作人姓名
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * 设置操作人姓名
     *
     * @param adminId 操作人姓名
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * 获取操作人姓名
     *
     * @return admin_name - 操作人姓名
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * 设置操作人姓名
     *
     * @param adminName 操作人姓名
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public byte[] getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(byte[] password) {
        this.password = password;
    }
}