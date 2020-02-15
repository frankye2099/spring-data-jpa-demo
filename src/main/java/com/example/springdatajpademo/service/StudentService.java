package com.example.springdatajpademo.service;

import com.example.springdatajpademo.model.Student;

import java.util.List;

public interface StudentService {
    public Student create(Student student);

    List<Student> getAllStudents();

    List<Student> getByName(String name);
}
