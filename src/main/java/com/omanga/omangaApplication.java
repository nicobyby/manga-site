package com.omanga;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
@MapperScan("com.omanga.dao")
public class omangaApplication {
    public static void main(String[] args) {
        SpringApplication.run(omangaApplication.class);
    }
}
