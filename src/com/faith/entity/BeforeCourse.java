package com.faith.entity;

import org.springframework.stereotype.Component;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-25
 * @Description: com.faith.entity
 * @version: 1.0
 */
public class BeforeCourse {
    private String couserName;
    private int courseCount;

    // 依赖teacher类
    private Teacher teacher;

    public BeforeCourse(String couserName, int courseCount, Teacher teacher) {
        this.couserName = couserName;
        this.courseCount = courseCount;
        this.teacher = teacher;
    }

    public String getCouserName() {
        return couserName;
    }

    public void setCouserName(String couserName) {
        this.couserName = couserName;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public void setCourseCount(int courseCount) {
        this.courseCount = courseCount;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void showInfo() {
        System.out.println(this.teacher.getName() + "每天上" + this.courseCount + "节" + this.couserName);
    }
}
