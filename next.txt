import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        in.close();
        if(n<26){
            System.out.println("NO");
            return;
        }

        int[] alpha = new int[123];
        str = str.toLowerCase();

        int count = 0;
        for(int i=0; i<n; i++){
            int ascii = str.charAt(i);
            if(alpha[ascii]!=1){
                alpha[ascii] = 1;
                count++;
            }
        }

        if(count==26) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}