package com.hyq.providerdemo.api.impl;

import com.hyq.providerdemo.api.HelloDubboApi;
import com.hyq.providerdemo.api.Result;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @author nanke
 * @date 2020/2/28 下午6:03
 */
@Service
@Component
public class HelloDubboApiImpl implements HelloDubboApi {

    @Override
    public Result<String> helloDubbo(String name) {
        return Result.buildSuccess("hello " + name + ", welcome to use dubbo");
    }
}
