import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j =-n+1;j<n;j++){
                if(-i<=j&&j<=i){
                    System.out.printf("*");
                }else{
                    System.out.printf(" ");
                }        
            }System.out.println();
        }
    }
}



/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/