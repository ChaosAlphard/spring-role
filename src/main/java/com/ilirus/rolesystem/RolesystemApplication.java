package com.ilirus.rolesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ilirus.rolesystem.dao")
@SpringBootApplication
public class RolesystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(RolesystemApplication.class, args);
    }

}
