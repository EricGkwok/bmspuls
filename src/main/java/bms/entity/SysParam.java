package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname SysParam
 * @Description
 * @Date 2019/7/6 10:35
 * @Created by WuLiao
 */
@Entity
@Table(name = "sys_param", schema = "bms")
public class SysParam {
    private String paramId;
    private String paramName;
    private String paramKey;
    private String paramValue;
    private String catalogId;
    private String catalogCascadeId;
    private String paramRemark;
    private String status;
    private String editMode;
    private Timestamp createTime;
    private String createUserId;
    private Timestamp modifyTime;
    private String modifyUserId;

    @Id
    @Column(name = "param_id", nullable = false, length = 50)
    public String getParamId() {
        return paramId;
    }

    public void setParamId(String paramId) {
        this.paramId = paramId;
    }

    @Basic
    @Column(name = "param_name", nullable = true, length = 100)
    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    @Basic
    @Column(name = "param_key", nullable = true, length = 50)
    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    @Basic
    @Column(name = "param_value", nullable = true, length = 500)
    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    @Basic
    @Column(name = "catalog_id", nullable = true, length = 50)
    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    @Basic
    @Column(name = "catalog_cascade_id", nullable = true, length = 500)
    public String getCatalogCascadeId() {
        return catalogCascadeId;
    }

    public void setCatalogCascadeId(String catalogCascadeId) {
        this.catalogCascadeId = catalogCascadeId;
    }

    @Basic
    @Column(name = "param_remark", nullable = true, length = 200)
    public String getParamRemark() {
        return paramRemark;
    }

    public void setParamRemark(String paramRemark) {
        this.paramRemark = paramRemark;
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
        SysParam sysParam = (SysParam) o;
        return Objects.equals(paramId, sysParam.paramId) &&
                Objects.equals(paramName, sysParam.paramName) &&
                Objects.equals(paramKey, sysParam.paramKey) &&
                Objects.equals(paramValue, sysParam.paramValue) &&
                Objects.equals(catalogId, sysParam.catalogId) &&
                Objects.equals(catalogCascadeId, sysParam.catalogCascadeId) &&
                Objects.equals(paramRemark, sysParam.paramRemark) &&
                Objects.equals(status, sysParam.status) &&
                Objects.equals(editMode, sysParam.editMode) &&
                Objects.equals(createTime, sysParam.createTime) &&
                Objects.equals(createUserId, sysParam.createUserId) &&
                Objects.equals(modifyTime, sysParam.modifyTime) &&
                Objects.equals(modifyUserId, sysParam.modifyUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paramId, paramName, paramKey, paramValue, catalogId, catalogCascadeId, paramRemark, status, editMode, createTime, createUserId, modifyTime, modifyUserId);
    }
}
