package com.yuanian.staffmsg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yuanian.staffmsg.Mapper")
public class StaffmsgApplication {

    public static void main(String[] args) {
        SpringApplication.run(StaffmsgApplication.class, args);
    }

}
