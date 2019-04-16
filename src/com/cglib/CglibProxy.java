package com.cglib;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;



/**
 * @author: Iman
 * date   : 2019/4/16
 */
public class CglibProxy implements  MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始测试");
        Object invokeSuper = methodProxy.invokeSuper(o, objects);
        System.out.println("测试结束");
        return invokeSuper;
    }
}
