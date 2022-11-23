import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int csum = 0;
        int temp = n;
        while(temp>0){
            int x = temp%10;
            temp=temp/10;
            csum+= x*x*x;
        }
        if(csum==n){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/