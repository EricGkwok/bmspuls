package bms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: lhyou
 * Date: 2019-07-06
 * Time: 9:36
 */
@Data
public class BisShopCustom implements Serializable {
    /**
    * 顾客编号
    */
    private String customUserId;

    /**
    * 店铺编号
    */
    private String shopId;

    /**
    * 最近到店时间
    */
    private Date recentTime;

    /**
    * 第一次关注店时间
    */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}