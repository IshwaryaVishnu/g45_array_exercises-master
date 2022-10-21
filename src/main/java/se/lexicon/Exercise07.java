package se.lexicon;

public class Exercise07 {

  /**
   * 7. Write a program which will set up an array to hold 10 numbers and print out only the uneven numbers.
   * Expected output: Array: 1 2 4 7 9 12
   * Odd Array: 1 7 9
   */
  public static void ex7() {
    int arr[] = {1, 2, 4, 7, 9, 12, 14, 13, 19, 20};
    System.out.println("Odd Numbers:");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        System.out.print(arr[i] +" \t" );

      }

    }
  }
}