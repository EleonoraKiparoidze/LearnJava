package com.nora.chapter11.test.daemon;

/**
 * Created by nora on 19.02.17.
 */
public class DaemonRunner {
    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();
        DaemonThread thread = new DaemonThread();
        daemonThread.setDaemon(true);
        daemonThread.start();
        thread.start();
        System.out.println(" main!!");
    }
}
