package com.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author: Iman
 * date   : 2019/4/16
 */
public class JdkProxy implements InvocationHandler {

    private XiaoMing xiaoMing;

    public JdkProxy(XiaoMing xiaoMing) {
        this.xiaoMing = xiaoMing;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("开始测试");
        method.invoke(xiaoMing);
        System.out.println("测试结束");
        return null;
    }
}
