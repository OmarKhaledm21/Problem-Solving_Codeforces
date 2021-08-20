import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String song = in.next(),original="";

        for(int i=0; i<song.length(); i++){

            if(i<=song.length()-3 && song.charAt(i)=='W' && song.charAt(i+1)=='U' && song.charAt(i+2)=='B' ){
                i+=2;
                if(!original.endsWith(" ")){
                    original+=" ";
                }
            }else{
                original+=song.charAt(i);
            }
        }
        System.out.println(original);

        in.close();
    }
}