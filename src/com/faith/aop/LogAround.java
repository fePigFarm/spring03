package com.faith.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-24
 * @Description: com.faith.aop
 * @version: 1.0
 */
public class LogAround implements MethodInterceptor {
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        Object result = null;
        try {
            System.out.println("环绕通知");
            // 前置
            result = methodInvocation.proceed();
            // 后置
            System.out.println("环绕通知：后置通知");
        } catch (Exception e) {
            // 异常
            System.out.println("环绕通知：异常通知");
        }
        return result;
    }
}
