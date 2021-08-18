
import java.lang.reflect.Array;
import java.util.*;

import static java.lang.Integer.max;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int g;
        int[] gifts =new int[n+1];

        for(int i=1; i<=n; i++) {
            g=in.nextInt();
            gifts[g]=i;
        }

        for(int i=1; i<=n; i++){
            System.out.print(gifts[i]+" ");
        }


        in.close();
    }
}