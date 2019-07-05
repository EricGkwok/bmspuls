package bms.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Data
@Entity
@Table(name = "sysDept")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class SysDept {
    @Id
    @Column(name = "deptId",nullable = true,length = 50)
    String deptId;
    @Column(name = "cascadeId",nullable = true)
    String        cascadeId;
    @Column(name = "deptName",nullable = true,length = 100)
    String deptName;
    @Column(name = "parentId",nullable = true,length = 50)
    String         parentId;
    @Column(name = "deptCode",nullable = false,length = 50)
    String  deptCode;
    @Column(name = "manager",nullable = false,length = 50)
    String       manager;
    @Column(name = "phone",nullable = false,length = 50)
    String phone;
    @Column(name = "fax",nullable = false,length = 50)
    String         fax;
    @Column(name = "address",nullable = false,length = 200)
    String  address;
    @Column(name = "isAutoExpand",nullable = false,length = 50)
    String        isAutoExpand;
    @Column(name = "iconName",nullable = false,length = 50)
    String iconName;
    int       sortNo;
    @Column(name = "remark",nullable = false,length = 400)
    String remark;
    @Column(name = "isDel",nullable = false,length = 10)
    String      isDel;
    Date create_time;
    @Column(name = "createUserId",length = 50)
    String  createUserId;

    Date modifyTime;
    @Column(name = "modifyUserId",length = 50)
    String  modifyUserId;
}
