import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
       
        int day = in.nextInt();
        int month = in.nextInt();
        int year = in.nextInt();
        
        int exDay = in.nextInt();
        int exMonth = in.nextInt();
        int exYear = in.nextInt();
        
        int fine = 0;
        if(year == exYear){
            if(month == exMonth){
                if(day == exDay)
                    System.out.println(fine);
                else if(day > exDay){
                    int daysLate = day - exDay;
                    fine = 15 * daysLate;
                }
            }else if(month > exMonth){
                int monthsLate = month - exMonth;
                fine = 500 * monthsLate;
            }
            
        }else if(year != exYear){
            fine = 10000;
        }
        
        System.out.println(fine);
        
        
    }
}