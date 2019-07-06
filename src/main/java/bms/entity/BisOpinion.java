package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisOpinion
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_opinion", schema = "bms")
public class BisOpinion {
    private String opinionId;
    private String customUserId;
    private String content;
    private Timestamp createTime;

    @Id
    @Column(name = "opinion_id", nullable = false, length = 50)
    public String getOpinionId() {
        return opinionId;
    }

    public void setOpinionId(String opinionId) {
        this.opinionId = opinionId;
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
    @Column(name = "content", nullable = true, length = -1)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        BisOpinion that = (BisOpinion) o;
        return Objects.equals(opinionId, that.opinionId) &&
                Objects.equals(customUserId, that.customUserId) &&
                Objects.equals(content, that.content) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(opinionId, customUserId, content, createTime);
    }
}
