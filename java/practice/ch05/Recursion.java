import java.io.File;

public class Recursion {

  /** Factorial of a number */
  public static int factorial(int n) {
    if (n < 0) {
      throw new IllegalArgumentException();
    } else if (n == 0) {
      return 1;
    } else {
      return n * factorial(n-1);
    }
  }

  /** Draw English ruler for given number of inches and major tick length */
  public static void drawRuler(int nInches, int majorLength) {
    drawLine(majorLength, 0);
    for (int j = 1; j <= nInches; j++) {
      drawInterval(majorLength - 1);
      drawLine(majorLength, j);
    }
  }

  private static void drawLine(int tickLength, int tickLabel) {
    for (int j = 0; j < tickLength; j++) {
      System.out.print("-");
    }
    if (tickLabel >= 0) {
      System.out.print(" " + tickLabel);
    }
    System.out.print("\n");
  }

  private static void drawLine(int tickLength) {
    drawLine(tickLength, -1);
  }

  private static void drawInterval(int centralLength) {
    if (centralLength >= 1) {
      drawInterval(centralLength - 1);
      drawLine(centralLength);
      drawInterval(centralLength - 1);
    }
  }

  private static boolean binarySearch(int[] data, int target, int low, int high) {
    if (low > high) {
      return false;
    } else {
      int mid = (low + high) / 2;
      if (target == data[mid]) {
        return true;
      } else if (target < data[mid]) {
        return binarySearch(data, target, low, mid - 1);
      } else {
        return binarySearch(data, target, mid + 1, high);
      }
    }
  }

  private static long diskUsage(File root) {
    long total = root.length();
    if (root.isDirectory()) {
      for (String item: root.list()) {
        File child = new File(root, item);
        total += diskUsage(child);
      }
    }
    System.out.println(total + "\t" + root);
    return total;
  }
  public static void main(String[] args) {
    //System.out.println(factorial(4));
    //drawRuler(1, 4);
    //int[] data = {1, 2, 3, 4, 5, 6};
    //System.out.println(binarySearch(data, 8, 0, 5));
    diskUsage(new File("/home/anoop/practice"));
  }
}
