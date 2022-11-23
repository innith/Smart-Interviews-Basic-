import java.io.*;
import java.util.*;

class Solution {

    //tail recursive solution.
    static int fac(int n,int k){
        if(n==0 || n==1) return k;
        return fac(n-1,k*n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        
        System.out.println(fac(n,1));
    }
}



/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/