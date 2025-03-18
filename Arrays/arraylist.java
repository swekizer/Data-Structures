package Arrays;
import java.util.ArrayList;
import java.util.*;

public class arraylist{
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list); //[]

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list); //[10, 20, 30, 40, 50]

        //Sorting an ArrayList
        Collections.sort(list);
        System.out.println(list); //[10, 20, 30, 40, 50]

        //Reversing an ArrayList
        Collections.reverse(list);
        System.out.println(list); //[50, 40, 30, 20, 10]

        //Checking if an element is present in an ArrayList
        //list.contains(20);
        System.out.println(list.contains(20)); //true

        //Getting the index of an element in an ArrayList
        list.set(0, 100);
        System.out.println(list); //[100, 40, 30, 20, 10]


        //Removing an element from an ArrayList
        list.remove(0);
        System.out.println(list); //[40, 30, 20, 10]


        //Getting the size of an ArrayList
        System.out.println(list.size()); //4



        //Getting the element at a particular index
        System.out.println(list.get(0)); //40

        //Printing an ArrayList
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }


        //Creating an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Doe");
        names.add("Alice");
        names.add("Bob");
        System.out.println(names); //[John, Doe, Alice, Bob]


        //Creating an ArrayList of Characters
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('D');
        System.out.println(chars); //[A, B, C, D]


        //Taking input of an ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of elements in the list");
            int n = sc.nextInt();
            for(int i=0; i<n; i++){
                list2.add(sc.nextInt());
            }
        }
        System.out.println(list2); //Input list 




        //Iterating through an ArrayList
        for(int i=0; i<list2.size(); i++){
            System.out.print(list2.get(i) + " ");
        }










    }
}