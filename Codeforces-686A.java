
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n=in.nextInt(),x=in.nextInt();
        long sum= x,d=0,sad=0;
        char op;

        for(int i=0; i<n; i++){
            op=in.next().charAt(0);
            d=in.nextInt();
            if(op == '+'){
                sum+=d;
            }else{
                if(sum>=d){
                    sum-=d;
                }else{
                    sad++;
                }
            }
        }
        System.out.println(sum+" "+sad);
        in.close();
    }
}