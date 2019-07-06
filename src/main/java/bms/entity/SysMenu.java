package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname SysMenu
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "sys_menu", schema = "bms")
public class SysMenu {
    private String menuId;
    private String cascadeId;
    private String menuName;
    private String menuType;
    private String parentId;
    private String iconName;
    private String isAutoExpand;
    private String url;
    private String remark;
    private String status;
    private String editMode;
    private Integer sortNo;
    private Timestamp createTime;
    private String createUserId;
    private Timestamp modifyTime;
    private String modifyUserId;

    @Id
    @Column(name = "menu_id", nullable = false, length = 50)
    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    @Basic
    @Column(name = "cascade_id", nullable = true, length = 500)
    public String getCascadeId() {
        return cascadeId;
    }

    public void setCascadeId(String cascadeId) {
        this.cascadeId = cascadeId;
    }

    @Basic
    @Column(name = "menu_name", nullable = true, length = 100)
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "menu_type", nullable = true, length = 10)
    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    @Basic
    @Column(name = "parent_id", nullable = true, length = 50)
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "icon_name", nullable = true, length = 50)
    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    @Basic
    @Column(name = "is_auto_expand", nullable = true, length = 10)
    public String getIsAutoExpand() {
        return isAutoExpand;
    }

    public void setIsAutoExpand(String isAutoExpand) {
        this.isAutoExpand = isAutoExpand;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 100)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 500)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
    @Column(name = "edit_mode", nullable = true, length = 10)
    public String getEditMode() {
        return editMode;
    }

    public void setEditMode(String editMode) {
        this.editMode = editMode;
    }

    @Basic
    @Column(name = "sort_no", nullable = true)
    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
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
    @Column(name = "create_user_id", nullable = true, length = 50)
    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    @Basic
    @Column(name = "modify_time", nullable = true)
    public Timestamp getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Timestamp modifyTime) {
        this.modifyTime = modifyTime;
    }

    @Basic
    @Column(name = "modify_user_id", nullable = true, length = 50)
    public String getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(String modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysMenu sysMenu = (SysMenu) o;
        return Objects.equals(menuId, sysMenu.menuId) &&
                Objects.equals(cascadeId, sysMenu.cascadeId) &&
                Objects.equals(menuName, sysMenu.menuName) &&
                Objects.equals(menuType, sysMenu.menuType) &&
                Objects.equals(parentId, sysMenu.parentId) &&
                Objects.equals(iconName, sysMenu.iconName) &&
                Objects.equals(isAutoExpand, sysMenu.isAutoExpand) &&
                Objects.equals(url, sysMenu.url) &&
                Objects.equals(remark, sysMenu.remark) &&
                Objects.equals(status, sysMenu.status) &&
                Objects.equals(editMode, sysMenu.editMode) &&
                Objects.equals(sortNo, sysMenu.sortNo) &&
                Objects.equals(createTime, sysMenu.createTime) &&
                Objects.equals(createUserId, sysMenu.createUserId) &&
                Objects.equals(modifyTime, sysMenu.modifyTime) &&
                Objects.equals(modifyUserId, sysMenu.modifyUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, cascadeId, menuName, menuType, parentId, iconName, isAutoExpand, url, remark, status, editMode, sortNo, createTime, createUserId, modifyTime, modifyUserId);
    }
}
