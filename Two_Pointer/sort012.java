package Two_Pointer;

import java.util.Scanner;

public class sort012 {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
        
    }


    public static void sort(int[] arr){
        int left =0;
        int mid =0;
        int high = arr.length -1;

        while(mid <=high){
            if(arr[mid] == 0){
                swap(arr, mid, left);
                mid++;
                left++;
            }else if(arr[mid] ==1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }

    private static void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
