package Math;

import java.util.Scanner;

public class CountDigits {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.close();

    int count = (int) (Math.log10(n) + 1);
    System.out.println(count);
  }
}
