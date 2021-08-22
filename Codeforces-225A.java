import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        boolean possible = true;

        int n=in.nextInt(),x=in.nextInt(),a,b;
        for (int i=0; i<n; i++){
            a=in.nextInt();
            b=in.nextInt();

            if(x== a || x==b || x==7-a || x==7-b){
                possible=false;
            }
            x=7-x;
        }
        System.out.println(possible==true? "YES":"NO");

        in.close();
    }
}