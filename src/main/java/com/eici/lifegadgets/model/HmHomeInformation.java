package com.eici.lifegadgets.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "hm_home_information")
public class HmHomeInformation {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Title
     */
    private String title;

    /**
     * 存储路径
     */
    private String urlpath;

    /**
     * 排序
     */
    private Integer sorting;

    /**
     * 启用 1.启用,0.关闭
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
     * 获取Title
     *
     * @return title - Title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置Title
     *
     * @param title Title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取存储路径
     *
     * @return urlpath - 存储路径
     */
    public String getUrlpath() {
        return urlpath;
    }

    /**
     * 设置存储路径
     *
     * @param urlpath 存储路径
     */
    public void setUrlpath(String urlpath) {
        this.urlpath = urlpath;
    }

    /**
     * 获取排序
     *
     * @return sorting - 排序
     */
    public Integer getSorting() {
        return sorting;
    }

    /**
     * 设置排序
     *
     * @param sorting 排序
     */
    public void setSorting(Integer sorting) {
        this.sorting = sorting;
    }

    /**
     * 获取启用 1.启用,0.关闭
     *
     * @return status - 启用 1.启用,0.关闭
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置启用 1.启用,0.关闭
     *
     * @param status 启用 1.启用,0.关闭
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