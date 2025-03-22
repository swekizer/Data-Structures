package Traversals;

import java.util.*;

public class Traversal {
    public static void main(String[] args) {
      
      //Creating root node
      TreeNode root = new TreeNode(1);
      
      //Creating left and right childrens of root node
      root.left = new TreeNode(2);
      root.right = new TreeNode(3);
      
      //Further creation
      root.left.left = new TreeNode(4);
      root.left.right = new TreeNode(5);
      
      //Inorder
      List<Integer> Inorderlist = BinaryTreeTraversals.Inorder(root);
      System.out.print(Inorderlist);
      
      
      //PreOrder
      List<Integer> PreOrderlist = BinaryTreeTraversals.PreOrder(root);
      System.out.print(PreOrderlist);
      
      //PostOrder
      List<Integer> PostOrderlist = BinaryTreeTraversals.PostOrder(root);
      System.out.print(PostOrderlist);
  
  }
}

class TreeNode{
  
    int data;
    TreeNode right;
    TreeNode left;
    
    public TreeNode(int data){
      this.data = data;
      left = null;
      right = null;
    }
}


class BinaryTreeTraversals{
    TreeNode root;
    
    BinaryTreeTraversals(){
      root = null;
    }
    
    
    //Inorder
    public static List<Integer> Inorder(TreeNode root){
        
        List<Integer> result = new ArrayList<>();
        InorderHelper(root, result);
        return result;
    }
    
    private static void InorderHelper(TreeNode node, List<Integer> result){
      
      if(node == null){
        return;
      }

      InorderHelper(node.left, result);
      result.add(node.data);
      InorderHelper(node.right, result);
    }
    
    
    
    
    //PreOrder
    public static List<Integer> PreOrder(TreeNode root){
        
        List<Integer> result = new ArrayList<>();
        PreOrderHelper(root, result);
        return result;
    }
    
    private static void PreOrderHelper(TreeNode node, List<Integer> result){
      
      if(node == null){
        return;
      }

      result.add(node.data);
      PreOrderHelper(node.left, result);
      PreOrderHelper(node.right, result);
    }
    
    
    
    
    //PostOrder
    public static List<Integer> PostOrder(TreeNode root){
        
        List<Integer> result = new ArrayList<>();
        PostOrderHelper(root, result);
        return result;
    }
    
    private static void PostOrderHelper(TreeNode node, List<Integer> result){
      
      if(node == null){
        return;
      }

      PostOrderHelper(node.left, result);
      PostOrderHelper(node.right, result);
      result.add(node.data);
    }
}












