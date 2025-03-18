package Two_Pointer;
import java.util.*;

public class twoSum {
    public static void main(String[] args) {
        
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int target = scn.nextInt();

            int[] arr = new int[n];
            

            for(int i=0 ; i<n; i++){
                arr[i] = scn.nextInt();
            }


            boolean answer1 = twoSumAppraoch(arr, target);
            boolean answer2 = twoPointerAppraoch(arr, target);

            System.out.println(answer1);
            System.out.println(answer2);
        }

    }


    static boolean twoSumAppraoch(int arr[], int target) {
        
        
        //Brute Force Time Limit Error
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;
    }

    //Two Pointer Approach
    static boolean twoPointerAppraoch(int[] arr, int target){

        int i=0;
        int j= arr.length-1;

        while(i<j){
            if(arr[i] + arr[j] == target){
                return true;
            }else if(arr[i] + arr[j] > target){
                j--;
            }else{
                i++;
            }
        }
        return false;
    }


    //HashMap
    static int[] twoSumAppraoch2(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }else{
                map.put(arr[i], i);
            }
        }
        return new int[] {-1,-1};
    }
}
