import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        n = n>>i;
        if(n%2==0){
            System.out.println("false");
        }else{
            System.out.println("true");
        }
        
    }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/