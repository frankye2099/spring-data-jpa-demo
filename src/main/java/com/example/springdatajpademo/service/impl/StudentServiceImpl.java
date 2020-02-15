package com.example.springdatajpademo.service.impl;

import com.example.springdatajpademo.dao.StudentDao;
import com.example.springdatajpademo.model.Student;
import com.example.springdatajpademo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {
    private final StudentDao dao;

    public StudentServiceImpl(StudentDao dao) {
        this.dao = dao;
    }

    @Override
    @Transactional
    public Student create(Student student) {
        log.info("create student: {}", student);
        return dao.createStudent(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return dao.getAllStudents();
    }

    @Override
    public List<Student> getByName(String name) {
        return dao.getByName(name);
    }
}
