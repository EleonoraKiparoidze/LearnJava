package com.nora.chapter11.test.priority;

/**
 * Created by nora on 17.02.17.
 */
public class ThreadThread extends Thread {
    @Override
    public void run() {
        for(int i = 0; i<10;i++){
            System.out.println("Thread");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.err.println("Error"+e);
            }
        }
    }
}
