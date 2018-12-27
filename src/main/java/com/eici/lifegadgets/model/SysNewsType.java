package com.eici.lifegadgets.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "sys_news_type")
public class SysNewsType {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 新闻类别名称
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 新闻类别介绍
     */
    @Column(name = "type_context")
    private String typeContext;

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
     * 获取新闻类别名称
     *
     * @return type_name - 新闻类别名称
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置新闻类别名称
     *
     * @param typeName 新闻类别名称
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 获取新闻类别介绍
     *
     * @return type_context - 新闻类别介绍
     */
    public String getTypeContext() {
        return typeContext;
    }

    /**
     * 设置新闻类别介绍
     *
     * @param typeContext 新闻类别介绍
     */
    public void setTypeContext(String typeContext) {
        this.typeContext = typeContext;
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