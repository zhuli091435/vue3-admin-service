package com.li.vue3adminservice.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品属性表
 * @TableName attribute
 */
public class Attribute implements Serializable {
    /**
     * 属性ID
     */
    private Long id;

    /**
     * 所属分类ID
     */
    private Long categoryId;

    /**
     * 属性名称
     */
    private String name;

    /**
     * 属性类型(1:规格, 2:参数)
     */
    private Integer type;

    /**
     * 录入方式(1:手工录入, 2:列表选择)
     */
    private Integer inputType;

    /**
     * 排序
     */
    private Integer sort;

    /**
     * 状态(1:启用, 0:禁用)
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    /**
     * 属性ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 属性ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 所属分类ID
     */
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 所属分类ID
     */
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 属性名称
     */
    public String getName() {
        return name;
    }

    /**
     * 属性名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 属性类型(1:规格, 2:参数)
     */
    public Integer getType() {
        return type;
    }

    /**
     * 属性类型(1:规格, 2:参数)
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 录入方式(1:手工录入, 2:列表选择)
     */
    public Integer getInputType() {
        return inputType;
    }

    /**
     * 录入方式(1:手工录入, 2:列表选择)
     */
    public void setInputType(Integer inputType) {
        this.inputType = inputType;
    }

    /**
     * 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 状态(1:启用, 0:禁用)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 状态(1:启用, 0:禁用)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Attribute other = (Attribute) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCategoryId() == null ? other.getCategoryId() == null : this.getCategoryId().equals(other.getCategoryId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getInputType() == null ? other.getInputType() == null : this.getInputType().equals(other.getInputType()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCategoryId() == null) ? 0 : getCategoryId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getInputType() == null) ? 0 : getInputType().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", categoryId=").append(categoryId);
        sb.append(", name=").append(name);
        sb.append(", type=").append(type);
        sb.append(", inputType=").append(inputType);
        sb.append(", sort=").append(sort);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}