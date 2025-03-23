package Questions;
import java.util.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
    }
}

public class diameter {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            int[] arr = new int[n];

            for(int i=0; i< n; i++){
                arr[i] = scn.nextInt();
            }

            TreeNode root = buildTreefromArray(arr);
            System.out.println(root.data);
        }
    }

    public static TreeNode buildTreefromArray(int[] arr){

        if(arr.length == 0 || arr[0] == -1) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        int i=1;
        while(!queue.isEmpty() && i < arr.length){
            TreeNode node = queue.poll();

            if(arr[i] != -1){
                node.left = new TreeNode(arr[i]);
                queue.add(node.left);
            }
            i++;

            if(i < arr.length && arr[i] != -1){
                node.right = new TreeNode(arr[i]);
                queue.add(node.right);
            } 
            i++;
        }


        return root;
    }


    public static int diameterOfTree(TreeNode root){
        return 0;
    }
}
