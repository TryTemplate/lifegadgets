package com.eici.lifegadgets.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "sys_news_context")
public class SysNewsContext {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 新闻标题
     */
    private String title;

    /**
     * 新闻内容
     */
    private String context;

    /**
     * 新闻标签 热词
     */
    private String label;

    /**
     * 新闻类别外键
     */
    @Column(name = "type_id")
    private Integer typeId;

    /**
     * 是否删除 0.正常 1.删除
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
     * 操作人id
     */
    @Column(name = "admin_id")
    private Integer adminId;

    /**
     * 操作人
     */
    @Column(name = "admin_name")
    private String adminName;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取新闻标题
     *
     * @return title - 新闻标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置新闻标题
     *
     * @param title 新闻标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取新闻内容
     *
     * @return context - 新闻内容
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置新闻内容
     *
     * @param context 新闻内容
     */
    public void setContext(String context) {
        this.context = context;
    }

    /**
     * 获取新闻标签 热词
     *
     * @return label - 新闻标签 热词
     */
    public String getLabel() {
        return label;
    }

    /**
     * 设置新闻标签 热词
     *
     * @param label 新闻标签 热词
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * 获取新闻类别外键
     *
     * @return type_id - 新闻类别外键
     */
    public Integer getTypeId() {
        return typeId;
    }

    /**
     * 设置新闻类别外键
     *
     * @param typeId 新闻类别外键
     */
    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    /**
     * 获取是否删除 0.正常 1.删除
     *
     * @return is_delete - 是否删除 0.正常 1.删除
     */
    public String getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除 0.正常 1.删除
     *
     * @param isDelete 是否删除 0.正常 1.删除
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
     * 获取操作人
     *
     * @return admin_name - 操作人
     */
    public String getAdminName() {
        return adminName;
    }

    /**
     * 设置操作人
     *
     * @param adminName 操作人
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }
}