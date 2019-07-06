package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisProjectRecord
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_project_record", schema = "bms")
public class BisProjectRecord {
    private String recordId;
    private String projectId;
    private String bagRecordId;
    private String shopId;
    private String projectStatus;
    private Timestamp drawTime;
    private Timestamp useTime;

    @Id
    @Column(name = "record_id", nullable = false, length = 50)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
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
    @Column(name = "bag_record_id", nullable = true, length = 50)
    public String getBagRecordId() {
        return bagRecordId;
    }

    public void setBagRecordId(String bagRecordId) {
        this.bagRecordId = bagRecordId;
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
    @Column(name = "project_status", nullable = true, length = 10)
    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    @Basic
    @Column(name = "draw_time", nullable = true)
    public Timestamp getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(Timestamp drawTime) {
        this.drawTime = drawTime;
    }

    @Basic
    @Column(name = "use_time", nullable = true)
    public Timestamp getUseTime() {
        return useTime;
    }

    public void setUseTime(Timestamp useTime) {
        this.useTime = useTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisProjectRecord that = (BisProjectRecord) o;
        return Objects.equals(recordId, that.recordId) &&
                Objects.equals(projectId, that.projectId) &&
                Objects.equals(bagRecordId, that.bagRecordId) &&
                Objects.equals(shopId, that.shopId) &&
                Objects.equals(projectStatus, that.projectStatus) &&
                Objects.equals(drawTime, that.drawTime) &&
                Objects.equals(useTime, that.useTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, projectId, bagRecordId, shopId, projectStatus, drawTime, useTime);
    }
}
