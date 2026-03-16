package Arrays;

import java.util.Scanner;

public class LargestElement {
  public static int largestElement(int[] arr, int n) {
    int max = arr[0];
    
    for(int i = 1; i < n; i++) {
      if(arr[i] > max) {
        max = arr[i];
      }
    }

    return max;
  }

  public static int secondLargest(int[] arr, int n) {
    if(n < 2) {
      return -1;
    }
    
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

    int max = largestElement(arr, n);
    int secondMax = secondLargest(arr, n);
    System.out.println(max);
    System.out.println(secondMax);
    sc.close();
  }
}
