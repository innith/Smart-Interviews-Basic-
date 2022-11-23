import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j =0;j<i;j++){
                System.out.printf((char)(j+1+64)+" ");
            }
            for(int k=i+1;k>=1;k--){
                System.out.printf((char)(k+64)+" ");
            }
            System.out.println();
        }
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/