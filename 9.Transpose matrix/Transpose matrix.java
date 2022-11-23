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
        int trs[][] = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                trs[i][j]=mat[j][i];
                System.out.printf(trs[i][j]+" ");
            }
            System.out.println();
        }
    }
}



/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/