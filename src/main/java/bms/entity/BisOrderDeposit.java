package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisOrderDeposit
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_order_deposit", schema = "bms")
public class BisOrderDeposit {
    private String depositId;
    private String orderId;
    private String payAccount;
    private Double depositMoney;
    private String payWay;
    private Timestamp payTime;
    private String depositStatus;
    private Timestamp backTime;
    private String customUserId;

    @Id
    @Column(name = "deposit_id", nullable = false, length = 50)
    public String getDepositId() {
        return depositId;
    }

    public void setDepositId(String depositId) {
        this.depositId = depositId;
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
    @Column(name = "pay_account", nullable = true, length = 100)
    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    @Basic
    @Column(name = "deposit_money", nullable = true, precision = 0)
    public Double getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(Double depositMoney) {
        this.depositMoney = depositMoney;
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
    @Column(name = "pay_time", nullable = true)
    public Timestamp getPayTime() {
        return payTime;
    }

    public void setPayTime(Timestamp payTime) {
        this.payTime = payTime;
    }

    @Basic
    @Column(name = "deposit_status", nullable = true, length = 10)
    public String getDepositStatus() {
        return depositStatus;
    }

    public void setDepositStatus(String depositStatus) {
        this.depositStatus = depositStatus;
    }

    @Basic
    @Column(name = "back_time", nullable = true)
    public Timestamp getBackTime() {
        return backTime;
    }

    public void setBackTime(Timestamp backTime) {
        this.backTime = backTime;
    }

    @Basic
    @Column(name = "custom_user_id", nullable = true, length = 50)
    public String getCustomUserId() {
        return customUserId;
    }

    public void setCustomUserId(String customUserId) {
        this.customUserId = customUserId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisOrderDeposit that = (BisOrderDeposit) o;
        return Objects.equals(depositId, that.depositId) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(payAccount, that.payAccount) &&
                Objects.equals(depositMoney, that.depositMoney) &&
                Objects.equals(payWay, that.payWay) &&
                Objects.equals(payTime, that.payTime) &&
                Objects.equals(depositStatus, that.depositStatus) &&
                Objects.equals(backTime, that.backTime) &&
                Objects.equals(customUserId, that.customUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(depositId, orderId, payAccount, depositMoney, payWay, payTime, depositStatus, backTime, customUserId);
    }
}
