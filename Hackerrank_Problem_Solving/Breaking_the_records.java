import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        int maxi = scores.get(0);
        int mini = scores.get(0); //start with 0 index
        int count_max = 0;
        int count_min = 0;
        
        for(int i = 0; i< scores.size(); i++){
            if(scores.get(i) > maxi){
                
                maxi = scores.get(i);
                count_max++;
            }
             if(scores.get(i) < mini){
                
                mini = scores.get(i);
                count_min++;
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(count_max);
        list.add(count_min);
        
        // list.add(30);
        return list;
        // return {count_min, count_max};
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> scores = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresTemp[i]);
            scores.add(scoresItem);
        }

        List<Integer> result = Result.breakingRecords(scores);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
