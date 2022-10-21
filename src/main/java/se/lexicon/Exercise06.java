package se.lexicon;

public class Exercise06 {

  /**
   * 6. Write a program which will set up an array to hold the next values in this order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
   * Expected output: Average is: 17.3
   */
  public static void ex6() {
    double [] arr = {43, 5, 23, 17, 2, 14};
    double total = 0;
    int i;
    for (i = 0; i <arr.length; i++)
      total = total + arr[i];
    double average = total / arr.length;
    System.out.println("Average is : " + average);

  }

  }

