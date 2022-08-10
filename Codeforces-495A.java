import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hashtable<Character, ArrayList<String>> map = new Hashtable<>();
        map.put('0', new ArrayList<>(Arrays.asList("D", "8")));
        map.put('1', new ArrayList<>(Arrays.asList("D", "3", "4", "0", "7", "9", "8")));
        map.put('2', new ArrayList<>(Arrays.asList("D", "8")));
        map.put('3', new ArrayList<>(Arrays.asList("D", "9", "8")));
        map.put('4', new ArrayList<>(Arrays.asList("D", "9", "8")));
        map.put('5', new ArrayList<>(Arrays.asList("D", "6", "9", "8")));
        map.put('6', new ArrayList<>(Arrays.asList("D", "8")));
        map.put('7', new ArrayList<>(Arrays.asList("D", "0", "3", "9", "8")));
        map.put('8', new ArrayList<>(Arrays.asList("D")));
        map.put('9', new ArrayList<>(Arrays.asList("D", "8")));

        String n = input.next();
        int total = 1;

        for (int i = 0; i < n.length(); i++) {
            char curr = n.charAt(i);
            total *= (map.get(curr).size());
        }
        System.out.println(total);
    }
}