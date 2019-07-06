package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisWechatRecord
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_wechat_record", schema = "bms")
public class BisWechatRecord {
    private String recordId;
    private String content;
    private String recordType;
    private String sendUserId;
    private String createUserId;
    private Timestamp createTime;
    private String status;
    private Timestamp sendTime;
    private String failureCause;

    @Id
    @Column(name = "record_id", nullable = false, length = 50)
    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "content", nullable = true, length = 100)
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "record_type", nullable = true, length = 10)
    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    @Basic
    @Column(name = "send_user_id", nullable = true, length = 50)
    public String getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId;
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
    @Column(name = "create_time", nullable = true)
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
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
    @Column(name = "send_time", nullable = true)
    public Timestamp getSendTime() {
        return sendTime;
    }

    public void setSendTime(Timestamp sendTime) {
        this.sendTime = sendTime;
    }

    @Basic
    @Column(name = "failure_cause", nullable = true, length = 200)
    public String getFailureCause() {
        return failureCause;
    }

    public void setFailureCause(String failureCause) {
        this.failureCause = failureCause;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisWechatRecord that = (BisWechatRecord) o;
        return Objects.equals(recordId, that.recordId) &&
                Objects.equals(content, that.content) &&
                Objects.equals(recordType, that.recordType) &&
                Objects.equals(sendUserId, that.sendUserId) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(status, that.status) &&
                Objects.equals(sendTime, that.sendTime) &&
                Objects.equals(failureCause, that.failureCause);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, content, recordType, sendUserId, createUserId, createTime, status, sendTime, failureCause);
    }
}
