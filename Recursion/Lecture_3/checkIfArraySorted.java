package Lecture_3;

import java.util.Scanner;

//Task: Check if array is sorted on or not

public class checkIfArraySorted {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            int[] arr =new int[n];

            for(int i=0; i< arr.length; i++){
                arr[i] = scn.nextInt();
            }

            boolean temp = sorted(arr, 0);
            System.out.println(temp);
        }
    }


    static boolean sorted(int[] arr, int start){
        if(start == arr.length-1){
            return true;
        }


        if(arr[start] > arr[start+1]){
            return false;
        }
        return sorted(arr, start+1);
        
    }
}
