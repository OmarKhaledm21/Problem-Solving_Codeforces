import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char p = sc.next().charAt(0);
        char[][] office = new char[n][m];
        for (int i = 0; i < n; i++) {
            String l = sc.next();
            for (int j = 0; j < m; j++) {
                office[i] = l.toCharArray();
            }
        }
        sc.close();
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, 1, -1};
        boolean[] visited = new boolean[100];
        char empty = '.';
        visited[empty] = true;
        visited[p] = true;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (office[i][j] == p) {
                    for (int k = 0; k < 4; k++) {
                        int x = i + dx[k];
                        int y = j + dy[k];
                        if (x >= 0 && x < n && y >= 0 && y < m  && !visited[office[x][y]]) {
                            visited[office[x][y]] = true;
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);

    }
}