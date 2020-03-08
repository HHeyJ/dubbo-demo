package com.hyq.spistudy.dubbospi.aop;

import com.hyq.spistudy.dubbospi.inteface.Mask;
import org.apache.dubbo.common.URL;

/**
 * @author nanke
 * @date 2020/3/3 下午6:29
 */
public class MaskAop implements Mask {

    private Mask mask;

    /**
     * 含该构造方法，则为包装类
     * @param mask
     */
    public MaskAop(Mask mask) {
        this.mask = mask;
    }

    @Override
    public String action(URL url) {
        return "洗洗手～,然后" + mask.action(url);
    }
}
