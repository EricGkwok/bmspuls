package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname SysDictionaryIndex
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "sys_dictionary_index", schema = "bms")
public class SysDictionaryIndex {
    private String dicIndexId;
    private String dicKey;
    private String dicName;
    private String catalogId;
    private String catalogCascadeId;
    private String dicRemark;
    private Timestamp createTime;
    private String createUserId;
    private Timestamp modifyTime;
    private String modifyUserId;

    @Id
    @Column(name = "dic_index_id", nullable = false, length = 50)
    public String getDicIndexId() {
        return dicIndexId;
    }

    public void setDicIndexId(String dicIndexId) {
        this.dicIndexId = dicIndexId;
    }

    @Basic
    @Column(name = "dic_key", nullable = true, length = 50)
    public String getDicKey() {
        return dicKey;
    }

    public void setDicKey(String dicKey) {
        this.dicKey = dicKey;
    }

    @Basic
    @Column(name = "dic_name", nullable = true, length = 100)
    public String getDicName() {
        return dicName;
    }

    public void setDicName(String dicName) {
        this.dicName = dicName;
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
    @Column(name = "dic_remark", nullable = true, length = 500)
    public String getDicRemark() {
        return dicRemark;
    }

    public void setDicRemark(String dicRemark) {
        this.dicRemark = dicRemark;
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
        SysDictionaryIndex that = (SysDictionaryIndex) o;
        return Objects.equals(dicIndexId, that.dicIndexId) &&
                Objects.equals(dicKey, that.dicKey) &&
                Objects.equals(dicName, that.dicName) &&
                Objects.equals(catalogId, that.catalogId) &&
                Objects.equals(catalogCascadeId, that.catalogCascadeId) &&
                Objects.equals(dicRemark, that.dicRemark) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(modifyUserId, that.modifyUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dicIndexId, dicKey, dicName, catalogId, catalogCascadeId, dicRemark, createTime, createUserId, modifyTime, modifyUserId);
    }
}
