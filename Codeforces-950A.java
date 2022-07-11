import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int a = sc.nextInt();

        int tl = 0;
        int tr = 0;
        int count = 0;
        for (int i = 0; i < (a + 1); i++) {
            tl = l + i;
            tr = r + a - i;
            count = Math.max(count,Math.min(tl,tr)*2);
        }
        sc.close();
        System.out.println(count);
    }
}



