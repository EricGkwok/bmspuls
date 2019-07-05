package bms.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "sysUser")
public class SysUser {

    @Id
    @Column(name = "userId",nullable = true,length = 50)
    private    String          userId;
    @Column(name = "account",nullable = false,length = 50)
    private    String          account;
    @Column(name = "password",nullable = false,length = 50)
    private    String          password;
    @Column(name = "sername",nullable = false,length = 50)
    private    String          sername;
    @Column(name = "lockNum",nullable = false,length = 10)
    private    int             lockNum;
    @Column(name = "errorNum",nullable = false,length = 10)
    private    int             errorNum;
    @Column(name = "sex",nullable = false,length = 10)
    private    String          sex;
    @Column(name = "status",nullable = false,length = 10)
    private    String          status;
    @Column(name = "userType",nullable = false,length = 10)
    private    String          userType;
    @Column(name = "deptId",nullable = false,length = 50)
    private    String          deptId;
    @Column(name = "mobile",nullable = false,length = 50)
    private    String          mobile;
    @Column(name = "qq",nullable = false,length = 50)
    private    String          qq;
    @Column(name = "wechat",nullable = false,length = 50)
    private    String          wechat;
    @Column(name = "email",nullable = false,length = 50)
    private    String          email;
    @Column(name = "idno",nullable = false,length = 50)
    private    String          idno;
    @Column(name = "style",nullable = false,length = 10)
    private    String          style;
    @Column(name = "address",nullable = false,length = 200)
    private    String          address;
    @Column(name = "remark",nullable = false,length = 400)
    private    String          remark;
    @Column(name = "isDel",nullable = false,length = 50)
    private    String          isDel;

    Date create_time;
    @Column(name = "createUserId",length = 50)
    String  createUserId;
    Date modifyTime;
    @Column(name = "modifyUserId",length = 50)
    String  modifyUserId;
}
