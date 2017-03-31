package com.nora.prometheus.week5;

/**
 * Created by nora on 23.03.17.
 */
public class Application {
    public static void main(String[] args) {
        Command command;
        if (args == null || args.length == 0) {
            System.out.println("Error");
        }
        else {
            switch (args[0]) {
                case "help": {
                    if(args.length != 1){
                        System.out.println("Error");
                    }else {
                        command = new Help(args);
                        command.execute();
                    }
                }
                break;
                case "echo": {
                    if (args[1] == null || args[1].equals(" ") || args.length !=2) {
                        System.out.println("Error");
                    } else {
                        command = new Echo(args);
                        command.execute();
                    }
                }
                break;
                case "date": {
                    if ( args.length !=2) {
                        System.out.println("Error");
                    } else if (!args[1].equals("now")) {
                        System.out.println("Error");
                    }
                    else {
                        command = new Date(args);
                        command.execute();
                    }
                }
                break;
                case "exit": {
                    if(args.length != 1){
                        System.out.println("Error");
                    }else {
                        command = new Exit(args);
                        command.execute();
                    }
                }
                break;
                default: {
                    System.out.println("Error");
                }
                break;
            }
        }
    }
}
