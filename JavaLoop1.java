import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        /*
        Objective
        In this challenge, we're going to use loops to help us do some simple math.

        Task
        Given an integer, , print its first  multiples. Each multiple  (where ) should be printed on a new line in the form: N x i = result.

        Input Format

        A single integer, .

        Constraints
        2 <= N <= 20

        Output Format

        Print  lines of output; each line  (where ) contains the  of  in the form:
        N x i = result.
        */
        
        //Guard
        if(N < 2 || N >20)
            System.out.println("ERROR: Value of N should be inclusive between 2 and 20");
        int result = Integer.MIN_VALUE;
        for(int i = 1;i<=10;i++)
        {
            result = (N*i);
            System.out.printf("%d x %d = %d%n",N,i,result);
        }   
        
    }
}

