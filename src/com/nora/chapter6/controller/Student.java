package com.nora.chapter6.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nora on 25.01.17.
 */
public abstract class Student implements IEnrollee{
    private String firstName, middleName, lastName, faculty, address;
    private int day;
    private int month;
    private int year;
    private List<Integer> marks = new ArrayList<>();

    public Student() {
    }

    public Student(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public Student(String firstName, String middleName, String lastName, String faculty, int day, int month, int year,String address) {
        this(firstName,middleName,lastName);
        this.faculty = faculty;
        this.day = day;
        this.month = month;
        this.year = year;
        this.address = address;
    }

    public int getDay() {
        return day;
    }

    @Override
    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    @Override
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setMark(int mark){
        marks.add(mark);
    }
    public List<Integer> getMark(){
        return marks;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", faculty='" + faculty + '\'' +
                ", address='" + address + '\'' +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    public abstract void setFormOfStudy();
}
