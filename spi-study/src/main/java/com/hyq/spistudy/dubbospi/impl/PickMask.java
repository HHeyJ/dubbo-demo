package com.hyq.spistudy.dubbospi.impl;

import com.hyq.spistudy.dubbospi.inteface.Mask;
import org.apache.dubbo.common.URL;

/**
 * @author nanke
 * @date 2020/3/3 下午6:26
 */
public class PickMask implements Mask {

    @Override
    public String action(URL url) {
        return "摘下口罩～";
    }
}
