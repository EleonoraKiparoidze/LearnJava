package com.nora.chapter6.logic;

import com.nora.chapter6.controller.PartTimeStudent;
import com.nora.chapter6.controller.Student;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.List;

/**
 * Created by nora on 25.01.17.
 */
public  class StudentCalculator {

    public static int getAge(Student student){
        Temporal dayOfBirthday = LocalDate.of(student.getYear(),student.getMonth(),student.getDay());
        Temporal dayToday = LocalDate.now();
        return (int) ChronoUnit.YEARS.between(dayOfBirthday,dayToday);
    }

    public static int averageMark(Student student){
        List<Integer> marks = student.getMark();
        int averageMark = 0;
        for(int mark: marks){
            averageMark +=mark;
        }
        return averageMark/marks.size();
    }
}
