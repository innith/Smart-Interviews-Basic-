import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = "";
        for(int i =0;i<s.length();i++){
            int count =0;
            char c = s.charAt(i);
            
            res+=s.charAt(i);
            for(int j =i;j<s.length();j++){
                if(s.charAt(j)==c){
                    count++;
                }else{
                    break;
                }           
            }
            res+=count+"";
            i=i+count-1;
        }
        System.out.println(res);
    }
}



/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/