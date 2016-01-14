import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
    private int[] elements;
    public int maximumDifference;
    // Add your code here
    public Difference(int[] a){
        elements = a;
        maximumDifference = 0;
    }
    
    
    public void computeDifference(){
        int count = 0;
        while(count <= elements.length - 2){
            for(int i=0;i < elements.length - 1;i++){
                int number = Math.abs(elements[i + 1] - elements[count]);
                if(number > maximumDifference){
                    maximumDifference = number;
                }
                
            }
            count++;
        }        
    }

}

public class Solution {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int N = sc.nextInt();
                int[] a = new int[N];
                for (int i = 0; i < N; i++) {
                    a[i] = sc.nextInt();
                }

                Difference D = new Difference(a);

                D.computeDifference();

                System.out.print(D.maximumDifference);
            }
}