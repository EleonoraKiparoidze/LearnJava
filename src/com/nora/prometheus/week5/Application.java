package com.nora.prometheus.week5;

/**
 * Created by nora on 23.03.17.
 */
public class Application {
    public static void main(String[] args) {
        Command command;
        if(args == null){
            System.out.println("Error");
        }
        if (args != null) {
            switch (args[0]) {
                case "help":{
                    command = new Help(args);
                    command.execute();
                }
                break;
                case "echo":{
                    if(args[1]==null || args[1].equals("")){
                        System.out.println("Error");
                    }
                    else {
                        command = new Echo(args);
                        command.execute();
                    }
                }
                break;
                case "data":{
                    if( !args[1].equals("now")){
                        System.out.println("Error");
                    }
                    else {
                        command = new DateNow(args);
                        command.execute();
                    }
                }
                break;
                case "exit":{
                    command = new Exit(args);
                    command.execute();
                }
                break;
                default:{
                    System.out.println("Error");
                }
                break;
            }
        }
    }
}
