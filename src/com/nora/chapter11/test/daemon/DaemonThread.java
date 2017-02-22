package com.nora.chapter11.test.daemon;

/**
 * Created by nora on 19.02.17.
 */
public class DaemonThread extends Thread {
    @Override
    public void run() {
        try {
            if (isDaemon()) {

                System.out.println("Start daemon thread!");
                Thread.sleep(10_000);
            } else {
                System.out.println("Start ordinary thread!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (isDaemon()) {

                System.out.println("End daemon thread!");
            } else {

                System.out.println("End ordinary thread!");
            }
        }
    }
}

