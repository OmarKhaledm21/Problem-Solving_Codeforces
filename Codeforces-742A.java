import java.math.BigInteger;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        if (n==0)
        {
            System.out.println("1");
        }
        else if (n>0) {
            int[] units = {8, 4, 2, 6};
            n = (n - 1) % 4;
            System.out.println(units[n]);
        }
        in.close();
    }
}