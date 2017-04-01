package com.nora.prometheus.week7.task;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

/**
 * Created by nora on 31.03.17.
 */
public class Application {
    public static double parse(String rpnString) {

        String newRpn = rpnString.replaceAll("[\\s]+", " ");
        String[] rpn = newRpn.trim().split(" ");
        Double first;
        Double second;
        Deque<Double> numbers = new LinkedList<>();
        for (String aRpn : rpn) {
            if (aRpn.equals("*") || aRpn.equals("+") || aRpn.equals("/") || aRpn.equals("-")) {
                switch (aRpn) {
                    case "*":
                        try {
                            first = numbers.pop();
                            second = numbers.pop();
                        } catch (NoSuchElementException e) {
                            throw new RPNParserException();
                        }
                        numbers.push(first * second);
                        break;
                    case "/":
                        try {
                            first = numbers.pop();
                            second = numbers.pop();
                            if (second == 0  ) {
                                throw new ArithmeticException();
                            } else {
                                numbers.push(second / first);
                            }
                        } catch (NoSuchElementException e) {
                            throw new RPNParserException();
                        }

                        break;
                    case "-":
                        try {
                            first = numbers.pop();
                            second = numbers.pop();
                        } catch (NoSuchElementException e) {
                            throw new RPNParserException();
                        }
                        numbers.push(second - first);
                        break;
                    case "+":
                        try {
                            first = numbers.pop();
                            second = numbers.pop();
                        } catch (NoSuchElementException e) {
                            throw new RPNParserException();
                        }
                        numbers.push(first + second);
                        break;
                }
            } else {
                try {
                    numbers.push(Double.parseDouble(aRpn));
                } catch (NumberFormatException e) {
                    throw new RPNParserException();
                }
            }
        }
        Double result;
        try {
            result = numbers.pop();
        } catch (NoSuchElementException e) {
            throw new RPNParserException();
        }

        return result;
    }

    public static void main(String[] args) {

        System.out.println(parse("1   2 /"));

    }


}
