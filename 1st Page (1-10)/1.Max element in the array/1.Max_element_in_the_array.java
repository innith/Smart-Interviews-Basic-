import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int max = Integer.MIN_VALUE;
        for(int i =0;i<t;i++){
            int x = sc.nextInt();
            if(max<x) max=x;
        }
        System.out.println(max);
    }
}

/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/