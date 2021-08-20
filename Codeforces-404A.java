import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        char[][] exam = new char[n][n];
        for(int i=0; i<n; i++){
            String whole=in.next();
            for(int j=0; j<n; j++) {
                exam[i][j] = whole.charAt(j);
            }
        }

        char d=' ',d2=' ';
        int x=0,y=n-1,count=0;
        if(exam[0][x]==exam[0][y]){
            d=exam[0][x];
        }
        if(exam[0][x+1]==exam[0][y-1]){
            d2=exam[0][x+1];
        }
        for(int i=0; i<n; i++){
            for(int v=0; v<n; v++){
                if(exam[i][v]==d){
                    count++;
                }
            }

            if(count>2){
                System.out.println("NO");
                return;
            }else{
                count=0;
            }

            for(int v=0; v<n; v++){
                if(exam[i][v]==d2){
                    count++;
                }
            }

            if(count<n-2 && x!=y){
                System.out.println("NO");
                return;
            }else if(count<n-1 && x==y){
                System.out.println("NO");
                return;
            }else{
                count=0;
            }

            if(exam[i][x] == exam[i][y] && x!=y) {
                x++;
                y--;
            }else if(x==y) {
                if (exam[i - 1][x - 1] == exam[i][x]) {
                    x++;
                    y--;
                } else{
                    System.out.println("NO");
                    return;
                }
            }else{
                System.out.println("NO");
                return;
            }
        }


        System.out.println("YES");

        in.close();
    }
}