package com.nora.chapter5.run;

import com.nora.chapter5.controller.Park;

/**
 * Created by nora on 20.01.17.
 */
public class Main {
    public static void main(String[] args) {
        Park park = new Park("Rock Park","For 8:00 To 21:00");
        park.setAttraction("Train",45);
        park.setAttraction("Butterfly",60);
        System.out.println(park);
    }
}
