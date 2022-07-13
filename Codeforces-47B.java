
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<Character, Integer> count = new Hashtable<>();
        count.put('A', 0);
        count.put('B', 0);
        count.put('C', 0);

        for (int i = 0; i < 3; i++) {
            String statement = sc.next();
            if (statement.charAt(1) == '<') {
                count.put(statement.charAt(2), count.getOrDefault(statement.charAt(2), 0) + 1);
            } else {
                count.put(statement.charAt(0), count.getOrDefault(statement.charAt(0), 0) + 1);
            }
        }
        sc.close();
        if (count.get('A') == 1 && count.get('B') == 1 && count.get('C') == 1) {
            System.out.println("Impossible");
        } else {
            if (count.get('A') == 0) {
                System.out.print("A");
            } else if (count.get('B') == 0) {
                System.out.print("B");
            } else if (count.get('C') == 0) {
                System.out.print("C");
            }


            if (count.get('A') == 1) {
                System.out.print("A");
            } else if (count.get('B') == 1) {
                System.out.print("B");
            } else if (count.get('C') == 1) {
                System.out.print("C");
            }



            if (count.get('A') == 2) {
                System.out.print("A");
            } else if (count.get('B') == 2) {
                System.out.print("B");
            } else if (count.get('C') == 2) {
                System.out.print("C");
            }
        }
    }
}