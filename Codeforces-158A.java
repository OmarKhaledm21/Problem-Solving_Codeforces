import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int total = 0;
        int target = arr[k-1];
        for(int i=0; i<n; i++){
            if(arr[i]>=target && arr[i]>0) {
                total++;
            }else{
                break;
            }
        }
        System.out.println(total);
    }
}


