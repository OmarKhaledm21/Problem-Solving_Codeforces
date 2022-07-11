import java.util.*;
//1702 B
class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<String> strings = new ArrayList<>();
        for(int i=0; i<t; i++){
            strings.add( sc.next() );
        }
        sc.close();

        HashSet<Character> characters = new HashSet<>();
        int count;
        for(String str : strings){
            int len = str .length();
            count = 0;
            for(int i= 0; i<len; i++){
                char c = str.charAt(i);
                if(characters.size() == 3){
                    while ( i<len && characters.contains(str.charAt(i)) ){
                        i++;
                    }
                    count++;
                    characters.clear();
                    if(i<len)
                        characters.add(str.charAt(i));
                }else{
                    characters.add(c);
                }
            }
            if(characters.size() > 0){
                count++;
            }
            characters.clear();
            System.out.println(count);
        }


    }

}