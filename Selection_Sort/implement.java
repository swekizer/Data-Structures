package Selection_Sort;

import java.util.Scanner;

public class implement {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = scn.nextInt();
            }

            selectionsort(arr);
            for(int i=0; i<n; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }



    static void selectionsort(int[] arr){
        
    
        for(int i=0; i<arr.length; i++){

            int last = arr.length - i -1;
            int maxIndex = maxNum(arr, 0, last);

            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
        }




    }

    static int maxNum(int[] arr, int start, int end){
        int max = start;
        for(int j = start; j<= end; j++){
            if(arr[max] < arr[j]){
                max = j; 
            }
        }
        return max;
    }
}
