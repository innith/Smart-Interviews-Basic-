import java.io.*;
import java.util.*;

class Solution {

    public static Scanner sc = new Scanner(System.in);
    
    static void isSparse(int m, int n){
        int count =0;
        int mat[][] = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                mat[i][j] = sc.nextInt();
                if(mat[i][j]==0)  count++;
            }
        }
        if(count>m*n/2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
    public static void main(String[] args) {
        int m = sc.nextInt();
        int n = sc.nextInt();
        isSparse(m,n);
     
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/