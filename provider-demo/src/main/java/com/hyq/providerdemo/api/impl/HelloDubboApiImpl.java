package com.hyq.providerdemo.api.impl;

import com.hyq.providerdemo.api.HelloDubboApi;
import com.hyq.providerdemo.api.Result;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.config.annotation.Service;
import org.apache.dubbo.rpc.RpcContext;
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

        URL url = RpcContext.getContext().getUrl();
        return Result.buildSuccess(name + ": 调用：" + url.getAddress() + "成功～");
    }
}
