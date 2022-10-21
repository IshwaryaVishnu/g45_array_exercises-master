package se.lexicon;

public class Exercise10 {

  /**
   * 10.Write a program which will represent multiplication table stored in multidimensional array.
   * Hint: You have two-dimensional array with values
   * [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]
   */
  public static void ex10() {
    int[][] multiplicationTable =new int[10][10];
    int row=1,column=1;
    for(int i=0; i<multiplicationTable.length; i++){
      for(int j=0; j<multiplicationTable[i].length; j++){
        multiplicationTable[i][j]=row*column;
        column=column+1;
      }
      row=row+1;
      column=1;
    }
    for(int i=0; i<multiplicationTable.length; i++){
      for(int j=0; j<multiplicationTable[i].length; j++){
        System.out.print(" "+multiplicationTable[i][j]+"\t| ");
      }
      System.out.print("\n");
    }
  }
}
