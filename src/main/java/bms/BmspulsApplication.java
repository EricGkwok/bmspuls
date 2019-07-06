package bms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"bms.mapper"})
public class BmspulsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BmspulsApplication.class, args);
    }

}
