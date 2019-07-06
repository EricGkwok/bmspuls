package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname SysRole
 * @Description
 * @Date 2019/7/6 10:35
 * @Created by WuLiao
 */
@Entity
@Table(name = "sys_role", schema = "bms")
public class SysRole {
    private String roleId;
    private String roleName;
    private String status;
    private String roleType;
    private String roleRemark;
    private String editMode;
    private String createUserId;
    private Timestamp createTime;
    private String modifyUserId;
    private Timestamp modifyTime;

    @Id
    @Column(name = "role_id", nullable = false, length = 50)
    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Basic
    @Column(name = "role_name", nullable = false, length = 100)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Basic
    @Column(name = "status", nullable = true, length = 10)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "role_type", nullable = true, length = 10)
    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    @Basic
    @Column(name = "role_remark", nullable = true, length = 400)
    public String getRoleRemark() {
        return roleRemark;
    }

    public void setRoleRemark(String roleRemark) {
        this.roleRemark = roleRemark;
    }

    @Basic
    @Column(name = "edit_mode", nullable = true, length = 10)
    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
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

    @Basic
    @Column(name = "modify_user_id", nullable = true, length = 50)
    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    @Basic
    @Column(name = "modify_time", nullable = true)
    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysRole sysRole = (SysRole) o;
        return Objects.equals(roleId, sysRole.roleId) &&
                Objects.equals(roleName, sysRole.roleName) &&
                Objects.equals(status, sysRole.status) &&
                Objects.equals(roleType, sysRole.roleType) &&
                Objects.equals(roleRemark, sysRole.roleRemark) &&
                Objects.equals(editMode, sysRole.editMode) &&
                Objects.equals(createUserId, sysRole.createUserId) &&
                Objects.equals(createTime, sysRole.createTime) &&
                Objects.equals(modifyUserId, sysRole.modifyUserId) &&
                Objects.equals(modifyTime, sysRole.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, roleName, status, roleType, roleRemark, editMode, createUserId, createTime, modifyUserId, modifyTime);
    }
}
