package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisNurseProject
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_nurse_project", schema = "bms")
public class BisNurseProject {
    private String projectId;
    private String projectName;
    private String typeId;
    private String coverPhoto;
    private String coverBigPhoto;
    private String useDevice;
    private Integer serverTime;
    private Double rmbPrice;
    private Integer beautyPrice;
    private Double manualPrice;
    private Double activePrice;
    private String status;
    private Integer sortNo;
    private String content;
    private String isDel;
    private Timestamp createTime;
    private String createUserId;
    private Timestamp modifyTime;
    private String modifyUserId;

    @Id
    @Column(name = "project_id", nullable = false, length = 50)
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Basic
    @Column(name = "project_name", nullable = true, length = 50)
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Basic
    @Column(name = "type_id", nullable = true, length = 50)
    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
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
    @Column(name = "use_device", nullable = true, length = 500)
    public String getUseDevice() {
        return useDevice;
    }

    public void setUseDevice(String useDevice) {
        this.useDevice = useDevice;
    }

    @Basic
    @Column(name = "server_time", nullable = true)
    public Integer getServerTime() {
        return serverTime;
    }

    public void setServerTime(Integer serverTime) {
        this.serverTime = serverTime;
    }

    @Basic
    @Column(name = "rmb_price", nullable = true, precision = 2)
    public Double getRmbPrice() {
        return rmbPrice;
    }

    public void setRmbPrice(Double rmbPrice) {
        this.rmbPrice = rmbPrice;
    }

    @Basic
    @Column(name = "beauty_price", nullable = true)
    public Integer getBeautyPrice() {
        return beautyPrice;
    }

    public void setBeautyPrice(Integer beautyPrice) {
        this.beautyPrice = beautyPrice;
    }

    @Basic
    @Column(name = "manual_price", nullable = true, precision = 0)
    public Double getManualPrice() {
        return manualPrice;
    }

    public void setManualPrice(Double manualPrice) {
        this.manualPrice = manualPrice;
    }

    @Basic
    @Column(name = "active_price", nullable = true, precision = 2)
    public Double getActivePrice() {
        return activePrice;
    }

    public void setActivePrice(Double activePrice) {
        this.activePrice = activePrice;
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
    @Column(name = "content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisNurseProject that = (BisNurseProject) o;
        return Objects.equals(projectId, that.projectId) &&
                Objects.equals(projectName, that.projectName) &&
                Objects.equals(typeId, that.typeId) &&
                Objects.equals(coverPhoto, that.coverPhoto) &&
                Objects.equals(coverBigPhoto, that.coverBigPhoto) &&
                Objects.equals(useDevice, that.useDevice) &&
                Objects.equals(serverTime, that.serverTime) &&
                Objects.equals(rmbPrice, that.rmbPrice) &&
                Objects.equals(beautyPrice, that.beautyPrice) &&
                Objects.equals(manualPrice, that.manualPrice) &&
                Objects.equals(activePrice, that.activePrice) &&
                Objects.equals(status, that.status) &&
                Objects.equals(sortNo, that.sortNo) &&
                Objects.equals(content, that.content) &&
                Objects.equals(isDel, that.isDel) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(modifyUserId, that.modifyUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, projectName, typeId, coverPhoto, coverBigPhoto, useDevice, serverTime, rmbPrice, beautyPrice, manualPrice, activePrice, status, sortNo, content, isDel, createTime, createUserId, modifyTime, modifyUserId);
    }
}
