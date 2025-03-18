package Linear_Search;

public class basic {
    public static void main(String[] args) {
        int[] arr = {11, 24, 3, 4, 5};
        int target = 3;
        System.out.println(linearSearch(arr, target));

        System.out.println(linearSearch2(arr, target));

        System.out.println(linearSearch3(arr, target));
    }

    // Linear Search
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Linear Search is a simple search algorithm that searches for an element in a list by checking each element sequentially until the target element is found or the end of the list is reached.



    //search in the array: return the index if item found
    //otherwise if item not found return -1
    public static int linearSearch(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }
        //run a loop
        for(int i = 0; i < arr.length; i++){
            //check for element at every index if it is = target
            if(arr[i] == target){
                return i;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target is not found
        return -1;
    }



    //search in the array: return the element if item found
    //otherwise if item not found return -1
    public static int linearSearch2(int[] arr, int target){

        if(arr.length == 0){
            return -1;
        }
        //run a loop
        for(int element : arr){
            //check for element at every index if it is = target
            if(element == target){
                return element;
            }
        }
        //this line will execute if none of the return statements above have executed
        //hence the target is not found
        return -1;
    }
    
    




    //search in the array: return true if item found
    //otherwise if item not found return false
    public static boolean linearSearch3(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int element : arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }
}

