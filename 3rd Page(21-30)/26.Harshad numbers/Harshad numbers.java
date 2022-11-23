import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int sum =0;
        while(temp>0){
            sum = sum+temp%10;
            temp = temp/10;
        }
        if(n%sum==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}



/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/