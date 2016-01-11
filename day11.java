import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
      
        int result = 0;
        int max = (int) (Math.pow(10,10) * -1);
        int i;
        int j;
        for(i = 0;i < 4;i++){
            for(j=0;j < 4;j++){
                result = (arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j] + arr[i + 2][j + 1] + arr[i+2][j + 2]);
                if(result > max){
                    max = result;
                }
            }
            
        }
        System.out.println(max);
    }
}