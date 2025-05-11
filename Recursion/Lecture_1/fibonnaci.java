public class fibonnaci {
    // 0 1 1 2 3 5 8 13 21 34 55 89 144

    public static void main(String[] args) {
        
        //System.err.println(fib(4));

        int n =4;
        for(int i=0; i<= n; i++){
            System.out.println(fib(i) + " ");
        }
    }

    public static int fib(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    }
}
