import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int req = sc.nextInt();
        for(int i =0;i<n;i++){
            int x = sc.nextInt();
            if(x==req){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}



/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/