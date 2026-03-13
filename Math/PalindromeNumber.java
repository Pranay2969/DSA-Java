package Math;

import java.util.Scanner;

public class PalindromeNumber {
  public static boolean palindromeChecker(int n) {
    if(n < 0 || n % 10 == 0) return false;
    int rev = 0;
    int dup = n;

    while(n != 0) {
      rev = rev * 10 + n % 10;
      n /= 10;
    }

    return rev == dup;
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
  
      int n = sc.nextInt();
  
      boolean isPalindrome = palindromeChecker(n);
      System.out.println(isPalindrome);
      
      sc.close();
    }  
}