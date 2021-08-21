import java.util.Scanner;



public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int cases = in.nextInt(), sum = 0;
        String shape;

        for (int i = 0; i < cases; i++) {

            shape = in.next();
            if (shape.equals("Tetrahedron")) {
                sum += 4;
            }
            else if (shape.equals("Cube")) {
                sum += 6;
            }
            else if (shape.equals("Octahedron")) {
                sum += 8;
            }
            else if (shape.equals("Dodecahedron")) {
                sum += 12;
            }
            else {
                sum += 20;
            }
        }

        System.out.println(sum);

        in.close();
    }
}