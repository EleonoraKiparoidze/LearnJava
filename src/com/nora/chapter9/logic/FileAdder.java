package com.nora.chapter9.logic;

import java.io.File;
import java.io.IOException;

public class FileAdder {

    public static File createFile( String fileName){
        String s = File.separator;
        File file = new File (s+"home"+s+"nora"+s+"IdeaProjects"+s+"LearnJava"+s+"src"+s+"com"+s+"nora"+s+"chapter9"+s+"file."+fileName);
        if(file.exists()){
            System.out.println(file.getName()+" exist!");
            file.deleteOnExit();
            System.out.println(file.getName()+" deleted!");
        }
        else {
            System.out.println(file.getName()+" doesn't exist!");
        }
        try {
            if(file.createNewFile()){
                System.out.println(file.getName()+" created!");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
      return file;
    }
}
