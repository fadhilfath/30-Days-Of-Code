import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i=0; i < N; i++){
            arr[i] = in.nextInt();
        }
        // create a new array to store new reverse data
        int arr2[] = new int[N];
        for(int i= (N-1);i >= 0; i--){
            arr2[i] = arr[N - (i + 1)];
            //System.out.print(arr2[N - (i + 1)]);
        }
        
        for(int i = 0;i < N;i++){
            System.out.print(arr2[i] + " ");
        }
    }
}