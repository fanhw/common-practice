package com.fhw.practice.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-09-05 21:50
 */
public class Main {
    public static void main(String[] args) {
        ServiceLoader<Search> load = ServiceLoader.load(Search.class);
        Iterator<Search> iterator = load.iterator();
        while (iterator.hasNext()) {
            Search search = iterator.next();
            search.searchDoc("sakura");
        }
    }
}
