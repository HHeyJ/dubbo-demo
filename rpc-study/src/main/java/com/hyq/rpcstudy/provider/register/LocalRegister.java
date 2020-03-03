package com.hyq.rpcstudy.provider.register;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nanke
 * @date 2020/3/3 下午3:11
 */
public class LocalRegister {

    private static Map<String ,Class> map = new HashMap<>();

    /**
     * 本地注册服务，handler处理时从本地获取实现类
     * @param interfaceName
     * @param classzz
     */
    public static void regist(String interfaceName, Class classzz) {
        map.put(interfaceName,classzz);
    }

    public static Class get(String interfaceName) {
        return map.get(interfaceName);
    }
}
