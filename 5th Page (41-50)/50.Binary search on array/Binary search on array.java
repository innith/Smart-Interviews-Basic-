import java.util.*;
public class Solution{  
 public static void binarySearch(int arr[], int first, int last, int key){  
   int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        System.out.println("true");  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if ( first > last ){  
      System.out.println("false");  
   }  
 }  
 public static void main(String args[]){  
        Scanner sc =new Scanner(System.in);
       int n = sc.nextInt();
     int key = sc.nextInt();
     int arr[] = new int[n];
     for(int i =0;i<n;i++){
         arr[i]=sc.nextInt();
     }
        binarySearch(arr,0,n-1,key);     
 }  
}  







/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/