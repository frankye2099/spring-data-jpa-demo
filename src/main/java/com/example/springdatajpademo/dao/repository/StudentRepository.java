package com.example.springdatajpademo.dao.repository;

import com.example.springdatajpademo.dao.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
    @Query("select s from StudentEntity s where s.name like %?1%")
    List<StudentEntity> findByName(String name);

    List<StudentEntity> findByNameContains(String name); // same
}
