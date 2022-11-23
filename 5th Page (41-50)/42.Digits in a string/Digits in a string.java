import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count =0;
        for(int i=0;i<s.length();i++){
            int k = s.charAt(i);
            if(k>=48&& k<=57){
                count+=1;
            }
        }
        if(count == s.length()){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/