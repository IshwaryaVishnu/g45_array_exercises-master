package se.lexicon;

public class Exercise13 {

  /**
   * 13. Create two arrays with arbitrary size and fill one with random numbers.
   * Then copy over the numbers from the array with random numbers so
   * that the even numbers are located in the rear (the right side) part of the
   * array and the odd numbers are located in the front part (the left side).
   */
  public static void ex13() {
    int randomNumbers;

    int arr[] = {1, 2, 4, 7, 9, 12};
    System.out.println("Odd Numbers:");
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 2 != 0) {
        System.out.print(arr[i] + " \t");

      }

    }
  }
}