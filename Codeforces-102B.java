
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int total = 0;
        while (str.length()>1){
            int sum = 0;
            for(int i=0; i<str.length(); i++){
                sum += Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            str = String.valueOf(sum);
            total++;

        }
        System.out.println(total);

    }
}