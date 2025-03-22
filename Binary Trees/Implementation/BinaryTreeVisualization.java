package Implementation;

public class BinaryTreeVisualization {
    public static void main(String[] args) {
      
      //Creating root node
      TreeNode root = new TreeNode(1);
      
      //Creating left and right childrens of root node
      root.left = new TreeNode(2);
      root.right = new TreeNode(3);
      
      //Further creation
      root.left.left = new TreeNode(4);
      root.left.right = new TreeNode(5);
  
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
