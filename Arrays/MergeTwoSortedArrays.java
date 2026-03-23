package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MergeTwoSortedArrays {
  public static List<Integer> mergeTwoSortedArrays(int[] arr1, int[] arr2, int n, int m) {
    List<Integer> union = new ArrayList<>();

    int i = 0, j = 0;
    while(i < n && j < m) {
      if(arr1[i] < arr2[j]) {
        union.add(arr1[i]);
        i++;
      } else if(arr2[j] < arr1[i]) {
        union.add(arr2[j]);
        j++;
      } else {
        union.add(arr1[i]);
        i++;
        j++;
      }
    }

    while(i < n) {
      union.add(arr1[i++]);
    }

    while(j < m) {
      union.add(arr2[j++]);
    }

    return union;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int[] arr1 = new int[n];
    for(int i = 0; i < n; i++) {
      arr1[i] = sc.nextInt();
    }

    int[] arr2 = new int[m];
    for(int i = 0; i < m; i++) {
      arr2[i] = sc.nextInt();
    }

    List<Integer> union = mergeTwoSortedArrays(arr1, arr2, n, m);
    System.out.println(union);

    sc.close();
  }
}
