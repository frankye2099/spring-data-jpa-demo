package com.example.springdatajpademo.controller;

import com.example.springdatajpademo.model.Student;
import com.example.springdatajpademo.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping("/students")
    public Student create(@RequestBody Student student) {
        Student saved = this.service.create(student);
        log.info("student {} has been created.",saved);
        return saved;
    }

//    @GetMapping("/students")
//    public List<Student> getAllStudents() {
//        return this.service.getAllStudents();
//    }

    @GetMapping("/students")
    public List<Student> getByName(@RequestParam(value = "name", defaultValue = "%") String name) {
        return this.service.getByName(name);
    }
}
