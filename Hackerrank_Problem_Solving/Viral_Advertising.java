import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
    // Write your code here

        // int count = 0;
        // for(int i = 0; i< n; i++){
        //             int liked = (int)Math.floor(n/2);
        //             int new_shared = liked *3;
        //             count = liked + 
        // }
        
        int cumulative = 0;
        // int n = n;
        int shared = 5;
        for(int i = 0; i<n;i++){
            int liked = (int)Math.floor(shared/2);
            cumulative+=liked;
            shared = liked*3; //self baby
            
                    // new_n= liked*3;
                    
        }
               return cumulative;     
        }
    

        
    }



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
