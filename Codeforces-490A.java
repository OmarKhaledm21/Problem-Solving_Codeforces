import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Math.min;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int teams=0;
        int n = in.nextInt();
        int[] children= new int[n];
        ArrayList<Integer> t1=new ArrayList<Integer>(),t2=new ArrayList<Integer>(),t3=new ArrayList<Integer>();

        for(int i=0; i<n; i++){
            children[i] = in.nextInt();
            if(children[i]==1){
                t1.add(i);
            }else if(children[i]==2){
                t2.add(i);
            }else{
                t3.add(i);
            }
        }

        teams = min(t3.size(),min(t1.size(),t2.size()));
        System.out.println(teams);
        for(int i=0; i<teams; i++){
            System.out.println((t1.get(i)+1)+" "+(t2.get(i)+1)+" "+(t3.get(i)+1));
        }

        in.close();
    }
}