package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisShopCustom
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_shop_custom", schema = "bms")
@IdClass(BisShopCustomPK.class)
public class BisShopCustom {
    private String customUserId;
    private String shopId;
    private Timestamp recentTime;
    private Timestamp createTime;

    @Id
    @Column(name = "custom_user_id", nullable = false, length = 50)
    public String getCustomUserId() {
        return customUserId;
    }

    public void setCustomUserId(String customUserId) {
        this.customUserId = customUserId;
    }

    @Id
    @Column(name = "shop_id", nullable = false, length = 50)
    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "recent_time", nullable = true)
    public Timestamp getRecentTime() {
        return recentTime;
    }

    public void setRecentTime(Timestamp recentTime) {
        this.recentTime = recentTime;
    }

    @Basic
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisShopCustom that = (BisShopCustom) o;
        return Objects.equals(customUserId, that.customUserId) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(recentTime, that.recentTime) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customUserId, shopId, recentTime, createTime);
    }
}
