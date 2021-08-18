

import java.util.Scanner;

import static java.lang.Integer.max;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a=in.next(),b=in.next();
        if(!a.equals(b)){
            System.out.println(Math.max(a.length(),b.length()));
        }else{
            System.out.println("-1");
        }


        in.close();
    }
}