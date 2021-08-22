import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int n =in.nextInt(),k=in.nextInt();
        String seq = "0123456789";
        String s;
        int count=0,res=0;
        int returnValue =-1;

        while(n!=0){
            s=in.next();
            for(int i=0; i<=k; i++){
                if(s.indexOf(seq.charAt(i))!=-1){
                    count++;
                }
                if(count>=k+1){
                    res++;
                }
            }
            count=0;
            n--;
        }
        System.out.println(res);

        in.close();
    }
}