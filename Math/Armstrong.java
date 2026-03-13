package Math;

import java.util.Scanner;

public class Armstrong {
  public static boolean armstrongChecker(int n) {
    int k =(int) Math.log10(n) + 1;

    int dup = n;
    int sum = 0;
    while (dup > 0) {
      sum += Math.pow(dup % 10, k);
      dup /= 10;
    }

    return sum == n; 
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    boolean isArmstrong = armstrongChecker(n);
    System.out.println(isArmstrong);
    
    sc.close();
  }
}
