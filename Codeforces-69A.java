import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=0,y=0,z=0;
        for(int i=0; i<n; i++){
            x+= sc.nextInt();
            y+= sc.nextInt();
            z+= sc.nextInt();
        }
        sc.close();
        if(x==y && y==z && z == 0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        
    }
}


