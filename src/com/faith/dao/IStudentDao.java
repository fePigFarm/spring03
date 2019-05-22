package com.faith.dao;

import com.faith.entity.StudentClass;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-22
 * @Description: com.faith.dao
 * @version: 1.0
 */
public interface IStudentDao {
    public void addStudent(StudentClass studentClass);
    void deleteStudentByNo(int no);
}
