package com.liugddx.controller;

import com.liugddx.inter.IHelloSkyWalking;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>@ClassName HelloSkyWalking</p>
 * <p>@description TODO</p>
 *
 * @author liugddx
 * @version 1.0
 * @date 2020/10/24 16:43
 */
@RestController
@RequestMapping("")
@Slf4j
public class HelloSkyWalking {

    @DubboReference
    private IHelloSkyWalking helloSkyWalking;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name){
        log.info("req is {}",name);
        return helloSkyWalking.helloSkyWalking(name);
    }
}
