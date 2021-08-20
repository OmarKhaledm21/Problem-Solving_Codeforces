
import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong(),t=in.nextLong();

        if(n==1 && t==10){
            System.out.print("-1");
        }else if(n>=2 && t==10){
            for(int i=1; i<n; i++){
                System.out.print("1");
            }
            System.out.println("0");
        }else{
            for(int i=1; i<=n; i++){
                System.out.print(t);
            }
        }

        in.close();
    }
}