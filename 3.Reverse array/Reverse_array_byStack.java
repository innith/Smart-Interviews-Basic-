import java.io.*;
import java.util.*;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Long> stack = new Stack<Long>();
        for(int i =0;i<n;i++){
            stack.push(sc.nextLong());
        }
        while(!stack.empty()){
            System.out.printf(stack.pop()+" ");
        }
    }
}