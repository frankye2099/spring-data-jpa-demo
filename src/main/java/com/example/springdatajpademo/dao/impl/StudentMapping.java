package com.example.springdatajpademo.dao.impl;

import com.example.springdatajpademo.dao.entity.StudentEntity;
import com.example.springdatajpademo.model.Student;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class StudentMapping {
    static StudentEntity toEntity(Student student) {
        return StudentEntity.builder()
                .name(student.getName())
                .age(student.getAge())
                .build();
    }

    static Student toModel(StudentEntity entity) {
        log.info("entity={}", entity);
        return Student.builder()
                .id(entity.getId())
                .name(entity.getName())
                .age(entity.getAge())
                .build();
    }
}
