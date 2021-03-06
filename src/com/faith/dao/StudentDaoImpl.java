package com.faith.dao;

import com.faith.entity.StudentClass;
import org.springframework.stereotype.Component;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-22
 * @Description: com.faith.dao
 * @version: 1.0
 */

@Component("studentDao")
public class StudentDaoImpl implements IStudentDao {
    public void addStudent(StudentClass studentClass) {
        System.out.println("增加学生类");
    }

    public void deleteStudentByNo(int no) {
        System.out.println("删除一个学生，学号为：" + no);
    }
}
