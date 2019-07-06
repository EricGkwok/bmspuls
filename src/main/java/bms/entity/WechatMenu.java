package bms.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @Classname WechatMenu
 * @Description
 * @Date 2019/7/6 10:35
 * @Created by WuLiao
 */
@Entity
@Table(name = "wechat_menu", schema = "bms")
public class WechatMenu {
    private String menuId;
    private String menuName;
    private String parentId;
    private String menuType;
    private String menuKey;
    private String url;
    private String mediaId;
    private String templateId;
    private String isAutoExpand;
    private Integer sortNo;
    private String remark;
    private Timestamp createTime;
    private String createUserId;
    private Timestamp modifyTime;
    private String modifyUserId;

    @Id
    @Column(name = "menu_id", nullable = false, length = 50)
    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    @Basic
    @Column(name = "menu_name", nullable = true, length = 50)
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "parent_id", nullable = true, length = 50)
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "menu_type", nullable = true, length = 50)
    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    @Basic
    @Column(name = "menu_key", nullable = true, length = 50)
    public String getMenuKey() {
        return menuKey;
    }

    public void setMenuKey(String menuKey) {
        this.menuKey = menuKey;
    }

    @Basic
    @Column(name = "url", nullable = true, length = 100)
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "media_id", nullable = true, length = 50)
    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    @Basic
    @Column(name = "template_id", nullable = true, length = 50)
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Basic
    @Column(name = "is_auto_expand", nullable = true, length = 10)
    public String getIsAutoExpand() {
        return isAutoExpand;
    }

    public void setIsAutoExpand(String isAutoExpand) {
        this.isAutoExpand = isAutoExpand;
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
    @Column(name = "remark", nullable = true, length = 200)
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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
        WechatMenu that = (WechatMenu) o;
        return Objects.equals(menuId, that.menuId) &&
                Objects.equals(menuName, that.menuName) &&
                Objects.equals(parentId, that.parentId) &&
                Objects.equals(menuType, that.menuType) &&
                Objects.equals(menuKey, that.menuKey) &&
                Objects.equals(url, that.url) &&
                Objects.equals(mediaId, that.mediaId) &&
                Objects.equals(templateId, that.templateId) &&
                Objects.equals(isAutoExpand, that.isAutoExpand) &&
                Objects.equals(sortNo, that.sortNo) &&
                Objects.equals(remark, that.remark) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(createUserId, that.createUserId) &&
                Objects.equals(modifyTime, that.modifyTime) &&
                Objects.equals(modifyUserId, that.modifyUserId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, menuName, parentId, menuType, menuKey, url, mediaId, templateId, isAutoExpand, sortNo, remark, createTime, createUserId, modifyTime, modifyUserId);
    }
}
