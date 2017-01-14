package com.nora.chapter1.controller;

/**
 * Created by nora on 14.01.17.
 */
public class FindLargerAndSmallerNumber {

public int findLarger(int [] numbersArray){
    int larger=numbersArray[0];
    for(int number:numbersArray){
        if(number>larger){
            larger=number;
        }
    }
    return larger;
}
    public int findSmaller(int [] numbersArray){
        int smaller=numbersArray[0];
        for(int number:numbersArray){
            if(number<smaller){
                smaller=number;
            }
        }
        return smaller;
    }

}
