package bms.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: lhyou
 * Date: 2019-07-06
 * Time: 9:33
 */
@Data
public class BisShop implements Serializable {
    /**
     * 店铺编号
     */
    private String shopId;

    /**
     * 店主编号
     */
    private String shopUserId;

    /**
     * 商店名称
     */
    private String shopName;

    /**
     * 商家简称
     */
    private String shortName;

    /**
     * 月目标现金收入
     */
    private Double monthCashIn;

    /**
     * 月目标消耗收入
     */
    private Double monthExpendIn;

    /**
     * 商家营业执照
     */
    private String shopLicense;

    /**
     * 商家标志图片
     */
    private String shopImage;

    private String shopDetailImage;

    private Double gpsX;

    private Double gpsY;

    /**
     * 排序号
     */
    private Integer sortNo;

    /**
     * 店铺地址
     */
    private String shopAddress;

    /**
     * 店铺二维码
     */
    private String shopQrcode;

    /**
     * 店铺电话
     */
    private String shopPhone;

    /**
     * 店铺面积
     */
    private Double shopArea;

    /**
     * 店铺主营项目
     */
    private String shopProject;

    /**
     * 店铺类型
     */
    private String shopType;

    /**
     * 商家介绍
     */
    private String shopIntro;

    /**
     * 显示状态 0禁用 1启用
     */
    private String showStatus;

    /**
     * 是否删除 0:有效1:删除
     */
    private String isDel;

    private String shopRemark;

    /**
     * 营业开始时间
     */
    private String beginTime;

    /**
     * 营业结束时间
     */
    private String endTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 创建人ID
     */
    private String createUserId;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 修改用户ID
     */
    private String modifyUserId;

    /**
     * 店主
     */
    private BisShopUser bisShopUser;

    private static final long serialVersionUID = 1L;
}