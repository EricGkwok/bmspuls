package bms.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisCustomUser
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_custom_user", schema = "bms")
public class BisCustomUser {
    private String customUserId;
    private String mobile;
    private String username;
    private String password;
    private String nikename;
    private String openid;
    private String unionid;
    private String wechat;
    private String photo;
    private String sex;
    private String phone;
    private String qq;
    private String email;
    private Date bornDate;
    private String idno;
    private String address;
    private String remark;
    private String enrollMode;
    private Timestamp enrollTime;
    private String isDel;
    private String wechatStatus;
    private Integer beautyNum;
    private Integer bagNum;

    @Id
    @Column(name = "custom_user_id", nullable = false, length = 50)
    public String getCustomUserId() {
        return customUserId;
    }

    public void setCustomUserId(String customUserId) {
        this.customUserId = customUserId;
    }

    @Basic
    @Column(name = "mobile", nullable = true, length = 20)
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "username", nullable = true, length = 50)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 50)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "nikename", nullable = true, length = 50)
    public String getNikename() {
        return nikename;
    }

    public void setNikename(String nikename) {
        this.nikename = nikename;
    }

    @Basic
    @Column(name = "openid", nullable = true, length = 50)
    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    @Basic
    @Column(name = "unionid", nullable = true, length = 50)
    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    @Basic
    @Column(name = "wechat", nullable = true, length = 50)
    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    @Basic
    @Column(name = "photo", nullable = true, length = 100)
    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Basic
    @Column(name = "sex", nullable = true, length = 10)
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "phone", nullable = true, length = 50)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "qq", nullable = true, length = 20)
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "email", nullable = true, length = 50)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "born_date", nullable = true)
    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    @Basic
    @Column(name = "idno", nullable = true, length = 20)
    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 100)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "remark", nullable = true, length = 200)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "enroll_mode", nullable = true, length = 10)
    public String getEnrollMode() {
        return enrollMode;
    }

    public void setEnrollMode(String enrollMode) {
        this.enrollMode = enrollMode;
    }

    @Basic
    @Column(name = "enroll_time", nullable = true)
    public Timestamp getEnrollTime() {
        return enrollTime;
    }

    public void setEnrollTime(Timestamp enrollTime) {
        this.enrollTime = enrollTime;
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
    @Column(name = "wechat_status", nullable = true, length = 10)
    public String getWechatStatus() {
        return wechatStatus;
    }

    public void setWechatStatus(String wechatStatus) {
        this.wechatStatus = wechatStatus;
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
    @Column(name = "bag_num", nullable = true)
    public Integer getBagNum() {
        return bagNum;
    }

    public void setBagNum(Integer bagNum) {
        this.bagNum = bagNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisCustomUser that = (BisCustomUser) o;
        return Objects.equals(customUserId, that.customUserId) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(username, that.username) &&
                Objects.equals(password, that.password) &&
                Objects.equals(nikename, that.nikename) &&
                Objects.equals(openid, that.openid) &&
                Objects.equals(unionid, that.unionid) &&
                Objects.equals(wechat, that.wechat) &&
                Objects.equals(photo, that.photo) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(phone, that.phone) &&
                Objects.equals(qq, that.qq) &&
                Objects.equals(email, that.email) &&
                Objects.equals(bornDate, that.bornDate) &&
                Objects.equals(idno, that.idno) &&
                Objects.equals(address, that.address) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(enrollMode, that.enrollMode) &&
                Objects.equals(enrollTime, that.enrollTime) &&
                Objects.equals(isDel, that.isDel) &&
                Objects.equals(wechatStatus, that.wechatStatus) &&
                Objects.equals(beautyNum, that.beautyNum) &&
                Objects.equals(bagNum, that.bagNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customUserId, mobile, username, password, nikename, openid, unionid, wechat, photo, sex, phone, qq, email, bornDate, idno, address, remark, enrollMode, enrollTime, isDel, wechatStatus, beautyNum, bagNum);
    }
}
