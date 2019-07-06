package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname BisPostMenu
 * @Description
 * @Date 2019/7/6 10:34
 * @Created by WuLiao
 */
@Entity
@Table(name = "bis_post_menu", schema = "bms")
public class BisPostMenu {
    private String postId;
    private String menuId;
    private Timestamp createTime;
    private String createUserId;

    @Id
    @Column(name = "post_id", nullable = false, length = 50)
    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    @Basic
    @Column(name = "menu_id", nullable = false, length = 50)
    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
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
        BisPostMenu that = (BisPostMenu) o;
        return Objects.equals(postId, that.postId) &&
                Objects.equals(menuId, that.menuId) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUserId, that.createUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(postId, menuId, createTime, createUserId);
    }
}
