package Bubble_Sort;
import java.util.*;


/*
Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in wrong order.
Time Complexity: O(n^2) in worst and average case. O(n) in best case.



3 2 1 5 4

Pass 1: i=0

j=0
3 > 2 , so swap them, Array becomes 2 3 1 5 4

j=1
3 > 1 , so swap them, Array becomes 2 1 3 5 4

j=2
3 < 5 , so do nothing, Array remains 2 1 3 5 4

j=3
5 > 4 , so swap them, Array becomes 2 1 3 4 5

5 is at its correct position now. And is the largest element in the array.

Pass 2: i=1

j=0
2 > 1 , so swap them, Array becomes 1 2 3 4 5

j=1
2 < 3 , so do nothing, Array remains 1 2 3 4 5

j=2
3 < 4 , so do nothing, Array remains 1 2 3 4 5

j=3
4 < 5 , so do nothing, Array remains 1 2 3 4 5

Pass 3: i=2

j=0
1 < 2 , so do nothing, Array remains 1 2 3 4 5

j=1
2 < 3 , so do nothing, Array remains 1 2 3 4 5

j=2
3 < 4 , so do nothing, Array remains 1 2 3 4 5

j=3
4 < 5 , so do nothing, Array remains 1 2 3 4 5

Pass 4: i=3

j=0
1 < 2 , so do nothing, Array remains 1 2 3 4 5

j=1
2 < 3 , so do nothing, Array remains 1 2 3 4 5

j=2
3 < 4 , so do nothing, Array remains 1 2 3 4 5

j=3
4 < 5 , so do nothing, Array remains 1 2 3 4 5

Array is sorted now.


Now we see that we do not need to check the last element in the array in the next pass as it is already at its correct position.
So, we can reduce the number of comparisons in the next pass by 1.
So, in the next pass, we will check only the first n-1 elements of the array.
Similarly, in the next pass, we will check only the first n-2 elements of the array and so on.
So, the number of comparisons in the next pass will be n-1, n-2, n-3, .... 1
So, the total number of comparisons will be n-1 + n-2 + n-3 + .... 1 = n(n-1)/2
So, the time complexity of Bubble Sort is O(n^2) in worst and average case. O(n) in best case.





 */










public class code {
    public static void main(String[] args) {
        
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = scn.nextInt();
            }

            bubbleSort(arr);
            for(int i=0; i<n; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }



static void bubbleSort(int[] arr){
    
    boolean swapped;

    //run the steps n-1 times
    for(int i=0; i<arr.length; i++){
        swapped = false;
        for(int j=1; j< arr.length -i; j++){
            //swap if the element found is lesser than the previous element
            if(arr[j] < arr[j-1]){
                //swap
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                swapped = true;
            }
        }

        if(swapped == false){
            //if the array is already sorted
            break;
        }
    }
    }
}