import java.util.*;


class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] garden = new int[n];
        for (int i = 0; i < n; i++) {
            garden[i] = sc.nextInt();
        }
        sc.close();
        int count = 1, sum = 1;
        for (int i = 0; i < n; i++) {
            int cur = garden[i];
            if (i > 0 && i < n - 1) {
                int k = i - 1, r = i + 1;
                while (k >= 0 && garden[k] <= cur) {
                    cur = garden[k];
                    k--;
                    count++;
                }
                cur = garden[i];
                while (r < n && garden[r] <= cur) {
                    cur = garden[r];
                    r++;
                    count++;
                }
            }
            if(i==0){
                int  r = i + 1;
                while (r < n && garden[r] <= cur) {
                    cur = garden[r];
                    r++;
                    count++;
                }
            }
            if(i==n-1){
                int k = i - 1;
                while (k >= 0 && garden[k] <= cur) {
                    cur = garden[k];
                    k--;
                    count++;
                }
            }

            sum = Math.max(count, sum);
            count = 1;
        }
        System.out.println(sum);
    }
}