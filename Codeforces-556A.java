import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int[] freq = new int[2];
        freq[0] = freq[1] = 0;
        for(int i=0; i<n; i++){
            char c = str.charAt(i);
            if(c=='1'){
                freq[1]++;
            }else{
                freq[0]++;
            }
        }
        System.out.println(Math.abs(freq[0]-freq[1]));
    }
}


