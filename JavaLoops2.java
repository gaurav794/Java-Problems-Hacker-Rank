import java.io.*;
import java.util.*;

/*
Author: Gaurav Sharma*/
public class Solution {

    public static void main(String[] args) {
        /* 
        We use the integers , , and  to create the following series:

        a + (2^n-1)*b
    
        You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

        Input Format

        The first line contains an integer, , denoting the number of queries.
        Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

        Constraints

        Output Format

        For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.       
         */
         Scanner scanner = new Scanner(System.in);
         int queries = scanner.nextInt();
         //Queries
         for(int query=1;query<=queries;query++)
         {
            int a = scanner.nextInt(); // value of a
            int b = scanner.nextInt(); // value of b
            int N = scanner.nextInt(); // value of N
            int previousValueInSeries = a; // Updated frequently
            int currentValueInSeries = 0; // Store Current Value in Series
             //Query Number
            for(int n=0;n<N;n++)
            {
                // (a + 2^0*b), (a + (2^0*b) + (2^1*b))
                currentValueInSeries = previousValueInSeries + Solution.pow(n)*b;
                System.out.printf("%d ",currentValueInSeries);
                //update previous value with current
                previousValueInSeries = currentValueInSeries;  
            }
             System.out.println();//Print next query on new line
         }       
         scanner.close();        
    }
    //pow method
    public static int pow(int power)
    {
        int value = 1;
        for(int i=0;i<power;i++)
        {
        value*=2; 
        }
        return value;
    }
}
