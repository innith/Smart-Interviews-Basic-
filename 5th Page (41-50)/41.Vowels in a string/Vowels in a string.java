import java.io.*;
import java.util.*;

class Solution {

    static final List<Character> vowel = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
    public static void main(String[] args) {
        
        //Character Vowel[] ={'a','e','i','o','u','A','E','I','O','U'};
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i =0;i<str.length();i++){
            if(!vowel.contains(str.charAt(i))){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}



/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/