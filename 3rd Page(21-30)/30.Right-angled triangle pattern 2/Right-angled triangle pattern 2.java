import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =1;
        int k =0;
        int mat[][] = new int[n][n];
        for(int i =0;i<n;i++){
            for(int j =k;j<n;j++){
                mat[j][i]=num;
                num++;
            }
            k++;
        }
        for(int p=0;p<n;p++){
            for(int q =0;q<n;q++){
                if(mat[p][q]!=0) System.out.printf(mat[p][q]+" ");
            }System.out.println();
        }
    }
}



/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/