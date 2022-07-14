
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s= sc.next();
        sc.close();
        char[] str = s.toCharArray();
        n--;
        int i;
        for(i=n-1; i>=0; i-=2){
            System.out.print(str[i]);
        }
        if(n%2==0){
            i=0;
        }else{
            i=1;
        }
        for(; i<=n; i+=2){
            System.out.print(str[i]);
        }
    }
}