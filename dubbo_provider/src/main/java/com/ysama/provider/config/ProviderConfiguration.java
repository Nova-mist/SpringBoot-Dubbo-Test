package com.ysama.provider.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableDubbo(scanBasePackages = "com.ysama.provider.service")
@PropertySource("classpath:/provider.properties")
public class ProviderConfiguration {
}
