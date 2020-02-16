package com.wangshao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author liutao
 * @create 2020-02-16-18:24
 */

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication_4001 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication_4001.class, args);
    }

}
