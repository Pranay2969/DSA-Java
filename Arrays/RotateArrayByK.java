package Arrays;

import java.util.Scanner;

public class RotateArrayByK {
  // Rotates the array to the left by K positions (anti-clockwise)
  public static void rotateArrayByK(int[] arr, int n, int K) {
    while(K-- > 0) {
      int temp = arr[0];
      for(int i = 1; i < n; i++) {
        arr[i - 1] = arr[i];
      }
      arr[n - 1] = temp;
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int K = sc.nextInt();

    rotateArrayByK(arr, n, K);
    for (int ele : arr) {
      System.out.print(ele + " ");
    }
    sc.close();
  }
}
