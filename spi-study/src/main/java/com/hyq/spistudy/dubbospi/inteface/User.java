package com.hyq.spistudy.dubbospi.inteface;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author nanke
 * @date 2020/3/3 下午6:46
 */
@SPI(value = "nanke")
public interface User {

    String action(URL url);
}
