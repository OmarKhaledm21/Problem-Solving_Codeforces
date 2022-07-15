import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder p = new StringBuilder();
        p.append(s);
        for(int i=s.length()-1; i>=0; i--){
            p.append(s.charAt(i));
        }
        System.out.println(p);
    }
}