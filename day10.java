import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here.*/
        Scanner in = new Scanner(System.in);
        int testCase = in.nextInt();
  
        
        for(int i = 0;i < testCase;i++){
            int number = in.nextInt();
            convertBinary(number);
            System.out.println();
        }
    }
    
    public static void convertBinary(int x){
        
        int binary[] = new int[40];
        int count = 0;
        while(x > 0){
            binary[count++] = x % 2;
            x = x / 2;
        }
        // print out the array that contains binary
        for(int i = count - 1; i >= 0;i--){
            System.out.print(binary[i]);
        }
    }
}
