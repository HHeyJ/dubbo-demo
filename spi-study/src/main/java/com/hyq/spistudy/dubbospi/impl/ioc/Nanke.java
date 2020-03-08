package com.hyq.spistudy.dubbospi.impl.ioc;

import com.hyq.spistudy.dubbospi.inteface.Mask;
import com.hyq.spistudy.dubbospi.inteface.User;
import org.apache.dubbo.common.URL;

/**
 * @author nanke
 * @date 2020/3/3 下午6:37
 */
public class Nanke implements User {

    private Mask mask;

    public void setMask(Mask mask) {
        this.mask = mask;
    }

    @Override
    public String action(URL url) {
        return "nanke " + mask.action(url);
    }
}
