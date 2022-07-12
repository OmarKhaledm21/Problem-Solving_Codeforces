import java.util.*;


class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int a,b;
        for(int i=0; i<n; i++){
            a=sc.nextInt(); b=sc.nextInt();
            if(a!= b){
                System.out.println("Happy Alex");
                return;
            }
        }
        System.out.println("Poor Alex");
        sc.close();
    }
}