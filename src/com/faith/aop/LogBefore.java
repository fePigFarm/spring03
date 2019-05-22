package com.faith.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-23
 * @Description: 前置通知
 * @version: 1.0
 */
public class LogBefore implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("前置通知：即将执行...");
    }
}
