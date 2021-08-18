
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Character> set = new HashSet<Character>();
        String line  = in.nextLine();
        int ch;
        for(int i=0; i<line.length(); i++){
            ch= ((int)line.charAt(i));
            if(ch>=97 && ch<=122) {
                set.add(line.charAt(i));
            }
        }
        System.out.println(set.size());

        in.close();
    }
}