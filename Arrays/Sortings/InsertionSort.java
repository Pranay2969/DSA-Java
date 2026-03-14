package Arrays.Sortings;

import java.util.Scanner;

public class InsertionSort {
  public static void insertionSort(int[] arr, int size) {
    for(int i = 1; i < size; i++) {
      int key = arr[i];
      int j = i - 1;

      while(j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }
  public static void display(int[] arr) {
    for(int ele : arr) {
      System.out.print(ele + " ");
    }
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    insertionSort(arr, n);
    display(arr);

    sc.close();
  }
}
