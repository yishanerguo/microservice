package com.wangshao.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author liutao
 * @create 2020-02-10-17:12
 * spingCloud相关配置
 */

@Configuration
public class SpringCloudConfig {

    /**
     * 调用服务模板
     * @return
     */
    @Bean
    @LoadBalanced //引入ribbon负载均衡
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }

    @Bean
    public IRule myRule(){
        return new RetryRule();
    }
}
