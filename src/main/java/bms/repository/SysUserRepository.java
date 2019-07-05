package bms.repository;

import bms.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SysUserRepository  extends JpaRepository<SysUser,String> {
}
