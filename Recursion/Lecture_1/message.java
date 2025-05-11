//Task: Print Hello 5 times without modifying the function and calling it 5 times
//This is a simple example of recursion




public class message {
    
    public static void main(String[] args) {
        

        printMessage();
        //This also cannot be modified
        // message1();
        // message2();
        // message3();
        // message4();
        
    }


    static void printMessage(){
        System.out.println("Hello");
        //NO modification of the function
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");
        // System.out.println("Hello");

        message1();
    }

    static void message1(){
        System.out.println("Hello");
        message2();
    }

    static void message2(){
        System.out.println("Hello");
        message3();
    }

    static void message3(){
        System.out.println("Hello");
        message4();
    }

    static void message4(){
        System.out.println("Hello");
        
    } 
}
