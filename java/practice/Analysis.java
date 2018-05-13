public class Analysis {

  /** Function to concatenate a given character c n times using + operator*/
  public static String concatPlus(char c, int n) {
    String result = "";
    for (int i = 0; i < n; i++) {
      result += c;
    }
    return result;
  }

  /** Function to concatenate a given character c n times using + operator*/
  public static String concatStringBuilder(char c, int n) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(c);
    }
    return sb.toString();
  }

  /* Test the concatenation functions */
  public static void main(String[] args) {
    double[][] results = new double[101][2];
    int inputSize = 50;
    for (int i = 0; i <= 100; i++) {
      long startTime = System.currentTimeMillis();
      String test = concatPlus('a', inputSize);
      long endTime = System.currentTimeMillis();
      long elapsed = endTime - startTime;
      results[i][0] = elapsed;

      startTime = System.currentTimeMillis();
      test = concatStringBuilder('a', inputSize);
      endTime = System.currentTimeMillis();
      elapsed = endTime - startTime;
      results[i][1] = elapsed;
      inputSize += 50;
    }
    System.out.println("|Input size\t|+\t|SB\t|");
    for (int j = 1; j <= 100; j++) {
      System.out.println("|" + j + "\t|" + results[j][0] + "\t|" + results[j][1] + "\t|");
    }
  }
}
