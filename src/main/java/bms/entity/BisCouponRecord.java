package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisCouponRecord
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_coupon_record", schema = "bms")
public class BisCouponRecord {
    private String recordId;
    private String activeId;
    private String cdkey;
    private String mobile;
    private String status;
    private Timestamp createTime;
    private Timestamp exchangeTime;

    @Id
    @Column(name = "record_id", nullable = false, length = 50)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "active_id", nullable = true, length = 50)
    public String getActiveId() {
        return activeId;
    }

    public void setActiveId(String activeId) {
        this.activeId = activeId;
    }

    @Basic
    @Column(name = "cdkey", nullable = true, length = 50)
    public String getCdkey() {
        return cdkey;
    }

    public void setCdkey(String cdkey) {
        this.cdkey = cdkey;
    }

    @Basic
    @Column(name = "mobile", nullable = true, length = 50)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "exchange_time", nullable = true)
    public Timestamp getExchangeTime() {
        return exchangeTime;
    }

    public void setExchangeTime(Timestamp exchangeTime) {
        this.exchangeTime = exchangeTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisCouponRecord that = (BisCouponRecord) o;
        return Objects.equals(recordId, that.recordId) &&
                Objects.equals(activeId, that.activeId) &&
                Objects.equals(cdkey, that.cdkey) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(status, that.status) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(exchangeTime, that.exchangeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, activeId, cdkey, mobile, status, createTime, exchangeTime);
    }
}
