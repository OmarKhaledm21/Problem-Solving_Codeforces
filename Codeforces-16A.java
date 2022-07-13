
import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m = sc.nextInt();
        HashSet<Character> row = new HashSet<>();
        boolean false_row_flag = false;
        boolean false_col_flag = false;

        char[][] flag = new char[n][m];
        for(int i=0; i<n; i++){
            row.clear();
            String r = sc.next();
            for(int j=0; j<m; j++){
                flag[i][j] = r.charAt(j);
                row.add(flag[i][j]);
            }
            if(row.size()>1){
                false_row_flag = true;
            }
            if(i>0 && flag[i][0] == flag[i-1][0]){
                false_col_flag = true;
            }
        }
        sc.close();
        if(false_row_flag || false_col_flag){
            System.out.println("NO");
        }else{
            System.out.println("YES");
        }
    }


}