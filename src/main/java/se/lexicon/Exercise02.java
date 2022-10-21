package se.lexicon;
public class Exercise02 {

  /**
   * 2. Create a program and create a method with name ‘indexOf’ which will find and return the index of an element in the array.
   * If the element does not exist your method should return -1 as value.
   * Expected output: Index position of number 5 is: 2.
   */
  public static void ex2() {
    indexOf();
  }
  public static void indexOf() {
    int[] elements = {1, 0, 5, 2, 4, 2};
    int number = 5;
    int indexOf = -1;
    for(int i = 0; i < elements.length; i++) {
      if(elements[i] == number) {
        indexOf = i;
        break;
      }
    }

    System.out.println("Index position of number "+number+" is : "+indexOf);
  }
}