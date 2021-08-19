

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }

        if(n<=2){
            System.out.println("0");
        }else{
            Arrays.sort(arr);
            int min = arr[0],max=arr[n-1];
            int res=0;
            for(int i=1; i<n-1; i++){
                if(arr[i]>min&&arr[i]<max){
                    res++;
                }
            }
            System.out.println(res);
        }
        in.close();
    }
}