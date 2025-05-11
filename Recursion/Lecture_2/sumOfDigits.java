import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();

            int answer = sum(n);
            System.out.println(answer);

            int temp = product(n);
            System.out.println(temp);
        }
    }


    static int sum(int n){
        if(n == 0){
            return 0;
        }

        return (n%10) + sum(n/10);
    }

    static int product(int n){
        if(n%10 == n){
            return n;
        }

        return (n%10) * product(n/10);
    }


}
