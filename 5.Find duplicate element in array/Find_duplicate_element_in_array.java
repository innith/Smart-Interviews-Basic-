import java.io.*;
import java.util.*;

class Solution {

    static int duplicate(int arr[], int n){
        for(int i =0;i<n;i++){
            for(int j =i+1;j<n;j++){
                if(arr[i]==arr[j])  return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(duplicate(arr,n));
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/