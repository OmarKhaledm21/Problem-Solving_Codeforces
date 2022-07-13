
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int energy = 0;
        int prev= 0;
        int res = 0;
        int current = 0;
        for(int i=1; i<=n; i++){
            current = sc.nextInt();
            energy += (prev-current);
            if(energy<0){
                res += (-energy);
                energy = 0;
            }
            prev = current;
        }
        sc.close();
        System.out.println(res);
    }
}