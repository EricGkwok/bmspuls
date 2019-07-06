package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisBeautyRecord
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_beauty_record", schema = "bms")
public class BisBeautyRecord {
    private String recordId;
    private String orderId;
    private String cdkey;
    private String customUserId;
    private Integer beautyNum;
    private Integer giveNum;
    private Double totalMoney;
    private Double singePrice;
    private String recordType;
    private Timestamp payTime;
    private String vaildStatus;
    private String shopId;
    private Integer remainNum;

    @Id
    @Column(name = "record_id", nullable = false, length = 50)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
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
    @Column(name = "cdkey", nullable = true, length = 50)
    public String getCdkey() {
        return cdkey;
    }

    public void setCdkey(String cdkey) {
        this.cdkey = cdkey;
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
    @Column(name = "beauty_num", nullable = true)
    public Integer getBeautyNum() {
        return beautyNum;
    }

    public void setBeautyNum(Integer beautyNum) {
        this.beautyNum = beautyNum;
    }

    @Basic
    @Column(name = "give_num", nullable = true)
    public Integer getGiveNum() {
        return giveNum;
    }

    public void setGiveNum(Integer giveNum) {
        this.giveNum = giveNum;
    }

    @Basic
    @Column(name = "total_money", nullable = true, precision = 2)
    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Basic
    @Column(name = "singe_price", nullable = true, precision = 2)
    public Double getSingePrice() {
        return singePrice;
    }

    public void setSingePrice(Double singePrice) {
        this.singePrice = singePrice;
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
    @Column(name = "pay_time", nullable = true)
    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    @Basic
    @Column(name = "vaild_status", nullable = true, length = 10)
    public String getVaildStatus() {
        return vaildStatus;
    }

    public void setVaildStatus(String vaildStatus) {
        this.vaildStatus = vaildStatus;
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
    @Column(name = "remain_num", nullable = true)
    public Integer getRemainNum() {
        return remainNum;
    }

    public void setRemainNum(Integer remainNum) {
        this.remainNum = remainNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisBeautyRecord that = (BisBeautyRecord) o;
        return Objects.equals(recordId, that.recordId) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(cdkey, that.cdkey) &&
                Objects.equals(customUserId, that.customUserId) &&
                Objects.equals(beautyNum, that.beautyNum) &&
                Objects.equals(giveNum, that.giveNum) &&
                Objects.equals(totalMoney, that.totalMoney) &&
                Objects.equals(singePrice, that.singePrice) &&
                Objects.equals(recordType, that.recordType) &&
                Objects.equals(payTime, that.payTime) &&
                Objects.equals(vaildStatus, that.vaildStatus) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(remainNum, that.remainNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, orderId, cdkey, customUserId, beautyNum, giveNum, totalMoney, singePrice, recordType, payTime, vaildStatus, shopId, remainNum);
    }
}
