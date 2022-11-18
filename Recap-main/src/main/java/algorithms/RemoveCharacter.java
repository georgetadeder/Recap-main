package algorithms;

import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {

        String word = "algoritmica";
        System.out.println("Enter a word: " + word);
        String s = "a";
        System.out.println("Enter a character to remove: " +s);
        char c= s.charAt(0);
        for (int i = 0; i<word.length(); i++) {
            if(word.charAt(i)== c) {
                System.out.println("");
            } else {
                System.out.print(word.charAt(i));
            }
        }
    }
}
