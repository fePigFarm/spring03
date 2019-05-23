package com.faith.aop;

import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-24
 * @Description: 异常通知
 * @version: 1.0
 */
public class ExceptionAdvice implements ThrowsAdvice {
    public void afterThrowing(Method method, Object[] args, Object target, Throwable throwable) {
        System.out.println("异常通知：" + target + ", 方法" + method + ", 参数个数" + method.getParameterCount());
    }
}
