package bms.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: lhyou
 * Date: 2019-07-06
 * Time: 9:36
 */
@Data
@Component
public class BisShopPost implements Serializable {
    /**
    * 职位编号
    */
    private String postId;

    /**
    * 职位名称
    */
    private String postName;

    /**
    * 职位编码
    */
    private String postCode;

    /**
    * 职位描述
    */
    private String postDesc;

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