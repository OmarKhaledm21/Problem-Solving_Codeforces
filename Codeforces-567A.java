

import java.util.Scanner;

import static java.lang.Integer.max;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n=in.nextInt();
        int[] city = new int[n];

        for(int i=0; i<n; i++){
            city[i]=in.nextInt();
        }
        for (int i=0; i<n; i++) {
            if(i==0) {
                System.out.println((city[1]-city[0])+" " +(city[n-1]-city[0]));
            }else if(i==n-1){
                System.out.println((city[n-1]-city[n-2])+" "+(city[n-1]-city[0]));
            }else{
                int min = city[i+1]-city[i], min2=city[i]-city[i-1];
                int m =Math.min(min,min2);
                int max=city[n-1]-city[i],max2=city[i]-city[0];
                int ma = Math.max(max,max2);
                System.out.println(m+" "+ma);
            }
        }

        in.close();
    }
}