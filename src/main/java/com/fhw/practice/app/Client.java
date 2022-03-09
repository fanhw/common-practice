package com.fhw.practice.app;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-03-09 20:05
 */


public class Client {
    public static void main(String[] args) {
        Fruit fruit = Factory.getInstance("com.fhw.practice.app.Orange");
        if(null != fruit){
            fruit.eat();
        }
    }
}
