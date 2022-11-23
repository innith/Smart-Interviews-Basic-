import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int count =0;
        for(int i =0;i<99;i++){
            count += sc.nextInt();  
        }
        System.out.println(5050-count);
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/