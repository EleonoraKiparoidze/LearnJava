package com.nora.chapter10.task1.controller;

import java.util.*;

/**
 * Created by nora on 15.02.17.
 */
public class BlackBox implements Collection<Double> {
    private int k;
    private SortedSet<Double> numbersSet = new TreeSet<>();

    public BlackBox() {
        k = 0;
    }

    public SortedSet<Double> getNumbersSet() {
        return numbersSet;
    }

    @Override
    public int size() {
        return numbersSet.size();
    }

    @Override
    public boolean isEmpty() {
        if (numbersSet.size() == 0)
            return true;
        return false;
    }

    @Override
    public boolean contains(Object o) {
        for (Double number : numbersSet) {
            if (number.equals(o))
                return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return numbersSet.iterator();
    }

    @Override
    public Object[] toArray() {
        return numbersSet.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return numbersSet.toArray(a);
    }

    @Override
    public boolean add(Double aDouble) {
        k++;
        return numbersSet.add(aDouble);
    }

    @Override
    public boolean remove(Object o) {
        k--;
        return numbersSet.remove(o);
    }

    @Override
    public boolean addAll(Collection c) {
        k = +c.size();
        return numbersSet.addAll(c);
    }

    @Override
    public void clear() {
        k = 0;
        numbersSet.clear();
    }

    @Override
    public boolean retainAll(Collection c) {
        return numbersSet.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c) {
        k = 0;
        return numbersSet.removeAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return numbersSet.containsAll(c);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlackBox doubles = (BlackBox) o;

        if (k != doubles.k) return false;
        return numbersSet != null ? numbersSet.equals(doubles.numbersSet) : doubles.numbersSet == null;

    }

    @Override
    public int hashCode() {
        int result = k;
        result = 31 * result + (numbersSet != null ? numbersSet.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BlackBox{" +
                "k=" + k +
                ", numbersList=" + numbersSet +
                '}';
    }
}
