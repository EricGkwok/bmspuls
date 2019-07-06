package bms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: lhyou
 * Date: 2019-07-06
 * Time: 9:37
 */
@Data
public class BisShopWork implements Serializable {
    /**
    * 工作机编号
    */
    private String workId;

    /**
    * 绑定店铺编号
    */
    private String shopId;

    /**
    * 工作机IP
    */
    private String shopIp;

    /**
    * 工作机密码
    */
    private String workPassword;

    /**
    * 是否设置密码 0 是 1否
    */
    private String whetherSet;

    /**
    * 工作机SN
    */
    private String workSn;

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

    private static final long serialVersionUID = 1L;
}