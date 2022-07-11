import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t= sc.next();
        sc.close();
        int len = s.length();
        if(len == t.length()){
            for(int i=0,j = len-1; i<len; i++,j--){
                char _s = s.charAt(i);
                char _t = t.charAt(j);
                if(_s!=_t){
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}


