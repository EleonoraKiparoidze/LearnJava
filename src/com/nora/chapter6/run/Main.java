package com.nora.chapter6.run;

import com.nora.chapter6.controller.PartTimeStudent;
import com.nora.chapter6.controller.Student;
import com.nora.chapter6.logic.StudentCalculator;

/**
 * Created by nora on 25.01.17.
 */
public class Main {
    public static void main(String[] args) {
        Student student = new PartTimeStudent("Eleonora","Zazovna","Kiparoidze","ingeneria",31,10,1995,"Kazackaia,26");
        student.setMark(3);
        student.setMark(5);
        int age = StudentCalculator.getAge(student);
        int mark = StudentCalculator.averageMark(student);
        student.setFormOfStudy();
        System.out.println(student);
        System.out.println("Age  --> "+Integer.toString(age));
        System.out.println("Average Mark  --> "+Integer.toString(mark));
    }
}
