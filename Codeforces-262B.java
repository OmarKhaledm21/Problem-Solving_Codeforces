import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] incomes = new Integer[n];
        for (int i = 0; i < n; i++) {
            incomes[i] = sc.nextInt();
        }
        sc.close();

        int j = 0;
        while (k!=0 && j<n) {
            if (incomes[j] < 0) {
                incomes[j] *= -1;
                j++;
                k--;
            }else{
                break;
            }
        }
        Arrays.sort(incomes);

        incomes[0] *= (int) Math.pow(-1, k);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += incomes[i];
        }
        System.out.println(sum);
    }
}