package com.nora.prometheus.week5;

/**
 * Created by nora on 24.03.17.
 */
public class Echo implements Command {
   private  String [] text;

    public Echo(String[] text) {
        this.text = text;
    }

    @Override
    public void execute() {
        System.out.println(text[1]);
    }
}
