package Arrays;

import java.util.Scanner;

public class MissingNumber {
  // For distinct integers
  public static int missingNumber(int[] arr) {
    int n = arr.length + 1;

    int[] hash = new int[n + 1];

    for (int i = 0; i < n - 1; i++) {
      hash[arr[i]]++;
    }

    for (int i = 1; i <= n; i++) {
      if (hash[i] == 0) {
        return i;
      }
    }

    return -1;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    int missingNumber = missingNumber(arr);
    System.out.println(missingNumber);
    sc.close();
  }
}
