package com.nora.prometheus.week7.task;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collector;

/**
 * Created by nora on 31.03.17.
 */
public class Application {
    public static double parse(String rpnString) {

        String[] rpn = rpnString.split(" ");
        double first;
        double second;
        Deque<Double> numbers = new LinkedList<>();
        for (int i = 0; i < rpn.length; i++) {
            if (rpn[i].equals("*") || rpn[i].equals("+") || rpn[i].equals("/") || rpn[i].equals("-")) {
                if (rpn[i].equals("*")) {
                    first = numbers.pop();
                    System.out.println(first);
                    second = numbers.pop();
                    System.out.println(second);
                    numbers.push(first * second);
                } else if (rpn[i].equals("/")) {
                    first = numbers.pop();
                    second = numbers.pop();
                    try{
                    numbers.push(first / second);
                    }catch (ArithmeticException e){
                        System.out.println(e);
                    }

                } else if (rpn[i].equals("-")) {
                    first = numbers.pop();
                    second = numbers.pop();
                    numbers.push(first - second);
                } else if (rpn[i].equals("+")) {
                    first = numbers.pop();
                    second = numbers.pop();
                    numbers.push(first + second);
                }
            }else {
                try {
                    numbers.push(Double.parseDouble(rpn[i]));
                } catch (RPNParserException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println(numbers);

        return numbers.pop();
    }

    public static void main(String[] args) {

        System.out.println(parse("0 0 / ("));
    }

}
