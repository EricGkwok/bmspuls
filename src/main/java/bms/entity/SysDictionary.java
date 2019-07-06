package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname SysDictionary
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "sys_dictionary", schema = "bms")
public class SysDictionary {
    private String dicId;
    private String dicIndexId;
    private String dicCode;
    private String dicValue;
    private String showColor;
    private String status;
    private String editMode;
    private Integer sortNo;
    private Timestamp createTime;
    private String createUserId;
    private Timestamp modifyTime;
    private String modifyUserId;

    @Id
    @Column(name = "dic_id", nullable = false, length = 50)
    public String getDicId() {
        return dicId;
    }

    public void setDicId(String dicId) {
        this.dicId = dicId;
    }

    @Basic
    @Column(name = "dic_index_id", nullable = true, length = 255)
    public String getDicIndexId() {
        return dicIndexId;
    }

    public void setDicIndexId(String dicIndexId) {
        this.dicIndexId = dicIndexId;
    }

    @Basic
    @Column(name = "dic_code", nullable = true, length = 100)
    public String getDicCode() {
        return dicCode;
    }

    public void setDicCode(String dicCode) {
        this.dicCode = dicCode;
    }

    @Basic
    @Column(name = "dic_value", nullable = true, length = 100)
    public String getDicValue() {
        return dicValue;
    }

    public void setDicValue(String dicValue) {
        this.dicValue = dicValue;
    }

    @Basic
    @Column(name = "show_color", nullable = true, length = 50)
    public String getShowColor() {
        return showColor;
    }

    public void setShowColor(String showColor) {
        this.showColor = showColor;
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
        SysDictionary that = (SysDictionary) o;
        return Objects.equals(dicId, that.dicId) &&
                Objects.equals(dicIndexId, that.dicIndexId) &&
                Objects.equals(dicCode, that.dicCode) &&
                Objects.equals(dicValue, that.dicValue) &&
                Objects.equals(showColor, that.showColor) &&
                Objects.equals(status, that.status) &&
                Objects.equals(editMode, that.editMode) &&
                Objects.equals(sortNo, that.sortNo) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(modifyUserId, that.modifyUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dicId, dicIndexId, dicCode, dicValue, showColor, status, editMode, sortNo, createTime, createUserId, modifyTime, modifyUserId);
    }
}
