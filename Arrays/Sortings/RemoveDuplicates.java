package Arrays.Sortings;

import java.util.Scanner;

public class RemoveDuplicates {
  // Returns the length of array with unique elements; input array must be sorted
  public static int removeDuplicates(int[] arr, int n) {
    int i = 0;

    for(int j = 1; j < n; j++) {
      if(arr[j] != arr[i]) {
        i++;

        arr[i] = arr[j];
      }
    }

    return i + 1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int k = removeDuplicates(arr, n);
    for(int i = 0; i < k; i++) {
      System.out.print(arr[i] + " ");
    }

    sc.close();
  }
}
