package com.jnshu.mapper;

import com.jnshu.modle.Student;

import java.util.List;

public interface StudentDao {
    Student findByIdStudent(int id);
    List<Student> findListStudent();
    Integer insertStudent(Student student);
    boolean deleteStudent(int id);
    boolean updateStudent(Student student);
}
