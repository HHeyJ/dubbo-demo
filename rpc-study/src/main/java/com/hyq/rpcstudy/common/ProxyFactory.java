package com.hyq.rpcstudy.common;

import com.hyq.rpcstudy.protocal.http.HttpClient;
import com.hyq.rpcstudy.provider.register.RemoteRegister;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author nanke
 * @date 2020/3/3 下午4:16
 */
public class ProxyFactory {

    public static <T> T getProxy(Class interfaceClass) {
        return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class[]{interfaceClass}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                return HttpClient.post(
                        // 从远程注册中心获取 服务地址 端口
                        RemoteRegister.get(interfaceClass.getName()).getHostName(), RemoteRegister.get(interfaceClass.getName()).getPort(),
                        new ParamsObject(interfaceClass.getName(), method.getName(), method.getParameterTypes(), args));
            }
        });
    }
}
