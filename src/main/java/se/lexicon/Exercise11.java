package se.lexicon;
import java.util.*;
public class Exercise11 {

  /**
   * 11.Write a program that ask the user for an integer and repeat that
   * question until user give you a specific value that user already has been
   * told about as a message in your program. Store these values in an array
   * and print that array. After that reverse the array elements so that the
   * first element becomes the last element, the second element becomes
   * the second to last element, etc. Do not just reverse the order in which
   * they are printed. You need to change the way they are stored in the
   * array.
   */
  public static void ex11() {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter how many numbers you want to print: ");
    int numbers = input.nextInt();
    int specificValues[] = new int[numbers];
    for (int i = 0; i < specificValues.length; i++) {
      System.out.print("Enter the numbers " + (i + 1) + " : ");
      specificValues[i] = input.nextInt();
    }
    System.out.println("Numbers in original order: ");
    for (int i = 0; i < specificValues.length; i++) {
      System.out.print(specificValues[i] + " ");
    }
    System.out.println();
    System.out.println("Numbers in reverse order: ");
    for (int i = specificValues.length-1; i >= 0; i--) {
      System.out.print(specificValues[i] + " ");

    }

  }
}














