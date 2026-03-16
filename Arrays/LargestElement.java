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
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int max = largestElement(arr, n);
    System.out.println(max);
    sc.close();
  }
}
