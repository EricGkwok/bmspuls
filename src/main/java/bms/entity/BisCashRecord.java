package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisCashRecord
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_cash_record", schema = "bms")
public class BisCashRecord {
    private String recordId;
    private String orderId;
    private String customUserId;
    private Integer beautyNum;
    private Double money;
    private String payWay;
    private String cashType;
    private String recordType;
    private Timestamp payTime;

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
    @Column(name = "money", nullable = true, precision = 0)
    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Basic
    @Column(name = "pay_way", nullable = true, length = 10)
    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    @Basic
    @Column(name = "cash_type", nullable = true, length = 10)
    public String getCashType() {
        return cashType;
    }

    public void setCashType(String cashType) {
        this.cashType = cashType;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisCashRecord that = (BisCashRecord) o;
        return Objects.equals(recordId, that.recordId) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(customUserId, that.customUserId) &&
                Objects.equals(beautyNum, that.beautyNum) &&
                Objects.equals(money, that.money) &&
                Objects.equals(payWay, that.payWay) &&
                Objects.equals(cashType, that.cashType) &&
                Objects.equals(recordType, that.recordType) &&
                Objects.equals(payTime, that.payTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, orderId, customUserId, beautyNum, money, payWay, cashType, recordType, payTime);
    }
}
