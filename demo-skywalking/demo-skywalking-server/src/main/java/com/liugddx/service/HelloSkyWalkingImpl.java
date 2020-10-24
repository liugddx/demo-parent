package com.liugddx.service;

import com.liugddx.inter.IHelloSkyWalking;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * <p>@ClassName HelloSkyWalkingImpl</p>
 * <p>@description TODO</p>
 *
 * @author liugddx
 * @version 1.0
 * @date 2020/10/24 16:21
 */
@DubboService
public class HelloSkyWalkingImpl implements IHelloSkyWalking {

    public String helloSkyWalking(String name) {
        return "你好"+name;
    }
}
