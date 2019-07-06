package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname SysRoleMenu
 * @Description
 * @Date 2019/7/6 10:35
 * @Created by WuLiao
 */
@Entity
@Table(name = "sys_role_menu", schema = "bms")
public class SysRoleMenu {
    private String roleId;
    private String menuId;
    private String grantType;
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
    @Column(name = "menu_id", nullable = false, length = 50)
    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    @Basic
    @Column(name = "grant_type", nullable = true, length = 10)
    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
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
        SysRoleMenu that = (SysRoleMenu) o;
        return Objects.equals(roleId, that.roleId) &&
                Objects.equals(menuId, that.menuId) &&
                Objects.equals(grantType, that.grantType) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, menuId, grantType, createUserId, createTime);
    }
}
