package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname SysCatalog
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "sys_catalog", schema = "bms")
public class SysCatalog {
    private String catalogId;
    private String cascadeId;
    private String rootKey;
    private String rootName;
    private String catalogName;
    private String parentId;
    private Integer sortNo;
    private String iconName;
    private String isAutoExpand;
    private Timestamp createTime;
    private String createUserId;
    private Timestamp modifyTime;
    private String modifyUserId;

    @Id
    @Column(name = "catalog_id", nullable = false, length = 50)
    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
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
    @Column(name = "root_key", nullable = true, length = 100)
    public String getRootKey() {
        return rootKey;
    }

    public void setRootKey(String rootKey) {
        this.rootKey = rootKey;
    }

    @Basic
    @Column(name = "root_name", nullable = true, length = 100)
    public String getRootName() {
        return rootName;
    }

    public void setRootName(String rootName) {
        this.rootName = rootName;
    }

    @Basic
    @Column(name = "catalog_name", nullable = true, length = 50)
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
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
    @Column(name = "sort_no", nullable = true)
    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
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
        SysCatalog that = (SysCatalog) o;
        return Objects.equals(catalogId, that.catalogId) &&
                Objects.equals(cascadeId, that.cascadeId) &&
                Objects.equals(rootKey, that.rootKey) &&
                Objects.equals(rootName, that.rootName) &&
                Objects.equals(catalogName, that.catalogName) &&
                Objects.equals(parentId, that.parentId) &&
                Objects.equals(sortNo, that.sortNo) &&
                Objects.equals(iconName, that.iconName) &&
                Objects.equals(isAutoExpand, that.isAutoExpand) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(modifyUserId, that.modifyUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(catalogId, cascadeId, rootKey, rootName, catalogName, parentId, sortNo, iconName, isAutoExpand, createTime, createUserId, modifyTime, modifyUserId);
    }
}
