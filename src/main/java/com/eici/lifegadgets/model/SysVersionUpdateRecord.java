package com.eici.lifegadgets.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "sys_version_update_record")
public class SysVersionUpdateRecord {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 主题
     */
    private String theme;

    /**
     * 发布日期
     */
    @Column(name = "release_date")
    private Date releaseDate;

    /**
     * 更新详情
     */
    @Column(name = "update_details")
    private String updateDetails;

    /**
     * 新版本
     */
    @Column(name = "new_version")
    private String newVersion;

    /**
     * 原版本
     */
    @Column(name = "original_version")
    private String originalVersion;

    /**
     * 是否属于重要更新 1.是,0.否
     */
    @Column(name = "important_updates")
    private String importantUpdates;

    /**
     * 更新所属纪元版本
     */
    @Column(name = "epoch_version")
    private String epochVersion;

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
     * 获取主题
     *
     * @return theme - 主题
     */
    public String getTheme() {
        return theme;
    }

    /**
     * 设置主题
     *
     * @param theme 主题
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * 获取发布日期
     *
     * @return release_date - 发布日期
     */
    public Date getReleaseDate() {
        return releaseDate;
    }

    /**
     * 设置发布日期
     *
     * @param releaseDate 发布日期
     */
    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    /**
     * 获取更新详情
     *
     * @return update_details - 更新详情
     */
    public String getUpdateDetails() {
        return updateDetails;
    }

    /**
     * 设置更新详情
     *
     * @param updateDetails 更新详情
     */
    public void setUpdateDetails(String updateDetails) {
        this.updateDetails = updateDetails;
    }

    /**
     * 获取新版本
     *
     * @return new_version - 新版本
     */
    public String getNewVersion() {
        return newVersion;
    }

    /**
     * 设置新版本
     *
     * @param newVersion 新版本
     */
    public void setNewVersion(String newVersion) {
        this.newVersion = newVersion;
    }

    /**
     * 获取原版本
     *
     * @return original_version - 原版本
     */
    public String getOriginalVersion() {
        return originalVersion;
    }

    /**
     * 设置原版本
     *
     * @param originalVersion 原版本
     */
    public void setOriginalVersion(String originalVersion) {
        this.originalVersion = originalVersion;
    }

    /**
     * 获取是否属于重要更新 1.是,0.否
     *
     * @return important_updates - 是否属于重要更新 1.是,0.否
     */
    public String getImportantUpdates() {
        return importantUpdates;
    }

    /**
     * 设置是否属于重要更新 1.是,0.否
     *
     * @param importantUpdates 是否属于重要更新 1.是,0.否
     */
    public void setImportantUpdates(String importantUpdates) {
        this.importantUpdates = importantUpdates;
    }

    /**
     * 获取更新所属纪元版本
     *
     * @return epoch_version - 更新所属纪元版本
     */
    public String getEpochVersion() {
        return epochVersion;
    }

    /**
     * 设置更新所属纪元版本
     *
     * @param epochVersion 更新所属纪元版本
     */
    public void setEpochVersion(String epochVersion) {
        this.epochVersion = epochVersion;
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