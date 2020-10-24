package com.liugddx.conf;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * <p>@ClassName ConsumerConfiguration</p>
 * <p>@description TODO</p>
 *
 * @author liugddx
 * @version 1.0
 * @date 2020/10/24 16:37
 */
@Configuration
@EnableDubbo(scanBasePackages = "com.liugddx.controller")
@PropertySource("classpath:/spring/dubbo-consumer.properties")
public class ConsumerConfiguration {

}
