package com.nora.prometheus.week6;

/**
 * Created by nora on 24.03.17.
 */
public class Application {
    public static void main(String[] args) {
        char ch;
        String str = "";
        int i;
        int k;
        int j;

        if (args[0].equals("")) {
            System.out.println("");
        } else {
            for (i = 0; i < args[0].length(); ) {
                ch = args[0].charAt(i);
                k = 0;
                if (i == args[0].length()-1 ) {
                    str += Character.toString(ch);
                    break;
                }

                if (args[0].charAt(i+1) == ch) {
                    for (j = i; j < args[0].length(); j++) {
                        if (args[0].charAt(j) == ch){
                            k++;
                            if(k == 9){
                                str += Character.toString(ch)+Integer.toString(k);
                                k=0;
                            }
                        }else break;
                    }
                    i = j;
                } else{
                    i++;
                }

                if (k > 1) {
                    str += Character.toString(ch) + Integer.toString(k);
                }
                else {
                    str += Character.toString(ch);
                }

            }
            System.out.println(str);
        }
    }
}
