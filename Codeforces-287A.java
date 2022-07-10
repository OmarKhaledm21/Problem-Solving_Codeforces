import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] ch = new char[4][4];
        for (int i = 0; i < 4; i++) {
            String line = sc.next();
            for (int j = 0; j < 4; j++) {
                char c = line.charAt(j);
                ch[i][j] = c;
            }
        }
        sc.close();


        for (int k = 0; k < 3; k++) {
            for (int s = 0; s < 3; s++) {
                int count = 0;
                for (int i = s; i < s + 2; i++) {
                    for (int j = k; j < k + 2; j++) {
                        if (ch[i][j] == '#') {
                            count++;
                        }
                    }
                }
                if (count != 2) {
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }

}