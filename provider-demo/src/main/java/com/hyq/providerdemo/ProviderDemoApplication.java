package com.hyq.providerdemo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author nanke
 * @date 2020/2/28 下午5:56
 */
@EnableDubbo
@SpringBootApplication
public class ProviderDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderDemoApplication.class,args);
    }
}
