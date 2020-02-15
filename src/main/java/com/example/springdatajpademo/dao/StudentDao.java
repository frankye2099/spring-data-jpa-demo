package com.example.springdatajpademo.dao;

import com.example.springdatajpademo.model.Student;

import java.util.List;

public interface StudentDao {
    Student createStudent(Student student);

    List<Student> getAllStudents();

    List<Student> getByName(String name);
}
