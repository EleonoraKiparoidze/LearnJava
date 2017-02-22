package com.nora.chapter11.test.join;

/**
 * Created by nora on 17.02.17.
 */
public class JoinRunner {
    static {
        System.out.println("Start main");
    }

    public static void main(String[] args) {
        JoinThread thread1 = new JoinThread("First");
        JoinThread thread2 = new JoinThread("Second");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());

    }
}
