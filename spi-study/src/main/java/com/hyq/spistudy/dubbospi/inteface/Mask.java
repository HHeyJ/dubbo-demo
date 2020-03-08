package com.hyq.spistudy.dubbospi.inteface;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author nanke
 * @date 2020/3/3 下午6:20
 */
@SPI
public interface Mask {

    @Adaptive(value = "maskType")
    String action(URL url);
}
