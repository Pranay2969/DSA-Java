package Arrays.Sortings;

import java.util.Scanner;

public class SelectionSort {
  public static void selectionSort(int[] arr, int size) {
    for(int i = 0; i < size - 1; i++) {
      int minIdx = i;
      for(int j = i + 1; j < size; j++) {
        if(arr[j] < arr[minIdx]) {
          minIdx = j;
        }
      }

      int temp = arr[i];
      arr[i] = arr[minIdx];
      arr[minIdx] = temp;
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

    selectionSort(arr, n);
    display(arr);

    sc.close();
  }
}
