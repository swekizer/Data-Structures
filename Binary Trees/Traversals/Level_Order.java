package Traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Level_Order{
    public static void main(String[] args) {
        
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            int[] arr = new int[n];

            for(int i=0; i< n; i++){
                arr[i] = scn.nextInt();
            }

            TreeNode root = buildTreefromArray(arr);
            System.out.println(root.data);

            List<List<Integer>> result = levelOrder(root);
            System.out.println(result);
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




    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            int queueSize = queue.size();
            List<Integer> level = new ArrayList<>();

            for(int i=0; i<queueSize; i++){
                TreeNode node = queue.poll();   
                level.add(node.data);

                if(node.left != null) queue.add(node.left);
                if(node.right != null) queue.add(node.right);
            }

            result.add(level);
        }

        return result;
    }
}



class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data){
        this.data = data;
        left = null;
        right = null;
    }
}