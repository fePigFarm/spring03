package com.faith.service;

import com.faith.entity.StudentClass;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-22
 * @Description: com.faith.service
 * @version: 1.0
 */
public interface IStudentService {
    void addStudent(StudentClass studentClass);
    void deleteStudentByNo(int no);
}
