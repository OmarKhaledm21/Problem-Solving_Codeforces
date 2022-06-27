
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char target_letter='\0';
        char other_letter='\0';
        int target_i = 0, target_j = n - 1;
        boolean mid = false;

        for (int i = 0; i < n; i++) {
            String line = sc.next();
            if(i==0){
                target_letter = line.charAt(0);
                other_letter= line.charAt(1);
                if(target_letter == other_letter){
                    System.out.println("NO");
                    return;
                }
            }
            char ti=line.charAt(target_i),tj=line.charAt(target_j);
            for(int k=0; k<n; k++){
                char curr = line.charAt(k);
                if(curr == ti || curr == tj){
                    continue;
                }
                if(curr!= other_letter){
                    System.out.println("NO");
                    return;
                }
            }
            if(ti == target_letter && tj == target_letter){
                target_i++;
                target_j--;
            }else{
                System.out.println("NO");
                return;
            }

        }
        System.out.println("YES");
        sc.close();
    }
}