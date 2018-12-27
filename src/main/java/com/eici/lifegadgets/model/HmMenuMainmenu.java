package com.eici.lifegadgets.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "hm_menu_mainmenu")
public class HmMenuMainmenu {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 菜单名称
     */
    private String title;

    /**
     * 菜单目标路径
     */
    private String url;

    /**
     * 备注
     */
    private String remarks;

    /**
     * 主菜单外键id
     */
    @Column(name = "v_out_id")
    private Integer vOutId;

    /**
     * 排序
     */
    private String sorting;

    /**
     * 状态 1.启用,0未启用
     */
    private String status;

    /**
     * 菜单类型 1.前台 2.后台
     */
    private Integer type;

    /**
     * 图标
     */
    @Column(name = "menu_icon")
    private String menuIcon;

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
     * 获取菜单名称
     *
     * @return title - 菜单名称
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置菜单名称
     *
     * @param title 菜单名称
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取菜单目标路径
     *
     * @return url - 菜单目标路径
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置菜单目标路径
     *
     * @param url 菜单目标路径
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取备注
     *
     * @return remarks - 备注
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 设置备注
     *
     * @param remarks 备注
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    /**
     * 获取主菜单外键id
     *
     * @return v_out_id - 主菜单外键id
     */
    public Integer getvOutId() {
        return vOutId;
    }

    /**
     * 设置主菜单外键id
     *
     * @param vOutId 主菜单外键id
     */
    public void setvOutId(Integer vOutId) {
        this.vOutId = vOutId;
    }

    /**
     * 获取排序
     *
     * @return sorting - 排序
     */
    public String getSorting() {
        return sorting;
    }

    /**
     * 设置排序
     *
     * @param sorting 排序
     */
    public void setSorting(String sorting) {
        this.sorting = sorting;
    }

    /**
     * 获取状态 1.启用,0未启用
     *
     * @return status - 状态 1.启用,0未启用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态 1.启用,0未启用
     *
     * @param status 状态 1.启用,0未启用
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取菜单类型 1.前台 2.后台
     *
     * @return type - 菜单类型 1.前台 2.后台
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置菜单类型 1.前台 2.后台
     *
     * @param type 菜单类型 1.前台 2.后台
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取图标
     *
     * @return menu_icon - 图标
     */
    public String getMenuIcon() {
        return menuIcon;
    }

    /**
     * 设置图标
     *
     * @param menuIcon 图标
     */
    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
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