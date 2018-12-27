package com.eici.lifegadgets.model;

import javax.persistence.*;
import java.util.Date;

@Table(name = "sys_files")
public class SysFiles {
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 使用id (某表id)
     */
    @Column(name = "use_id")
    private Integer useId;

    /**
     * 使用分类 (表示某表)
     */
    @Column(name = "use_type")
    private String useType;

    /**
     * 文件名称
     */
    private String name;

    /**
     * 文件大小 单位(kb)
     */
    private Double size;

    /**
     * 文件类型
     */
    private String type;

    /**
     * 存储路径
     */
    @Column(name = "url_path")
    private String urlPath;

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
     * 获取使用id (某表id)
     *
     * @return use_id - 使用id (某表id)
     */
    public Integer getUseId() {
        return useId;
    }

    /**
     * 设置使用id (某表id)
     *
     * @param useId 使用id (某表id)
     */
    public void setUseId(Integer useId) {
        this.useId = useId;
    }

    /**
     * 获取使用分类 (表示某表)
     *
     * @return use_type - 使用分类 (表示某表)
     */
    public String getUseType() {
        return useType;
    }

    /**
     * 设置使用分类 (表示某表)
     *
     * @param useType 使用分类 (表示某表)
     */
    public void setUseType(String useType) {
        this.useType = useType;
    }

    /**
     * 获取文件名称
     *
     * @return name - 文件名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置文件名称
     *
     * @param name 文件名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取文件大小 单位(kb)
     *
     * @return size - 文件大小 单位(kb)
     */
    public Double getSize() {
        return size;
    }

    /**
     * 设置文件大小 单位(kb)
     *
     * @param size 文件大小 单位(kb)
     */
    public void setSize(Double size) {
        this.size = size;
    }

    /**
     * 获取文件类型
     *
     * @return type - 文件类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置文件类型
     *
     * @param type 文件类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取存储路径
     *
     * @return url_path - 存储路径
     */
    public String getUrlPath() {
        return urlPath;
    }

    /**
     * 设置存储路径
     *
     * @param urlPath 存储路径
     */
    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
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
}