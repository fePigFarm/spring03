package com.faith.aop;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-24
 * @Description: com.faith.aop
 * @version: 1.0
 */
public class LogAfter implements AfterReturningAdvice {
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) {
        System.out.println("后置通知-目标对象：" + o1 + ", 调用方法名" + method.getName()
                + ",方法参数个数" + method.getParameterCount());
    }
}
