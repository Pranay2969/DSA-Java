package Arrays.Sortings;

import java.util.Scanner;

public class CheckIsSorted {
  public static boolean isSorted(int[] arr, int n) {
    for(int i = 1; i < n; i++) {
      if(arr[i] < arr[i - 1]) {
        return false;
      }
    }

    return true;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    boolean isSorted = isSorted(arr, n);
    System.out.println(isSorted);

    sc.close();
  }
}
