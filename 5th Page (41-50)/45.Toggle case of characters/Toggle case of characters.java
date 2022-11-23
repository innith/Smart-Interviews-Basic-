import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
         for(int i=0;i<s.length();i++){
            int k = s.charAt(i);
             char c = s.charAt(i);
            if(k>=65&& k<=90){
                System.out.print(Character.toLowerCase(c));
            }else{
                System.out.print(Character.toUpperCase(c));
            }
    }
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/