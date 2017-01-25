package com.nora.chapter6.controller;

import java.io.Serializable;

/**
 * Created by nora on 25.01.17.
 */
public interface IEnrollee{

    void setLastName(String lastName);

    void setFirstName(String firstName);

    void setMiddleName(String middleName);

    void setAddress(String address);

    void setMark(int mark);

    void setDay(int day);

    void setMonth(int month);

    void setYear(int year);

}
