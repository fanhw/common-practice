package com.fhw.practice.app;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-03-09 20:01
 */


public class Factory {
    public static Fruit getInstance(String ClassName) {
        Fruit fruit = null;
        try {
            fruit = (Fruit) Class.forName(ClassName).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fruit;
    }
}
