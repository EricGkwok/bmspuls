package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisBeautyConfig
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_beauty_config", schema = "bms")
public class BisBeautyConfig {
    private String configId;
    private Integer buyNum;
    private Integer giveNum;
    private String isDel;
    private Timestamp createTime;
    private String createUserId;
    private Timestamp modifyTime;
    private String modifyUserId;
    private String remark;

    @Id
    @Column(name = "config_id", nullable = false, length = 50)
    public String getConfigId() {
        return configId;
    }

    public void setConfigId(String configId) {
        this.configId = configId;
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
    @Column(name = "give_num", nullable = true)
    public Integer getGiveNum() {
        return giveNum;
    }

    public void setGiveNum(Integer giveNum) {
        this.giveNum = giveNum;
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
    @Column(name = "remark", nullable = true, length = 400)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisBeautyConfig that = (BisBeautyConfig) o;
        return Objects.equals(configId, that.configId) &&
                Objects.equals(buyNum, that.buyNum) &&
                Objects.equals(giveNum, that.giveNum) &&
                Objects.equals(isDel, that.isDel) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(modifyUserId, that.modifyUserId) &&
                Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configId, buyNum, giveNum, isDel, createTime, createUserId, modifyTime, modifyUserId, remark);
    }
}
