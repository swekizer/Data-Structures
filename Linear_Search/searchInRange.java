package Linear_Search;

public class searchInRange {
    public static void main(String[] args) {
        int[] arr = {11, 24, 3, 4, 5};
        int target = 3;
        System.out.println(search(arr, target, 1, 3));
    }



    static boolean search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return false;
        }
        for(int i=start; i<end; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
