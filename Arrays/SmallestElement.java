package Arrays;

import java.util.Scanner;

public class SmallestElement {
  public static int smallestElement(int[] arr, int n) {
    int min = arr[0];

    for(int i = 1; i < n; i++) {
      if(arr[i] < min) {
        min = arr[i];
      }
    }
    return min;
  }

  public static int secondSmallest(int[] arr, int n) {
    if (n < 2) {
      return -1;
    }
    int min = arr[0];
    int secondMin = Integer.MAX_VALUE;
    
    for(int i = 1; i < n; i++) {
      if(arr[i] < min) {
        secondMin = min;
        min = arr[i];
      } else if(arr[i] < secondMin && arr[i] != secondMin) {
        secondMin = arr[i];
      }
    }

    return secondMin;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int secondMax = secondSmallest(arr, n);
    System.out.println(secondMax);
    sc.close();
  }
}
