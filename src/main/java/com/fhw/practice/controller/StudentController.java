package com.fhw.practice.controller;

import com.fhw.practice.entiy.Student;
import com.fhw.practice.exception.BizCodeEnum;
import com.fhw.practice.service.StudentService;
import com.fhw.practice.utils.ResponseData;
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
    public ResponseData<List<Student>> findAll() {
        List<Student> result = studentService.findAll();
        return ResponseData.success(result);
    }

    @RequestMapping(value = "/addStudent", method = RequestMethod.POST, consumes = "application/json")
    public ResponseData addStudent(@RequestBody Student student) {
        studentService.add(student);
        return ResponseData.success();
    }

    @RequestMapping(value = "/modifyStudent", method = RequestMethod.POST, consumes = "application/json")
    public ResponseData modifyStudent(@RequestBody Student student) {
        if (null == student.getId()) {
            return ResponseData.fail(BizCodeEnum.PARAMETER_EXCEPTION);
        }
        Student studentFormDB = studentService.findById(student.getId());
        if (null == studentFormDB) {
            return ResponseData.fail(BizCodeEnum.PARAMETER_EXCEPTION.getCode(), "id非法");
        }
        int result = studentService.modify(student);
        if (result == 0) {
            return ResponseData.fail(BizCodeEnum.DATABASE_EXCEPTION);
        }
        return ResponseData.success();
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello World";
    }
}
