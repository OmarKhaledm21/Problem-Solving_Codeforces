import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.print(Math.min(a,b)+" ");
        System.out.print(Math.abs(a-b)/2);
    }
}



