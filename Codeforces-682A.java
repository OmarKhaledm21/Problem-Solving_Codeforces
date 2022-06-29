import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        long count=0;
        for(int i=1; i<=m; i++){
            count+= (n+(i%5))/5;
        }
        System.out.println(count);
    }

}