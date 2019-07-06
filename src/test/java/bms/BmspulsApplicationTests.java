package bms;

import bms.entity.SysUser;
import bms.repository.SysUserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BmspulsApplicationTests {
    @Autowired
    SysUserRepository sysUserRepository;

    @Test
    public void contextLoads() {
        List<SysUser> all = sysUserRepository.findAll();
        for (SysUser s : all) {
            System.out.println(s);
        }
        System.out.println("ok");

    }

}
