import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'o', 'y', 'e', 'u', 'i'));
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (!vowels.contains(c)) {
                stringBuilder.append('.').append(c);
            }
        }
        System.out.println(stringBuilder);
    }
}


