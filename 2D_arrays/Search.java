//SAME LOGIC CAN BE USED FOR FINDING LARGEST AND SMALLEST ELEMENT IN 2D ARRAY
import java.util.*;
public class Search {


    public static boolean seachValue(int matrix[][], int key){
                for (int i = 0; i < matrix.length; i++) { // iterating over rows(n)
            for (int j = 0; j < matrix[0].length; j++) { // iterating over columns(m)
                 if(matrix[i][j] ==key){
                        System.out.println("Value found at index: "+"("+i+","+j+")");
                        return true;
                 }
            }
        }
        System.out.println("Value not found"); //this will not run because of return statement in if condition
        return false;
        
        
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length; // no of rows
        int m = matrix[0].length; // no of columns

        for (int i = 0; i < n; i++) { // iterating over rows(n)
            for (int j = 0; j < m; j++) { // iterating over columns(m)
                Scanner sc = new Scanner(System.in);
                matrix[i][j] = sc.nextInt(); // input
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " "); // output
            }
            System.out.println();
        }

        seachValue(matrix,5);

    }
}
