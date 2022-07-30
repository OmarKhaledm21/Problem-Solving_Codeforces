import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if (m == 0) {
            System.out.println(0);
            return;
        }
        int[] debt = new int[n + 1];
        for (int q = 0; q < m; q++) {
            int p1 = sc.nextInt();
            int p2 = sc.nextInt();
            int d = sc.nextInt();
            debt[p1] += d;
            debt[p2] -= d;
        }
        sc.close();
        int sum = 0;
        for (int q = 0; q < n + 1; q++) {
            sum += (debt[q] > 0 ? debt[q] : 0);
        }
        System.out.println(sum);
    }
}