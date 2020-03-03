package com.hyq.rpcstudy.provider.register;

import com.hyq.rpcstudy.common.Address;

import java.io.*;
import java.util.*;

/**
 * @author nanke
 * @date 2020/3/3 下午3:11
 */
public class RemoteRegister {

    public static Map<String,List<Address>> map = new HashMap<>();

    public static void regist(String interfaceName, Address address) {
        List<Address> list = map.get(interfaceName);
        if (list == null) {
            list = Collections.singletonList(address);
        } else {
            list.add(address);
        }
        map.put(interfaceName,Collections.singletonList(address));
        saveSnapshot();
    }

    public static Address get(String intefaceName) {

        map = getSnapshot();
        List<Address> list = map.get(intefaceName);
        Address address = list.get(0);
        return address;
    }

    /**
     * 模拟注册中心
     */
    private static void saveSnapshot() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/Users/webuy/Desktop/zookeeper.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
            oos.writeObject(map);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Map<String,List<Address>> getSnapshot() {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/webuy/Desktop/zookeeper.txt");
            ObjectInputStream ois = new ObjectInputStream(fileInputStream);
            return (Map<String,List<Address>>) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
