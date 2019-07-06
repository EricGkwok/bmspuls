package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname SysIcon
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "sys_icon", schema = "bms")
public class SysIcon {
    private String iconId;
    private String iconName;
    private String iconFileName;
    private String iconPath;
    private String iconType;
    private String iconSizeType;
    private String status;
    private String editMode;
    private String createUserId;
    private Timestamp createTime;
    private String modifyUserId;
    private Timestamp modifyTime;

    @Id
    @Column(name = "icon_id", nullable = false, length = 50)
    public String getIconId() {
        return iconId;
    }

    public void setIconId(String iconId) {
        this.iconId = iconId;
    }

    @Basic
    @Column(name = "icon_name", nullable = false, length = 50)
    public String getIconName() {
        return iconName;
    }

    public void setIconName(String iconName) {
        this.iconName = iconName;
    }

    @Basic
    @Column(name = "icon_file_name", nullable = true, length = 50)
    public String getIconFileName() {
        return iconFileName;
    }

    public void setIconFileName(String iconFileName) {
        this.iconFileName = iconFileName;
    }

    @Basic
    @Column(name = "icon_path", nullable = true, length = 100)
    public String getIconPath() {
        return iconPath;
    }

    public void setIconPath(String iconPath) {
        this.iconPath = iconPath;
    }

    @Basic
    @Column(name = "icon_type", nullable = true, length = 50)
    public String getIconType() {
        return iconType;
    }

    public void setIconType(String iconType) {
        this.iconType = iconType;
    }

    @Basic
    @Column(name = "icon_size_type", nullable = true, length = 10)
    public String getIconSizeType() {
        return iconSizeType;
    }

    public void setIconSizeType(String iconSizeType) {
        this.iconSizeType = iconSizeType;
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
        SysIcon sysIcon = (SysIcon) o;
        return Objects.equals(iconId, sysIcon.iconId) &&
                Objects.equals(iconName, sysIcon.iconName) &&
                Objects.equals(iconFileName, sysIcon.iconFileName) &&
                Objects.equals(iconPath, sysIcon.iconPath) &&
                Objects.equals(iconType, sysIcon.iconType) &&
                Objects.equals(iconSizeType, sysIcon.iconSizeType) &&
                Objects.equals(status, sysIcon.status) &&
                Objects.equals(editMode, sysIcon.editMode) &&
                Objects.equals(createUserId, sysIcon.createUserId) &&
                Objects.equals(createTime, sysIcon.createTime) &&
                Objects.equals(modifyUserId, sysIcon.modifyUserId) &&
                Objects.equals(modifyTime, sysIcon.modifyTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(iconId, iconName, iconFileName, iconPath, iconType, iconSizeType, status, editMode, createUserId, createTime, modifyUserId, modifyTime);
    }
}
