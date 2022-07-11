import java.util.*;
//1702 A
class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            long v = sc.nextInt();
            long x = (long) Math.pow(10, Math.floor(Math.log10(v)));
            System.out.println(v-x);
        }
        sc.close();
    }

}