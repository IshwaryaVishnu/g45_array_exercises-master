package se.lexicon;
import java.util.Arrays;
public class Exercise13 {

  /**
   * 13. Create two arrays with arbitrary size and fill one with random numbers.
   * Then copy over the numbers from the array with random numbers so
   * that the even numbers are located in the rear (the right side) part of the
   * array and the odd numbers are located in the front part (the left side).
   */
  public static void ex13() {
    int array1[] = {2, 4, 5, 1, 7, 8, 9, 7};
    int arr2 = array1.length;
    getArrangedEvenOdd(array1, arr2);
  }
  public static void getArrangedEvenOdd(int array1[], int array2) {
    int i = -1, j = 0;
    while (j != array2) {
      if (array1[j] % 2 == 0) {
        i++;
        int array3 = array1[i];
        array1[i] = array1[j];
        array1[j] = array3;
      }
      j++;
    }
    for (int k = 0; k < array2; k++)
      System.out.print(array1[k] + " ");
  }
}
