package com.cglib;

import com.java.Car;
import com.java.XiaoMing;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author: Iman
 * date   : 2019/4/16
 */
public class ProxyTest {
    public static void main(String[] args) {
        CglibProxy cglibProxy=new CglibProxy();
        Enhancer enhancer=new Enhancer();
        enhancer.setSuperclass(XiaoMing.class);
        enhancer.setCallback(cglibProxy);
        Car car = (Car) enhancer.create();
        car.buy();
    }
}
