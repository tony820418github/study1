package com.sh.zfc.mybatisframework;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.sh.zfc.mybatisframework.dao")
@ComponentScan("com.sh.zfc.mybatisframework.*")
public class MybatisframeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisframeworkApplication.class, args);
    }
}
