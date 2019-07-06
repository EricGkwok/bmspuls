package bms.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @Classname BisShopCustomPK
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
public class BisShopCustomPK implements Serializable {
    private String customUserId;
    private String shopId;

    @Column(name = "custom_user_id", nullable = false, length = 50)
    @Id
    public String getCustomUserId() {
        return customUserId;
    }

    public void setCustomUserId(String customUserId) {
        this.customUserId = customUserId;
    }

    @Column(name = "shop_id", nullable = false, length = 50)
    @Id
    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisShopCustomPK that = (BisShopCustomPK) o;
        return Objects.equals(customUserId, that.customUserId) &&
                Objects.equals(shopId, that.shopId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customUserId, shopId);
    }
}
