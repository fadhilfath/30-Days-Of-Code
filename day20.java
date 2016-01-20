    
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        String user_input = in.nextLine();
        
        /*String[] result = user_input.split("[!,?._'@\\s]+");
        System.out.println(result.length);
        for(int i = 0;i < result.length;i++){
            System.out.println(result[i]);
        }*/
        
        
         StringTokenizer st = new StringTokenizer(user_input,"[!,?.\\_'@ ]+");
         System.out.println(st.countTokens());
         while (st.hasMoreTokens()) {
             System.out.println(st.nextToken());
         }
    }
}
