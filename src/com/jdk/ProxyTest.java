package com.jdk;

import java.lang.reflect.Proxy;

/**
 * @author: Iman
 * date   : 2019/4/16
 */
public class ProxyTest {
    public static void main(String[] args) {
        XiaoMing xiaoMing=new XiaoMing();
        JdkProxy jdkProxy=new JdkProxy(xiaoMing);

        Car car = (Car)Proxy.newProxyInstance(xiaoMing.getClass().getClassLoader(),
                xiaoMing.getClass().getInterfaces(),jdkProxy);
        car.buy();
    }
}
