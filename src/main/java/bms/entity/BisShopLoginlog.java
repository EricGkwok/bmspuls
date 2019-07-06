package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisShopLoginlog
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_shop_loginlog", schema = "bms")
public class BisShopLoginlog {
    private String logId;
    private String sessionId;
    private String username;
    private String account;
    private Timestamp loginTime;
    private String userId;
    private String loginIp;
    private String explorer;
    private Timestamp exitTime;
    private String exitType;

    @Id
    @Column(name = "log_id", nullable = false, length = 50)
    public String getLogId() {
        return logId;
    }

    public void setLogId(String logId) {
        this.logId = logId;
    }

    @Basic
    @Column(name = "session_id", nullable = true, length = 50)
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
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
    @Column(name = "account", nullable = true, length = 50)
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Basic
    @Column(name = "login_time", nullable = true)
    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    @Basic
    @Column(name = "user_id", nullable = true, length = 50)
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "login_ip", nullable = true, length = 50)
    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    @Basic
    @Column(name = "explorer", nullable = true, length = 50)
    public String getExplorer() {
        return explorer;
    }

    public void setExplorer(String explorer) {
        this.explorer = explorer;
    }

    @Basic
    @Column(name = "exit_time", nullable = true)
    public Timestamp getExitTime() {
        return exitTime;
    }

    public void setExitTime(Timestamp exitTime) {
        this.exitTime = exitTime;
    }

    @Basic
    @Column(name = "exit_type", nullable = true, length = 10)
    public String getExitType() {
        return exitType;
    }

    public void setExitType(String exitType) {
        this.exitType = exitType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BisShopLoginlog that = (BisShopLoginlog) o;
        return Objects.equals(logId, that.logId) &&
                Objects.equals(sessionId, that.sessionId) &&
                Objects.equals(username, that.username) &&
                Objects.equals(account, that.account) &&
                Objects.equals(loginTime, that.loginTime) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(loginIp, that.loginIp) &&
                Objects.equals(explorer, that.explorer) &&
                Objects.equals(exitTime, that.exitTime) &&
                Objects.equals(exitType, that.exitType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logId, sessionId, username, account, loginTime, userId, loginIp, explorer, exitTime, exitType);
    }
}
