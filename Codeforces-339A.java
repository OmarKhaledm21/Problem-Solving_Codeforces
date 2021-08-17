import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String equation = in.next();
        ArrayList<Integer> arr= new ArrayList<>();

        for(int i=0; i<equation.length(); i++){
            if(equation.charAt(i) != '+'){
                int num = equation.charAt(i)-'0';
                arr.add(num);
            }
        }

        Collections.sort(arr);

        for(int i=0; i<(equation.length()/2)+1; i++) {
            if (i < (equation.length() / 2)) {
                System.out.print((arr.get(i)).toString() + "+");
            }else{
                System.out.print((arr.get(i)).toString());
            }
        }
        in.close();
    }
}