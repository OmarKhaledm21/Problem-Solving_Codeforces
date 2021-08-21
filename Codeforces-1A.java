import java.util.Scanner;

import static java.lang.Math.ceil;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n=in.nextLong(),m=in.nextLong(),a=in.nextLong();

        System.out.println(((m+a-1)/a) * ((n+a-1)/a));

        in.close();
    }
}