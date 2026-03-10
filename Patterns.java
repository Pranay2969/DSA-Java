public class Patterns {
  public static void main(String[] args) {

    // Solid Rectangle...............................................................................................
  
    /* 
      ****
      ****
      ****
     */
    
    /* int n = 4;
    int m = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        System.out.print("*");
      }
      System.out.println();
    } */
  

    // Hollow Rectangle..............................................................................................

    /* 
      *****
      *   *
      *   *
      *****
     */
    
    /* int n = 4;
    int m = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= m; j++) {
        if (i == 1 || j == 1 || i == 4 || j == 5 ) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    } */
   

    // Half Pyramid..................................................................................................

    /* 
      *
      **
      ***
      ****
     */

    /* int n = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    } */

    // Inverted Pyramid..............................................................................................

    /* 
      ****
      ***
      **
      *
     */

    /* int n = 4;
    for (int i = n; i >= 1; i--) {
      for (int j = i; j >= 1; j--) {
        System.out.print("*");
      }
      System.out.println();
    } */

    // Inverted Half Pyramid........................................................................................

    /* 
         *
        **
       ***
      ****
     */

    /* int n = 4;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n-i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    } */

    // Half Pyramid with Numbers.....................................................................................

    /* 
      1 
      1 2
      1 2 3
      1 2 3 4
      1 2 3 4 5
     */

    /* int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    } */

    // Inverted Half Pyramid with Numbers............................................................................

    /* 
      1 2 3 4 5 
      1 2 3 4
      1 2 3
      1 2
      1
     */

    /* int n = 5;
    for(int i = n; i >= 1; i--) {
      for(int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println();
    } */

    // Floyd's Triangle..............................................................................................

    /* 
      1 
      2 3
      4 5 6
      7 8 9 10
      11 12 13 14 15
     */

    /* int number = 1;
    int n = 5;
    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= i; j++) {
        System.out.print(number + " ");
        number++;
      }
      System.out.println();
    } */

    // 0-1 Triangle..................................................................................................

    /* 
      1 
      0 1
      1 0 1
      0 1 0 1
      1 0 1 0 1
     */

    /* int n = 5;
    for(int i = 1; i <= n; i++) {
      for(int j = 1; j <= i; j++) {
        int sum = i + j;
        if (sum % 2 == 0) {
          System.out.print(1 + " ");
        } else {
          System.out.print(0 + " ");
        }
      }
      System.out.println();
    } */

    // Butterfly Pattern............................................................................................

    /* 
      *      *
      **    **
      ***  ***
      ********
      ********
      ***  ***
      **    **
      *      *
     */

    /* int n = 4;
      // Upper Half
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      int spaces = 2*(n-i);
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
      // Lower Half
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      int spaces = 2*(n-i);
      for (int j = 1; j <= spaces;  j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    } */

    // Solid Rhombus................................................................................................

    /* 
          *****
         *****
        *****
       *****
      *****
     */

    /* int n = 5;
    for (int i = 1; i <= n; i++) {
      int spaces = n - i;
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    } */

    // Number Pyramid...............................................................................................

    /* 
          1 
         2 2
        3 3 3
       4 4 4 4
      5 5 5 5 5
     */

    /* int n = 5;
    for (int i = 1; i <= n; i++) {
      int spaces = n - i;
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    } */

    // Palindromic Pattern..........................................................................................

    /* 
          11
         2112
        321123
       43211234
      5432112345
     */

    /* int n = 5;
    for (int i = 1; i <= n; i++) {
      int spaces = n - i;
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }

      for (int j = 1; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    } */

    // Diamond Pattern..............................................................................................

    /* 
         *
        ***
       *****
      *******
      *******
       *****
        ***
         *
     */

    /* int n = 4;
    for (int i = 1; i <= n; i++) {
      int spaces = n - i;
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      for (int j = i; j >= 1; j--) {
        System.out.print("*");
      }

      for (int j = 2; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = n; i >= 1; i--) {
      int spaces = n - i;
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }
      for (int j = i; j >= 1; j--) {
        System.out.print("*");
      }

      for (int j = 2; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    } */
  }
}