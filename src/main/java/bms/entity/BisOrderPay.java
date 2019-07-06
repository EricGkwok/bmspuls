package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisOrderPay
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_order_pay", schema = "bms", catalog = "")
public class BisOrderPay {
    private String payId;
    private String orderId;
    private String buyAccount;
    private String payCode;
    private String payWay;
    private Timestamp createTime;
    private Timestamp payTime;
    private Double payMoney;
    private String payStatus;
    private String payBack;
    private String payType;
    private String errorMessage;
    private Timestamp nodifyTime;
    private String transactionId;
    private String outTransactionId;
    private String refundId;
    private String authCode;

    @Id
    @Column(name = "pay_id", nullable = false, length = 50)
    public String getPayId() {
        return payId;
    }

    public void setPayId(String payId) {
        this.payId = payId;
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
    @Column(name = "buy_account", nullable = true, length = 100)
    public String getBuyAccount() {
        return buyAccount;
    }

    public void setBuyAccount(String buyAccount) {
        this.buyAccount = buyAccount;
    }

    @Basic
    @Column(name = "pay_code", nullable = true, length = 50)
    public String getPayCode() {
        return payCode;
    }

    public void setPayCode(String payCode) {
        this.payCode = payCode;
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
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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
    @Column(name = "pay_money", nullable = true, precision = 0)
    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    @Basic
    @Column(name = "pay_status", nullable = true, length = 10)
    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    @Basic
    @Column(name = "pay_back", nullable = true, length = 10)
    public String getPayBack() {
        return payBack;
    }

    public void setPayBack(String payBack) {
        this.payBack = payBack;
    }

    @Basic
    @Column(name = "pay_type", nullable = true, length = 10)
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Basic
    @Column(name = "error_message", nullable = true, length = 200)
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Basic
    @Column(name = "nodify_time", nullable = true)
    public Timestamp getNodifyTime() {
        return nodifyTime;
    }

    public void setNodifyTime(Timestamp nodifyTime) {
        this.nodifyTime = nodifyTime;
    }

    @Basic
    @Column(name = "transaction_id", nullable = true, length = 50)
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    @Basic
    @Column(name = "out_transaction_id", nullable = true, length = 50)
    public String getOutTransactionId() {
        return outTransactionId;
    }

    public void setOutTransactionId(String outTransactionId) {
        this.outTransactionId = outTransactionId;
    }

    @Basic
    @Column(name = "refund_id", nullable = true, length = 50)
    public String getRefundId() {
        return refundId;
    }

    public void setRefundId(String refundId) {
        this.refundId = refundId;
    }

    @Basic
    @Column(name = "auth_code", nullable = true, length = 50)
    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisOrderPay that = (BisOrderPay) o;
        return Objects.equals(payId, that.payId) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(buyAccount, that.buyAccount) &&
                Objects.equals(payCode, that.payCode) &&
                Objects.equals(payWay, that.payWay) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(payTime, that.payTime) &&
                Objects.equals(payMoney, that.payMoney) &&
                Objects.equals(payStatus, that.payStatus) &&
                Objects.equals(payBack, that.payBack) &&
                Objects.equals(payType, that.payType) &&
                Objects.equals(errorMessage, that.errorMessage) &&
                Objects.equals(nodifyTime, that.nodifyTime) &&
                Objects.equals(transactionId, that.transactionId) &&
                Objects.equals(outTransactionId, that.outTransactionId) &&
                Objects.equals(refundId, that.refundId) &&
                Objects.equals(authCode, that.authCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(payId, orderId, buyAccount, payCode, payWay, createTime, payTime, payMoney, payStatus, payBack, payType, errorMessage, nodifyTime, transactionId, outTransactionId, refundId, authCode);
    }
}
