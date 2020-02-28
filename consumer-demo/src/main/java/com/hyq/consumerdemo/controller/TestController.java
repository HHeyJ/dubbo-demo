package com.hyq.consumerdemo.controller;

import com.hyq.providerdemo.api.HelloDubboApi;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nanke
 * @date 2020/2/28 下午11:50
 */
@RestController
public class TestController {

    @Reference
    private HelloDubboApi helloDubboApi;

    @RequestMapping("/hello")
    public String hello (@RequestParam String youName) {
        return helloDubboApi.helloDubbo(youName).getEntry();
    }

}
