

import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n=in.nextInt();
        int[] arr = new int[n+1];
        for(int i=1; i<=n; i++){
            arr[i]=in.nextInt();
        }
        boolean[] visit = new boolean[n+1];

        int next=n;
        for(int i=1; i<=n; i++){
            visit[arr[i]]=true;
            while (visit[next] && next>0){
                System.out.print(next-- +" ");
            }
            System.out.println("");
        }


        in.close();
    }
}