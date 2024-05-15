package service.student;

import base.service.BaseService;
import jakarta.persistence.NoResultException;
import model.Student;

public interface StudentService extends BaseService<Student, Long> {
    Student findByUserAndPass(String username, String password) throws NoResultException;

    Student findByNationalCode(String nationalCode) throws NoResultException;
}
