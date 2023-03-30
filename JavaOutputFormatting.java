import java.io.*;
import java.util.*;

/*Author: Gaurav Sharma*/
public class Solution {

    public static void main(String[] args) {
        /* 
    Input Format

    Every line of input will contain a String followed by an integer.
    Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

    Output Format

    In each line of output there should be two columns:
    The first column contains the String and is left justified using exactly  characters.
    The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
        */
     
     //Scanner object to read inputs
     Scanner scanner = new Scanner(System.in);
     String string = "";
     int integer = 0;
     System.out.println("================================");
     for(int i=0;i<3;i++)
     {
        string = scanner.next();
        integer = scanner.nextInt();
        System.out.printf("%-15s%0,3d\n",string,integer); 
     }    
     scanner.close();
     System.out.println("================================");       
    }
}
