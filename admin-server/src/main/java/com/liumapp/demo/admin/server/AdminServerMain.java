package com.liumapp.demo.admin.server;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

/**
 * file AdminServerMain.java
 * author liumapp
 * github https://github.com/liumapp
 * email liumapp.com@gmail.com
 * homepage http://www.liumapp.com
 * date 2018/11/20
 */
@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@SpringBootApplication
public class AdminServerMain {

    public static void main(String[] args) {
        SpringApplication.run(AdminServerMain.class , args);
    }

}
