
//Hashing

//Hashing is a technique in which a number or a string is converted into a fixed size value, typically for security purposes. The hash value is a summary of the original data. Hashing is used in various applications like databases, password storage, and digital signatures.

//A function that converts a given big input into a small practical value is called a hash function. The output of a hash function is called a hash value or hash code.

//Hashing in java

//1. Map --> HashMap, LinkedHashMap, TreeMap

//2. Set --> HashSet, LinkedHashSet, TreeSet


//Lets start with HashMap

//HashMap
//key-value pair
//key is unique

//Example
//tea --> 10
//coffee --> 20
//milk --> 30
//burger --> 40
//pizza --> 50

// HashMap<String, Integer> map = new HashMap<>();
// map.put("tea", 10);
// map.put("coffee", 20);
// map.put("milk", 30);
// map.put("burger", 40);
// map.put("pizza", 50);
 

//Time complexity of HashMap
//get() --> O(1)
//put() --> O(1)
//remove() --> O(1)
//containsKey() --> O(1)
//containsValue() --> O(n)
//size() --> O(1)


//HashMap is implemented as array of linked list
//Each element in the array is a linked list


//Sample Representation of HashMap
//  0      1      2      3  
//  |      |      |      |
// Node          Node   Node
//  |                    |
// Node                 Node

//0, 1, 2, 3 are called buckets
//Each bucket is a linked list

// key ---> hashcode ---> bucket index


//How to calculate hashcode
//hashCode() method is used to calculate the hash code of an object. It returns a hash code value for the object. The hash code is a unique code that is used to identify the object in a collection like a hashtable.


/*
How does put() method work in HashMap
1. Calculate the hashcode of the key
2. Calculate the bucket index
3. Check if the key is already present in the bucket
4. If the key is already present, update the value
5. If the key is not present, add the key-value pair to the bucket
6. If the bucket is full, increase the size of the bucket
7. If the load factor is greater than 0.75, increase the size of the bucket
8. Rehash all the elements
9. Add the new key-value pair to the bucket
10. Return the value
11. Time complexity of put() method is O(1)
*/