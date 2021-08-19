

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String keys = "qwertyuiopasdfghjkl;zxcvbnm,./";

        String dir = in.next();
        String input = in.next();

        if(dir.equals("R")) {
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                for (int j = 0; j < keys.length(); j++) {
                    if (keys.charAt(j) == ch) {
                        System.out.print(keys.charAt(j - 1));
                    }
                }
            }
        }else{
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                for (int j = 0; j < keys.length(); j++) {
                    if (keys.charAt(j) == ch) {
                        System.out.print(keys.charAt(j + 1));
                    }
                }
            }
        }
        in.close();
    }
}