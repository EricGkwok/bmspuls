package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname SysRoleUser
 * @Description
 * @Date 2019/7/6 10:35
 * @Created by WuLiao
 */
@Entity
@Table(name = "sys_role_user", schema = "bms")
public class SysRoleUser {
    private String roleId;
    private String userId;
    private String createUserId;
    private Timestamp createTime;

    @Id
    @Column(name = "role_id", nullable = false, length = 50)
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "user_id", nullable = false, length = 50)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "create_user_id", nullable = true, length = 50)
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysRoleUser that = (SysRoleUser) o;
        return Objects.equals(roleId, that.roleId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, userId, createUserId, createTime);
    }
}
