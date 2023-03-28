import java.io.*;
import java.util.*;

/*
Author: Gaurav Sharma
*/
public class Solution {

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[3];
        //read inputs
        for(int i=0;i<3;i++)
            array[i] = scanner.nextInt();           
        scanner.close();
        //prints the numbers
        for(int i=0;i<3;i++)
            System.out.println(array[i]);
    }
}
