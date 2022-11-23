import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j =0;j<=i;j++){
                System.out.printf("*");
            }System.out.println();
        }
        for(int k =0;k<n;k++){
            for(int l =0;l<n-k-1;l++){
                System.out.printf("*");
            }System.out.println();
        }
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/