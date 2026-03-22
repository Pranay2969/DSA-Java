package Arrays;

import java.util.Scanner;

public class MovingZeros {
  public static void movingZerosToEnd(int[] arr, int n) {
    int j = 0;

    for(int i = 0; i < n; i++) {
      if(arr[i] != 0) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        j++;
      }
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    movingZerosToEnd(arr, n);
    for(int ele : arr) {
      System.out.print(ele + " ");
    }

    sc.close();
  }
}
