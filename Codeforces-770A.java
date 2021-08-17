import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n=in.nextInt(),k=in.nextInt();

        String pass="";

        for(int i=0; i<n; i++){
            if(i<k){
                pass+=Character.toString(97+i);
            }else{
                if(pass.charAt(i-1) != 'a'){
                    pass += 'a';
                }else{
                    pass += 'b';
                }
            }
        }


        System.out.println(pass);

        in.close();
    }
}