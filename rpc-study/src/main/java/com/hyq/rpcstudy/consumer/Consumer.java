package com.hyq.rpcstudy.consumer;


import com.hyq.rpcstudy.common.ProxyFactory;
import com.hyq.rpcstudy.provider.api.HelloApi;

import java.io.IOException;

/**
 * @author nanke
 * @date 2020/3/3 下午3:36
 */
public class Consumer {

    public static void main(String[] args) throws IOException {

        HelloApi helloApi = ProxyFactory.getProxy(HelloApi.class);
        String nanke = helloApi.sayHello("nanke");
        System.out.println(nanke);

    }
}
