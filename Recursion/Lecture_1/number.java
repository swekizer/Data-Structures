//Task:write a function that takes in a number and prints it 5 times without modifying the function and calling it 5 times
//This is a simple example of recursion




public class number {
    public static void main(String[] args) {
        


        print1(1);
        //This also cannot be modified
        // print2(1);
        // print3(1);
        // print4(1);
        // print5(1);
    }    

    static void print1(int n){
        System.out.println(n);
        //NO modification of the function
        print2(2);
    }

    static void print2(int n){
        System.out.println(n);
        print3(3);
    }

    static void print3(int n){
        System.out.println(n);
        print4(4);
    }

    static void print4(int n){
        System.out.println(n);
        print5(5);
    }

    static void print5(int n){
        System.out.println(n);
        
    }
}
