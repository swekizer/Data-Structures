package Two_Pointer;
import java.util.*;

public class movesZeroToEnd {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            int[] arr = new int[n];
            for(int i=0 ; i<n; i++){
                arr[i] = scn.nextInt();
            }

            moveZero(arr);
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
    }


    static void moveZero(int[] arr){

        int i=0; 
        for(int j = 0; j<arr.length; j++){
            if(arr[j] != 0){
              int temp = arr[j];
              arr[j] = arr[i];
              arr[i] = temp;
              i++;
            }
        }
    }
}
