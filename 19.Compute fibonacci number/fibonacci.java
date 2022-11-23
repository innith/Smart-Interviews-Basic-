import java.io.*;
import java.util.*;

class Solution {
    
    static int fibonacci(int n){
        if(n==1||n==2){
            return 1;
        }
        int fir = 1;
        int sec = 1;
        
        for(int i = 3; i<=n;i++){
            int temp = fir + sec;
            fir = sec;
            sec = temp;
        }
        return sec;
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }
}




/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/