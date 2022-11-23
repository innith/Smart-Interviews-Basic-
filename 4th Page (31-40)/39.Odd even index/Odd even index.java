import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String even="";
        String odd="";
        for(int i =0;i<str.length();i++){
            if(i%2==0){
                even+=str.charAt(i);
            }else{
                odd+=str.charAt(i);
            }
        }
        System.out.print(odd+even);
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/