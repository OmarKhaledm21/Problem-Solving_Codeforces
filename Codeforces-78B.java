
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int div = n / 7;
        String[] s = {"R","O","Y","G","B","I","V"};
        StringBuilder stringBuilder = new StringBuilder();
        while (true){
            div--;
            for(int i=0; i<7; i++){
                stringBuilder.append(s[i]);
            }
            if(div == 0){
                break;
            }
        }
        if(n % 7 == 1){
            stringBuilder.append("G");
        }
        else if(n % 7 == 2){
            stringBuilder.append("GB");
        }
        else if(n % 7 == 3){
            stringBuilder.append("YGB");
        }
        else if(n % 7 == 4){
            stringBuilder.append("YGBI");
        }
        else if(n % 7 == 5){
            stringBuilder.append("OYGBI");
        }
        else if(n % 7 == 6){
            stringBuilder.append("OYGBIV");
        }
        System.out.println(stringBuilder);
    }


}