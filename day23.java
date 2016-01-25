import java.io.*;
import java.util.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{
  static void levelOrder(Node root){
      //Write your code here
      if(root == null){
          return;
      }
      Queue<Node> listNode = new LinkedList<Node>();
      listNode.add(root);
      while(!listNode.isEmpty()){
          Node curr = listNode.remove();
          System.out.print(curr.data + " ");
          if(curr.left != null)
              listNode.add(curr.left); // check if the left node is not empty add to queue
          if(curr.right != null)
              listNode.add(curr.right);
          //listNode.remove();
                
      }
    }

    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            levelOrder(root);
        } 
}