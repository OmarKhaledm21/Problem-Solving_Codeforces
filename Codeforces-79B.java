import java.util.*;

public class Solution {
    static class cell {
        int a;
        int b;
        int c;

        public cell(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String[] vegs = { "Carrots", "Kiwis", "Grapes"};
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int t = sc.nextInt();
        cell[] waste = new cell[k];
        for (int i = 0; i < k; i++) {
            waste[i] = new cell(sc.nextInt(), sc.nextInt());
            waste[i].c = (waste[i].a * m) - (m - waste[i].b);
        }
        Arrays.sort(waste, Comparator.comparingInt(o -> o.c));
        int a, b, c;
        boolean flag = false;
        for (int i = 0; i < t; i++) {
            flag = false;
            a = sc.nextInt();
            b = sc.nextInt();
            c = (a * m) - (m - b);
            int total = 0;
            for (cell w : waste) {
                if(w.c < c){
                    total++;
                }else if(w.c == c){
                    System.out.println("Waste");
                    flag = true;
                    break;
                }else{
                    break;
                }
            }
            if(flag){
                continue;
            }
            c-= total;
            int res = (c%3);
            if(res>0) {
                System.out.println(vegs[res - 1]);
            }else{
                res = vegs.length;
                System.out.println(vegs[res-1]);
            }
        }
        sc.close();

    }
}
