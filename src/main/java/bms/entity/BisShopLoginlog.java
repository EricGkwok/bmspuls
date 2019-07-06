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
public class BisShopLoginlog implements Serializable {
    /**
    * 日志编号
    */
    private String logId;

    /**
    * 会话ID
    */
    private String sessionId;

    /**
    * 用户姓名
    */
    private String username;

    /**
    * 用户账号
    */
    private String account;

    /**
    * 登陆用户时间
    */
    private Date loginTime;

    /**
    * 用户编号
    */
    private String userId;

    /**
    * 登陆IP
    */
    private String loginIp;

    /**
    * 登陆浏览器
    */
    private String explorer;

    /**
    * 退出时间
    */
    private Date exitTime;

    /**
    * 退出类型 1超时退出 2自动退出
    */
    private String exitType;

    private static final long serialVersionUID = 1L;
}