package com.nora.prometheus.week5;

/**
 * Created by nora on 24.03.17.
 */
public class Help implements Command {

    private String [] text;

    public Help(String[] text) {
        this.text = text;
    }

    @Override
    public void execute() {
        System.out.println("Help executed");
    }
}
