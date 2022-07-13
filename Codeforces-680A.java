import java.math.BigInteger;
import java.util.*;


class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<Integer, Integer> set = new Hashtable<>();
        int sum = 0;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            int t = sc.nextInt();
            sum += t;
            if (set.containsKey(t)) {
                int freq = set.get(t);
                if (freq < 3 ) {
                    freq++;
                    set.replace(t,freq);
                }
            } else {
                set.put(t, 1);
            }
        }

        for(int val : set.keySet()){
            int freq = set.get(val);
            if(freq == 1){
                continue;
            }
            int m = freq * val;
            if(m>max ){
                max = m;
            }
        }

        System.out.println(sum - max);

    }
}