package com.nora.run;
import com.nora.model.SloganAction;
/**
 * Created by nora on 14.01.17.
 */
public class Main {
    public static void main(String[] args) {
        for(String str: args){
            System.out.printf("Arguments -> %s%n",str);
        }

        SloganAction sloganObject = new SloganAction();
        sloganObject.printSlogan();
    }
}
