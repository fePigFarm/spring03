package com.faith.service;

import com.faith.dao.IStudentDao;
import com.faith.dao.StudentDaoImpl;
import com.faith.entity.StudentClass;

/**
 * @Auther: yangguoqiang01
 * @Date: 2019-05-22
 * @Description: com.faith.service
 * @version: 1.0
 */
public class StudentServiceImpl implements IStudentService {
    // 其中  new StudentDaoImpl(); spring可以帮忙
    // IStudentDao iStudentDao = new StudentDaoImpl();

    IStudentDao iStudentDao;

    public IStudentDao getiStudentDao() {
        return iStudentDao;
    }

    public void setiStudentDao(IStudentDao iStudentDao) {
        this.iStudentDao = iStudentDao;
    }

    public void addStudent(StudentClass studentClass) {

    }
}
