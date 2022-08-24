import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int total = 0;
        for(int i=0; i<5; i++){
            total += s.nextInt();
        }
        if(total == 0){
            System.out.println(-1);
            return;
        }
        int bet = total/5;
        if(total == 5*bet){
            System.out.println(bet);
        }else{
            System.out.println(-1);
        }
    }
}