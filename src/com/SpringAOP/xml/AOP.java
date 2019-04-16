package com.SpringAOP.xml;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author: Iman
 * date   : 2019/4/16
 */

public class AOP {

    public void before() {
        System.out.println("前置通知");
    }


    public void after() {
        System.out.println("后置通知");
    }


    public void runtime() {
        System.out.println("运行通知");
    }


    public void throwing() {
        System.out.println("异常通知");
    }


    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知后");

    }
}
