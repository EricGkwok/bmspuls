package bms.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisNurseBag
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_nurse_bag", schema = "bms")
public class BisNurseBag {
    private String bagId;
    private String bagName;
    private Double bagTotalPrice;
    private String coverPhoto;
    private String coverBigPhoto;
    private Integer openCardNum;
    private Integer remainNum;
    private Integer maxBuyNum;
    private Integer minBuyNum;
    private Date putawayTime;
    private Date soldoutTime;
    private Integer overdueTime;
    private String content;
    private String status;
    private Integer sortNo;
    private String isDel;
    private Timestamp createTime;
    private String createUserId;
    private Timestamp modifyTime;
    private String modifyUserId;
    private String bagIntroduce;
    private Integer buyCount;

    @Id
    @Column(name = "bag_id", nullable = false, length = 50)
    public String getBagId() {
        return bagId;
    }

    public void setBagId(String bagId) {
        this.bagId = bagId;
    }

    @Basic
    @Column(name = "bag_name", nullable = true, length = 50)
    public String getBagName() {
        return bagName;
    }

    public void setBagName(String bagName) {
        this.bagName = bagName;
    }

    @Basic
    @Column(name = "bag_total_price", nullable = true, precision = 2)
    public Double getBagTotalPrice() {
        return bagTotalPrice;
    }

    public void setBagTotalPrice(Double bagTotalPrice) {
        this.bagTotalPrice = bagTotalPrice;
    }

    @Basic
    @Column(name = "cover_photo", nullable = true, length = 100)
    public String getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }

    @Basic
    @Column(name = "cover_big_photo", nullable = true, length = 100)
    public String getCoverBigPhoto() {
        return coverBigPhoto;
    }

    public void setCoverBigPhoto(String coverBigPhoto) {
        this.coverBigPhoto = coverBigPhoto;
    }

    @Basic
    @Column(name = "open_card_num", nullable = true)
    public Integer getOpenCardNum() {
        return openCardNum;
    }

    public void setOpenCardNum(Integer openCardNum) {
        this.openCardNum = openCardNum;
    }

    @Basic
    @Column(name = "remain_num", nullable = true)
    public Integer getRemainNum() {
        return remainNum;
    }

    public void setRemainNum(Integer remainNum) {
        this.remainNum = remainNum;
    }

    @Basic
    @Column(name = "max_buy_num", nullable = true)
    public Integer getMaxBuyNum() {
        return maxBuyNum;
    }

    public void setMaxBuyNum(Integer maxBuyNum) {
        this.maxBuyNum = maxBuyNum;
    }

    @Basic
    @Column(name = "min_buy_num", nullable = true)
    public Integer getMinBuyNum() {
        return minBuyNum;
    }

    public void setMinBuyNum(Integer minBuyNum) {
        this.minBuyNum = minBuyNum;
    }

    @Basic
    @Column(name = "putaway_time", nullable = true)
    public Date getPutawayTime() {
        return putawayTime;
    }

    public void setPutawayTime(Date putawayTime) {
        this.putawayTime = putawayTime;
    }

    @Basic
    @Column(name = "soldout_time", nullable = true)
    public Date getSoldoutTime() {
        return soldoutTime;
    }

    public void setSoldoutTime(Date soldoutTime) {
        this.soldoutTime = soldoutTime;
    }

    @Basic
    @Column(name = "overdue_time", nullable = true)
    public Integer getOverdueTime() {
        return overdueTime;
    }

    public void setOverdueTime(Integer overdueTime) {
        this.overdueTime = overdueTime;
    }

    @Basic
    @Column(name = "content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
    @Column(name = "sort_no", nullable = true)
    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
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

    @Basic
    @Column(name = "bag_introduce", nullable = true, length = 1000)
    public String getBagIntroduce() {
        return bagIntroduce;
    }

    public void setBagIntroduce(String bagIntroduce) {
        this.bagIntroduce = bagIntroduce;
    }

    @Basic
    @Column(name = "buy_count", nullable = true)
    public Integer getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Integer buyCount) {
        this.buyCount = buyCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisNurseBag that = (BisNurseBag) o;
        return Objects.equals(bagId, that.bagId) &&
                Objects.equals(bagName, that.bagName) &&
                Objects.equals(bagTotalPrice, that.bagTotalPrice) &&
                Objects.equals(coverPhoto, that.coverPhoto) &&
                Objects.equals(coverBigPhoto, that.coverBigPhoto) &&
                Objects.equals(openCardNum, that.openCardNum) &&
                Objects.equals(remainNum, that.remainNum) &&
                Objects.equals(maxBuyNum, that.maxBuyNum) &&
                Objects.equals(minBuyNum, that.minBuyNum) &&
                Objects.equals(putawayTime, that.putawayTime) &&
                Objects.equals(soldoutTime, that.soldoutTime) &&
                Objects.equals(overdueTime, that.overdueTime) &&
                Objects.equals(content, that.content) &&
                Objects.equals(status, that.status) &&
                Objects.equals(sortNo, that.sortNo) &&
                Objects.equals(isDel, that.isDel) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(modifyUserId, that.modifyUserId) &&
                Objects.equals(bagIntroduce, that.bagIntroduce) &&
                Objects.equals(buyCount, that.buyCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bagId, bagName, bagTotalPrice, coverPhoto, coverBigPhoto, openCardNum, remainNum, maxBuyNum, minBuyNum, putawayTime, soldoutTime, overdueTime, content, status, sortNo, isDel, createTime, createUserId, modifyTime, modifyUserId, bagIntroduce, buyCount);
    }
}
