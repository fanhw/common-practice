package com.fhw.practice.guide.Hashset;

import java.util.HashSet;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-03-12 09:41
 */


public class Main {
    public static void main(String[] args) {
        HashSet<Student> set = new HashSet<>();
        //添加对象
        set.add(new Student("张三", 20));
        set.add(new Student("张三", 20));
        set.add(new Student("李四", 21));
        set.add(new Student("李四", 21));
        set.add(new Student("王五", 22));
        set.add(new Student("王五", 22));
        //遍历
        for (Student s : set) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
