import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            int ans = sum(n);
            System.out.println(ans);
        }
    }


    static int sum(int n){
        if(n == 1){
            return 1;
        }

        return n + sum(n-1);
        
    }
}
