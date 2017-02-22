package com.nora.chapter11.test.join;

/**
 * Created by nora on 17.02.17.
 */
public class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        String name = getName();
        long time = 0;
        System.out.println("Старт потока " + name);
        try {
            switch (name) {
                case "First":
                    time = 5_000;
                case "Second":{
                    time = 500;
                }

            }
            Thread.sleep(time);
            System.out.println("End потока " + name);

        } catch (InterruptedException e) {
            System.err.println("Error" + e);
        }
    }
}

