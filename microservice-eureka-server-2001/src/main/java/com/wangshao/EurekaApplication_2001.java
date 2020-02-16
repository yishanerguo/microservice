package com.wangshao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import javax.ws.rs.ApplicationPath;

/**
 * @author liutao
 * @create 2020-02-09-23:52
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication_2001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication_2001.class,args);
    }
}
