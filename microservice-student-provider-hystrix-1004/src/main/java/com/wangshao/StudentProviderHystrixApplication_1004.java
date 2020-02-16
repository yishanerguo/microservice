package com.wangshao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author liutao
 * @create 2020-02-09-15:50
 */

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class StudentProviderHystrixApplication_1004 {

    public static void main(String[] args) {
        SpringApplication.run(StudentProviderHystrixApplication_1004.class, args);
    }
}
