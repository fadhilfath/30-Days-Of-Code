import java.io.*;
import java.util.*;

class Palindrome {
    //Write your code here
    Stack st = new Stack();
    Queue q = new LinkedList();
    public void pushCharacter(char ch){
        st.push(ch);
    }
    
    public void enqueueCharacter(char ch){
        q.add(ch);
    }
    
    public char popCharacter(){
        char ret = (Character)st.pop();
         return ret;
    } 
    
    public char dequeueCharacter(){
         char ret = (Character)q.poll();
        return ret;
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // read the string s.
        String s = sc.nextLine();
        
        // create the Palindrome class object p.
        Palindrome p = new Palindrome();
        char arr[]=s.toCharArray();//Converting string to a character array
        // push all the characters of string s to stack.
        for (char c : arr) {
            p.pushCharacter(c);
        }
        
        // enqueue all the characters of string s to queue.
        for (char c : arr) {
            p.enqueueCharacter(c);
        }
        
        boolean f = true;
        
        // pop the top character from stack.
        // dequeue the first character from queue.
        // compare both the characters.
        for (int i = 0; i < s.length(); i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                f = false;
                
                break;
            }
        }
        
        // finally print whether string s is palindrome or not.
        if (f) {
            System.out.println("The word, "+s+", is a palindrome.");
        } else {
            System.out.println("The word, "+s+", is not a palindrome.");
        }
    }
}