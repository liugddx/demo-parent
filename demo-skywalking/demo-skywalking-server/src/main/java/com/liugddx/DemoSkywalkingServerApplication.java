package com.liugddx;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.liugddx.service")
@PropertySource("classpath:/spring/dubbo-provider.properties")
public class DemoSkywalkingServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSkywalkingServerApplication.class, args);
    }

}
