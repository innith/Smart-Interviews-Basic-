import java.io.*;
import java.util.*;

class Solution {

    static final List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');
    public static void main(String[] args) {
        int vc = 0;
        int cc =0;
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i =0;i<str.length();i++){
            if(!vowels.contains(str.charAt(i))){
                cc++;
            }else{
                vc++;
            }
        }
        System.out.printf(vc+" "+cc);
    }
}



/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/