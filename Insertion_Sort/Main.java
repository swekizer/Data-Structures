//Theory
//Take an element from the unsorted array and insert it into its correct position in the sorted array.
//Repeat this process until all the elements are in the correct position.
//The insertion sort algorithm is a simple sorting algorithm that works the way we sort playing cards in our hands.

//Algorithm
//Step 1: Iterate from arr[1] to arr[n] over the array.
//Step 2: Compare the current element (key) to its predecessor.
//Step 3: If the key element is smaller than its predecessor, compare it to the elements before.
//Move the greater elements one position up to make space for the swapped element.

//Example
//Suppose we have an array arr[] = {12, 11, 13, 5, 6}.
//Step 1: Let us loop for i = 1 (second element of the array) to 4 (last element of the array)
//Step 2: i = 1. Since 11 is smaller than 12, move 12 and insert 11 before 12.
//Now, the array becomes {11, 12, 13, 5, 6}.
//Step 3: i = 2. 13 will remain at its position as all elements in A[0..I-1] are smaller than 13.
//Now, the array becomes {11, 12, 13, 5, 6}.
//Step 4: i = 3. 5 will move to the beginning and all other elements from 11 to 13 will move one position ahead of their current position.
//Now, the array becomes {5, 11, 12, 13, 6}.
//Step 5: i = 4. 6 will move to the position after 5, and elements from 11 to 13 will move one position ahead of their current position.
//Now, the array becomes {5, 6, 11, 12, 13}.
//The time complexity of the insertion sort is O(n^2) in the worst-case scenario.








package Insertion_Sort;

public class Main {
    public static void main(String[] args) {
        
    }

    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    } 
}
