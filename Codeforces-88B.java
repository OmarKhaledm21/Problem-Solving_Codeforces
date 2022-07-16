import java.util.*;

public class Solution {
    static class index {
        int x_coord;
        int y_coord;

        public index(int i, int j) {
            this.x_coord = i;
            this.y_coord = j;
        }
    }

    static ArrayList<index> shift = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        char[][] keys;
        int res = 0;
        ArrayList<index>[] posKey = new ArrayList[26];
        boolean[] can = new boolean[26];
        keys = new char[n][m];
        for (int i = 0; i < n; i++) {
            String l = sc.next();
            for (int j = 0; j < m; j++) {
                keys[i][j] = l.charAt(j);
            }
        }
        for (int i = 0; i < 26; i++) {
            posKey[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                char c = keys[i][j];
                if (c == 'S') {
                    shift.add(new index(i, j));
                } else {
                    int ASCII = keys[i][j] - 'a';
                    posKey[ASCII].add(new index(i, j));
                }
            }
        }

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < posKey[i].size() && !can[i]; j++) {                                                                         //check of each key if can press on it with one hand
                can[i] = can[i] | check(posKey[i].get(j).x_coord, posKey[i].get(j).y_coord, x);
            }
        }

        int q = sc.nextInt();
        String text = sc.next();

        for(int i=0; i<q; i++){
            char c = text.charAt(i);
            if(Character.isLowerCase(c)){
                int _index = c-'a';
                if(posKey[_index].isEmpty()){
                    res--;
                    break;
                }
            }else{
                c = Character.toLowerCase(c);
                int _index = c-'a';
                if(shift.isEmpty() || posKey[_index].isEmpty()){
                    res--;
                    break;
                }
                if(!can[_index]){
                    res++;
                }
            }
        }
        System.out.println(res);

    }

    public static int dist(int i, int j, int shr, int shc) {
        return (i - shr) * (i - shr) + (j - shc) * (j - shc);
    }

    public static boolean check(int i, int j, int x) {
        for (int w = 0; w < shift.size(); w++) {
            int dis = dist(i, j, shift.get(w).x_coord, shift.get(w).y_coord);
            if (dis <= x * x)
                return true;
        }
        return false;
    }

}