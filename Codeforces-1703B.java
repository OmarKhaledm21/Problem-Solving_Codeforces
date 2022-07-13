import java.util.*;


class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Character> set= new HashSet<>();
        int n= sc.nextInt();
        for(int i=0; i<n; i++){
            set.clear();
            int k = sc.nextInt();
            String s = sc .next();
            int count = 0;
            for(int j=0; j<s.length(); j++){
                char c = s.charAt(j);
                if(set.contains(c)){
                       count++;
                }else {
                    count+=2;
                    set.add(c);
                }

            }
            System.out.println(count);
        }
        sc.close();
    }
}