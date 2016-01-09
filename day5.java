import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        
        
        String res = "";
        for(int i = 0;i < T;i++){
            int a = in.nextInt(); // 5
            int b = in.nextInt(); // 3
            int N = in.nextInt(); // 5
            for(int j = 0;j < N;j++){
                int result = a;
                int counter = j;
                while (counter >= 0){
                    result += (Math.pow(2,counter) * b);
                    counter--;
                }
                System.out.print(result + " ");
            }
            System.out.println("");
            
        }
        
    }
    
    /*
    public static int power(int number){
        int result_power = 1;
        if(number == 0){
            return 1;
        }
        for(int i = 1;i <= number;i++){
            result_power *= 2;
            // result_power = result_power * 2;
        }
        
        return result_power;
        
    }*/
}