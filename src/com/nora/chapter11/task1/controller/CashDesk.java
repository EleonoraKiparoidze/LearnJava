package com.nora.chapter11.task1.controller;

import java.util.ArrayDeque;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by nora on 23.02.17.
 */
public class CashDesk extends Thread {
    private int number;
    private final int capacity = 32;

    private boolean isServed;

    private Lock lock = new ReentrantLock();
    private Condition isFree = lock.newCondition();

    private AtomicLong numbersOfClients;
    private final BlockingQueue<Client> clients = new ArrayBlockingQueue<>(capacity);

    public CashDesk(int number) {
        numbersOfClients = new AtomicLong(0);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void addClient(Client client) {
        numbersOfClients.incrementAndGet();
        clients.offer(client);
    }

    public void deleteClient(Client client) {
        numbersOfClients.decrementAndGet();
        clients.remove(client);
    }

    public BlockingQueue<Client> getClients() {
        return clients;
    }

    public AtomicLong getNumbersOfClients() {
        return numbersOfClients;
    }

    public Boolean isServed() {
        return isServed;
    }

    @Override
    public void run() {
        try {
            while (true) {
                    TimeUnit.SECONDS.sleep(new Random().nextInt(12));
                    lock.lock();
                    Client client = clients.take();
                    System.out.println("Client " + client.getName() + " is served on cashDesk №" + getNumber());
                    numbersOfClients.decrementAndGet();
                    isFree.signal();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

}
