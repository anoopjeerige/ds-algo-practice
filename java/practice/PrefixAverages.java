public class PrefixAverages {

  /** Returns an array result such that, for all j, result[j] equals average of x[0] .. x[j]*/

  public static double[] prefixAverage1(double[] x) {
    System.out.println("O(n^2)");
    int n = x.length;
    double[] result = new double[n];
    for (int j = 0; j < n; j++) {
      double total = 0;
      for (int k = 0; k <= j; k++) {
        total += x[k];
      }
      result[j] = total / (j + 1);
    }
    return result;
  }

  /** Improved prefix averages - by maintaining current prefix sum dyamically */
  public static double[] prefixAverage2(double[] x) {
    System.out.println("O(n)");
    int n = x.length;
    double[] result = new double[n];
    double total = 0;
    for (int i = 0; i < n; i ++) {
      total += x[i];
      result[i] = total / (i + 1);
    }
    return result;
  }

  public static void main(String[] args) {
    double[] test = {1, 2, 3, 4, 5};
    double[] res = null;
    res = prefixAverage1(test);
    for(double item: res) {
      System.out.print(item + " ");
    }
  }
}
