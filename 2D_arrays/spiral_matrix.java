public class SpiralMatrix {

    public static void printSpiral(int matrix[][]){
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while(startRow <= endRow && startCol <=endCol){ //equals be used for odd no of rows and columns

            //j for columns and i for rows
            //top 
            for(int j = startCol; j<=endCol; j++){ //we need to move in columns to print first row
                System.out.print(matrix[startRow][j]+" "); //j is column index
            }

            //right 
            for(int i = startRow+1; i<=endRow; i++){ //we need to move in rows to print last column
                System.out.print(matrix[i][endCol]+" "); //i is row index //this time row is changing one
            }

            //bottom
            for(int j = endCol-1; j>=startCol; j--){
                System.out.print(matrix[endRow][j]+" ");
            }

            //left
            for(int i = endRow-1; i>=startRow+1; i--){
                System.out.print(matrix[i][startCol] +" ");

            }

            startRow++;
            endRow--;       
            startCol++;
            endCol--;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        int matrix[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        printSpiral(matrix);
    } 
}
