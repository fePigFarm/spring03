package com.faith.service;

import com.faith.dao.IStudentDao;
import com.faith.dao.StudentDaoImpl;
import com.faith.entity.StudentClass;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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

    // 加入事物，要不都成功，要不都失败
    // readOnly = false 不是只读
    // 事物的传播行为 propagation
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void addStudent(StudentClass studentClass) {
        iStudentDao.addStudent(studentClass);
    }

    public void deleteStudentByNo(int no) {
        System.out.println(no + " --- 序号");
    }
}
