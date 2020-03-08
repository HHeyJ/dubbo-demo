package com.hyq.spistudy.dubbospi.test;

import com.hyq.spistudy.dubbospi.inteface.Mask;
import com.hyq.spistudy.dubbospi.inteface.User;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nanke
 * @date 2020/3/3 下午6:24
 */
public class DubboSpiTest {

    public static void main(String[] args) {

        ExtensionLoader<Mask> maskLoader = ExtensionLoader.getExtensionLoader(Mask.class);
        Mask weakMask = maskLoader.getExtension("weakMask");
        System.out.println(weakMask.action(null));

        Mask pickMask = maskLoader.getExtension("pickMask");
        System.out.println(pickMask.action(null));

        Map<String,String> map = new HashMap<>();
        map.put("maskType","pickMask");
        URL url = new URL("","",0,map);

        ExtensionLoader<User> userLoader = ExtensionLoader.getExtensionLoader(User.class);
        User nanke = userLoader.getExtension("true");
        System.out.println(nanke.action(url));

    }
}


