package com.faith.factory;

import com.faith.newinstance.HtmlCourse;
import com.faith.newinstance.ICourse;
import com.faith.newinstance.JavaCourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.plaf.IconUIResource;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-20
 * @Description: 课程工厂 多态
 * @version: 1.0
 */
public class CourseFactory {
    // 静态方法 常规方法
//    public static ICourse getCourse(String name) {
//        if(name.equals("java")) {
//           return new JavaCourse();
//        } else if(name.equals("html")) {
//            return new HtmlCourse();
//        }
//        return null;
//    }

    // ioc
    public static ICourse getCourse(String name) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        if(name.equals("java")) {
            return (ICourse) context.getBean("java");
        } else if(name.equals("html")) {
            return (ICourse) context.getBean("html");
        }
        return null;
    }
}
