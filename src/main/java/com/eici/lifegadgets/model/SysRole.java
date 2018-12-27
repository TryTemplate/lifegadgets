package com.eici.lifegadgets.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "sys_role")
public class SysRole {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 权限备注
     */
    @Column(name = "role_note")
    private String roleNote;

    /**
     * 是否启用 1.启用,0禁用
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
     * 获取角色名称
     *
     * @return role_name - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取权限备注
     *
     * @return role_note - 权限备注
     */
    public String getRoleNote() {
        return roleNote;
    }

    /**
     * 设置权限备注
     *
     * @param roleNote 权限备注
     */
    public void setRoleNote(String roleNote) {
        this.roleNote = roleNote;
    }

    /**
     * 获取是否启用 1.启用,0禁用
     *
     * @return status - 是否启用 1.启用,0禁用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置是否启用 1.启用,0禁用
     *
     * @param status 是否启用 1.启用,0禁用
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