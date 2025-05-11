package Lecture_3;

import java.util.ArrayList;

//✅ Rule of Thumb:
//If you're returning a list, build it after the recursive call (post-order)
//If you're passing the list, you can do the if check before the recursive call (pre-order)


/*
static void collect(int[] arr, int index, ArrayList<Integer> list) {
    if (index == arr.length) return;

    if (arr[index] % 2 == 0) {
        list.add(arr[index]); // Add even number
    }

    collect(arr, index + 1, list); // pass the same list forward
}

 */




/*
static void collect(int[] arr, int index, ArrayList<Integer> list) {
    if (index == arr.length) return;

    if (arr[index] % 2 == 0) {
        list.add(arr[index]); // Add even number
    }

    collect(arr, index + 1, list); // pass the same list forward
}
 */



//Task: Find all the even numbers from the arrayList



public class arraylist {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 6, 8, 9, 12};
        ArrayList<Integer> result = method2(arr, 0);
        System.out.println(result);

        ArrayList<Integer> collect = new ArrayList<>();
        method1(arr, 0, collect);
        System.out.println(collect);
    }

    //Here I already have a list, so we modify it then call recursive function
    static void method1(int[] arr, int index, ArrayList<Integer> list){
        if(index == arr.length) return;

        if(arr[index] % 2 == 0){
            list.add(arr[index]);
        }

        method1(arr, index+1, list);
    }


    //Here I do not have the list, so call then function then built the list
    static ArrayList<Integer> method2(int[] arr, int index){
        if(index == arr.length){
            return new ArrayList<>();
        }

        ArrayList<Integer> list = method2(arr, index+1);

        if(arr[index] % 2 == 0){
            list.add(arr[index]);
        }

        return list;
    }



}