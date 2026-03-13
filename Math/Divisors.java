package Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Divisors {
  public static List<Integer> allDivisors(int n) {
    List<Integer> divisors = new ArrayList<>();

    for(int i = 1; i * i <= n; i++) {
      if(n % i == 0) {
        divisors.add(i);
        if (n / i != i) {
          divisors.add(n / i);
        }
      }
    }
    Collections.sort(divisors);
        
    return divisors;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    List<Integer> divList = allDivisors(n);
    System.out.println(divList);
    
    sc.close();
  }
}
