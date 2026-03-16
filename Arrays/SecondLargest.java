package Arrays;

import java.util.Scanner;

public class SecondLargest {
  public static int secondLargest(int[] arr, int n) {
    int max = arr[0];
    int secondMax = Integer.MIN_VALUE;
    
    for(int i = 1; i < n; i++) {
      if(arr[i] > max) {
        secondMax = max;
        max = arr[i];
      } else if(arr[i] > secondMax) {
        secondMax = arr[i];
      }
    }

    return secondMax;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int secondMax = secondLargest(arr, n);
    System.out.println(secondMax);
    sc.close();
  }
}
