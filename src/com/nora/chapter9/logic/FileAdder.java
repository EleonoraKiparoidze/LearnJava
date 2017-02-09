package com.nora.chapter9.logic;

import java.io.File;
import java.io.IOException;

/**
 * Created by nora on 09.02.17.
 */
public class FileAdder {
    public static File addFile(String fileName){
        String s = File.separator;
        File file = new File(s + "home" + s + "nora" + s + "IdeaProjects" + s + "LearnJava" + s + "src" + s + "com" + s + "nora" + s + "chapter9" + s + "file" + s + fileName);
        if (file.delete()) {
            System.out.println("File deleted!");
        }
        else {
            try {
                if (file.createNewFile()) System.out.println("File -->" + file.getName());
            } catch (IOException e) {
                System.err.println(e);
            }
        }
        return file;
    }
}
