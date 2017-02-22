package com.nora.chapter11.test.priority;

/**
 * Created by nora on 17.02.17.
 */
public class Main {
    public static void main(String[] args) {
        ThreadThread threadThread = new ThreadThread();
        Thread threadRunnable = new Thread(new ThreadRunnable());
        //threadRunnable.start();
        //threadThread.start();


        PriorityThread priorityThreadMin = new PriorityThread("Min");
        PriorityThread priorityThreadMax = new PriorityThread("Max");
        PriorityThread priorityThreadNorm = new PriorityThread("Norm");

        priorityThreadMin.setPriority(Thread.MIN_PRIORITY);
        priorityThreadMax.setPriority(Thread.MAX_PRIORITY);
        priorityThreadNorm.setPriority(Thread.NORM_PRIORITY);

        priorityThreadNorm.start();
        priorityThreadMin.start();
        priorityThreadMax.start();

    }
}
