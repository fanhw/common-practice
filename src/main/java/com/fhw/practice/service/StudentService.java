package com.fhw.practice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fhw.practice.entiy.Student;

import java.util.List;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-02-16 23:22
 */


public interface StudentService extends IService<Student> {
    /**
     * 方法
     *
     * @param
     * @return
     */
    List<Student> findAll();

    /**
     * 方法
     *
     * @param student
     * @return
     */
    void add(Student student);
    /**
     *
     */
     int modify(Student student);
    /**
     *
     */
    Student findById(Long id);
}
