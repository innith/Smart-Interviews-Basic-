import java.io.*;
import java.util.*;

public class Solution {
    
    static boolean isPrime(long n){
        if(n==1)  return false;
        if(n==2||n==3)  return true;
        if(n%2==0||n%3==0)  return false;
        for(long i =5;i*i<n;i=i+6){
            if(n%i==0||n%(i+2)==0){
                return false;
            }
        }
        return true;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n  = sc.nextLong();
        if(isPrime(n)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/