package bms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: lhyou
 * Date: 2019-07-06
 * Time: 9:35
 */
@Data
public class BisShopCollect implements Serializable {
    /**
    * 收藏编号
    */
    private String collectId;

    /**
    * 消费者编号
    */
    private String customUserId;

    /**
    * 店铺编号
    */
    private String shopId;

    /**
    * 创建时间
    */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}