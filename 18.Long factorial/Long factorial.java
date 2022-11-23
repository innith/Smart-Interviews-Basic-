import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
       Scanner sc = new  Scanner(System.in);
        int n = sc.nextInt();
        long fac = 1;
        for(int i =n;i>=1;i--){
            fac *= (long)i;
        }
        System.out.println(fac);
    }
}



/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/