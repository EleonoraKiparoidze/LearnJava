package com.nora.chapter6.controller;

/**
 * Created by nora on 25.01.17.
 */
public class PartTimeStudent extends Student {
    private String form;

    public PartTimeStudent() {
    }

    public PartTimeStudent(String firstName, String middleName, String lastName) {
        super(firstName, middleName, lastName);
    }

    public PartTimeStudent(String firstName, String middleName, String lastName, String faculty, int day, int month, int year, String address) {
        super(firstName, middleName, lastName, faculty, day, month, year, address);
    }

    @Override
    public void setFormOfStudy() {
        form = "Part Time";
    }

    public String getFormOfStudy() {
        return form;
    }

    @Override
    public String toString() {
        return super.toString()+" " +
                "form -->'" + form + '\'' +
                '}';
    }
}
