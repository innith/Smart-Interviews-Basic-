import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        for(int i =0;i<n;i++){
            int x = sc.nextInt();
            if(x%2!=0){
                count+=x;
            }
            
        }System.out.println(count);
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/