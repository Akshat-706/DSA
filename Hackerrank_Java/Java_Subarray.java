import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int A[] = new int[n];
        
        for(int i = 0; i<A.length; i++){
            A[i] = sc.nextInt();
        }
        
        
        int count = 0;
        for(int j = 0; j<A.length ; j++){
            int cs = 0;
            for(int k=j; k<A.length; k++ ){
                
                    cs = cs + A[k];
                if(cs < 0){
                count++;  //In this kadane not applicable as its for maximum sum and not take in account all subArrays, so use nested loop.
            }
            }
            

        }
        System.out.println(count);
    }
}
