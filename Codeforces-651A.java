import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int a1 = input.nextInt();
        int a2 = input.nextInt();
        input.close();
        while (a1 > 0 && a2 > 0) {
            if (a1 > a2) {
                a1 -= 2;
                a2 += 1;
                count++;
            } else {
                a1 += 1;
                a2 -= 2;
                count++;
            }
            if (a1 < 0 || a2 < 0) {
                count--;
            }

        }
        System.out.println(count);

    }
}