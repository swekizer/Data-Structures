package Arrays;
import java.util.Arrays;

public class passinginfunction{
    public static void main(String[] args) {
        int[] prices = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(prices));
        change(prices);
        System.out.println(Arrays.toString(prices));
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}