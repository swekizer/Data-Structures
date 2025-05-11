import java.util.*;

public class countZeroes {
    public static void main(String[] args) {
        try (Scanner scn = new Scanner(System.in)) {
            int n = scn.nextInt();
            int answer = count(n);

            System.out.println(answer);
        }
        
    }

    static int count(int n){
        return countHelper(n, 0);
    }

    static int countHelper(int n, int counter){
        if(n == 0){
            return counter;
        }

        int rem = n % 10;
        if(rem == 0){
            counter++;
            return countHelper(n/10, counter);
        }
        return countHelper(n/10, counter);
    }



}



//30204