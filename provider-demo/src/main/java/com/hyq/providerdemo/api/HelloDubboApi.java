package com.hyq.providerdemo.api;

/**
 * @author nanke
 * @date 2020/2/28 下午5:56
 */
public interface HelloDubboApi {

    /**
     * Dubbo你好
     * @param name
     * @return
     */
    Result<String> helloDubbo(String name);
}
