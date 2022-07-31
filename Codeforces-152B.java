import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int OO = (int) 1e9;
        int n = input.nextInt();
        int m = input.nextInt();

        long x = input.nextInt();
        long y = input.nextInt();

        long steps = 0;
        int k = input.nextInt();
        for (int i = 0; i < k; i++) {
            int xi = input.nextInt();
            int yi = input.nextInt();

            int maxi = n;
            int maxj = m;
            if (xi < 0)
                maxi = 1;
            if (yi < 0)
                maxj = 1;

            long st = OO;
            if (xi != 0)
                st = Math.min(st, (maxi - x) / xi);

            if (yi != 0)
                st = Math.min(st, (maxj - y) / yi);

            steps += st;
            x += st * xi;
            y += st * yi;
            // System.out.println(x + " " + y);
        }

        System.out.println(steps);
    }
}