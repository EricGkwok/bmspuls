package bms.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description: 
 * User: lhyou
 * Date: 2019-07-06
 * Time: 9:37
 */
@Data
public class BisShopUser implements Serializable {
    /**
    * 用户编号
    */
    private String shopUserId;

    /**
    * 用户类型 1 店主 2员工
    */
    private String userType;

    /**
    * 店铺编号
    */
    private String shopId;

    /**
    * 账号
    */
    private String account;

    /**
    * 姓名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 头像照片
    */
    private String photo;

    /**
    * 工号
    */
    private String workNumber;

    /**
    * 性别1:男2:女3:保密
    */
    private String sex;

    /**
    * 职位编码
    */
    private String postCode;

    /**
    * 入职日期
    */
    private Date entryDate;

    /**
    * 手机号码
    */
    private String mobile;

    /**
    * 电话
    */
    private String phone;

    /**
    * 邮箱
    */
    private String email;

    /**
    * 出生日期
    */
    private Date bornDate;

    /**
    * 身份证
    */
    private String idno;

    /**
    * 居住地址
    */
    private String address;

    /**
    * 紧急联系人
    */
    private String linkman;

    /**
    * 紧急联系电话
    */
    private String linkphone;

    /**
    * 状态0:禁用1:启用 0:离职 1:在职
    */
    private String status;

    /**
    * 是否删除0有效1删除
    */
    private String isDel;

    /**
    * 备注
    */
    private String remark;

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