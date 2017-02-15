package com.nora.chapter10.task1.controller;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by nora on 15.02.17.
 */
public class BlackBox implements Collection<Double> {
    private int k;
    private LinkedList<Double> numbersList = new LinkedList<>();

    public BlackBox() {
        k = 0;
    }

    @Override
    public int size() {
        return numbersList.size();
    }

    @Override
    public boolean isEmpty() {
        if (numbersList.size() == 0)
            return true;
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (Double number : numbersList) {
            if (number.equals(o))
                return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return numbersList.iterator();
    }

    @Override
    public Object[] toArray() {
        return numbersList.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return numbersList.toArray(a);
    }

    @Override
    public boolean add(Double aDouble) {
        k++;
        return numbersList.add(aDouble);
    }

    @Override
    public boolean remove(Object o) {
        k--;
        return numbersList.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {
        k = +c.size();
        return numbersList.addAll(c);
    }

    @Override
    public void clear() {
        k = 0;
        numbersList.clear();
    }

    @Override
    public boolean retainAll(Collection c) {
        return numbersList.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        k = 0;
        return numbersList.removeAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return numbersList.containsAll(c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlackBox doubles = (BlackBox) o;

        if (k != doubles.k) return false;
        return numbersList != null ? numbersList.equals(doubles.numbersList) : doubles.numbersList == null;

    }

    @Override
    public int hashCode() {
        int result = k;
        result = 31 * result + (numbersList != null ? numbersList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BlackBox{" +
                "k=" + k +
                ", numbersList=" + numbersList +
                '}';
    }
}
