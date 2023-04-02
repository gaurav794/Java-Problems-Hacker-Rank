import java.io.*;
import java.util.*;
/*@author: Gaurav Sharma*/
public class Solution {

    public static void main(String[] args) 
    {
        /* 
        You are given an integer , you have to convert it into a string.

    Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".

   n can range between -100 to 100  inclusive.
        */
        Scanner scanner = new Scanner(System.in);
        
        try
        {
            Integer.toString(scanner.nextInt());
            System.out.println("Good job");
        }
        catch(Exception e)
        {
            System.out.println("Wrong answer");
        }
    }
}
