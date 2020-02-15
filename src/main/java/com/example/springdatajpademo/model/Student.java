package com.example.springdatajpademo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
@AllArgsConstructor
public class Student {
    private Integer id;
    private String name;
    private Integer age;
}
