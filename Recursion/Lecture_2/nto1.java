import java.util.Scanner;

public class nto1{
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            sequence(n);
            sequenceReverse(n);
        }
    }

    static void sequence(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        sequence(n-1);
    }

    static void sequenceReverse(int n){
        if(n == 0){
            return;
        }

        sequenceReverse(n-1);
        System.out.println(n);
    }
}