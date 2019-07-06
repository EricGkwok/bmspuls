package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisCouponActive
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_coupon_active", schema = "bms")
public class BisCouponActive {
    private String activeId;
    private String activeName;
    private Integer beautyNum;
    private Integer bondNum;
    private String isDel;
    private Timestamp createTime;
    private String createUserId;
    private Timestamp modifyTime;
    private String modifyUserId;

    @Id
    @Column(name = "active_id", nullable = false, length = 50)
    public String getActiveId() {
        return activeId;
    }

    public void setActiveId(String activeId) {
        this.activeId = activeId;
    }

    @Basic
    @Column(name = "active_name", nullable = true, length = 50)
    public String getActiveName() {
        return activeName;
    }

    public void setActiveName(String activeName) {
        this.activeName = activeName;
    }

    @Basic
    @Column(name = "beauty_num", nullable = true)
    public Integer getBeautyNum() {
        return beautyNum;
    }

    public void setBeautyNum(Integer beautyNum) {
        this.beautyNum = beautyNum;
    }

    @Basic
    @Column(name = "bond_num", nullable = true)
    public Integer getBondNum() {
        return bondNum;
    }

    public void setBondNum(Integer bondNum) {
        this.bondNum = bondNum;
    }

    @Basic
    @Column(name = "is_del", nullable = true, length = 10)
    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
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
        BisCouponActive that = (BisCouponActive) o;
        return Objects.equals(activeId, that.activeId) &&
                Objects.equals(activeName, that.activeName) &&
                Objects.equals(beautyNum, that.beautyNum) &&
                Objects.equals(bondNum, that.bondNum) &&
                Objects.equals(isDel, that.isDel) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(modifyUserId, that.modifyUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activeId, activeName, beautyNum, bondNum, isDel, createTime, createUserId, modifyTime, modifyUserId);
    }
}
