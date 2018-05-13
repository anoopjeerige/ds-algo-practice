import java.util.*;
import java.lang.*;

public class Creativity {

  // c1.14 Reverse
  public static int[] customReverse(int[] list) {
    for (int i = 0; i < list.length/2; i++) {
      int temp = list[i];
      list[i] = list[list.length - i - 1];
      list[list.length - i - 1] = temp;
    }
    return list;
  }

  // c1.15 Min and Max
  public static void minMaxValue(int[] list) {
    int min = list[0];
    int max = list[0];
    for (int i=1; i<list.length; i++) {
      if (list[i] < min) {
        min = list[i];
      }
      if (list[i] > max) {
        max = list[i];
      }
    }
    System.out.println("Min: " + min + "Max: " + max);
  }

  // method to print elements of a integer array
  public static void printList(int[] list) {
    for(int i = 0; i < list.length; i++) {
      System.out.print(list[i] + " ");
    }
    System.out.println();
  }

  // Method to get single int input from user
  public static int getIntInput(Scanner input) {
    // get int from user
    System.out.print("Enter an integer: ");
    while(!input.hasNextInt()) {
      input.nextLine();
      System.out.println("Invalid entry. Please enter an integer.");
    }
    return input.nextInt();
  }

  // Method to get float input from user
  public static float getFloatInput(Scanner input) {
    // get float from user
    System.out.print("Enter a float: ");
    while(!input.hasNextFloat()) {
      input.nextLine();
      System.out.println("Invalid entry. Please enter a float.");
    }
    return input.nextFloat();
  }

  // get inputs for a float array
  public static float[] getFloatArray(Scanner input) {
    System.out.print("Size of array: ");
    int n = getIntInput(input);
    float[] userInputs = new float[n];
    System.out.println("Array elements: ");
    for (int i = 0; i < userInputs.length; i++) {
      userInputs[i] = getFloatInput(input);
    }
    return userInputs;
  }

  // c1.16 check if given inputs can be used in any of the expressions - a+b=c, a=b-c, a*b=c
  public static void checkExpression(int a, int b, int c) {
    if ((a + b) == c) {
      System.out.println("Expression a+b=c: " + a + "+" + b + "=" + c);
    } else if ((b - c) == a) {
      System.out.println("Expression a=b-c: " + a + "=" + b + "-" + c);
    } else if ((a * b) == c) {
      System.out.println("Expression a*b=c: " + a + "*" + b + "=" + c);
    } else {
      System.out.println("No Expression matched for a: " + a + " b: " + b + " c: " + c);
    }
  }

  // get inputs for a integer array
  public static int[] getIntArray(Scanner input) {
    System.out.print("Size of the array: ");
    int n = getIntInput(input);
    int[] userInputs = new int[n];
    System.out.println("Array elements: ");
    for (int i = 0; i < userInputs.length; i++) {
      userInputs[i] = getIntInput(input);
    }
    return userInputs;
  }

  // array pair whose product is even
  public static void getPairEvenProduct(int[] userArray) {
    boolean flag = false;
    for (int i = 0; i < userArray.length && !flag; i++) {
      for (int j = 0; j < userArray.length && j != i; j++) {
        if ((userArray[i] * userArray[j]) % 2 == 0) {
          System.out.println("Pair: " + userArray[i] + "," + userArray[j] + " has product that is even.");
          flag = true;
          break;
        }
        //System.out.println("Pair: " + userArray[i] + "," + userArray[j]);
      }
    }
  }

  // c1.18 p-norm of a vector
  public static double norm(int[] v, int p) {
    double result = 0;
    for (int i = 0; i < v.length; i++) {
      result += Math.pow(v[i], (double)p);
    }
    result = Math.pow(result, (1 / (double)p));
    return result;
  }

  // c1.18 2-norm of vector
  public static double norm(int[] v) {
    return norm(v, 2);
  }

  // c1.19 division count
  public static void countDivision(int n) {
    int count = 0;
    // while (n >= 2){
    //   n = n / 2;
    //   count += 1;
    // }
    count = (int)(Math.log(n)/Math.log(2));
    System.out.println("Number: " + n + " Division Count: " + count);
  }

  // c1.20 check is a float array has distinct values
  public static boolean isDistinct(float[] toTest) {
    float chosenOne = toTest[0];
    for(int i = 1; i < toTest.length; i++) {
      if (chosenOne == toTest[i]) {
        return false;
      }
    }
    return true;
  }

