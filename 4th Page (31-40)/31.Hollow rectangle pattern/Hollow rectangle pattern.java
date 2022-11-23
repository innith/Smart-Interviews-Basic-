import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(i==0||j==0||i==n-1||j==m-1){
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