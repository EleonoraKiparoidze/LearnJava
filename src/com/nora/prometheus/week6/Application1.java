package com.nora.prometheus.week6;

/**
 * Created by nora on 24.03.17.
 */
public class Application1 {
    public static void main(String[] args) {
        char ch;
        String s = "";
        String symb = "";
        String str = "";
        int i;
        int j;
        boolean b = true;
        for (i = 0; i < args[0].length()-1; i++) {
            if(args[0].charAt(i) == args[0].charAt(i+1)){
                b =false;
            }
        }
        if(b) {
            for (i = 0; i < args[0].length(); ) {
                ch = args[0].charAt(i);
                if (Character.isDigit(args[0].charAt(0))) {
                    str = "";
                    break;
                } else {
                    if (!Character.isDigit(ch)) {
                        symb = Character.toString(ch);
                        s = "";
                    } else {
                        s += args[0].charAt(i);
                    }
                    i++;

                    if (s.length() > 1) {
                        str = "";
                        break;
                    } else if (s.length() != 0) {
                        if (Integer.parseInt(s) == 1) {
                            str = "";
                            break;
                        } else {
                            for (j = 0; j < Integer.parseInt(s) - 1; j++)
                                str += symb;
                        }
                    } else {
                        str += Character.toString(ch);
                    }
                }
            }
        }
        else {
            str ="";
        }
        System.out.println(str);
    }
}
