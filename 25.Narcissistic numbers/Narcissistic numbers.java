import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long dsum = 0;
        int temp = n;
        int d = (int)Math.ceil((int)Math.log(n)/Math.log(10));
        while(temp>0){
            int x = temp%10;
            temp=temp/10;
            dsum+= (long) Math.pow(x,d);
        }
        if((int)dsum==n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/