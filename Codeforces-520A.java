

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n= in.nextInt();
        String letter = in.next().toLowerCase();
        boolean[] ascii = new boolean[123];

        for(int i=0; i<letter.length(); i++){
            ascii[(int)letter.charAt(i)]=true;
        }

        boolean c2=true;

        for(int i=97; i<=122; i++){
            if(ascii[i]==false){
                c2=false;
                break;
            }
        }

        if(c2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        in.close();
    }
}