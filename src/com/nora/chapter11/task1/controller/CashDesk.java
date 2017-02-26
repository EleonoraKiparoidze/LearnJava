package com.nora.chapter11.task1.controller;

import java.util.ArrayDeque;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by nora on 23.02.17.
 */
public class CashDesk extends Thread {
    private int number;
    private int capacity = 32;
    private BlockingQueue<Client> clients = new ArrayBlockingQueue<Client>(capacity);

    public CashDesk(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void addClient(Client client){
        clients.offer(client);
    }

    public void deleteClient(Client client){
        try {
            clients.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public BlockingQueue<Client> getClients() {
        return clients;
    }
    @Override
    public void run() {
        try {
            while (true) {
                TimeUnit.SECONDS.sleep(10);
                Client client = clients.take();
                System.out.println("Client " + client.getName() + " is served on cashDesk №" + getNumber());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
