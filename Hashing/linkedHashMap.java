import java.util.*;


public class linkedHashMap {
    public static void main(String[] args) {
        
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        map.put(1,100);
        map.put(2,200);
        map.put(3,300);
        map.put(4,400);
        map.put(5,500);

        System.out.println(map);


        //So basically LinkedHashMap maintains the order of insertion
        //It is ordered

        //Lets change the order of insertion
        LinkedHashMap<Integer, Integer> map1 = new LinkedHashMap<>();

        map1.put(2,200);
        map1.put(1,100);
        map1.put(5,500);
        map1.put(4,400);
        map1.put(3,300);

        System.out.println(map1);



        //All other methods are same as HashMap

        //Iteration on LinkedHashMap
        LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
        map2.put("Marvel", 500);
        map2.put("DC", 400);
        map2.put("Sony", 300);
        map2.put("Warner Bros", 200);

        for(Map.Entry<String, Integer> e : map2.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }


        //Remove
        map2.remove("Sony");
        System.out.println(map2);

        //Size
        System.out.println(map2.size());

        //IsEmpty
        System.out.println(map2.isEmpty());

        //clear
        map2.clear();
        System.out.println(map2.isEmpty());


        //time complexity of LinkedHashMap
        //get() --> O(1)
        //put() --> O(1)
        //remove() --> O(1)
        //containsKey() --> O(1)
        //containsValue() --> O(n)
        //size() --> O(1)


        //Uses Doubly linked list to maintain the order of insertion
    }
}
