package com.ysama.consumer.config;


import com.ysama.dubbo_interface.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.ReferenceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReferenceConfiguration {

    @Bean
    @DubboReference
    public ReferenceBean<HelloService> helloService() {
        return new ReferenceBean<>();
    }
}
