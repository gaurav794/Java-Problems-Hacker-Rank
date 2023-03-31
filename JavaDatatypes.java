import java.io.*;
import java.util.*;

/*Author: Gaurav Sharma*/
public class Solution {

    public static void main(String[] args) {
        /* 
         Input Format

        The first line contains an integer, , denoting the number of test cases.
        Each test case, , is comprised of a single line with an integer, , which can be arbitrarily large or small.

        Output Format

        For each input variable  and appropriate primitive , you must determine if the given primitives are capable of storing it. If yes, then print:

        n can be fitted in:
        * dataType
        If there is more than one appropriate data type, print each one on its own line and order them by size (i.e.: ).
        
        n can be fitted in:
        * datatype

        If the number cannot be stored in one of the four aforementioned primitives, print the line:   
        
        n can't be fitted anywhere
            
        */
        //Declare array to store datatype values : Add when it falls in the range
        // Iterate over the test cases
                //Check range of the primitive integer value
        //Iterate to print the desired result
        Scanner scanner = new Scanner(System.in);//read input
        int testCases = scanner.nextInt(); // number of test cases
        int counter = 0; // Store datatype value on index: Updates when added +1
        String[] storeInputs = new String[testCases];
        
        for(int i=0;i<testCases;i++)
        {   
            long testCaseInt = 0;
            String testCaseValue = ""; 
            try
            {              
                testCaseInt = scanner.nextLong();// read test case integer
            }
            catch(InputMismatchException e)
            {
                testCaseValue = scanner.nextLine(); 
                System.out.println(testCaseValue + " can't be fitted anywhere.");
                continue;
            }
            
            if(testCaseInt >= Byte.MIN_VALUE && testCaseInt <= Byte.MAX_VALUE)
            {
                storeInputs[counter] = "byte";
                ++counter;
            }
            if(testCaseInt >= Short.MIN_VALUE && testCaseInt <= Short.MAX_VALUE)
            {
                storeInputs[counter] = "short";
                ++counter;
            }
            if(testCaseInt >= Integer.MIN_VALUE && testCaseInt <= Integer.MAX_VALUE)
            {
                storeInputs[counter] = "int";
                ++counter;
            }
            if(testCaseInt >= Long.MIN_VALUE && testCaseInt <= Long.MAX_VALUE)
            {
                storeInputs[counter] = "long";
                ++counter;
            }
            
            int arrayLength = storeInputs.length;
            System.out.println(testCaseInt + " can be fitted in:");
            //print data types
            for(int j = 0; j < arrayLength;j++)
            {
                if(storeInputs[j] != null)
                    System.out.println("* "+storeInputs[j]);
                storeInputs[j] = null; // reset the value
            }
                           
            counter = 0;//reset counter
                 
        }
        
    }
}
