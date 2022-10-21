package se.lexicon;

public class Exercise04 {

  /**
   * 4. Write a program which will copy the elements of one array into another array.
   * Expected output:
   *                Elements from first array: 1 15 20
   *                Elements from second array: 1 15 20
   */
  public static void ex4() {

    int [] arr1 = new int [] {1, 15, 20};
    int arr2[] = new int[arr1.length];
    for (int i = 0; i < arr1.length; i++) {
      arr2[i] = arr1[i];
    }
    System.out.println("Elements of first array: ");
    for (int i = 0; i < arr1.length; i++) {
      System.out.print(arr1[i] + " ");
    }

    System.out.println();
    System.out.println("Elements of second array: ");
    for (int i = 0; i < arr2.length; i++) {
      System.out.print(arr2[i] + " ");
    }
  }
}




