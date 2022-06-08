package com.fhw.practice.thread;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-05-31 21:37
 */


public class ThreadTest implements Runnable {
    private int tickets = 10;

    @Override
    public void run() {
        while (true) {
            sale();
        }
    }

    public synchronized void sale() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "所卖票号" + tickets);
            System.out.println(Thread.currentThread().getName() + "剩余票数" + --tickets);
        }
    }
}
