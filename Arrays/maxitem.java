package Arrays;

public class maxitem {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(max(arr));

    }

    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
}
