import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int p =0;p<n;p++){
            arr[p]=sc.nextInt();
        }
        for(int i =0;i<n;i++){
            int count =0;
            for(int j =0;j<n;j++){
                if(arr[i]==arr[j]){
                    count ++; 
                    if(count>1) continue;
                }if(count>1) continue;
            }if(count==1) 
            System.out.printf(arr[i]+" "); 
        }
        
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/