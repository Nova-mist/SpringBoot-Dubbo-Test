package com.ysama.consumer.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "com.ysama.consumer.action")
@PropertySource("classpath:/consumer.properties")
public class ConsumerConfiguration {
}
