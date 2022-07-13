import java.math.BigInteger;
import java.util.*;


class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int total = 0;
        a--;
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        sc.close();
        total += c[a];

        int i = a;
        int j = a;
        while (i >= 0 && j < n) {
            if (c[i] == 1 && c[j] == 1 && i!=j) {
                total+=2;
            }
            i--;
            j++;

        }
        while (i >= 0) {
            if (c[i] == 1) {
                total++;
            }
            i--;
        }
        while (j < n) {
            if (c[j] == 1) {
                total++;
            }
            j++;
        }
        System.out.println(total);

    }
}