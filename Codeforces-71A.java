
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(),size=0;
        String letter;
        for(int i=0; i<n; i++) {
            letter = in.next();
            size = letter.length();
            if (size > 10) {
                letter = letter.charAt(0) + Integer.toString(size - 2) + letter.charAt(size - 1);
            }
            System.out.println(letter);
        }
        in.close();
    }
}