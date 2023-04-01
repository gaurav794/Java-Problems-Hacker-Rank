import java.io.*;
import java.util.*;
/*
Author: Gaurav Sharma
*/
public class Solution {

    public static void main(String[] args) {
        /*
        The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

        Hint: Java's Scanner.hasNext() method is helpful for this problem.

        Input Format

        Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

        Output Format

        For each line, print the line number, followed by a single space, and then the line content received as input.
        */
        Scanner scanner = new Scanner(System.in);
        String line = "";
        int counter = 0;
        
        //SOLUTION: 1 Not the best solution but works
        // while(line != "\0")
        // {
        //     try
        //     {
        //         line = scanner.nextLine();
        //         System.out.println(++counter + " " + line);
        //     }
        //     catch(Exception e) // No line found exception
        //     {
        //       break;        
        //     }
                     
        // }
        //SOLUTION: 2
        while(scanner.hasNext())
        {
                line = scanner.nextLine();
                System.out.println(++counter + " " + line);
      
        }
        scanner.close();
    }
}
