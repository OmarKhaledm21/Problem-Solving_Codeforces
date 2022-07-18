import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line_segments = new int[n];
        for (int i = 0; i < n; i++) {
            line_segments[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(line_segments);

        for (int i = 0; i < n-2; i++) {
            if (line_segments[i] + line_segments[i + 1] > line_segments[i + 2]) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
