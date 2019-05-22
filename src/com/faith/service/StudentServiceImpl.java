package com.faith.service;

import com.faith.dao.IStudentDao;
import com.faith.dao.StudentDaoImpl;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-22
 * @Description: com.faith.service
 * @version: 1.0
 */
public class StudentServiceImpl implements IStudentService {
    // 其中  new StudentDaoImpl(); spring可以帮忙
    IStudentDao iStudentDao = new StudentDaoImpl();

    public void addStudent() {

    }
}
