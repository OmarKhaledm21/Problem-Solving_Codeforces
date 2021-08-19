import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        int rated = 0,rated2=0;
        
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
            b[i]=in.nextInt();
           
            if(a[i]!=b[i]){
                System.out.println("rated");
                return;
            }
        }

        for(int i=1; i<n; i++){
            if(a[i]>a[i-1]){
                System.out.println("unrated");
                return;
            }
        }
        System.out.println("maybe");

        in.close();
    }
}