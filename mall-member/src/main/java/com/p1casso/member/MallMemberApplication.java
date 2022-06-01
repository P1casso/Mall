package com.p1casso.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author p1casso
 * @Date 2022/6/1 13:47
 */
//@EnableFeignClients(basePackages = "com.p1casso.member.feign")
@MapperScan("com.p1casso.member.dao")
@SpringBootApplication
public class MallMemberApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallMemberApplication.class, args);
    }
}
