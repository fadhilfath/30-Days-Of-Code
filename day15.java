import java.io.*;
import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
    
}
class Solution
{
    public static  Node insert(Node head,int data)
    {
         //Complete this method
         Node newNode = new Node(data);
         Node curr = head;
         if(head == null){
             head = newNode;
             return head;
         }
         
         while(curr.next != null){
             curr = curr.next;
         }
         curr.next = newNode;
         
         return head;
    }

     public static void display(Node head)
    {
          Node start=head;
          while(start!=null)
          {
              System.out.print(start.data+" ");
              start=start.next;
          }
    }

    public static void main(String args[])
    {
          Scanner sc=new Scanner(System.in);
          Node head=null;
          int T=sc.nextInt();
          while(T-->0){
              int ele=sc.nextInt();
              head=insert(head,ele);
          }
          display(head);

   }
}