package Math;

import java.util.Scanner;

public class CountDigits {

  public static int countDigits(int n) {

    return (int) (Math.log10(n) + 1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    int count = countDigits(n);
    System.out.println(count);
    
    sc.close();
  }
}
