package Linear_Search;

import java.util.Arrays;
public class searchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 5;
        System.out.println(Arrays.toString(search(arr, target)));
        // Arrays.toString() is used to convert an array into a readable String representation
        // Without toString(), printing an array directly would show its memory reference
        // e.g. [I@4617c264 instead of [1, 2, 3]
    }


    static int[] search(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1, -1};
        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }



    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int[] row : arr){
            for(int element : row){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}
