
import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("USA", 300);
        map.put("UK", 200);
        map.put("India", 100);
        map.put("China", 400);
        map.put("Russia", 500);

        //Searching or Accessing
        System.out.println(map.get("India"));
        System.out.println(map.get("USA"));

        //containsKey and containsValue
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsValue(390));

        System.out.println(map.size());

        //remove
        map.remove("India");
        System.out.println(map.containsKey("India"));


        //update
        map.put("UK", 500);
        System.out.println(map.get("UK"));

        //null
        System.out.println(map.get("France"));//null

        //Size
        System.out.println(map.size());

        //IsEmpty
        System.out.println(map.isEmpty());

        //Printing the map
        System.out.println(map);
        //HashMap is not ordered

        //clear
        map.clear();
        System.out.println(map.isEmpty());







        //Iteration on HashMap
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Marvel", 500);
        map1.put("DC", 400);
        map1.put("Sony", 300);
        map1.put("Warner Bros", 200);
        map1.put("Universal", 100);

        //KeySet
        Set<String> keys = map1.keySet();
        System.out.println(keys);

        for(String str : keys){
            System.out.println(str + " " + map1.get(str));
        }


        //EntrySet
        Set<Map.Entry<String, Integer>> entries = map1.entrySet();
        for(Map.Entry<String, Integer> entry : entries){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        

    }
}
