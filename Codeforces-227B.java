
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Hashtable<Integer, Integer> set = new Hashtable<>();
        for (int i = 0; i < n; i++) {
            set.put(sc.nextInt(), i);
        }
        int m = sc.nextInt();
        long c1 = 0, c2 = 0;
        for (int i = 0; i < m; i++) {
            int target = sc.nextInt();
            int res1 = set.get(target) + 1;
            c1 += res1;
            c2 += (n - res1 + 1);

        }
        sc.close();
        System.out.println(c1 + " " + c2);
    }


}