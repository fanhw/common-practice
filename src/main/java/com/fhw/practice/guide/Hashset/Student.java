package com.fhw.practice.guide.Hashset;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-03-12 09:33
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private Integer age;
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student student = (Student) obj;
        return student.getAge().equals(age) && student.getName().equals(name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