  // c1.21
  public static int[] shuffle(int[] deck) {
    int n = deck.length;
    Random r = new Random();
    for (int i = 0; i < n; i++) {
      int j = r.nextInt(n);
      int temp = deck[i];
      deck[i] = deck[j];
      deck[j] = temp;
    }
    return deck;
  }

  // return a deck
  public static int[] getDeck(){
    int[] deck = new int[52];
    for (int i = 0; i <  deck.length; i++) {
      deck[i] = i + 1;
    }
    return deck;
  }

  // method to output combinations of given string
  public static void permutate(String s, int l, int r) {
    if ( l == r) {
      System.out.println(s);
    } else {
      for (int i = l; i <= r; i++) {
        s = swap(s, l, i);
        permutate(s, l + 1, r);
        s = swap(s, l, i);
      }
    }
  }

  /**
  * Swap a character at position
  * @param a string value
  * @param i position 1
  * @param j position 2
  * @return swapped string
  */
  public static String swap(String a, int i, int j) {
    char temp;
    char[] charArray = a.toCharArray();
    temp = charArray[i];
    charArray[i] = charArray[j];
    charArray[j] = temp;
    return String.valueOf(charArray);
  }

  // C1.23 dot product of two arrays
  public static int[] dotProduct(int[] a, int[] b) {
    int[] c = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      c[i] = a[i] * b[i];
    }
    return c;
  }

  //p1.29 Brithday Paradox
  public static void birthdayParadox() {
    double[][] birthdayProbability = new double[20][2];
    int n = 5;
    for (int i = 0; i < 20; i ++) {
      int matchCount = 0;
      for (int j = 0; j < 1000; j++) {
        int[] temp = randomGenerator(n);
        if(checkMatch(temp)) {
          matchCount++;
        }
      }
      birthdayProbability[i][0] = n;
      birthdayProbability[i][1] = matchCount * 1.0 / 1000;
      matchCount = 0;
      n += 5;
    }
    System.out.println("Birthday Paradox");
    System.out.println("------------------");
    System.out.println("|n\t|P(n)\t|");
    System.out.println("------------------");
    for (int k = 0; k < 20; k++) {
      System.out.println("|" + (int)birthdayProbability[k][0] + "\t|" + birthdayProbability[k][1] + "\t|");
    }
  }

  //p1.29 generate n randon numbers
  public static int[] randomGenerator(int n) {
    int[] results = new int[n];
    Random r = new Random();
    for (int i = 0; i < results.length; i++){
      results[i] = r.nextInt(366);
    }
    return results;
  }

  //p1.29 check for atleast one matching pair in given array
  public static boolean checkMatch(int[] test) {
    for (int i = 0; i < test.length; i ++){
      for (int j = 0; j < test.length && j != i; j++) {
        if (test[i] == test[j]) {
          return true;
        }
      }
    }
    return false;
  }

  // Testing methods
  public static void main(String[] args) {
    int[] myList = {3, 2, 5, 1, 4};

    // printList(myList);
    // myList = customReverse(myList);
    // printList(myList);

    //minMaxValue(myList);

    Scanner input = new Scanner(System.in);
    // System.out.println("Enter a b c");
    // int a = getIntInput(input);
    // int b = getIntInput(input);
    // int c = getIntInput(input);
    // checkExpression(a, b, c);

    // int[] userArray = getIntArray(input);
    // printList(userArray);
    // getPairEvenProduct(userArray);

    // System.out.println("p-norm of vector");
    // System.out.println("Vector coordinates array");
    // int[] vectors = getIntArray(input);
    // System.out.println("p value");
    // int p = getIntInput(input);
    // System.out.println("p-norm: " + norm(vectors, p));
    // System.out.println("euclidean-norm: " + norm(vectors));

    // System.out.println("Number division count");
    // countDivision(getIntInput(input));

    // System.out.println("Float array distinct values: " + isDistinct(getFloatArray(input)));

    // System.out.println("Shuffle deck :");
    // int[] deck = getDeck();
    // printList(deck);
    // deck = shuffle(deck);
    // printList(deck);

    // String test = "ABC";
    // permutate(test, 0, test.length()-1);

    // int[] a = getIntArray(input);
    // int[] b = getIntArray(input);
    // int[] c = dotProduct(a, b);
    // printList(c);

    //printList(randomGenerator(23));
    //System.out.println(checkMatch(randomGenerator(5)));
    birthdayParadox();
  }

}
