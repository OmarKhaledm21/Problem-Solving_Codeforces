import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n+1][m];
        sc.close();
        int turn = m;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                for (int j = 0; j < m; j++) arr[i][j] = '#';
            } else {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = '.';
                }
                if (turn == m) {
                    arr[i][m - 1] = '#';
                    turn = 0;
                } else {
                    arr[i][0] = '#';
                    turn = m;
                }
            }
        }
        for(int i=1; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}



