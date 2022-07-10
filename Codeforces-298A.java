import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != '.') {
                if (s.charAt(i) == 'R') {
                    while (s.charAt(i) == 'R') {
                        i++;
                    }
                    System.out.println(i + " " + (i + 1));

                } else {
                    System.out.println((i + 1) + " " + i);
                }
                break;
            }
        }
    }

}