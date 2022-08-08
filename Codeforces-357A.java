import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int[] cm = new int[m];
        int sum = 0;
        for (int i = 0; i < m; i++) {
            cm[i] = input.nextInt();
            sum += cm[i];
        }
        int x = input.nextInt(), y = input.nextInt();
        input.close();
        int g1 = 0;
        for (int i = 0; i < m; i++) {
            g1 += cm[i];
            if (g1 >= x && g1 <= y && (sum - g1) >= x && (sum - g1) <= y) {

                {
                    System.out.println(i + 2);
                    return;
                }

            }
        }
        System.out.println(0);
    }
}