import java.io.*;
import java.util.*;

class Solution {

    public static Scanner sc = new Scanner(System.in);
    
    static int[][] readMatrix(int m, int n){
        int mat[][] = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                mat[i][j] = sc.nextInt();
            }
        }return mat;
    }
    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        int mat[][] = readMatrix(m,n);
        for(int i =0;i<m;i++){
           int count =0;
            for(int j =0;j<n;j++){
                count+=mat[i][j];
            }
            System.out.println(count);
        }
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/