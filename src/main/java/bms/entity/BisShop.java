package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisShop
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_shop", schema = "bms")
public class BisShop {
    private String shopId;
    private String ownerId;
    private String shopName;
    private String shortName;
    private Double monthCashIn;
    private Double monthExpendIn;
    private String shopLicense;
    private String shopImage;
    private String shopDetailImage;
    private Double gpsX;
    private Double gpsY;
    private Integer sortNo;
    private String shopAddress;
    private String shopQrcode;
    private String shopPhone;
    private Double shopArea;
    private String shopProject;
    private String shopType;
    private String shopIntro;
    private String showStatus;
    private String isDel;
    private String shopRemark;
    private String beginTime;
    private String endTime;
    private Timestamp createTime;
    private String createUserId;
    private Timestamp modifyTime;
    private String modifyUserId;

    @Id
    @Column(name = "shop_id", nullable = false, length = 50)
    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "owner_id", nullable = true, length = 50)
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    @Basic
    @Column(name = "shop_name", nullable = true, length = 100)
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Basic
    @Column(name = "short_name", nullable = true, length = 100)
    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Basic
    @Column(name = "month_cash_in", nullable = true, precision = 2)
    public Double getMonthCashIn() {
        return monthCashIn;
    }

    public void setMonthCashIn(Double monthCashIn) {
        this.monthCashIn = monthCashIn;
    }

    @Basic
    @Column(name = "month_expend_in", nullable = true, precision = 2)
    public Double getMonthExpendIn() {
        return monthExpendIn;
    }

    public void setMonthExpendIn(Double monthExpendIn) {
        this.monthExpendIn = monthExpendIn;
    }

    @Basic
    @Column(name = "shop_license", nullable = true, length = 100)
    public String getShopLicense() {
        return shopLicense;
    }

    public void setShopLicense(String shopLicense) {
        this.shopLicense = shopLicense;
    }

    @Basic
    @Column(name = "shop_image", nullable = true, length = 100)
    public String getShopImage() {
        return shopImage;
    }

    public void setShopImage(String shopImage) {
        this.shopImage = shopImage;
    }

    @Basic
    @Column(name = "shop_detail_image", nullable = true, length = 100)
    public String getShopDetailImage() {
        return shopDetailImage;
    }

    public void setShopDetailImage(String shopDetailImage) {
        this.shopDetailImage = shopDetailImage;
    }

    @Basic
    @Column(name = "gps_x", nullable = true, precision = 0)
    public Double getGpsX() {
        return gpsX;
    }

    public void setGpsX(Double gpsX) {
        this.gpsX = gpsX;
    }

    @Basic
    @Column(name = "gps_y", nullable = true, precision = 0)
    public Double getGpsY() {
        return gpsY;
    }

    public void setGpsY(Double gpsY) {
        this.gpsY = gpsY;
    }

    @Basic
    @Column(name = "sort_no", nullable = true)
    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    @Basic
    @Column(name = "shop_address", nullable = true, length = 200)
    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    @Basic
    @Column(name = "shop_qrcode", nullable = true, length = 100)
    public String getShopQrcode() {
        return shopQrcode;
    }

    public void setShopQrcode(String shopQrcode) {
        this.shopQrcode = shopQrcode;
    }

    @Basic
    @Column(name = "shop_phone", nullable = true, length = 50)
    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    @Basic
    @Column(name = "shop_area", nullable = true, precision = 2)
    public Double getShopArea() {
        return shopArea;
    }

    public void setShopArea(Double shopArea) {
        this.shopArea = shopArea;
    }

    @Basic
    @Column(name = "shop_project", nullable = true, length = 100)
    public String getShopProject() {
        return shopProject;
    }

    public void setShopProject(String shopProject) {
        this.shopProject = shopProject;
    }

    @Basic
    @Column(name = "shop_type", nullable = true, length = 10)
    public String getShopType() {
        return shopType;
    }

    public void setShopType(String shopType) {
        this.shopType = shopType;
    }

    @Basic
    @Column(name = "shop_intro", nullable = true, length = -1)
    public String getShopIntro() {
        return shopIntro;
    }

    public void setShopIntro(String shopIntro) {
        this.shopIntro = shopIntro;
    }

    @Basic
    @Column(name = "show_status", nullable = true, length = 10)
    public String getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(String showStatus) {
        this.showStatus = showStatus;
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
    @Column(name = "shop_remark", nullable = true, length = 200)
    public String getShopRemark() {
        return shopRemark;
    }

    public void setShopRemark(String shopRemark) {
        this.shopRemark = shopRemark;
    }

    @Basic
    @Column(name = "begin_time", nullable = true, length = 50)
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    @Basic
    @Column(name = "end_time", nullable = true, length = 50)
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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
        BisShop bisShop = (BisShop) o;
        return Objects.equals(shopId, bisShop.shopId) &&
                Objects.equals(ownerId, bisShop.ownerId) &&
                Objects.equals(shopName, bisShop.shopName) &&
                Objects.equals(shortName, bisShop.shortName) &&
                Objects.equals(monthCashIn, bisShop.monthCashIn) &&
                Objects.equals(monthExpendIn, bisShop.monthExpendIn) &&
                Objects.equals(shopLicense, bisShop.shopLicense) &&
                Objects.equals(shopImage, bisShop.shopImage) &&
                Objects.equals(shopDetailImage, bisShop.shopDetailImage) &&
                Objects.equals(gpsX, bisShop.gpsX) &&
                Objects.equals(gpsY, bisShop.gpsY) &&
                Objects.equals(sortNo, bisShop.sortNo) &&
                Objects.equals(shopAddress, bisShop.shopAddress) &&
                Objects.equals(shopQrcode, bisShop.shopQrcode) &&
                Objects.equals(shopPhone, bisShop.shopPhone) &&
                Objects.equals(shopArea, bisShop.shopArea) &&
                Objects.equals(shopProject, bisShop.shopProject) &&
                Objects.equals(shopType, bisShop.shopType) &&
                Objects.equals(shopIntro, bisShop.shopIntro) &&
                Objects.equals(showStatus, bisShop.showStatus) &&
                Objects.equals(isDel, bisShop.isDel) &&
                Objects.equals(shopRemark, bisShop.shopRemark) &&
                Objects.equals(beginTime, bisShop.beginTime) &&
                Objects.equals(endTime, bisShop.endTime) &&
                Objects.equals(createTime, bisShop.createTime) &&
                Objects.equals(createUserId, bisShop.createUserId) &&
                Objects.equals(modifyTime, bisShop.modifyTime) &&
                Objects.equals(modifyUserId, bisShop.modifyUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, ownerId, shopName, shortName, monthCashIn, monthExpendIn, shopLicense, shopImage, shopDetailImage, gpsX, gpsY, sortNo, shopAddress, shopQrcode, shopPhone, shopArea, shopProject, shopType, shopIntro, showStatus, isDel, shopRemark, beginTime, endTime, createTime, createUserId, modifyTime, modifyUserId);
    }
}
