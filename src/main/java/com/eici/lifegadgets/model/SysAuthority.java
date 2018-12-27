package com.eici.lifegadgets.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "sys_authority")
public class SysAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 权限(模块)名称
     */
    @Column(name = "aut_name")
    private String autName;

    /**
     * 权限备注
     */
    @Column(name = "aut_note")
    private String autNote;

    /**
     * 权限地址
     */
    @Column(name = "aut_url")
    private String autUrl;

    /**
     * 状态 1.启用,0.停用
     */
    private String status;

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
     * 是否删除 0.正常,1.删除
     */
    @Column(name = "is_delete")
    private String isDelete;

    /**
     * 操作人id
     */
    @Column(name = "admin_id")
    private Integer adminId;

    /**
     * 操作人姓名
     */
    @Column(name = "admin_name")
    private String adminName;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取权限(模块)名称
     *
     * @return aut_name - 权限(模块)名称
     */
    public String getAutName() {
        return autName;
    }

    /**
     * 设置权限(模块)名称
     *
     * @param autName 权限(模块)名称
     */
    public void setAutName(String autName) {
        this.autName = autName;
    }

    /**
     * 获取权限备注
     *
     * @return aut_note - 权限备注
     */
    public String getAutNote() {
        return autNote;
    }

    /**
     * 设置权限备注
     *
     * @param autNote 权限备注
     */
    public void setAutNote(String autNote) {
        this.autNote = autNote;
    }

    /**
     * 获取权限地址
     *
     * @return aut_url - 权限地址
     */
    public String getAutUrl() {
        return autUrl;
    }

    /**
     * 设置权限地址
     *
     * @param autUrl 权限地址
     */
    public void setAutUrl(String autUrl) {
        this.autUrl = autUrl;
    }

    /**
     * 获取状态 1.启用,0.停用
     *
     * @return status - 状态 1.启用,0.停用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 1.启用,0.停用
     *
     * @param status 状态 1.启用,0.停用
     */
    public void setStatus(String status) {
        this.status = status;
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
     * 获取是否删除 0.正常,1.删除
     *
     * @return is_delete - 是否删除 0.正常,1.删除
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除 0.正常,1.删除
     *
     * @param isDelete 是否删除 0.正常,1.删除
     */
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取操作人id
     *
     * @return admin_id - 操作人id
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * 设置操作人id
     *
     * @param adminId 操作人id
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
}