package com.fhw.practice.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fhw.practice.entiy.Student;
import com.fhw.practice.mapper.StudentDao;
import com.fhw.practice.service.StudentService;
import com.fhw.practice.utils.WrapperUtils;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-02-16 23:23
 */

@Service
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements StudentService {

    @Override
    public List<Student> findAll() {
        LambdaQueryWrapper<Student> queryWrapper = WrapperUtils.getQueryWrapper();
        return this.baseMapper.selectList(queryWrapper);
    }

    @Override
    public void add(Student student) {
        this.baseMapper.insert(student);
    }

    @Override
    public int modify(Student student) {
        int i = this.baseMapper.updateById(student);
        return i;
    }

    @Override
    public Student findById(Long id) {
        Student student = this.baseMapper.selectById(id);
        return student;
    }
}
