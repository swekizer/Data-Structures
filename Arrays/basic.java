package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        

        //Why we need arrays?
        
        String product = "Paper";

        int price1 = 10;
        int price2 = 20;
        int price3 = 30;
        int price4 = 40;
        System.out.println(product);
        System.out.println(price1+ " " +price2+ " " +price3+ " " +price4);

        //If we have to store the price of 100 products, we have to declare 100 variables.
        //This is not a good practice. So, we use arrays to store multiple values of same type.
        //Arrays are used to store multiple values of same type in a single variable.

        //Syntax
        //datatype[] arrayName = new datatype[size];
        //datatype[] arrayName = {value1, value2, value3, value4, value5};
        //datatype[] arrayName = new datatype[size]{value1, value2, value3, value4, value5};

        //Example
        int[] prices = {10, 20, 30, 40, 50};
        System.out.println(prices[0]); //10


        int[] prices2 = new int[5];
        //new is keyword used to create an array object.

        prices2[0] = 10;
        prices2[1] = 20;
        prices2[2] = 30;
        prices2[3] = 40;
        prices2[4] = 50;


        //Accessing elements of an array(Syntax)
        //arrayName[index]
        System.out.println(prices2[0]); //10

        //Updating elements of an array
        prices2[0] = 100;
        System.out.println(prices2[0]); //100




        // int[] ros; //Declaration of an array ros is getting defined in the stack memory.
        // ros = new int[5]; //Initialization: actually here object is created in the heap memory.





        //Iterating through an array
        for (int i = 0; i < prices2.length; i++) {
            System.out.println(prices2[i]);
        }

        //Array of Strings
        String[] products = {"Pen", "Pencil", "Eraser", "Sharpner"};
        System.out.println(products[0]); //Pen



        //Taking input of an array
        int[] arr = new int[5];
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }


            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            //Enhanced for loop
            for(int num : arr) {             //for each element num in the array arr
                System.out.print(num + " "); //num is the element of the array.
            }
        


        //Prints the array in a single line.
        System.out.println(Arrays.toString(arr)); 




        //Array of String
        //We can create an array of strings.
        String[] str = new String[5];
        
            for(int i = 0; i < str.length; i++) {
                str[i] = sc.next();
            }

            System.out.println(Arrays.toString(str));

            //modify
            str[0] = "Hello";
            System.out.println(Arrays.toString(str));
        }

        
        






        //Array of Objects
        //We can create an array of objects of a class.
        //Syntax
        //ClassName[] arrayName = new ClassName[size];
        //ClassName[] arrayName = {object1, object2, object3, object4};
        //Example
        //Student[] students = new Student[5];  
        //Student[] students = {new Student(), new Student(), new Student(), new Student()};
        //Student[] students = new Student[5]{new Student(), new Student(), new Student(), new Student()};
        //Student is a class and students is an array of objects of the class Student.
        //We can access the properties of the class using the array.
        //students[0].name = "John";
        //students[0].age = 20;
        //students[0].rollNo = 1;
        //students[0].marks = 90;
        //System.out.println(students[0].name + " " + students[0].age + " " + students[0].rollNo + " " + students[0].marks);
        //Output: John 20 1 90
        //We can also use enhanced for loop to access the properties of the class.
        //for(Student student : students){
        //    System.out.println(student.name + " " + student.age + " " + student.rollNo + " " + student.marks);
        //}
        //Output: John 20 1 90
        //        Sam 21 2 80
        //        Bob 22 3 70



        







        
    }
}
