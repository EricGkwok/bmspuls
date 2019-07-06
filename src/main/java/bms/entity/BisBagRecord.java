package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisBagRecord
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_bag_record", schema = "bms")
public class BisBagRecord {
    private String recordId;
    private String bagId;
    private Integer validDay;
    private String customUserId;
    private Integer buyNum;
    private Integer shareNum;
    private Timestamp createTime;
    private String orderId;
    private String shareUserId;
    private Timestamp bagTime;
    private String recordType;
    private String status;
    private String receiveStatus;

    @Id
    @Column(name = "record_id", nullable = false, length = 50)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "bag_id", nullable = true, length = 50)
    public String getBagId() {
        return bagId;
    }

    public void setBagId(String bagId) {
        this.bagId = bagId;
    }

    @Basic
    @Column(name = "valid_day", nullable = true)
    public Integer getValidDay() {
        return validDay;
    }

    public void setValidDay(Integer validDay) {
        this.validDay = validDay;
    }

    @Basic
    @Column(name = "custom_user_id", nullable = true, length = 50)
    public String getCustomUserId() {
        return customUserId;
    }

    public void setCustomUserId(String customUserId) {
        this.customUserId = customUserId;
    }

    @Basic
    @Column(name = "buy_num", nullable = true)
    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    @Basic
    @Column(name = "share_num", nullable = true)
    public Integer getShareNum() {
        return shareNum;
    }

    public void setShareNum(Integer shareNum) {
        this.shareNum = shareNum;
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
    @Column(name = "order_id", nullable = true, length = 50)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "share_user_id", nullable = true, length = 10)
    public String getShareUserId() {
        return shareUserId;
    }

    public void setShareUserId(String shareUserId) {
        this.shareUserId = shareUserId;
    }

    @Basic
    @Column(name = "bag_time", nullable = true)
    public Timestamp getBagTime() {
        return bagTime;
    }

    public void setBagTime(Timestamp bagTime) {
        this.bagTime = bagTime;
    }

    @Basic
    @Column(name = "record_type", nullable = true, length = 10)
    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
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
    @Column(name = "receive_status", nullable = true, length = 10)
    public String getReceiveStatus() {
        return receiveStatus;
    }

    public void setReceiveStatus(String receiveStatus) {
        this.receiveStatus = receiveStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisBagRecord that = (BisBagRecord) o;
        return Objects.equals(recordId, that.recordId) &&
                Objects.equals(bagId, that.bagId) &&
                Objects.equals(validDay, that.validDay) &&
                Objects.equals(customUserId, that.customUserId) &&
                Objects.equals(buyNum, that.buyNum) &&
                Objects.equals(shareNum, that.shareNum) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(shareUserId, that.shareUserId) &&
                Objects.equals(bagTime, that.bagTime) &&
                Objects.equals(recordType, that.recordType) &&
                Objects.equals(status, that.status) &&
                Objects.equals(receiveStatus, that.receiveStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, bagId, validDay, customUserId, buyNum, shareNum, createTime, orderId, shareUserId, bagTime, recordType, status, receiveStatus);
    }
}
