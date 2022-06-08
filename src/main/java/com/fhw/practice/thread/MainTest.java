package com.fhw.practice.thread;

import lombok.*;

import java.io.*;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-05-31 21:30
 */


public class MainTest {
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    static class User implements Serializable {
        private String name;
        private Integer age;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        Thread thread1 = new Thread(new ThreadTest());
//        Thread thread2 = new Thread(new ThreadTest());
//        thread1.start();
//        thread2.start();
//        ObjectOutputStream objectOutputStream =
//                new ObjectOutputStream(new FileOutputStream(new File("C:\\Users\\fanha\\Desktop\\aaa.txt")));
//        objectOutputStream.writeObject(new User("sakura1", 181));
//        objectOutputStream.writeObject(new User("sakura2", 182));
//        objectOutputStream.writeObject(new User("sakura3", 183));
//        objectOutputStream.writeObject(new User("sakura4", 184));
//        objectOutputStream.writeObject(new User("sakura5", 185));
//        objectOutputStream.writeObject(new User("sakura6", 186));
//        objectOutputStream.close();

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("C:\\Users\\fanha\\Desktop\\aaa.txt")));
        User user = (User) objectInputStream.readObject();
        System.out.println(user);
        objectInputStream.close();
    }


}
