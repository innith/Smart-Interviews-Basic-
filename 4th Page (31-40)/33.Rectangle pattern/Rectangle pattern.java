import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =n;i>=1;i--){
            for(int j =n;j>=1;j--){
                if(i+j==n+1){
                    System.out.printf("*");
                }else{
                    System.out.printf(j+"");
                }
            }System.out.println();
        }
    }
}



/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/