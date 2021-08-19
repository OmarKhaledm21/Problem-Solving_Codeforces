import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        boolean[] levels=new boolean[n];
        int ind;

        int p = in.nextInt();
        for(int i=0; i<p; i++){
            ind = in.nextInt();
            levels[ind-1]=true;
        }

        int q = in.nextInt();
        for(int i=0; i<q; i++){
            ind = in.nextInt();
            levels[ind-1]=true;
        }

        boolean all = true;
        for(boolean value: levels){
            if(value){
                continue;
            }else{
                all=false;
                break;
            }
        }

        if(all){
            System.out.println("I become the guy.");
        }else{
            System.out.println("Oh, my keyboard!");
        }

        in.close();
    }
}