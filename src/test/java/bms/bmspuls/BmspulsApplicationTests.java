package bms.bmspuls;

import bms.entity.SysDept;
import bms.repository.SysDeptRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BmspulsApplicationTests {
//(classes=BmspulsApplicationTests.class)
    @Autowired
    SysDeptRepository sysDeptRepository;
    @Test
    public void contextLoads() {

        List<SysDept> all = sysDeptRepository.findAll();
        for (SysDept s: all
        ) {       System.out.println(s);
        }


            System.out.println("ok");
    }

}
