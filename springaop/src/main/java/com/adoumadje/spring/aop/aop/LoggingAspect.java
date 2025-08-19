package com.adoumadje.spring.aop.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
    @Before("execution(* com.adoumadje.spring.aop.service.ProductServiceImpl.multiply(..))")
    public void logBefore() {
        System.out.println("Log before method invocation");
    }

    @After("execution(* com.adoumadje.spring.aop.service.ProductServiceImpl.multiply(..))")
    public void logAfter() {
        System.out.println("Log after method invocation");
    }
}
