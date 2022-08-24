import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.next();
        char[] s = str.toCharArray();

        int ans=0,c=0,p=0;
        if(s[0]=='C'){
            c++;
        }else{
            p++;
        }
        for(int i=1;i<str.length();i++){
            if(s[i]=='C'){
                if(s[i-1]=='C'){
                    if(c==5){
                        c=0;
                        ans++;
                    }
                    c++;
                }else{
                    ans++;
                    c++;
                    p=0;
                }
            }else{
                if(s[i-1]=='P'){
                    if(p==5){
                        p=0;
                        ans++;
                    }
                    p++;
                }else{
                    ans++;
                    p++;
                    c=0;
                }
            }
        }
        System.out.println(ans+1);
    }
}