import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt(),n2=scanner.nextInt();
        String students = scanner.next();
        while(n2!=0){
            for(int i=1; i<n1; i++){
                if(students.charAt(i)=='G' && students.charAt(i-1)=='B'){
                    char[] studentsCHAR = students.toCharArray();
                    studentsCHAR[i]='B';
                    studentsCHAR[i-1]='G';
                    students=String.valueOf(studentsCHAR);
                    i++;
                }
            }
            n2--;
        }
        System.out.println(students);
    }
}
