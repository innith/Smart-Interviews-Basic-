import java.io.*;
import java.util.*;
import java.math.BigInteger;  
class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count =0;
        for(int i =0 ;i< str.length();i++){
            count += Character.getNumericValue(str.charAt(i));
        }
        System.out.println(count);
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/