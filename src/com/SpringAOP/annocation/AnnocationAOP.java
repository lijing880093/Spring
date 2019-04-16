package com.SpringAOP.annocation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author: Iman
 * date   : 2019/4/16
 */
// 不属于dao service controller
@Component
//AOP 的切面注解版
@Aspect
public class AnnocationAOP {
    // execution 执行的方程式：方法返回值类型  包名.类名.方法名(..) 参数
    @Before("execution(* com.SpringAOP.annocation.service.UserService.add(..))")
    public void before() {
        System.out.println("前置通知");
    }

    @After("execution(* com.SpringAOP.annocation.service.UserService.add(..))")
    public void after() {
        System.out.println("后置通知");
    }

    @AfterReturning("execution(* com.SpringAOP.annocation.service.UserService.add(..))")
    public void runtime() {
        System.out.println("运行通知");
    }

    @AfterThrowing("execution(* com.SpringAOP.annocation.service.UserService.add(..))")
    public void throwing() {
        System.out.println("异常通知");
    }

    @Around("execution(* com.SpringAOP.annocation.service.UserService.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知前");
        proceedingJoinPoint.proceed();
        System.out.println("环绕通知后");

    }
}
