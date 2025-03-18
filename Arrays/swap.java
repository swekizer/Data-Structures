package Arrays;

public class swap {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50};
        swapp(arr, 1, 3);


        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    static void swapp(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
