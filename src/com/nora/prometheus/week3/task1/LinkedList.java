package com.nora.prometheus.week3.task1;

import java.util.List;

/**
 * Created by nora on 09.03.17.
 */
public class LinkedList {
    private Node first;
    private Node last;
    private int count;
    /* Конструктор без аргументів */
    public LinkedList() {
        count = 0;
    }
    /* Додати елемент в кінець списку */
    public void add(Integer data) {
        Node newNode = new Node();
        newNode.setData(data);
        if(first != null){
            last.setNext(newNode);
            last = newNode;
        }else {
            last = newNode;
            first = last;
        }
        count++;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(14);

        linkedList.add(15);
        linkedList.add(16);
        System.out.println(linkedList.get(2));
        System.out.println(linkedList.delete(2));
        System.out.println(linkedList.get(2));
    }

    /* Отримати елемент по індексу, повертає null якщо такий елемент недоступний */
    public Integer get(int index) {
        if (index>=count && index < 0 ){
            return null;
        }

        Node current= first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return  current.getData();
    }
    /* Вилучення елементу за індексом, повертає true у разі успіху або false в іншому випадку */
    public boolean delete(int index) {
        if (index>=count && index < 0 ){
            return false;
        }
        Node prev = first;
        Node next = first;
        Node current = first;
        for (int i = 0; i < index-1; i++) {
            prev = prev.getNext();
        }
        for (int i = 0; i < index+1; i++) {
            next =  next.getNext();
        }
        prev.setNext(next);
        count--;
        return true;
    }
    /*Поверта розмір списку: якщо елементів в списку нема то повертає 0 (нуль)*/
    public int size() {
        return count;
    }
}
