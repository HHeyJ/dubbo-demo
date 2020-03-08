package com.hyq.spistudy.javaspi.test;

import com.hyq.spistudy.javaspi.inteface.eat.Eat;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author nanke
 * @date 2020/3/3 下午6:08
 */
public class JavaSpiTest {

    public static void main(String[] args) {

        ServiceLoader<Eat> serviceLoader = ServiceLoader.load(Eat.class);
        Iterator<Eat> iterator = serviceLoader.iterator();
        // 1、ServiceLoader 返回的是一个数组，如果定义多个实现类，无法准确获取目标
        // 1、无法支持IOC, AOP
        while(iterator.hasNext()) {
            Eat next = iterator.next();
            String eat = next.eat();
            System.out.println(eat);
        }

    }
}
