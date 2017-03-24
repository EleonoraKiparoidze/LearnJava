package com.nora.prometheus.week5;

/**
 * Created by nora on 24.03.17.
 */
public class DateNow implements Command{
    private String [] text;

    public DateNow(String[] text) {
        this.text = text;
    }

    @Override
    public void execute() {
        System.out.println(System.currentTimeMillis());
    }
}
