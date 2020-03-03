package com.hyq.rpcstudy.provider.api;

/**
 * @author nanke
 * @date 2020/3/3 下午3:09
 */
public class HelloApiImpl implements HelloApi {

    @Override
    public String sayHello(String name) {
        return "hello " + name + " ~";
    }
}
