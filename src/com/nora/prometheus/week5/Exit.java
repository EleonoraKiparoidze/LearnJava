package com.nora.prometheus.week5;

/**
 * Created by nora on 24.03.17.
 */
public class Exit implements Command{
    private String [] text;

    public Exit(String[] text) {
        this.text = text;
    }

    @Override
    public void execute() {
        System.out.println("Goodbye!");
    }
}
