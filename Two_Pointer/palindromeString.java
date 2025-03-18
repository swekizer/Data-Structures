package Two_Pointer;
import java.util.*;

public class palindromeString {

    public static void main(String[] args) {
        
        try (Scanner scn = new Scanner(System.in)) {
            String str = scn.next();
            //System.out.println(isPalindrome(str));
            System.out.println(isPalindrome2(str));
        }
    }

    //Use StringBuilder
    public static boolean isPalindrome(String str){

        StringBuilder res = new StringBuilder();

        res.append(str);
        res.reverse();
        if(res.toString().equals(str)){
            return true;
        }
        return false;
    }



    //Using Two Pointer
    public static boolean isPalindrome2(String str){

        int left =0;
        int right = str.length()-1;

        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}