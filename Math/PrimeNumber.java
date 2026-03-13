package Math;

import java.util.Scanner;

public class PrimeNumber {
  public static boolean primeChecker(int n) {
    if(n < 2) return false;

    for(int i = 2; i * i <= n; i++) {
      if (n % i == 0) 
        return false;      
    }

    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    boolean isPrime = primeChecker(n);
    System.out.println(isPrime);
    
    sc.close();
  }
}
