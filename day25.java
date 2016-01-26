import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. */
        int[] number = new int[3];
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        for(int i = 0; i < test;i++){
            number[i] = in.nextInt();
            if(isPrime(number[i])){
                System.out.println("Prime");
            }else {
                System.out.println("Not prime");
            }
            
        }
      
        
        
    }
    
    public static boolean isPrime(int n){
        boolean result = true;
        if(n == 1 || n == 0)
            result = false;
        if(n == 2)
            result = true;
        if(n == 3)
            result = true;
        int sqrt = (int) Math.sqrt(n);
        for(int j = 2; j < sqrt;j++){
           if(n % j == 0)
               result = false;
        }
        
        
        return result;
        
    }
}