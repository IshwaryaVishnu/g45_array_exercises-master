package se.lexicon;

public class Exercise05 {

  /**
   * 5. Create a two-dimensional string array [2][2]. Assign values to the 2d array containing any Country and City.
   * Expected output:
   *              France Paris
   *              Sweden Stockholm
   */
  public static void ex5() {
    int columns =2;
    int rows = 2;

    String[][] newArray = {{"France", "Paris"}, {"Sweden", "Stockholm"}};
       for(int i = 0; i < rows; i++){
      for(int j = 0; j < columns; j++) {
        System.out.print(newArray[i][j] +" \t" );
      }
         System.out.println( );
    }

  }

}
