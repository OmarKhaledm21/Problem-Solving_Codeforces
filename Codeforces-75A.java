import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.next(), b = input.next();
        int original_a = Integer.parseInt(a), original_b = Integer.parseInt(b);
        int original_res = original_a + original_b;
        String res = String.valueOf(original_res);
        int mod_a = 0,mod_b = 0;
        int mod_res = 0;
        StringBuilder _a= new StringBuilder();
        StringBuilder _b= new StringBuilder();
        StringBuilder _res = new StringBuilder();
        for(int i=0; i<a.length(); i++){
            if(a.charAt(i) == '0'){
                continue;
            }
            _a.append(a.charAt(i));
        }
        for(int i=0; i<b.length(); i++){
            if(b.charAt(i) == '0'){
                continue;
            }
            _b.append(b.charAt(i));
        }

        for(int i=0; i<res.length(); i++){
            if(res.charAt(i) == '0'){
                continue;
            }
            _res.append(res.charAt(i));
        }
        mod_a = Integer.parseInt(_a.toString());
        mod_b = Integer.parseInt(_b.toString());

        mod_res = Integer.parseInt(_res.toString());
        if(mod_res == mod_a+mod_b){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}