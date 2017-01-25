package com.nora.chapter6.logic;

import com.nora.chapter6.controller.PartTimeStudent;
import com.nora.chapter6.controller.Student;

import java.util.Calendar;
import java.util.List;

/**
 * Created by nora on 25.01.17.
 */
public  class StudentCalculator {

    public static int getAge(Student student){
        int day = student.getDay();
        int month = student.getMonth();
        int year = student.getYear();
        Calendar calendar = Calendar.getInstance();
        int monthCalendar = calendar.get(Calendar.MONTH);
        int dayCalendar = calendar.get(Calendar.DAY_OF_MONTH);
        int yearCalendar = calendar.get(Calendar.YEAR);
        if ((month > monthCalendar) || (month == monthCalendar) && (day > dayCalendar)) {
            return yearCalendar - year - 1;
        } else {
            return yearCalendar - year;
        }
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
