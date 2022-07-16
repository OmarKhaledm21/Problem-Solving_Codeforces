import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] group = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                group[i] = sc.nextInt();
            }
            Arrays.sort(group);
            boolean flagged = false;
            for (int i = 0; i < n; i++) {
                if (group[i + n] < (group[i] + x)) {
                    System.out.println("NO");
                    flagged = true;
                    break;
                }
            }
            if(flagged) continue;
            System.out.println("YES");
        }
        sc.close();
    }
 
}