import java.util.Scanner;



public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n=in.nextInt(),m=in.nextInt();
        if(n==2 && m!=3){
            System.out.println("NO");
        }else if(m>n && checkPrime(n) && checkPrime(m) && nextPrime(n,m)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


        in.close();
    }

    public static boolean checkPrime(int n){
        int i=2;
        while(i<=n/2){
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean nextPrime(int n, int m){
        for(int i=n+1; i<=m; i++){
            if(checkPrime(i) && i!=m){
                return false;
            }
        }
        return true;
    }
}