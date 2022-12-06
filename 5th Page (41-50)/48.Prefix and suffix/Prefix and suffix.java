//this was a partially correct solution , [14/20] score.


import java.io.*;
import java.util.*;

public class Solution {
    
    static boolean checkSame(String s , int p){
        String s1 = "";
        String s2 = "";
        for(int j =0;j<=p;j++){
            s1 = s1+s.charAt(j);
            s2 = s2+s.charAt(s.length()-1-p+j);
        }
        return s1.equals(s2);
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =  sc.nextLine();
        int n = str.length(); 
        int ans =0;
        for(int i =0;i<n/2;i++){
            if(str.charAt(n-1)==str.charAt(i) &&checkSame(str,i) ){
               ans = i+1;
                    
                }
            }
        System.out.println(ans);
        }
    }

