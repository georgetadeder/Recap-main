package algorithms;

import java.lang.reflect.Array;

public class ArrayUtils {
    public static boolean isPalindrome(int[] n) {
//        //Palindrome: int [n] = {1,2,5,5,2,1}
//        boolean isPalindrome = false;
//        for (int i = 0, j = n.length - 1; i <= j; i++, j--) {
//            if (n[i] != n[j]) {
//                isPalindrome = false;
//                break;
//            } else {
//                isPalindrome = true;
//            }
//        }
//        return isPalindrome;
        for (int i = 0; i < n.length / 2; i++) {
            if (n[i] != n[n.length - 1 - i]) {
                return false;
            }
        }

        return true;
    }
}
