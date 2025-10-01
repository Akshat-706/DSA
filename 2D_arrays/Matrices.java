import java.util.*;

public class Matrices {
    public static void main(String[] args) {
        int martix[][] = new int[3][3];
        int n = martix.length; // no of rows
        int m = martix[0].length; // no of columns

        for (int i = 0; i < n; i++) { // iterating over rows(n)
            for (int j = 0; j < m; j++) { // iterating over columns(m)
                Scanner sc = new Scanner(System.in);
                martix[i][j] = sc.nextInt(); // input
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(martix[i][j] + " "); // output
            }
            System.out.println();
        }

    }
}