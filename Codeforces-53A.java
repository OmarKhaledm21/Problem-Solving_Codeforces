import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String h = s.next();
        int y = s.nextInt();
        String f[] = new String[y];
        String srt = "";
        for (int i = 0; i < y; i++) {
            f[i] = s.next();
        }
        s.close();
        Arrays.sort(f);
         srt = h;
        for (int i = 0; i < y; i++) {
            if (f[i].startsWith(h)) {
                srt = f[i];
                break;
            }
        }
        System.out.println(srt);


    }
}