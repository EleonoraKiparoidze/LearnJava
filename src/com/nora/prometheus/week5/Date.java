package com.nora.prometheus.week5;

/**
 * Created by nora on 24.03.17.
 */
public class Date implements Command{
    private String [] text;

    public Date(String[] text) {
        this.text = text;
    }

    @Override
    public void execute() {
        System.out.println(System.currentTimeMillis());
    }
}
