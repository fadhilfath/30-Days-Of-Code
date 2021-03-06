//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
      Scanner in = new Scanner(System.in);
      int N=in.nextInt();
      in.nextLine();
      Map<String,Integer> phoneBook = new HashMap<String,Integer>();
      for(int i=0;i<N;i++)
      {
         String name=in.nextLine();
         int phone=in.nextInt();
         in.nextLine();
         phoneBook.put(name,phone);
      }
      while(in.hasNext())
      {
         String s=in.nextLine();
         if(phoneBook.get(s) == null){
             System.out.println("Not found");
         }else{
             System.out.println(s + "=" + phoneBook.get(s));
         }
         
      }
   }
}