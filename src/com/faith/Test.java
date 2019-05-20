package com.faith;

import com.faith.entity.StudentClass;
import com.faith.factory.CourseFactory;
import com.faith.newinstance.ICourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-20
 * @Description: com.faith
 * @version: 1.0
 */
public class Test {

    public static void learnCourseWithFactory() {
        ICourse course = CourseFactory.getCourse("java");
        course.learn();
    }

    public static void learnCourseWithIOC() {
        // 拿学生
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentClass studentClass = (StudentClass) context.getBean("student");
        studentClass.learn("java");
    }

    public static void main(String[] args) {
        //  测试IOC
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentClass student = ac.getBean("student", com.faith.entity.StudentClass.class);
        System.out.println(student);
        System.out.println("姓名是：" + student.getStuName() + "，年龄是：" + student.getStuAge() + "，ID是" + student.getStuNo());

        learnCourseWithFactory();
        student.learn("html");

        StudentClass st = new StudentClass();
        st.learn("html");
    }
}
