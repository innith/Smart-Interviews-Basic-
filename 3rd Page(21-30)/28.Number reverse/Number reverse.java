import java.io.*;
import java.util.*;

class Solution {

  public static void reverse(long n) {

    if (n >= 0) {
      String str = String.valueOf(n);
      for (int i = str.length() - 1; i >= 0; i--) {
        System.out.printf(str.charAt(i) + "");
      }
    } else {
      n = n * -1;
      System.out.printf("-");
      reverse(n);
    }

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    while (n % 10 == 0 && n != 0) {
      n = n / 10;
    }
    reverse(n);
  }
}


/* https://github.com/innith/Smart-Interviews-Basic-
   https://www.linkedin.com/in/innith*/