package Lecture_3;

import java.util.Scanner;

//Task: Find target in a array.


public class linearSearch {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int target = scn.nextInt();

            int[] arr =new int[n];

            for(int i=0; i< arr.length; i++){
                arr[i] = scn.nextInt();
            }

            boolean temp = search(arr, 0, target);
            System.out.println(temp);

            int indexOfTarget = index(arr, 0, target);
            System.out.println(indexOfTarget);
        }
    }

    static boolean search(int[] arr, int start, int target){
        if(start == arr.length){
            return false;
        }

        if(arr[start] == target){
            return true;
        }

        return search(arr, start+1, target);
    }

    static int index(int[] arr, int start, int target){
        if(start == arr.length){
            return -1;
        }

        if(arr[start] == target){
            return start;
        }

        return index(arr, start+1, target);
    }
}
