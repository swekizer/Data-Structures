package Lecture_3;

import java.util.Scanner;

//Task: Find first and last index of target.
// arr = [3,4,2,3,1] target = 3, first index = 0, last index = 3;


public class firstAndLastIndex {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int target = scn.nextInt();

            int[] arr =new int[n];

            for(int i=0; i< arr.length; i++){
                arr[i] = scn.nextInt();
            }

            int firstIndex = first(arr, 0, target);
            System.out.println(firstIndex);

            int lastIndex = last(arr, n-1, target);
            System.out.println(lastIndex);
        }
    }


    static int first(int[] arr, int start, int target){
        if(start == arr.length){
            return -1;
        }

        if(arr[start] == target){
            return start;
        }

        return first(arr, start+1, target);
    }


    static int last(int[] arr, int end, int target){
        if(end == 0){
            return -1;
        }

        if(arr[end] == target){
            return end;
        }

        return last(arr, end-1, target);
    }


    
}
