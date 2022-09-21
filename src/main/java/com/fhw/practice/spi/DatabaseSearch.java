package com.fhw.practice.spi;

import java.util.List;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-09-05 21:49
 */


public class DatabaseSearch implements Search {
    //  著作权归https://pdai.tech所有。
    //链接：https://www.pdai.tech/md/interview/x-interview.html

    @Override
    public List<String> searchDoc(String keyword) {
        System.out.println("数据搜索 " + keyword);
        return null;
    }
}
