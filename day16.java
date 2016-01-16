import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // must be print out in the ascending order
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int[] arrays = new int[length];
        int min = Integer.MAX_VALUE;
        int abs = 0;
        for(int i = 0;i < length;i++){
            arrays[i] = in.nextInt();
        }
        Arrays.sort(arrays);
        for(int i = 0;i < (length-1);i++){
            abs = Math.abs(arrays[i] - arrays[i + 1]);
            if(abs < min)
                min = abs;
        }
        //System.out.println(min);
        int count = 0;
        while(count < (length - 1)){
            abs = Math.abs(arrays[count] - arrays[count + 1]);
            if(abs == min){
                min = abs;
                System.out.println(arrays[count] + " " + arrays[count + 1] + " ");

            }
            count++;
        }
        //System.out.println(min);
        
    }
}