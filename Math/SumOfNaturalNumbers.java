package Math;

import java.util.Scanner;

public class SumOfNaturalNumbers {
  public static int sumOfNaturalNumbers(int n) {  
    return n * (n + 1) / 2;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    int sum = sumOfNaturalNumbers(n);
    System.out.println(sum);
    
    sc.close();
  }
}
