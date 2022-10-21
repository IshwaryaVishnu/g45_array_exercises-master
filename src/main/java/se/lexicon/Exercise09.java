package se.lexicon;
import java.util.Arrays;
public class Exercise09 {

  /**
   * 9. Write a method which will add elements in an array.
   * Remember that arrays are fixed in size,so you need to come up with a
   * solution to “expand” the array
   */
  public static void ex9() {
    int[] elements = { 5, 6, 7, 8,9 };
    System.out.println("Constant Arrays: ");
    for (int i = 0; i < elements.length; i++) {
      System.out.print(elements[i]+" \t");
    }
    int[] expandArrays = Arrays.copyOf(elements, 9);
    expandArrays = new int[]{10, 11, 12, 13};
    System.out.println("Expand Arrays: ");
    for (int i = 0; i < expandArrays.length; i++) {
      System.out.print(expandArrays[i]+" \t");
    }
  }

  }

