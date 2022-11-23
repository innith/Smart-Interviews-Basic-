import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        long sa = (long) b+c;
        long sb = (long) c+a;
        long sc = (long) a+b;
        if(sa>a && sb>b && sc>c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/