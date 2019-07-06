package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisShopWork
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_shop_work", schema = "bms")
public class BisShopWork {
    private String workId;
    private String shopId;
    private String shopIp;
    private String workPassword;
    private String whetherSet;
    private String workSn;
    private Timestamp createTime;
    private String createUserId;
    private Timestamp modifyTime;
    private String modifyUserId;

    @Id
    @Column(name = "work_id", nullable = false, length = 50)
    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    @Basic
    @Column(name = "shop_id", nullable = true, length = 50)
    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "shop_ip", nullable = true, length = 50)
    public String getShopIp() {
        return shopIp;
    }

    public void setShopIp(String shopIp) {
        this.shopIp = shopIp;
    }

    @Basic
    @Column(name = "work_password", nullable = true, length = 50)
    public String getWorkPassword() {
        return workPassword;
    }

    public void setWorkPassword(String workPassword) {
        this.workPassword = workPassword;
    }

    @Basic
    @Column(name = "whether_set", nullable = true, length = 10)
    public String getWhetherSet() {
        return whetherSet;
    }

    public void setWhetherSet(String whetherSet) {
        this.whetherSet = whetherSet;
    }

    @Basic
    @Column(name = "work_sn", nullable = true, length = 50)
    public String getWorkSn() {
        return workSn;
    }

    public void setWorkSn(String workSn) {
        this.workSn = workSn;
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
        BisShopWork that = (BisShopWork) o;
        return Objects.equals(workId, that.workId) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(shopIp, that.shopIp) &&
                Objects.equals(workPassword, that.workPassword) &&
                Objects.equals(whetherSet, that.whetherSet) &&
                Objects.equals(workSn, that.workSn) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(modifyUserId, that.modifyUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workId, shopId, shopIp, workPassword, whetherSet, workSn, createTime, createUserId, modifyTime, modifyUserId);
    }
}
