package com.hyq.rpcstudy.provider;

import com.hyq.rpcstudy.common.Address;
import com.hyq.rpcstudy.protocal.http.BuildTomcat;
import com.hyq.rpcstudy.provider.api.HelloApi;
import com.hyq.rpcstudy.provider.api.HelloApiImpl;
import com.hyq.rpcstudy.provider.register.LocalRegister;
import com.hyq.rpcstudy.provider.register.RemoteRegister;

/**
 * @author nanke
 * @date 2020/3/3 下午3:09
 */
public class Provider {

    public static void main(String[] args) {

        // 本地注册 - 自己提供出去的服务名 - 实现类
        LocalRegister.regist(HelloApi.class.getName(),HelloApiImpl.class);

        // 远程注册
        RemoteRegister.regist(HelloApi.class.getName(),new Address("localhost",8080));

        // 启动tomcat
        BuildTomcat.start("localhost",8080);
    }
}
