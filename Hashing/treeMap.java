import java.util.*;

public class treeMap {
    public static void main(String[] args) {
        

        TreeMap<Integer, Integer> map = new TreeMap<>();

        map.put(1,100);
        map.put(2,200);
        map.put(3,300);
        map.put(4,400);
        map.put(5,500);

        System.out.println(map);

        //So basically TreeMap sorts the keys
        //It is ordered

        //Lets change the order of insertion
        TreeMap<Integer, Integer> map1 = new TreeMap<>();

        map1.put(2,200);
        map1.put(1,100);
        map1.put(5,500);
        map1.put(4,400);
        map1.put(3,300);

        System.out.println(map1);


        //All other methods are same as HashMap

        //Iteration on TreeMap
        TreeMap<String, Integer> map2 = new TreeMap<>();
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


        //Time complexity of TreeMap
        //get() --> O(logn)
        //put() --> O(logn)
        //remove() --> O(logn)
        //containsKey() --> O(logn)
        //containsValue() --> O(n)
        //size() --> O(1)

        //Red Black Tree is used to implement TreeMap
    }
}
