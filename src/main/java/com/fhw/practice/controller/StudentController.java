package com.fhw.practice.controller;

import com.fhw.practice.entiy.Student;
import com.fhw.practice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-02-16 23:05
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Student> findAll() {
        List<Student> result = studentService.findAll();
        return result;
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST, consumes = "application/json")
    public void addStudent(@RequestBody Student student) {
        studentService.add(student);
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello World";
    }
}
