package com.faith.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-25
 * @Description: 注解形式的前置通知
 * @version: 1.0
 */


// 相当于xml中的  <bean id="logBeforeAnnotation" class="全路径"></bean>
@Component("logBeforeAnnotation")
@Aspect  // 类是一个通知
public class LogBeforeAnnotation {

    @Before("execution(* com.faith.entity.Course.showInfo())") // 属性定义切点
    public void beforeMethod() {
        System.out.println("我是注解形式的前置通知函数");
    }

    @AfterReturning("execution(* com.faith.entity.Course.showInfo())")
    public void afterMethod() {
        System.out.println("我是注解形式的后置通知函数");
    }
}
