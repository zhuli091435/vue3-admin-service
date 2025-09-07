package com.li.vue3adminservice.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * 用户表
 * @TableName user
 */
@TableName(value ="user")
public class User {
    /**
     * 用户ID，主键自增
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户名，唯一
     */
    private String username;

    /**
     * 密码（加密存储，建议使用BCrypt等算法）
     */
    private String password;

    /**
     * 头像URL
     */
    private String avatar;

    /**
     * 邮箱，唯一
     */
    private String email;

    /**
     * 手机号，唯一
     */
    private String phone;

    /**
     * 用户状态：0=禁用，1=启用
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

    /**
     * 用户ID，主键自增
     */
    public Long getId() {
        return id;
    }

    /**
     * 用户ID，主键自增
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 用户名，唯一
     */
    public String getUsername() {
        return username;
    }

    /**
     * 用户名，唯一
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 密码（加密存储，建议使用BCrypt等算法）
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码（加密存储，建议使用BCrypt等算法）
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 头像URL
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 头像URL
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 邮箱，唯一
     */
    public String getEmail() {
        return email;
    }

    /**
     * 邮箱，唯一
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 手机号，唯一
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 手机号，唯一
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 用户状态：0=禁用，1=启用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 用户状态：0=禁用，1=启用
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
        User other = (User) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getAvatar() == null ? other.getAvatar() == null : this.getAvatar().equals(other.getAvatar()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getAvatar() == null) ? 0 : getAvatar().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
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
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", avatar=").append(avatar);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}