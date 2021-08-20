
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s1=in.nextInt(),s2=in.nextInt();
        for(int i=0; i<s1*s2; i++){
            String c = in.next();
            if(c.equals("C") || c.equals("M") || c.equals("Y")){
                System.out.println("#Color");
                return;
            }
        }
        System.out.println("#Black&White");
        in.close();
    }
}