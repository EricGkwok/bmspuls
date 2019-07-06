package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisBagProject
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_bag_project", schema = "bms")
public class BisBagProject {
    private String bagId;
    private String projectId;
    private Double projectOldPrice;
    private Double projectNewPrice;
    private Integer projectNum;
    private Timestamp createTime;
    private String createUserId;

    @Id
    @Column(name = "bag_id", nullable = false, length = 50)
    public String getBagId() {
        return bagId;
    }

    public void setBagId(String bagId) {
        this.bagId = bagId;
    }

    @Basic
    @Column(name = "project_id", nullable = false, length = 50)
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Basic
    @Column(name = "project_old_price", nullable = true, precision = 2)
    public Double getProjectOldPrice() {
        return projectOldPrice;
    }

    public void setProjectOldPrice(Double projectOldPrice) {
        this.projectOldPrice = projectOldPrice;
    }

    @Basic
    @Column(name = "project_new_price", nullable = true, precision = 2)
    public Double getProjectNewPrice() {
        return projectNewPrice;
    }

    public void setProjectNewPrice(Double projectNewPrice) {
        this.projectNewPrice = projectNewPrice;
    }

    @Basic
    @Column(name = "project_num", nullable = true)
    public Integer getProjectNum() {
        return projectNum;
    }

    public void setProjectNum(Integer projectNum) {
        this.projectNum = projectNum;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisBagProject that = (BisBagProject) o;
        return Objects.equals(bagId, that.bagId) &&
                Objects.equals(projectId, that.projectId) &&
                Objects.equals(projectOldPrice, that.projectOldPrice) &&
                Objects.equals(projectNewPrice, that.projectNewPrice) &&
                Objects.equals(projectNum, that.projectNum) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUserId, that.createUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bagId, projectId, projectOldPrice, projectNewPrice, projectNum, createTime, createUserId);
    }
}
