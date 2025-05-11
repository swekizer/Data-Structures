import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            int ans = factorialRecursion(n);
            System.out.println(ans);
        }
    }


    static int factorialRecursion(int n){
        if(n == 1){
            return 1;
        }

        return n * factorialRecursion(n-1);
        
    }
}
