package com.fhw.practice.juc;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-09-06 22:22
 */


public class SynchronizedDemo2 {
    Object object = new Object();

    public void method1() {
        synchronized (object) {

        }
    }
}
