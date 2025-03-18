import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println(set);

        //Time complexity of HashSet
        //add() --> O(1)
        //remove() --> O(1)
        //contains() --> O(1)
        //size() --> O(1)
        //isEmpty() --> O(1)
        //clear() --> O(1)

        //HashSet is implemented as HashMap
        //HashSet is a wrapper around HashMap
        //HashSet is a set where all the elements are keys of the HashMap

        
        //remove
        set.remove(30);
        System.out.println(set);

        //contains
        System.out.println(set.contains(40));

        //size
        System.out.println(set.size());

        //isEmpty
        System.out.println(set.isEmpty());

        //clear
        set.clear();
        System.out.println(set.isEmpty());

        //Iteration on HashSet
        HashSet<String> set1 = new HashSet<>();
        set1.add("Marvel");
        set1.add("DC");
        set1.add("Sony");
        set1.add("Warner Bros");

        for(String s : set1){
            System.out.println(s);
        }

        //Iteration using Iterator
        Iterator<String> i = set1.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        



        //Properties of HashSet
        //1. HashSet does not allow duplicates
        //2. HashSet does not maintain the order of insertion
        //3. HashSet allows null values




    }
}
