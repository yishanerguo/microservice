package com.wangshao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author liutao
 * @create 2020-02-11-18:37
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@EnableTurbine
public class StudentConsumerTurbineApplication_91 {

    public static void main(String[] args) {
        SpringApplication.run(StudentConsumerTurbineApplication_91.class,args);
    }
}
