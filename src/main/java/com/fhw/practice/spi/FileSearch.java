package com.fhw.practice.spi;

import java.util.List;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-09-05 21:48
 */


public class FileSearch implements Search {
    @Override
    public List<String> searchDoc(String keyword) {
        System.out.println("文件搜索" + keyword);
        return null;
    }
}
