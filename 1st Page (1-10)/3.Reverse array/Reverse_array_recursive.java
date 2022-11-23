import java.io.*;
import java.util.*;

class Solution {

    public static Scanner sc = new Scanner(System.in);
    public static void reversePrint(int p){    
        if(p==1){
            System.out.printf(sc.nextLong()+" ");
            return;
        }
        long x = sc.nextLong();
        reversePrint(p-1);
        System.out.printf(x+" ");
        
    }
    public static void main(String[] args) {
        
        int n = sc.nextInt();
        reversePrint(n);
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/