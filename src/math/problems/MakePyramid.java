package math.problems;

public class MakePyramid {


    public static void main(String[] args) {

        int rows = 6;

        for (
                int i = 1;
                i <= rows; i++) {

            for (i = 1; i <= rows - i; i++) {
                System.out.print(" ");
            }
            for (i = 1; i <= 2 * i - 1; i++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }













}
