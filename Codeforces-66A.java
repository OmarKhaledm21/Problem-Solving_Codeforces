import java.math.BigInteger;
import java.util.*;


class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            long x = sc.nextLong();
            if(x<=127){
                System.out.println("byte");
            }else if(x<=32767){
                System.out.println("short");
            }else if(x<=2147483647){
                System.out.println("int");
            }else{
                System.out.println("long");
            }
        }catch (Exception e){
            System.out.println("BigInteger");
        }
    }
}