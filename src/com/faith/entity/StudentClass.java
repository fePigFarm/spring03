package com.faith.entity;

import com.faith.factory.CourseFactory;
import com.faith.newinstance.HtmlCourse;
import com.faith.newinstance.ICourse;
import com.faith.newinstance.JavaCourse;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-20
 * @Description: com.faith
 * @version: 1.0
 */
public class StudentClass {
    private int stuNo;
    private String stuName;
    private int stuAge;

    public StudentClass() {
    }

    public StudentClass(int stuNo, String stuName, int stuAge) {
        this.stuNo = stuNo;
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public int getStuNo() {
        return stuNo;
    }

    public void setStuNo(int stuNo) {
        this.stuNo = stuNo;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    @Override
    public String toString() {
        return stuNo + "-" + stuName + "-" + stuAge;
    }

    public void learnJava() {
        JavaCourse course = new JavaCourse();
        course.learn();
    }

    public void learnHtml() {
        HtmlCourse course = new HtmlCourse();
        course.learn();
    }

    public void learn(String name) {
//        ICourse ic = CourseFactory.getCourse(name);
//        if(ic != null) {
//            ic.learn();
//        }

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ICourse iCourse = (ICourse) context.getBean(name);
        iCourse.learn();
    }

    public static void main(String[] args) {
        StudentClass st = new StudentClass();
        st.learnHtml();
        st.learnJava();
    }
}
