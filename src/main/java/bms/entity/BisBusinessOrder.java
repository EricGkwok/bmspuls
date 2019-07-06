package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisBusinessOrder
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_business_order", schema = "bms")
public class BisBusinessOrder {
    private String orderId;
    private String orderContent;
    private String projectId;
    private String shopId;
    private String customUserId;
    private Timestamp subscribeTime;
    private String orderType;
    private Double orderMoney;
    private Integer buyNum;
    private Double payMoney;
    private Integer extendBeautyNum;
    private Double cashIncome;
    private Double extendIncome;
    private String payWay;
    private Timestamp payTime;
    private String checkCode;
    private String orderStatus;
    private String orderRemark;
    private String serverUserId;
    private String handleUserId;
    private Timestamp createTime;
    private Timestamp serviceTime;
    private Timestamp cancelTime;
    private String cancelType;
    private Timestamp finishTime;
    private String orderSource;
    private String modifyStatus;
    private Integer freeNum;

    @Id
    @Column(name = "order_id", nullable = false, length = 50)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "order_content", nullable = true, length = 200)
    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }

    @Basic
    @Column(name = "project_id", nullable = true, length = 50)
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
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
    @Column(name = "custom_user_id", nullable = true, length = 50)
    public String getCustomUserId() {
        return customUserId;
    }

    public void setCustomUserId(String customUserId) {
        this.customUserId = customUserId;
    }

    @Basic
    @Column(name = "subscribe_time", nullable = true)
    public Timestamp getSubscribeTime() {
        return subscribeTime;
    }

    public void setSubscribeTime(Timestamp subscribeTime) {
        this.subscribeTime = subscribeTime;
    }

    @Basic
    @Column(name = "order_type", nullable = true, length = 10)
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @Basic
    @Column(name = "order_money", nullable = true, precision = 2)
    public Double getOrderMoney() {
        return orderMoney;
    }

    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
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
    @Column(name = "pay_money", nullable = true, precision = 0)
    public Double getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Double payMoney) {
        this.payMoney = payMoney;
    }

    @Basic
    @Column(name = "extend_beauty_num", nullable = true)
    public Integer getExtendBeautyNum() {
        return extendBeautyNum;
    }

    public void setExtendBeautyNum(Integer extendBeautyNum) {
        this.extendBeautyNum = extendBeautyNum;
    }

    @Basic
    @Column(name = "cash_income", nullable = true, precision = 2)
    public Double getCashIncome() {
        return cashIncome;
    }

    public void setCashIncome(Double cashIncome) {
        this.cashIncome = cashIncome;
    }

    @Basic
    @Column(name = "extend_income", nullable = true, precision = 2)
    public Double getExtendIncome() {
        return extendIncome;
    }

    public void setExtendIncome(Double extendIncome) {
        this.extendIncome = extendIncome;
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
    @Column(name = "check_code", nullable = true, length = 50)
    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    @Basic
    @Column(name = "order_status", nullable = true, length = 10)
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Basic
    @Column(name = "order_remark", nullable = true, length = 200)
    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    @Basic
    @Column(name = "server_user_id", nullable = true, length = 50)
    public String getServerUserId() {
        return serverUserId;
    }

    public void setServerUserId(String serverUserId) {
        this.serverUserId = serverUserId;
    }

    @Basic
    @Column(name = "handle_user_id", nullable = true, length = 50)
    public String getHandleUserId() {
        return handleUserId;
    }

    public void setHandleUserId(String handleUserId) {
        this.handleUserId = handleUserId;
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
    @Column(name = "service_time", nullable = true)
    public Timestamp getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(Timestamp serviceTime) {
        this.serviceTime = serviceTime;
    }

    @Basic
    @Column(name = "cancel_time", nullable = true)
    public Timestamp getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Timestamp cancelTime) {
        this.cancelTime = cancelTime;
    }

    @Basic
    @Column(name = "cancel_type", nullable = true, length = 10)
    public String getCancelType() {
        return cancelType;
    }

    public void setCancelType(String cancelType) {
        this.cancelType = cancelType;
    }

    @Basic
    @Column(name = "finish_time", nullable = true)
    public Timestamp getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Timestamp finishTime) {
        this.finishTime = finishTime;
    }

    @Basic
    @Column(name = "order_source", nullable = true, length = 10)
    public String getOrderSource() {
        return orderSource;
    }

    public void setOrderSource(String orderSource) {
        this.orderSource = orderSource;
    }

    @Basic
    @Column(name = "modify_status", nullable = true, length = 10)
    public String getModifyStatus() {
        return modifyStatus;
    }

    public void setModifyStatus(String modifyStatus) {
        this.modifyStatus = modifyStatus;
    }

    @Basic
    @Column(name = "free_num", nullable = true)
    public Integer getFreeNum() {
        return freeNum;
    }

    public void setFreeNum(Integer freeNum) {
        this.freeNum = freeNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisBusinessOrder that = (BisBusinessOrder) o;
        return Objects.equals(orderId, that.orderId) &&
                Objects.equals(orderContent, that.orderContent) &&
                Objects.equals(projectId, that.projectId) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(customUserId, that.customUserId) &&
                Objects.equals(subscribeTime, that.subscribeTime) &&
                Objects.equals(orderType, that.orderType) &&
                Objects.equals(orderMoney, that.orderMoney) &&
                Objects.equals(buyNum, that.buyNum) &&
                Objects.equals(payMoney, that.payMoney) &&
                Objects.equals(extendBeautyNum, that.extendBeautyNum) &&
                Objects.equals(cashIncome, that.cashIncome) &&
                Objects.equals(extendIncome, that.extendIncome) &&
                Objects.equals(payWay, that.payWay) &&
                Objects.equals(payTime, that.payTime) &&
                Objects.equals(checkCode, that.checkCode) &&
                Objects.equals(orderStatus, that.orderStatus) &&
                Objects.equals(orderRemark, that.orderRemark) &&
                Objects.equals(serverUserId, that.serverUserId) &&
                Objects.equals(handleUserId, that.handleUserId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(serviceTime, that.serviceTime) &&
                Objects.equals(cancelTime, that.cancelTime) &&
                Objects.equals(cancelType, that.cancelType) &&
                Objects.equals(finishTime, that.finishTime) &&
                Objects.equals(orderSource, that.orderSource) &&
                Objects.equals(modifyStatus, that.modifyStatus) &&
                Objects.equals(freeNum, that.freeNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderContent, projectId, shopId, customUserId, subscribeTime, orderType, orderMoney, buyNum, payMoney, extendBeautyNum, cashIncome, extendIncome, payWay, payTime, checkCode, orderStatus, orderRemark, serverUserId, handleUserId, createTime, serviceTime, cancelTime, cancelType, finishTime, orderSource, modifyStatus, freeNum);
    }
}
