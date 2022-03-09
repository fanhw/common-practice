package com.fhw.practice.app;

import com.fhw.practice.entiy.Student;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-03-09 21:23
 */


public class FactoryBeanTest implements FactoryBean<Student> {


    @Override
    public Class<?> getObjectType() {
        return Student.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    @Override
    public Student getObject() throws Exception {
        return new Student();
    }
}
