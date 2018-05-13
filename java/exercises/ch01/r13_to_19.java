import java.util.Scanner;

public class r13_to_19 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    // Is multiple
    // int[] inputs = new int[2];
    // System.out.println("Is n a multiple of m? Enter n and m: ");
    // for (int i=0; i<inputs.length; i++) {
    //   inputs[i] = getIntFromUser(input);
    // }
    // System.out.println(isMultiple(inputs[0], inputs[1]));
    //
    // // is even
    // System.out.println("Is i even? Enter i: ");
    // System.out.println(isEven(getIntFromUser(input)));
    //
    // // sum of all positive numbers less than or equal to n
    // System.out.println("Sum of all numbers less than or equal to n; Enter n: ");
    // System.out.println("Result: " + positiveSum(getIntFromUser(input)));
    //
    // // sum of all odd positive numbers less than or equal to n
    // System.out.println("Summ of all odd numbers less than or equal to n; Enter n:");
    // System.out.println("Result: " + oddPositiveSum(getIntFromUser(input)));
    //
    // // sum of all positive squares numbers less than or equal to n
    // System.out.println("Summ of all square numbers less than or equal to n; Enter n:");
    // System.out.println("Result: " + positiveSquaresSum(getIntFromUser(input)));

    // count of vowels in a charater string
    System.out.println("Count of vowels in a character string");
    System.out.println("Result: " + countVowels(getStringFromUser(input)));

    System.out.println("Enter string: ");
    removePunctuation(getStringFromUser(input));
  }

  public static int getIntFromUser(Scanner input) {
    // get a int
    System.out.print("Please enter an integer: ");
    while(!input.hasNextInt()){
      input.nextLine();
      System.out.println("Invalid integer; Please enter an integer: ");
    }
    return input.nextInt();
  }

  public static String getStringFromUser(Scanner input) {
    // get a string
    System.out.print("Enter a character string: ");
    while(!input.hasNextLine()) {
      System.out.println("Invalid entry; Enter a character string: ");
    }
    return input.nextLine();
  }

  /** is Mulitple */
  public static boolean isMultiple(long n, long m) {
    if (n % m == 0) {
      return true;
    }
    return false;
  }

  /** is even */
  public static boolean isEven(int i) {
    if (i >> 1 << 1 == i) {
      return true;
    }
    return false;
  }

  /** sum of all positive numbers less than or equal to n */
  public static int positiveSum(int n) {
    int result = 0;
    for(int i=1; i<=n; i++) {
      result += i;
    }
    return result;
  }

  /** sum of all odd positives less than or equal to n */
  public static int oddPositiveSum(int n) {
    int result = 0;
    for (int i=1; i<=n; i++) {
      if (i % 2 != 0) {
        result += i;
      }
    }
    return result;
  }

  /** sum of all odd positive squares less than or equal to n */
  public static int positiveSquaresSum(int n) {
    int result = 0;
    for (int i=1; i<=n; i++) {
      result += i * i;
    }
    return result;
  }

  /** vowels in a character string */
  public static int countVowels(String s) {
    int result = 0;
    char[] s_c = s.toCharArray();
    for (int i=0; i<s_c.length; i++) {
      if (s_c[i] == 'a' || s_c[i] == 'e' || s_c[i] == 'i' || s_c[i] == 'o' || s_c[i] == 'u') {
        result++;
      }
    }
    return result;
  }

  /** Remove punctuationss from a string */
  public static void removePunctuation(String s) {
    StringBuilder sb = new StringBuilder(s);
    for (int i=0; i<sb.length(); i++) {
      if (!Character.isDigit(sb.charAt(i)) && !Character.isLetter(sb.charAt(i))) {
        sb.deleteCharAt(i);
      }
    }
    System.out.println(sb.toString());

  }

  /** check if a target belongs to given array */
  public static boolean inArray(String s) {
    return false;
  }


}
