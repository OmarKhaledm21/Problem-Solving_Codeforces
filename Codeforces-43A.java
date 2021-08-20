
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       int n=in.nextInt();
       int count=0,ind=0;
       String[] team = new String[n];
       team[0]=in.next();
       count++;
       for(int i=1; i<n; i++){
           team[i]=in.next();
           if(team[i].equals(team[0])){
               count++;
           }else{
               ind = i;
           }
       }

       if(count>n/2){
           System.out.println(team[0]);
       }else{
           System.out.println(team[ind]);
       }

        in.close();
    }
}