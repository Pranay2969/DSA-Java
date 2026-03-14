package Arrays.Sortings;

import java.util.Scanner;

public class BubbleSort {
  public static void bubbleSort(int[] arr, int size) {
    for(int i = 0; i < size; i++) {
      boolean swap = false;

      for(int j = 0; j < size - i - 1; j++) {
        if(arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;

          swap = true;
        }
      }

      if(!swap)
        break;
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

    bubbleSort(arr, n);
    display(arr);

    sc.close();
  }
}
