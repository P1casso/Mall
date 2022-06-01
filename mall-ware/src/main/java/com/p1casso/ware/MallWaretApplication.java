package com.p1casso.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author p1casso
 * @Date 2022/6/1 13:47
 */
@MapperScan("com.p1casso.ware.dao")
@SpringBootApplication
public class MallWaretApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallWaretApplication.class, args);
    }
}
