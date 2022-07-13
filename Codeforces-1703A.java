import java.util.*;


class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0; i<n; i++){
            String s = sc .next();
            s = s.toLowerCase();
            if(s.equals("yes")){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}