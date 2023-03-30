import java.io.*;
import java.util.*;

/*Author: Gaurav Sharma*/
public class Solution {

    public static void main(String[] args) {
      
    /*
    There are three lines of input:

    The first line contains an integer.
    The second line contains a double.
    The third line contains a String.
    Output Format

    There are three lines of output:

    On the first line, print String: followed by the unaltered String read from stdin.
    On the second line, print Double: followed by the unaltered double read from stdin.
    On the third line, print Int: followed by the unaltered integer read from stdin.
      */
    Scanner scanner = new Scanner(System.in);
    int integer = scanner.nextInt();
    double decimal = scanner.nextDouble();
    //read the newline character which is queued
    scanner.nextLine();
    //read the string value
    String string = scanner.nextLine(); // 
    scanner.close();
    
    System.out.println("String: " + string); 
    System.out.println("Double: " + decimal);
    System.out.println("Int: " + integer);
      
    }
}
