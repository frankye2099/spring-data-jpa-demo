package com.example.springdatajpademo.dao.impl;

import com.example.springdatajpademo.dao.StudentDao;
import com.example.springdatajpademo.dao.entity.StudentEntity;
import com.example.springdatajpademo.dao.repository.StudentRepository;
import com.example.springdatajpademo.model.Student;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentDaoImpl implements StudentDao {
    private final StudentRepository repository;

    public StudentDaoImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public Student createStudent(Student student) {
        StudentEntity saved = repository.save(StudentMapping.toEntity(student));
        return StudentMapping.toModel(saved);
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll().stream()
                .map(StudentMapping::toModel)
                .collect(Collectors.toList());
    }

    @Override
    public List<Student> getByName(String name) {
        return repository.findByName(name).stream()
                .map(StudentMapping::toModel)
                .collect(Collectors.toList());
    }
}
