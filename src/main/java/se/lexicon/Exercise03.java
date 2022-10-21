package se.lexicon;
import java.util.*;
public class Exercise03 {

  /**
   * 3. Write a program which will sort string array.
   * Expected output:
   *                String array: [Paris, London, New York, Stockholm]
   *                Sort string array: [London, New York, Paris, Stockholm]
   */
  public static void ex3() {
        String[] countries = {"Paris", "London", "New York", "Stockholm"};
        Arrays.sort(countries);
        for (String sortCountries : countries) {
          System.out.print(sortCountries + " ");

        }
      }
    }



