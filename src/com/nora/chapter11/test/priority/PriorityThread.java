package com.nora.chapter11.test.priority;

/**
 * Created by nora on 17.02.17.
 */
public class PriorityThread extends Thread{

    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 0; i<10;i++){
            System.out.println(getName() +"  "+ i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.err.println("Error"+e);
            }
        }
    }
}
