package com.fhw.practice.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-04-11 19:14
 */

@Data
public class Student {
    private String name;
    private Integer age;

    public Student() {
    }

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
