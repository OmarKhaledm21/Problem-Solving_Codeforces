

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum=0;
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
            sum+=arr[i];
        }
        if(n==2){
            if(arr[0]==arr[1]) {
                System.out.println("2");
            }else{
                System.out.println("1");
            }
        }else {
            Arrays.sort(arr);
            int coinSum=0;
            int coins=0;
            for(int i=n-1; i>=0; i--){
                if(coinSum<=(sum/2)){
                    coinSum+=arr[i];
                    coins++;
                }
            }
            System.out.println(coins);
        }
        in.close();
    }
}