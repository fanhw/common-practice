package com.fhw.practice.guide;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-03-12 08:36
 */


public class TargetObject {
    private String value;

    public TargetObject() {
        value = "JavaGuide222";
    }

    public void publicMethod(String s) {
        System.out.println("I love " + s);
    }

    private void privateMethod() {
        System.out.println("value is " + value);
    }
}
