https://codeforces.com/contest/1698/problem/A
import java.util.HashSet;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a;
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            a= new int[ n ];
            for(int j=0; j<n; j++){
                a[j] = sc.nextInt();
            }
            XORMixup(a,n);
        }
        sc.close();


    }

    public static void XORMixup(int[] a, int n){
        HashSet<Integer> values = new HashSet<>();
        for(int i=0; i<n; i++){values.add(a[i]);}

        int target;
        for(int i=0; i<n; i++){
            target = i;
            int xor=0;
            for(int j=0; j<n; j++){
                if(target==j){
                    continue;
                }
                xor^= a[j];
            }
            if(values.contains(xor)){
                System.out.println(xor);
                break;
            }
        }

    }

}