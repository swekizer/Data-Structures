import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            reverse(n);
        }
    }



    static int sum =0;

    static void reverse(int n){
        if(n ==0){
            System.out.println(sum);
            return;
        }

        int rem = n%10;
        sum = (sum * 10) + rem;
        reverse(n/10);
    }
}
